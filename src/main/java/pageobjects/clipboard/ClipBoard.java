package pageobjects.clipboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

public class ClipBoard extends BasePage {

    public ClipBoard (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='childObjectListContainer']/div[1]/table/tbody/tr/td[3]/div/img")
    private WebElement newDocument;

    @FindBy(xpath = "//*[@id='childObjectListContainer']/div[1]/table/tbody/tr/td[5]/div/img")
    private WebElement newMail;

    public ClipBoard clicknewDocument(){
        newDocument.click();
        return this;
    }

    public ClipBoard clicknewMail(){
        newMail.click();
        return this;
    }
}
