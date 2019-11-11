package steps;
import cucumber.runtime.java.StepDefAnnotation;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;

import java.util.List;


public class GeneralSteps extends BaseTest {
    CommonMethods commonMethods = new CommonMethods(getDriver());
    Authentication auth = new Authentication(getDriver());

    public void loginAndGoToSite(){
        commonMethods.navigateToSite();

        if (auth.checkAuth()) {
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }
    }
}
