package creation;

import clipboard.ClipBoard;
import commonmethods.CommonMethods;
import objects.CommonBtns;
import objects.mail.MailProperties;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import search.CommonSearchBtnsAndFields;
import search.Object;
import topmenu.TopMenu;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateMail {
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
        MailProperties mailElements = new MailProperties(driver);
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

        clipBoardElements.clicknewMail();

        commonMethods.switchToChildWindowToFrame();

        mailElements.sendKeysto("oleh.feshchenko@sigmaukraine.com");
        mailElements.sendKeyssubject("Mail_creation_and_search_by_Oleh");
        mailElements.sendKeysbody("WebDriver_Chrome");

        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

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
