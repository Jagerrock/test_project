package objects.receiverslist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReceiversListProperties {
    private WebDriver driver;

    public ReceiversListProperties(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement receiverslistTitle;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement receiverslistDescription;

    public ReceiversListProperties sendKyesreceiverslistTitle(String a){
        receiverslistTitle.sendKeys(a);
        return this;
    }

    public ReceiversListProperties sendKeysreceiverslistDescription(String a){
        receiverslistDescription.sendKeys(a);
        return this;
    }
}
