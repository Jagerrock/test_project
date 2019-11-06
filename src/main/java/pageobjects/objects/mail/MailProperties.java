package pageobjects.objects.mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailProperties {
    private WebDriver driver;

    public MailProperties (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='to']")
    private WebElement to;

    @FindBy(xpath = "//*[@id='subject']")
    private WebElement subject;

    @FindBy(xpath = "//*[@id='body']")
    private WebElement body;

    public MailProperties sendKeysto(String a){
        to.sendKeys(a);
        return this;
    }

    public MailProperties sendKeyssubject(String a){
        subject.sendKeys(a);
        return this;
    }

    public MailProperties sendKeysbody(String a){
        body.sendKeys(a);
        return this;
    }
}
