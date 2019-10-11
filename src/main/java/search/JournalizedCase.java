package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JournalizedCase {
    private WebDriver driver;

    public JournalizedCase (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='descp']")
    private WebElement caseDescription;

    @FindBy(xpath = "//*[@id='initiator_txtName']")
    private WebElement name;

    public JournalizedCase sendKeystitle(String a){
        title.sendKeys(a);
        return this;
    }

    public JournalizedCase sendKeyscaseDescription(String a){
        caseDescription.sendKeys(a);
        return this;
    }

    public JournalizedCase sendKeyscasename(String a){
        name.sendKeys(a);
        return this;
    }
}
