package visibilitycheck;

import commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import registration.Registration;
import search.CommonSearchBtnsAndFields;
import topmenu.TopMenu;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class TodaysPostlistVisibilityCheck {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testTodaysPostlistCheck() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        Registration registrationElements = new Registration(driver);
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

        topMenu.clicktopmenuRegistration();
        topMenu.clicktopmenuRegistrationPostlist();

        commonMethods.switchToMainFrame();
        commonMethods.switchToPostlistFrame();

        registrationElements.clickEnterSelectDiary();
        registrationElements.clickEnterSelectPostlist();

        Assert.assertEquals("Oleh Feshchenko",searchBtns.getField4());
        Assert.assertEquals("Deed_creation_and_search_by_Oleh",searchBtns.getField5());

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
