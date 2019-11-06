package pageobjects.administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchArticle {
    private WebDriver driver;

    public SearchArticle (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_tbxWidth\"]")
    private WebElement width;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_tbxSortOrder\"]")
    private WebElement order;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement articlenNo;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_btnEditColumn\"]")
    private WebElement articleNoColumn;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement descp;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement createdBy;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement createdDate;

    @FindBy(xpath = "//label[@for='configureSearchRepeater_ctl00_cbxIsVisible']")
    private WebElement articlenNoCheckBox;

    @FindBy(xpath = "//label[@for='configureSearchRepeater_ctl01_cbxIsVisible']")
    private WebElement titleCheckBox;

    @FindBy(xpath = "//label[@for='configureSearchRepeater_ctl02_cbxIsVisible']")
    private WebElement descpCheckBox;

    @FindBy(xpath = "//label[@for='configureSearchRepeater_ctl03_cbxIsVisible']")
    private WebElement createdByCheckBox;

    @FindBy(xpath = "//label[@for='configureSearchRepeater_ctl04_cbxIsVisible']")
    private WebElement createdDateCheckBox;

    @FindBy(xpath = "//*[@id=\"tbxEngName\"]")
    private WebElement articleNoEdit;

    public boolean checkarticlenNo() {
        return articlenNo.isSelected();
    }

    public boolean checktitle() {
        return title.isSelected();
    }

    public boolean checkdescp() {
        return descp.isSelected();
    }

    public boolean checkcreatedBy() {
        return createdBy.isSelected();
    }

    public boolean checkcreatedDate() {
        return createdDate.isSelected();
    }

    public void sendKeysWidth(){
        width.sendKeys("51");
    }

    public void sendKeysOrder(){
        order.sendKeys("-10");
    }

    public void clickarticleNo(){
        articleNoColumn.click();
    }

    public void clickarticlenNoCheckBox(){
        articlenNoCheckBox.click();
    }

    public void clicktitleCheckBox(){
        titleCheckBox.click();
    }

    public void clickdescpCheckBox(){
        descpCheckBox.click();
    }

    public void clickcreatedByCheckBox(){
        createdByCheckBox.click();
    }

    public void clickcreatedDateCheckBox(){
        createdDateCheckBox.click();
    }

    public void sendKeysArticleNoedit(){
        articleNoEdit.sendKeys("123");
    }
}
