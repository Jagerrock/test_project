package pageobjects.search;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CommonSearchBtnsAndFields {
    private WebDriver driver;

    public CommonSearchBtnsAndFields(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id='btnStartSearch']")
    private WebElement bthSearch;

    public void clickbtnSearch(){
        bthSearch.click();
    }

    @FindBy(xpath = "//td[2]")
    private WebElement field2;

    @FindBy(xpath = "//td[3]")
    private WebElement field3;

    @FindBy(xpath = "//td[4]")
    private WebElement field4;

    @FindBy(xpath = "//td[5]")
    private WebElement field5;

    @FindBy(xpath = "//*[@class='txtDefault odd']//td[3]")
    private WebElement folderfield3;

    @FindBy(xpath = "//*[@id=\"objectList\"]/thead/tr/th[1]")
    private WebElement typeHeader;

    @FindBy(xpath = "//*[@id=\"objectList\"]/thead/tr/th[2]")
    private WebElement attributesHeader;

    public String getField2(){
        String a = field2.getText();
        return a;
    }

    public String getField3(){
        String a = field3.getText();
        return a;
    }

    public String getField4(){
        String a = field4.getText();
        return a;
    }

    public String getField5(){
        String a = field5.getText();
        return a;
    }

    public String getFolderFiled3(){
        String a = folderfield3.getText();
        return a;
    }

    public void checktypeHeader(){
        Assert.assertEquals("TYPE",typeHeader.getText());

    }
    public void checkattributesHeader(){
        Assert.assertEquals("ATTRIBUTES",attributesHeader.getText());
    }
}
