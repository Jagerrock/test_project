package pageobjects.objects.document;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentProperties {
    private WebDriver driver;

    public DocumentProperties(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[1]/div[1]/div/div[2]/div[1]/div[2]/button")
    private WebElement documentType;

    @FindBy(xpath = "//*[@id='MainUpdatePanel']/div[1]/div[1]/div[1]/div/div[2]/div[2]/div[2]/button")
    private WebElement template;

    @FindBy(xpath = "//*[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement description;

    public DocumentProperties clickEnterdocumentType(){
        documentType.click();
        documentType.sendKeys(Keys.ARROW_DOWN);
        documentType.sendKeys(Keys.RETURN);
        return this;
    }

    public DocumentProperties clickEntertemplate(){
        template.click();
        template.sendKeys(Keys.ARROW_DOWN);
        template.sendKeys(Keys.RETURN);
        return this;
    }

    public DocumentProperties sendKeysdocumentTitle(String a){
        title.sendKeys(a);
        return this;
    }

    public DocumentProperties sendKeysdocumentDescription(String a){
        description.sendKeys(a);
        return this;
    }
}