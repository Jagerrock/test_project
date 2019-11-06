package pageobjects.administration.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPerson {
    private WebDriver driver;

    public SearchPerson (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl00_cbxIsVisible\"]")
    private WebElement objectID;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl01_cbxIsVisible\"]")
    private WebElement employeeNbr;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl02_cbxIsVisible\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl03_cbxIsVisible\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl04_cbxIsVisible\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"configureSearchRepeater_ctl05_cbxIsVisible\"]")
    private WebElement createdDate;

    public boolean checkobjectID() {
        return objectID.isSelected();
    }

    public boolean checkemployeeNbr() {
        return employeeNbr.isSelected();
    }

    public boolean checkfirstName() {
        return firstName.isSelected();
    }

    public boolean checklasName() {
        return lastName.isSelected();
    }

    public boolean checkemail() {
        return email.isSelected();
    }

    public boolean checkcreatedDate() {
        return createdDate.isSelected();
    }

}
