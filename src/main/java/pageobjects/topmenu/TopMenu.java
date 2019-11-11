package pageobjects.topmenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

public class TopMenu extends BasePage {

    public TopMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='imgCustomerIcon']")
    private WebElement topmenuLogo;

    @FindBy(xpath = "//*[@id='Menu_New']")
    private WebElement topmenuNew;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[1]")
    private WebElement topmenuNewArticle;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[4]")
    private WebElement topmenuNewCompany;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[3]")
    private WebElement topmenuNewInstance;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[5]")
    private WebElement topmenuNewUsualCase;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[7]")
    private WebElement topmenuNewReceiversList;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/div/a[2]")
    private WebElement topmenuNewJournalizedCase;

    @FindBy(xpath = "//*[@id='Menu_Registration']")
    private WebElement topmenuRegisration;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/div/a[1]")
    private WebElement topmenuRegistrationRegistration;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/div/a[2]")
    private WebElement topmenuRegistrationPostlist;

    @FindBy(xpath = "//*[@id='Menu_Meetings']")
    private WebElement topmenuMeetings;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/div/a[1]")
    private WebElement topmenuMeetingsMM;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/div/a[2]")
    private WebElement topmenuMeetingsPM;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/div/a[3]")
    private WebElement topmenuMeetingsPP;

    @FindBy(xpath = "//*[@id='Menu_Search']")
    private WebElement topmenuSearch;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[1]")
    private WebElement topmenuSearchObject;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[2]")
    private WebElement topmenuSearchArticle;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[3]")
    private WebElement topmenuSearchDocument;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[4]")
    private WebElement topmenuSearchCompany;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[5]")
    private WebElement topmenuSearchCase;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[7]")
    private WebElement topmenuSearchReceiversList;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[8]")
    private WebElement topmenuSearchJournalizedCase;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[9]")
    private WebElement topmenuSearchDeed;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/div/a[10]")
    private WebElement topmenuSearchInstance;

    @FindBy(xpath = "//*[@id='Menu_Settings']")
    private WebElement topmenuSettings;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[5]/div/a")
    private WebElement topmenuSettingsAdministration;

    public TopMenu clicktopmenuLogo(){
        topmenuLogo.click();
        return this;
    }

    public TopMenu clicktopmenuNew(){
        topmenuNew.click();
        return this;
    }

    public TopMenu clicktopmenuNewArticle(){
        topmenuNewArticle.click();
        return this;
    }

    public TopMenu clicktopmenuNewCompany(){
        topmenuNewCompany.click();
        return this;
    }

    public TopMenu clicktopmenuNewInstance(){
        topmenuNewInstance.click();
        return this;
    }

    public TopMenu clicktopmenuNewUsualCase(){
        topmenuNewUsualCase.click();
        return this;
    }

    public TopMenu clicktopmenuNewReceiversList(){
        topmenuNewReceiversList.click();
        return this;
    }

    public TopMenu clicktopmenuNewJournalizedCase(){
        topmenuNewJournalizedCase.click();
        return this;
    }

    public TopMenu clicktopmenuRegistration(){
        topmenuRegisration.click();
        return this;
    }

    public TopMenu clicktopmenuRegistrationRegistration(){
        topmenuRegistrationRegistration.click();
        return this;
    }

    public TopMenu clicktopmenuRegistrationPostlist(){
        topmenuRegistrationPostlist.click();
        return this;
    }

    public TopMenu clicktopmenuMeetings(){
        topmenuMeetings.click();
        return this;
    }

    public TopMenu clicktopmenuMeetingsMM(){
        topmenuMeetingsMM.click();
        return this;
    }

    public TopMenu clicktopmenuMeetingsPM(){
        topmenuMeetingsPM.click();
        return this;
    }

    public TopMenu clicktopmenuMeetingsPP(){
        topmenuMeetingsPP.click();
        return this;
    }

    public TopMenu clicktopmenuSeach(){
        topmenuSearch.click();
        return this;
    }

    public TopMenu clicktopmenuSearchObject(){
        topmenuSearchObject.click();
        return this;
    }

    public TopMenu clicktopmenuSearchArticle(){
        topmenuSearchArticle.click();
        return this;
    }

    public TopMenu clicktopmenuSearchDocument(){
        topmenuSearchDocument.click();
        return this;
    }

    public TopMenu clicktopmenuSearchCompany(){
        topmenuSearchCompany.click();
        return this;
    }

    public TopMenu clicktopmenuSearchCase(){
        topmenuSearchCase.click();
        return this;
    }

    public TopMenu clicktopmenuSearchReceiversList(){
        topmenuSearchReceiversList.click();
        return this;
    }

    public TopMenu clicktopmenuSearchJournalizedCase(){
        topmenuSearchJournalizedCase.click();
        return this;
    }

    public TopMenu clicktopmenuSearchDeed(){
        topmenuSearchDeed.click();
        return this;
    }

    public TopMenu clicktopmenuSearchInstance(){
        topmenuSearchInstance.click();
        return this;
    }

    public TopMenu clicktopmenuSettings(){
        topmenuSettings.click();
        return this;
    }

    public TopMenu clicktopmenuSettingsAdministration(){
        topmenuSettingsAdministration.click();
        return this;
    }
}
