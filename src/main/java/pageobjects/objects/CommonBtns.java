package pageobjects.objects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

public class CommonBtns extends BasePage {

    public CommonBtns(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='btnSave']")
    private WebElement btnOk;

    @FindBy(xpath = "//*[@id='btnClose']")
    private WebElement bntCancel;

    @FindBy(xpath = "//*[@id='btnApply']")
    private WebElement btnApply;

    @FindBy(xpath = "//*[@id='SaveStatusNotifier_NotSaved']")
    private WebElement statusNotSaved;

    @FindBy(xpath = "//*[@id='SaveStatusNotifier_Saved']")
    private WebElement statusSaved;

    @FindBy(xpath = "//*[@id='treeContainer']/ul/li[2]/span[3]/span")
    private WebElement folder;

    public CommonBtns clickbtnOk(){
        btnOk.click();
        return this;
    }

    public CommonBtns clickbtnApply(){
        btnApply.click();
        return this;
    }

    public CommonBtns clickfolder(){
        folder.click();
        return this;
    }

    public void enablestatusSaved(){
        Assert.assertTrue(statusSaved.isEnabled());
    }

    public void enablestatusNotSaved() {
        Assert.assertTrue(statusNotSaved.isEnabled());
    }
}


