package steps.com.ua;

import authentication.Authentication;
import commonmethods.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import objects.CommonBtns;
import objects.article.ArticleProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import topmenu.TopMenu;

import java.util.List;

import static org.junit.Assert.fail;


public class ObjectCreationStepdefs1 {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before("@Test2")
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Navigation to the project1")
    public void navigationToTheProject() {
        Authentication auth = new Authentication(driver);
        CommonMethods commonMethods = new CommonMethods(driver);
        driver.get(commonMethods.baseUrl());
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if (driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")) {
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }
    }

    @When("You fill in all the data and click OK1")
    public void youFillInAllTheDataAndClickOK(DataTable table) {
        List data = table.row(0);
        System.out.println(data.get(0));
        CommonMethods commonMethods = new CommonMethods(driver);
        ArticleProperties articleElements = new ArticleProperties(driver);
        TopMenu topMenu = new TopMenu(driver);

        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewArticle();

        commonMethods.switchToChildWindowToFrame();

        articleElements.sendKeysarticleDesignation(data.get(0));
        articleElements.sendKeysarticleDescription();

    }

    @Then("The object has been created1")
    public void theObjectHasBeenCreated() {
        CommonMethods commonMethods = new CommonMethods(driver);
        CommonBtns commonBtns = new CommonBtns(driver);

        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

        driver.close();
        commonMethods.childWindowCloseCheck();
    }

    @After("@Test2")
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}



