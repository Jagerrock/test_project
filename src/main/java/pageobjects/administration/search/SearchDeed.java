package pageobjects.administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDeed {
    private WebDriver driver;

    public SearchDeed (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement startDate;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement identifier;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement deedNumber;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement initiatedName;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl05_cbxIsVisible\"]")
    private WebElement isPublished;

    public boolean checkstartDate() {
        return startDate.isSelected();
    }

    public boolean checkidentifier() {
        return identifier.isSelected();
    }

    public boolean checkdeedNumber() {
        return deedNumber.isSelected();
    }

    public boolean checkinitiatedName() {
        return initiatedName.isSelected();
    }

    public boolean checktitle() {
        return title.isSelected();
    }

    public boolean checkisPublished() {
        return isPublished.isSelected();
    }
}
