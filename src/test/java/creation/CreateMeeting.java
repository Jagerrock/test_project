package creation;

import commonmethods.CommonMethods;
import objects.CommonBtns;
import objects.meeting.MeetingProperties;
import meetings.Meetings;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import topmenu.TopMenu;
import authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateMeeting {
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
        MeetingProperties meetingElements = new MeetingProperties(driver);
        Meetings meetingsElements = new Meetings(driver);
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

        topMenu.clicktopmenuMeetings();
        topMenu.clicktopmenuMeetingsMM();

        commonMethods.switchToMainFrame();

        meetingsElements.clicknewMeeting();

        commonMethods.switchToChildWindowToFrame();

        meetingElements.clickEnterInstance();
        Thread.sleep(500);
        meetingElements.SendKeysDescription("Meeting_creation_and_search_by_Oleh");

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
