package steps.com.ua;

import org.openqa.selenium.WebDriver;
import pageobjects.BasePage;
import pageobjects.BaseTest;
import pageobjects.authentication.Authentication;
import pageobjects.commonmethods.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.article.ArticleProperties;
import pageobjects.topmenu.TopMenu;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class ObjectCreationStepdefs extends BaseTest {



    @Before("Test1")

    @Given("Navigation to the project")
    public void navigationToTheProject() {
        Authentication auth = new Authentication(getDriver());
        CommonMethods commonMethods = new CommonMethods(getDriver());
        commonMethods.navigateToSite();
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if (auth.checkAuth()) {
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }
    }

    @When("You fill in all the data and click OK")
    public void youFillInAllTheDataAndClickOK(DataTable table) {
        List data = table.row(0);

        ArticleProperties articleElements = new ArticleProperties(getDriver());
        TopMenu topMenu = new TopMenu(getDriver());
        CommonMethods commonMethods = new CommonMethods(getDriver());
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewArticle();

        commonMethods.switchToChildWindowToFrame();

        articleElements.sendKeysarticleDesignation(data.get(0));
        articleElements.sendKeysarticleDescription();

    }

    @Then("The object has been created")
    public void theObjectHasBeenCreated() {
        CommonBtns commonBtns = new CommonBtns(getDriver());
        CommonMethods commonMethods = new CommonMethods(getDriver());
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

        getDriver().close();
        commonMethods.childWindowCloseCheck();
    }

}



