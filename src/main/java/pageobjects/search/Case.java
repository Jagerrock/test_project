package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Case {
    private WebDriver driver;

    public Case(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='txtTitle']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='txtDescp']")
    private WebElement description;

    public Case sendKeysTitle(String a){
        title.sendKeys(a);
        return this;
    }

    public Case sendKeysDescription(String a){
        description.sendKeys(a);
        return this;
    }
}
