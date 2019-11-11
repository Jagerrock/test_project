package creation;

import org.junit.Test;
import steps.GeneralSteps;
import steps.ObjectSteps;
import steps.TopMenuSteps;

public class CreateParticipant {
    GeneralSteps generalSteps = new GeneralSteps();
    TopMenuSteps topMenuSteps = new TopMenuSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateParticipant() throws Exception {
        generalSteps.loginAndGoToSite();
        topMenuSteps.navigateToNewMeetingPm();
        objectSteps.fillInMeetingParticipantDataAndSave();
    }
}
