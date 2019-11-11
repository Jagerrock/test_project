package pageobjects.search;

import pageobjects.commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;
import pageobjects.authentication.Authentication;

import static org.junit.Assert.fail;

public class SearchJournalizedCase {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchJournalizedCase() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        TopMenu topMenu = new TopMenu(driver);
        JournalizedCase journalizedCaseSearch = new JournalizedCase(driver);
        CommonSearchBtnsAndFields searchBtns = new CommonSearchBtnsAndFields(driver);
        Authentication auth = new Authentication(driver);

        commonMethods.navigateToSite();
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if(driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")){
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }

        topMenu.clicktopmenuSeach();
        topMenu.clicktopmenuSearchJournalizedCase();

        commonMethods.switchToMainFrame();
        commonMethods.switchToSearchFrame();

        journalizedCaseSearch.sendKeystitle("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseSearch.sendKeyscaseDescription("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseSearch.sendKeyscasename("of_Oleh_WebDriver");

        driver.switchTo().defaultContent();

        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();

        commonMethods.switchToSearchResultFrame();

        Assert.assertEquals("of_Oleh_WebDriver", searchBtns.getField3());
        Assert.assertEquals("Journalized_case_creation_and_search_by_Oleh_WebDriver", searchBtns.getField4());

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
