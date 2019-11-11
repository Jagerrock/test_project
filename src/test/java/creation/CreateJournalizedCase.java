package creation;

import pageobjects.BaseTest;
import org.junit.Test;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

public class CreateJournalizedCase extends BaseTest {
    GeneralSteps generalSteps = new GeneralSteps();
    TopMenuSteps topMenuSteps = new TopMenuSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateAndSearchJournalizedCase() throws Exception {
        generalSteps.loginAndGoToSite();
        topMenuSteps.navigateToNewJournalizedCase();
        objectSteps.fillInJournalizedCaseAndSave();
    }

}
