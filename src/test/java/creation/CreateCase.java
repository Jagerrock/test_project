package creation;
import pageobjects.BaseTest;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.usualcase.CaseProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.topmenu.TopMenu;
import pageobjects.authentication.Authentication;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

import static org.junit.Assert.fail;
public class CreateCase extends BaseTest {
    GeneralSteps generalSteps = new GeneralSteps();
    TopMenuSteps topMenuSteps = new TopMenuSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateCase() throws Exception {
        generalSteps.loginAndGoToSite();
        topMenuSteps.navigateToNewCase();
        objectSteps.fillInCaseDataAndSave();
    }
}
