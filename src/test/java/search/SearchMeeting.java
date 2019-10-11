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

public class SearchMeeting {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchMeeting() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        Object objectSearch = new Object(driver);
        TopMenu topMenu = new TopMenu(driver);
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
        topMenu.clicktopmenuSearchObject();

        commonMethods.switchToMainFrame();
        commonMethods.switchToSearchFrame();

        objectSearch.sendKeysobjectDescription("Meeting_creation_and_search_by_Oleh");

        driver.switchTo().defaultContent();

        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();

        commonMethods.switchToSearchResultFrame();

        Assert.assertEquals("Meeting_creation_and_search_by_Oleh",searchBtns.getField4());

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
