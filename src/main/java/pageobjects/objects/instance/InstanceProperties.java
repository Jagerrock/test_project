package pageobjects.objects.instance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstanceProperties {

    private WebDriver driver;

    public InstanceProperties(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id='customerName']")
    private WebElement instanceName;

    @FindBy(xpath = "//*[@id='streetAddress']")
    private WebElement instanceAddress;

    @FindBy(xpath = "//*[@id='zipCode']")
    private WebElement instanceZipCode;

    @FindBy(xpath = "//*[@id='city']")
    private WebElement instanceCity;

    @FindBy(xpath = "//*[@id='phoneNbr']")
    private WebElement instanceMainPhoneNumber;

    @FindBy(xpath = "//*[@id='faxNbr']")
    public WebElement instanceFax;

    @FindBy(xpath = "//*[@id='txtEmail']")
    private WebElement instanceEmail;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement instanceDescription;

    @FindBy(xpath = "//*[@id='website']")
    private WebElement instanceWebsite;

    @FindBy(xpath = "//label[@for='isReferralReceiver']")
    private WebElement instanceReciever;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[2]/div[2]/div/div/button/div/div/div")
    private WebElement instancePostlist;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[2]/div[2]/span[2]/label") //*[@id="MainUpdatePanel"]/div[1]/div[2]/div[2]/span[2]/label
    private WebElement instanceDecisionMaker;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[2]/div[2]/span[3]/label")
    private WebElement instanceMeetingParticipant;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[2]/div[2]/span[4]/label")
    private WebElement instanceInternalUse;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[2]/div[2]/span[5]/label)")
    private WebElement instanceActive;

    @FindBy(xpath = "//*[@id='meetingInstance_txtAbbrevation'])")
    private WebElement instanceShortName;

    @FindBy(xpath = "//*[@id='meetingInstance_txtLocation'])")
    private WebElement instanceLocation;

    @FindBy(xpath = "//*[@id='meetingInstance_txtRepository']")
    private WebElement instanceRepository;

    @FindBy(xpath = "//*[@id='meetingInstance_txtSekretary']")
    private WebElement instanceSecretary;

    @FindBy(xpath = "//*[@id='meetingInstance_txtDaysBefore']")
    private WebElement instanceDaysBefore;

    @FindBy(xpath = "//*[@id='meetingInstance_txtDaysAfter']")
    private WebElement instanceDaysAfter;

    public InstanceProperties sendKeysinstanceName(String a){
        instanceName.sendKeys(a);
        return this;
    }

    public InstanceProperties sendKeysinstanceDescription(String a){
        instanceDescription.sendKeys(a);
        return this;
    }
}
