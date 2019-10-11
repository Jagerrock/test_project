package search;

import commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import topmenu.TopMenu;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class SearchInstance {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchInstance() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        TopMenu topMenu = new TopMenu(driver);
        Instance instanceSearch = new Instance(driver);
        CommonSearchBtnsAndFields searchBtns = new CommonSearchBtnsAndFields(driver);
        Authentication auth = new Authentication(driver);

        driver.get(commonMethods.baseUrl());
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if(driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")){
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }

        topMenu.clicktopmenuSeach();
        topMenu.clicktopmenuSearchInstance();

        commonMethods.switchToMainFrame();
        commonMethods.switchToSearchFrame();

        instanceSearch.sendKeysinstancename("Instance_creation_and_search_by_Oleh");
        instanceSearch.sendKeysdescription("WebDriver_Chrome");

        driver.switchTo().defaultContent();

        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();

        commonMethods.switchToSearchResultFrame();

        Assert.assertEquals("Instance_creation_and_search_by_Oleh", searchBtns.getField3());
        Assert.assertEquals("WebDriver_Chrome",searchBtns.getField4());

        driver.close();
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
