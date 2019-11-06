package pageobjects.objects.deed;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeedProperties {
    private WebDriver driver;

    public DeedProperties(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div[1]/div[1]/div/div[3]/div[1]/div[2]/button/div/div/div")
    private WebElement deedDiary;

    @FindBy(xpath = "//*[@id='bs-select-1-1']")
    private WebElement deedDiaryElement;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div[1]/div[1]/div/div[4]/div[1]/div[2]/button/div/div/div")
    private WebElement deedCreated;

    @FindBy(xpath = "//*[@id='bs-select-3-1']")
    private WebElement deedCreatedElement;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/button/div/div/div")
    private WebElement deedPostlist;

    @FindBy(xpath = "//*[@id='businessCodeIdentifier']")
    private WebElement deedBusinessCode;

    @FindBy(xpath = "//*[@id='deedType']")
    private WebElement deedDeedType;

    @FindBy(xpath = "//*[@id='title']")
    private WebElement deedTitle;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement deedDescription;

    @FindBy(xpath = "//*[@id='initiator_txtName']")
    private WebElement deedName;

    public DeedProperties clickdeedDiary(){
        deedDiary.click();
        return this;
    }

    public DeedProperties clickdeedDiaryElement(){
        deedDiaryElement.click();
        return this;
    }

    public DeedProperties clickEnterdeedCreated() {
        deedCreated.click();
        return this;
    }

    public DeedProperties clickdeedCreatedElement(){
        deedCreatedElement.click();
        return this;
    }

    public DeedProperties sendKeysdeedBusinessCode(String a){
        deedBusinessCode.sendKeys(a);
        deedBusinessCode.sendKeys(Keys.RETURN);
        return this;
    }

    public DeedProperties sendKeysdeedDeedType(String a){
        deedDeedType.sendKeys(a);
        deedDeedType.sendKeys(Keys.RETURN);
        return this;
    }

    public DeedProperties sendKeysdeedTitle(String a){
        deedTitle.sendKeys(a);
        return this;
    }

    public DeedProperties sendKeysdeedDescription(String a){
        deedDescription.sendKeys(a);
        return this;
    }

    public DeedProperties sendKeysdeedName(String a){
        deedName.sendKeys(a);
        return this;
    }

}

