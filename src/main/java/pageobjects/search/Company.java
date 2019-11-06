package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company {
    private WebDriver driver;

    public Company(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='CustomerName']")
    private WebElement clientName;

    @FindBy(xpath = "//*[@id='Descp']")
    private WebElement description;

    public Company sendKeysclientName(String a){
        clientName.sendKeys(a);
        return this;
    }

    public Company sendKeysdescription(String a){
        description.sendKeys(a);
        return this;
    }
}
