package creation;

import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.receiverslist.ReceiversListProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;
import pageobjects.authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateReceiversList {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCreateAndSearchReceiversList() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        ReceiversListProperties rlElements = new ReceiversListProperties(driver);
        CommonBtns commonBtns = new CommonBtns(driver);
        TopMenu topMenu = new TopMenu(driver);
        Authentication auth = new Authentication(driver);

        commonMethods.navigateToSite();
        commonMethods.windowMaximize();
        commonMethods.implicitWait();

        if(driver.getCurrentUrl().equals("https://vm-pld-49.pld2.local/adfs/ls")){
            auth.sendKeysLogin();
            auth.sendKeysPassword();
            auth.clickbtnSignIn();
        }

        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewReceiversList();

        commonMethods.switchToChildWindowToFrame();

        rlElements.sendKyesreceiverslistTitle("Recievers_list_creation_and_search_by_Oleh");
        rlElements.sendKeysreceiverslistDescription("WebDriver_Chrome");

        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();

        driver.close();
        commonMethods.childWindowCloseCheck();

    }

}
