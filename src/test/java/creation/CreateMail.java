package creation;

import pageobjects.BaseTest;
import pageobjects.clipboard.ClipBoard;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.mail.MailProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.authentication.Authentication;
import steps.FolderSteps;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

import static org.junit.Assert.fail;

public class CreateMail extends BaseTest {
    GeneralSteps generalSteps = new GeneralSteps();
    FolderSteps folderSteps = new FolderSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateMail() throws Exception {
        generalSteps.loginAndGoToSite();
        folderSteps.navigateToNewMail();
        objectSteps.fillInMailDataAndSave();
    }
}
