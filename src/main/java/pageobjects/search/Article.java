package pageobjects.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Article {
    private WebDriver driver;

    public Article(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
