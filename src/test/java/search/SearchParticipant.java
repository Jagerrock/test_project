package search;

import commonmethods.CommonMethods;
import meetings.Meetings;
import objects.CommonBtns;
import objects.participant.ParticipantProperties;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import topmenu.TopMenu;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class SearchParticipant {
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
        Meetings meetingsElements = new Meetings(driver);
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

        topMenu.clicktopmenuMeetings();
        topMenu.clicktopmenuMeetingsPM();

        commonMethods.switchToMainFrame();

        meetingsElements.sendKeysname("Oleh Feshchenko");
        meetingsElements.clickSeach();
        Thread.sleep(1000);

        Assert.assertEquals("Oleh Feshchenko ",searchBtns.getField2());

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
