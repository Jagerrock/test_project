package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instance {
    private WebDriver driver;

    public Instance (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='CustomerName']")
    private WebElement instanceName;

    @FindBy(xpath = "//*[@id='Descp']")
    private WebElement description;

    public Instance sendKeysinstancename(String a){
        instanceName.sendKeys(a);
        return this;
    }

    public Instance sendKeysdescription(String a){
        description.sendKeys(a);
        return this;
    }
}
