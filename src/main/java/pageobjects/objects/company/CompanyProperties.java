package pageobjects.objects.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyProperties {
    private WebDriver driver;

    public CompanyProperties(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id='CustomerName']")
    private WebElement companyClientName;

    @FindBy(xpath = "//*[@id='Descp']")
    private WebElement companyDescription;

    @FindBy(xpath = "//*[@id='CustomerNr']")
    private WebElement companyClientNbr;

    @FindBy(xpath = "//*[@id='OrgNr']")
    private WebElement companyOrgNbr;

    @FindBy(xpath = "//*[@id='address_txtAddress']")
    private WebElement companyCO;

    @FindBy(xpath = "//*[@id='address_txtAddress2']")
    private WebElement companyAddress;

    @FindBy(xpath = "//*[@id='address_txtPostNr']")
    private WebElement companyZipCode;

    @FindBy(xpath = "//*[@id='address_txtPostAddress']")
    private WebElement companyCity;

    @FindBy(xpath = "//*[@id='address_pnlCardView']/div[1]/div[2]/div/button/div/div/div")
    private WebElement companyAddressType;

    @FindBy(xpath = "//*[@id='address_pnlCardView']/div[2]/div[1]/div/div[3]/div/button/div/div/div")
    private WebElement companyCounrty;

    @FindBy(xpath = "//*[@id='address_txtDescription']")
    private WebElement companyAddressDescription;

    @FindBy(xpath = "//*[@id='contactInfo_pnlCardView']/div[1]/div/button/div/div/div")
    private WebElement companyContactType;

    @FindBy(xpath = "//*[@id='contactInfo_txtText']")
    private WebElement companyText;

    @FindBy(xpath = "//*[@id='contactInfo_txtDescription']")
    private WebElement companyContactDescription;

    @FindBy(xpath = "//*[@id='address_btnBack']")
    private WebElement companyAddressBtnBack;

    @FindBy(xpath = "//*[@id='address_btnNext']")
    private WebElement companyAddressBtnNext;

    @FindBy(xpath = "//*[@id='address_btnList]" )
    private WebElement companyAdressBtnList;

    @FindBy(xpath = "//*[@id='address_btnNew']")
    private WebElement companyBtnNew;

    @FindBy(xpath = "//*[@id='address_btnRemove']")
    private WebElement companyBtnRemove;

    @FindBy(xpath = "//*[@id='contactInfo_btnBack']")
    private WebElement companyContactBtnBack;

    @FindBy(xpath = "//*[@id='contactInfo_btnNext']")
    private WebElement companyContactBtnNext;

    @FindBy(xpath = "//*[@id='contactInfo_btnList]" )
    private WebElement companyContactBtnList;

    @FindBy(xpath = "//*[@id='contactInfo_btnNew']")
    private WebElement companyContactNew;

    @FindBy(xpath = "//*[@id='contactInfo_btnRemove']")
    private WebElement companyContactRemove;

    public CompanyProperties sendKeyscompanyClientName(String a){
        companyClientName.sendKeys(a);
        return this;
    }

    public CompanyProperties sendKeyscompanyClientDescription(String a){
        companyDescription.sendKeys(a);
        return this;
    }
}
