package pageobjects.clipboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClipBoard {
    private WebDriver driver;

    public ClipBoard (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
