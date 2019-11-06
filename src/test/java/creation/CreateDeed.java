package creation;

import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.deed.DeedProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;
import pageobjects.registration.Registration;
import pageobjects.authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateDeed {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchDeed() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        DeedProperties deedElements = new DeedProperties(driver);
        Registration registrationElements = new Registration(driver);
        CommonBtns commonBtns = new CommonBtns(driver);
        TopMenu topMenu = new TopMenu(driver);
        Authentication auth = new Authentication(driver);

        driver.get(commonMethods.baseUrl());
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if(driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")){
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }

        topMenu.clicktopmenuRegistration();
        topMenu.clicktopmenuRegistrationRegistration();

        commonMethods.switchToMainFrame();
        commonMethods.switchToDeedListFrame();

        registrationElements.clickregistrationNewDeed();
        commonMethods.switchToChildWindowToFrame();

        deedElements.clickEnterdeedCreated();
        deedElements.clickdeedCreatedElement();
        deedElements.clickdeedDiary();
        deedElements.clickdeedDiaryElement();
        Thread.sleep(1000);
        deedElements.sendKeysdeedBusinessCode("of");
        Thread.sleep(1000);
        deedElements.sendKeysdeedDeedType("of");
        Thread.sleep(1000);
        deedElements.sendKeysdeedTitle("Deed_creation_and_search_by_Oleh");

        deedElements.sendKeysdeedName("Oleh Feshchenko");

        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

        driver.close();
        commonMethods.childWindowCloseCheck();;

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
