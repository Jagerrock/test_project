package administration.search;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='1082']/td")
    private WebElement searchAdmin;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    private WebElement save;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div/div/div[2]/div[1]/div[1]/div[1]/div/button/div/div/div")
    private WebElement module;

    @FindBy(xpath = "//*[@id=\"chkUseCustomSearchPage\"]")
    private WebElement useCustomSearchPages;

    @FindBy(xpath = "//*[@id=\"MainUpdatePanel\"]/div/div/div/div[2]/div[1]/div[1]/div[2]/span/label")
    private WebElement useCustomSearchPagesLabel;

    @FindBy(xpath = "//*[@id='btnSave']")
    private WebElement bthSave;

    @FindBy(xpath = "//*[@id='bs-select-1-1']")
    private WebElement moduleArticle;

    @FindBy(xpath = "//*[@id='bs-select-1-2']")
    private WebElement moduleCase;

    @FindBy(xpath = "//*[@id='bs-select-1-3']")
    private WebElement moduleCompany;

    @FindBy(xpath = "//*[@id='bs-select-1-4']")
    private WebElement moduleCustomObject;

    @FindBy(xpath = "//*[@id='bs-select-1-5']")
    private WebElement moduleDeed;

    @FindBy(xpath = "//*[@id='bs-select-1-6']")
    private WebElement moduleDocument;

    @FindBy(xpath = "//*[@id='bs-select-1-7']")
    private WebElement moduleJournalizedCase;

    @FindBy(xpath = "//*[@id='bs-select-1-8']")
    private WebElement moduleObject;

    @FindBy(xpath = "//*[@id='bs-select-1-9']")
    private WebElement modulePerson;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div")
    private WebElement dropdown;

    @FindBy(xpath = "//*[@id=\"lblIsVisible\"]")
    private WebElement select;

    @FindBy(xpath = "//*[@id=\"lblOrder\"]")
    private WebElement order;

    @FindBy(xpath = "//*[@id=\"lblColumn\"]")
    private WebElement column;

    @FindBy(xpath = "//*[@id=\"lblDBName\"]")
    private WebElement dbname;

    @FindBy(xpath = "//*[@id=\"lblWidth\"]")
    private WebElement width;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_tbxSortOrder\"]")
    private WebElement orderfield;

    @FindBy(xpath = "//*[@id=\"btnSave\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\"vldWidthLength\"]")
    private WebElement warningMessageWidth;

    @FindBy(xpath = "//*[@id=\"vldPositiveSortOrder\"]")
    private WebElement warningMessageOrder;

    public boolean checkSelect(){
        return (select.isDisplayed());
    }

    public void sendKeysOrder(String a){
        orderfield.sendKeys(a);
    }
    public boolean checkUseCustomSearchPages() {
        return useCustomSearchPages.isSelected();
    }

    public void clickSave(){
        save.click();
    }

    public void clickUseCustomSearchPagesLabel(){
        useCustomSearchPagesLabel.click();
    }

    public boolean checkOrder(){
        return order.isDisplayed();
    }

    public boolean checkColumn(){
        return column.isDisplayed();
    }

    public boolean checkDbname(){
        return dbname.isDisplayed();
    }

    public boolean checkWidth(){
        return width.isDisplayed();
    }

    public void clicksearchAdmin(){
        searchAdmin.click();
    }
    public void clickmodule(){
        module.click();
    }
    public void clickmoduleArticle(){
        moduleArticle.click();
    }
    public void clickmoduleCase(){
        moduleCase.click();
    }
    public void clickmoduleCompany(){
        moduleCompany.click();
    }
    public void clickmoduleCustomObject(){
        moduleCustomObject.click();
    }
    public void clickmoduleDeed(){
        moduleDeed.click();
    }
    public void clickmoduleDocument(){
        moduleDocument.click();
    }
    public void clickmoduleJournalizedCase(){
        moduleJournalizedCase.click();
    }
    public void clickmoduleObject(){
        moduleObject.click();
    }
    public void clickmodulePerson(){
        modulePerson.click();
    }

    public void checkWarningMessageWidth(){
        Assert.assertEquals("- Value is too large (maximum width is 50%).", warningMessageWidth.getText());
    }

    public void checkWarningMessageOrder(){
        Assert.assertEquals("- Sort order must be a positive integer.", warningMessageOrder.getText());
    }
}

