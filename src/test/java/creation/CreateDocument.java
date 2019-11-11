package creation;

import pageobjects.BaseTest;
import org.junit.Test;
import steps.FolderSteps;
import steps.GeneralSteps;
import steps.ObjectSteps;

public class CreateDocument extends BaseTest {
    GeneralSteps generalSteps = new GeneralSteps();
    FolderSteps folderSteps = new FolderSteps();
    ObjectSteps objectSteps = new ObjectSteps();

    @Test
    public void testCreateDocument() throws Exception {
        generalSteps.loginAndGoToSite();
        folderSteps.navigateToNewDocument();
        objectSteps.fillInDocumentDataAndSave();
    }
}
