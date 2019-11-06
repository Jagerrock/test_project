package visibilitycheck;

import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.search.CommonSearchBtnsAndFields;
import pageobjects.authentication.Authentication;

import static org.junit.Assert.fail;

public class FolderViewVisibilityCheck {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testFolderViewCheck() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        CommonBtns commonBtns = new CommonBtns(driver);
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

        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderTreeFrame();
        commonBtns.clickfolder1();

        driver.switchTo().defaultContent();

        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderView();

        Assert.assertEquals("Mail_creation_and_search_by_Oleh", searchBtns.getFolderFiled3());

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
