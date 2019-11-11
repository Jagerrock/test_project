package creation;

import org.junit.Test;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

public class CreateInstance {
    GeneralSteps generalSteps = new GeneralSteps();
    TopMenuSteps topMenuSteps = new TopMenuSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateAndSearchInstance() throws Exception {
        generalSteps.loginAndGoToSite();
        topMenuSteps.navigateToNewInstance();
        objectSteps.fillInInstanceDataAndSave();
    }
}
