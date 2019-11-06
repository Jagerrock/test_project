package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiversList {
    private WebDriver driver;

    public ReceiversList (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement description;

    public ReceiversList sendKeystitle(String a){
        title.sendKeys(a);
        return this;
    }

    public ReceiversList sendKeysdescription(String a){
        description.sendKeys(a);
        return this;
    }
}
