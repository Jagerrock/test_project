package pageobjects.administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDocument {
    private WebDriver driver;

    public SearchDocument (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement identifier;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement createdDate;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement createdBy;


    public boolean checkidentifier() {
        return identifier.isSelected();
    }

    public boolean checktitle() {
        return title.isSelected();
    }

    public boolean checkcreatedDate() {
        return createdDate.isSelected();
    }

    public boolean checkcreatedBy() {
        return createdBy.isSelected();
    }

}
