package administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchObject {
    private WebDriver driver;

    public SearchObject (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement identifier;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement descp;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement createdBy;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement createdDate;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl05_cbxIsVisible\"]")
    private WebElement ownerPerson;

    public boolean checkidentifier() {
        return identifier.isSelected();
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

    public boolean checkownerPerson() {
        return ownerPerson.isSelected();
    }

}
