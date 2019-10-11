package creation;

import commonmethods.CommonMethods;
import objects.CommonBtns;
import objects.document.DocumentProperties;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import clipboard.ClipBoard;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateDocument {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchArticle() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        DocumentProperties documentElements = new DocumentProperties(driver);
        ClipBoard clipBoardElements = new ClipBoard(driver);
        CommonBtns commonBtns = new CommonBtns(driver);
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

        clipBoardElements.clicknewDocument();

        commonMethods.switchToChildWindowToFrame();
        documentElements.sendKeysdocumentTitle("Document_creation_and_search_by_Oleh");
        documentElements.sendKeysdocumentDescription("WebDriver_Chrome");
        Thread.sleep(1000);
        documentElements.clickEnterdocumentType();
        Thread.sleep(1000);
        documentElements.clickEntertemplate();

        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

        driver.close();
        commonMethods.childWindowCloseCheck();

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
