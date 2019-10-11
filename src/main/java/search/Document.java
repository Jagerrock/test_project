package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document {
    private WebDriver driver;

    public Document (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement description;

    public Document sendKeysTitle(String a){
        title.sendKeys(a);
        return this;
    }

    public Document sendKeysDescription(String a){
        description.sendKeys(a);
        return this;
    }
}
