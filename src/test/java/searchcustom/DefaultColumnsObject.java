package searchcustom;

import pageobjects.administration.search.Search;
import pageobjects.administration.search.SearchObject;
import pageobjects.authentication.Authentication;
import pageobjects.commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;

import static org.junit.Assert.fail;

public class DefaultColumnsObject {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testColumnsVisibilityCheck () throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        TopMenu topMenu = new TopMenu(driver);
        Search search = new Search(driver);
        Authentication auth = new Authentication(driver);
        SearchObject searchObject = new SearchObject(driver);

        commonMethods.navigateToSite();
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if(driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")){
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }

        topMenu.clicktopmenuSettings();
        topMenu.clicktopmenuSettingsAdministration();

        commonMethods.switchToMainFrame();
        commonMethods.switchToNavigationPanelAdmin();

        search.clicksearchAdmin();
        driver.switchTo().defaultContent();
        commonMethods.switchToMainFrame();
        commonMethods.switchToContentPanelFrame();
        search.clickmodule();
        search.clickmoduleObject();

        Thread.sleep(1000);

        Assert.assertFalse(search.checkUseCustomSearchPages());

        Assert.assertTrue(searchObject.checkidentifier());
        Assert.assertTrue(searchObject.checktitle());
        Assert.assertTrue(searchObject.checkdescp());
        Assert.assertTrue(searchObject.checkcreatedBy());
        Assert.assertTrue(searchObject.checkcreatedDate());
        Assert.assertTrue(searchObject.checkownerPerson());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
