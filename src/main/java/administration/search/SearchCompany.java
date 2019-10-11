package administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCompany {
    private WebDriver driver;

    public SearchCompany (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement customerNr;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement descp;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement orgNr;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl05_cbxIsVisible\"]")
    private WebElement createdBy;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl06_cbxIsVisible\"]")
    private WebElement createdDate;

    public boolean checkcustomerNr() {
        return customerNr.isSelected();
    }

    public boolean checktitle() {
        return title.isSelected();
    }

    public boolean checkdescp() {
        return descp.isSelected();
    }

    public boolean checkorgNr() {
        return orgNr.isSelected();
    }

    public boolean checkcreatedBy() {
        return createdBy.isSelected();
    }

    public boolean checkcreatedDate() {
        return createdDate.isSelected();
    }
}
