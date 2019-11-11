package creation;

import org.junit.Test;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

public class CreateReceiversList {
    GeneralSteps generalSteps = new GeneralSteps();
    TopMenuSteps topMenuSteps = new TopMenuSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateReceiversList() throws Exception {
        generalSteps.loginAndGoToSite();
        topMenuSteps.navigateToNewReceiversList();
        objectSteps.fillInReceiversListDataAndSave();
    }
}
