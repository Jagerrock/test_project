package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object {
    private WebDriver driver;

    public Object(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement objectTitle;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement objectDescription;

    public Object sendKeysobjectTitle(String a){
        objectTitle.sendKeys(a);
        return this;
    }

    public Object sendKeysobjectDescription(String a){
        objectDescription.sendKeys(a);
        return this;
    }

}


