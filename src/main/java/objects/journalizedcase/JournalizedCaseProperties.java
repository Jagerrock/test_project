package objects.journalizedcase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class JournalizedCaseProperties {
    private WebDriver driver;

    public JournalizedCaseProperties(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div[1]/div[1]/div/div[2]/div[1]/div[2]/button/div/div/div")
    private WebElement journalizedcaseDiary;

    @FindBy(xpath = "//*[@id='bs-select-1-1']")
    private WebElement journalizedcaseDiaryElement;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div[1]/div[1]/div/div[3]/div[1]/div[2]/button")
    private WebElement journalizedcaseCreated;

    @FindBy(id = "bs-select-10-1")
    private WebElement journalizedcaseCreatedElement;

    @FindBy(xpath = "//*[@id='businessCodeIdentifier']")
    private WebElement journalizedcaseBusinessCode;

    @FindBy(xpath = "//*[@id='row15']/td[2]")
    private WebElement journalizedcaseBusinessCodeSearch;

    @FindBy(xpath = "//*[@id='caseType']")
    private WebElement journalizedcaseCaseType;

    @FindBy(xpath = "//*[@id='pulSecrecyLevel_PulSecrecyLevels']/div/div[1]/div[2]/button/div/div/div")
    private WebElement journalizedcaseSecrecyDropDown;

    @FindBy(xpath = "//*[@id='bs-select-4-1']/span")
    private WebElement journalizedcaseSecrecyNone;

    @FindBy(xpath = "//*[@id='pulSecrecyLevel_PulSecrecyLevels']/div/div[3]/div/div[2]/button/div/div/div")
    private WebElement journalizedcasePersonalData;

    @FindBy(xpath = "//*[@id='bs-select-5-1']/span")
    private WebElement journalizedcasePersonalNone;

    @FindBy(xpath = "//*[@id='title']")
    private WebElement journalizedcaseTitle;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement journalizedcaseDescription;

    @FindBy(xpath = "//*[@id='initiator_txtName']")
    private WebElement journalizedcaseName;

    public JournalizedCaseProperties clickjournalizedcaseDiary(){
        journalizedcaseDiary.click();
        return this;
    }

    public JournalizedCaseProperties clickjournalizedcaseDiaryElement(){
        journalizedcaseDiaryElement.click();
        return this;
    }

    public JournalizedCaseProperties clickEnterjournalizedcaseCreated(){
        journalizedcaseCreated.click();
        journalizedcaseCreated.sendKeys(Keys.ARROW_DOWN);
        journalizedcaseCreated.sendKeys(Keys.RETURN);
        return this;
    }

    public JournalizedCaseProperties clickjournalizedcaseCreatedElement(){
        journalizedcaseCreatedElement.click();
        return this;
    }

    public JournalizedCaseProperties sendKeysEnterjournalizedcaseBusinessCode(String a){
        journalizedcaseBusinessCode.sendKeys(a);
        journalizedcaseBusinessCode.sendKeys(Keys.RETURN);
        return this;
    }

    public JournalizedCaseProperties sendKeysEnterjournalizedcaseCaseType(String a){
        journalizedcaseCaseType.sendKeys(a);
        journalizedcaseCaseType.sendKeys(Keys.RETURN);
        return this;
    }

    public JournalizedCaseProperties sendKeysjournalizedcaseTitle(String a){
        journalizedcaseTitle.sendKeys(a);
        return this;
    }

    public JournalizedCaseProperties sendKeysjournalizedcaseName(String a){
        journalizedcaseName.sendKeys(a);
        return this;
    }
}
