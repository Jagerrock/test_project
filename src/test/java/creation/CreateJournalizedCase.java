package creation;

import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.journalizedcase.JournalizedCaseProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;
import pageobjects.authentication.Authentication;
import static org.junit.Assert.fail;

public class CreateJournalizedCase {
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
        JournalizedCaseProperties journalizedCaseElements = new JournalizedCaseProperties(driver);
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

        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewJournalizedCase();

        commonMethods.switchToChildWindowToFrame();

        journalizedCaseElements.clickEnterjournalizedcaseCreated();

        journalizedCaseElements.clickjournalizedcaseDiary();
        journalizedCaseElements.clickjournalizedcaseDiaryElement();
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysEnterjournalizedcaseBusinessCode("of");
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysEnterjournalizedcaseCaseType("of");
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysjournalizedcaseTitle("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseElements.sendKeysjournalizedcaseName("of_Oleh_WebDriver");

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
