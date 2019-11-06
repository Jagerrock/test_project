package pageobjects.objects.participant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParticipantProperties {
    private WebDriver driver;

    public ParticipantProperties (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='tbFirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='tbLastName']")
    public WebElement lastName;

    public ParticipantProperties sendKeysfirstName(String a){
        firstName.sendKeys(a);
        return this;
    }

    public ParticipantProperties sendKeyslastNmae(String a){
        lastName.sendKeys(a);
        return this;
    }
}
