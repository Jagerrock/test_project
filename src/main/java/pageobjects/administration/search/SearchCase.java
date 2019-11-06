package pageobjects.administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCase {
    private WebDriver driver;

    public SearchCase (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement identifier;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement status;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement startDate;



    public boolean checkidentifier() {
        return identifier.isSelected();
    }

    public boolean checktitle() {
        return title.isSelected();
    }

    public boolean checkstatus() {
        return status.isSelected();
    }

    public boolean checkstartDate() {
        return startDate.isSelected();
    }

}
