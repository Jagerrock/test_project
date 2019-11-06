package pageobjects.meetings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Meetings {
    private WebDriver driver;

    public Meetings (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='new-meeting']")
    private WebElement newMeeting;

    @FindBy(xpath = "//*[@id='btnOK']")
    private WebElement btnOk;

    @FindBy(xpath = "//*[@id='new-btn']")
    private WebElement newParticipant;

    @FindBy(xpath = "//*[@id='txtFilterName']")
    private WebElement name;

    @FindBy(xpath = "//*[@id='btnSearch']")
    private WebElement search;

    public Meetings clickbtnOk(){
        btnOk.click();
        return this;
    }

    public Meetings clicknewMeeting(){
        newMeeting.click();
        return this;
    }

    public Meetings clicknewParticipant(){
        newParticipant.click();
        return this;
    }

    public Meetings sendKeysname(String a){
        name.sendKeys(a);
        return this;
    }

    public Meetings clickSeach(){
        search.click();
        return this;
    }
}
