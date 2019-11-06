package creation;

import pageobjects.commonmethods.CommonMethods;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.*;
import pageobjects.objects.article.ArticleProperties;
import pageobjects.objects.CommonBtns;
import pageobjects.topmenu.TopMenu;
import pageobjects.authentication.Authentication;

import static org.junit.Assert.fail;

public class CreateArticle {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

  /*  @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    } */

    @Test
    public void testCreateArticle() throws Exception {
        CommonMethods commonMethods = new CommonMethods(driver);
        ArticleProperties articleElements = new ArticleProperties(driver);
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
        topMenu.clicktopmenuNewArticle();

        commonMethods.switchToChildWindowToFrame();

        articleElements.sendKeysarticleDesignation("");
        articleElements.sendKeysarticleDescription();

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

