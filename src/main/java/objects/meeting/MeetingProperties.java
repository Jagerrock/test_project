package objects.meeting;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class MeetingProperties {
    private WebDriver driver;

    public MeetingProperties (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='mainField']/div[1]/div/button")
    private WebElement instance;

    @FindBy(xpath = "//*[@id='txtLocation']")
    private WebElement location;

    @FindBy(xpath = "//*[@id='txtDescp']")
    private WebElement description;

    public MeetingProperties clickEnterInstance(){
        instance.click();
        instance.sendKeys(Keys.ARROW_DOWN);
        instance.sendKeys(Keys.RETURN);
        return this;
    }

    public MeetingProperties SendKeysLocation(String a){
        instance.sendKeys(a);
        return this;
    }

    public MeetingProperties SendKeysDescription(String a){
        description.sendKeys(a);
        return this;
    }
}
