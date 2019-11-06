package pageobjects.objects.usualcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseProperties {
    private WebDriver driver;

    public CaseProperties(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement caseTitle;

    @FindBy(xpath = "//*[@id='Descp']")
    private WebElement caseDescription;

    public CaseProperties sendKeysusualcaseTitle(String a){
        caseTitle.sendKeys(a);
        return this;
    }

    public CaseProperties sendKeysusualcaseDescription(String a){
        caseDescription.sendKeys(a);
        return this;
    }
}
