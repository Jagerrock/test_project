package searchcustom;

import pageobjects.administration.search.Search;
import pageobjects.administration.search.SearchArticle;
import pageobjects.authentication.Authentication;
import pageobjects.commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.search.CommonSearchBtnsAndFields;
import pageobjects.topmenu.TopMenu;

import static org.junit.Assert.fail;

public class TypeAndAttributesCheck {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void PositiveIntCheck () throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        TopMenu topMenu = new TopMenu(driver);
        Search search = new Search(driver);
        Authentication auth = new Authentication(driver);
        SearchArticle searchArticle = new SearchArticle(driver);
        CommonSearchBtnsAndFields commonSearchBtnsAndFields = new CommonSearchBtnsAndFields(driver);

        driver.get(commonMethods.baseUrl());
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
        search.clickmoduleArticle();

        Thread.sleep(1000);

        search.clickUseCustomSearchPagesLabel();

        searchArticle.clickarticlenNoCheckBox();
        searchArticle.clicktitleCheckBox();
        searchArticle.clickdescpCheckBox();
        searchArticle.clickcreatedByCheckBox();
        searchArticle.clickcreatedDateCheckBox();
        search.clickSave();

        driver.switchTo().defaultContent();

        topMenu.clicktopmenuSeach();
        topMenu.clicktopmenuSearchArticle();

        commonMethods.switchToMainFrame();
        commonMethods.switchToSearchResultFrame();
        commonSearchBtnsAndFields.checktypeHeader();
        commonSearchBtnsAndFields.checkattributesHeader();
        driver.switchTo().defaultContent();
        topMenu.clicktopmenuSettings();
        topMenu.clicktopmenuSettingsAdministration();

        commonMethods.switchToMainFrame();
        commonMethods.switchToNavigationPanelAdmin();

        search.clicksearchAdmin();
        driver.switchTo().defaultContent();
        commonMethods.switchToMainFrame();
        commonMethods.switchToContentPanelFrame();
        search.clickmodule();
        search.clickmoduleArticle();

        Thread.sleep(1000);

        search.clickUseCustomSearchPagesLabel();
        search.clickSave();
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

