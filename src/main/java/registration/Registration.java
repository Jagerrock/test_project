package registration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='imgNewPostListItem']")
    private WebElement registrationNewDeed;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[5]/div/button")
    private WebElement registrationSelectDiary;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[6]/div/button")
    private WebElement registrationSelectPostlist;

    public Registration clickregistrationNewDeed(){
        registrationNewDeed.click();
        return this;
    }

    public Registration clickEnterSelectDiary(){
        registrationSelectDiary.click();
        registrationSelectDiary.sendKeys(Keys.ARROW_DOWN);
        registrationSelectDiary.sendKeys(Keys.RETURN);
        return this;
    }

    public Registration clickEnterSelectPostlist(){
        registrationSelectPostlist.click();
        registrationSelectPostlist.sendKeys(Keys.ARROW_DOWN);
        registrationSelectPostlist.sendKeys(Keys.RETURN);
        return this;
    }
}

