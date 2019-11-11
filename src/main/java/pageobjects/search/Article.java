package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

public class Article extends BasePage {

    public Article(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='descp1']")
    private WebElement designation;

    @FindBy(xpath = "//*[@id='descp2']")
    private WebElement description;

    public Article sendKeysDesignation(String a){
        designation.sendKeys(a);
        return this;
    }

    public Article sendKeysDescription(String a){
        description.sendKeys(a);
        return this;
    }

}
