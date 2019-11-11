package pageobjects.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

public class Authentication extends BasePage {

    public Authentication(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='userNameInput']")
    private WebElement login;

    @FindBy(xpath = "//*[@id='passwordInput']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='submitButton']")
    private WebElement btnSignIn;

    public void sendKeysLogin() {
        login.sendKeys("pld2\\oleh.feshchenko");
    }

    public void sendKeysPassword() {
        password.sendKeys("1qaz@WSX");
    }

    public void clickbtnSignIn() {
        btnSignIn.click();
    }

    public boolean checkAuth() {

         return driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls");

    }
}

