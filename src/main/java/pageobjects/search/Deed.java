package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deed {
    private WebDriver driver;

    public Deed (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement description;

    @FindBy(xpath = "//*[@id='initiator_txtName']")
    private WebElement name;

    public Deed sendKeystitle(String a){
        title.sendKeys(a);
        return this;
    }

    public Deed sendKeysdescription(String a){
        description.sendKeys(a);
        return this;
    }

    public Deed sendKeysname(String a){
        name.sendKeys(a);
        return this;
    }
}
