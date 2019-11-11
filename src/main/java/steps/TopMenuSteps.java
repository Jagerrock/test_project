package steps;

import pageobjects.BaseTest;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.meetings.Meetings;
import pageobjects.objects.meeting.MeetingProperties;
import pageobjects.registration.Registration;
import pageobjects.topmenu.TopMenu;

public class TopMenuSteps extends BaseTest {
    CommonMethods commonMethods = new CommonMethods(getDriver());
    TopMenu topMenu = new TopMenu(getDriver());
    Registration registrationElements = new Registration(getDriver());
    Meetings meetingsElements = new Meetings(getDriver());

    public void navigateToNewArticle(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewArticle();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewCase(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewUsualCase();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewCompany(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewCompany();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewDeed(){
        topMenu.clicktopmenuRegistration();
        topMenu.clicktopmenuRegistrationRegistration();
        commonMethods.switchToMainFrame();
        commonMethods.switchToDeedListFrame();
        registrationElements.clickregistrationNewDeed();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewInstance(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewInstance();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewJournalizedCase(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewJournalizedCase();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewMeeting(){
        topMenu.clicktopmenuMeetings();
        topMenu.clicktopmenuMeetingsMM();
        commonMethods.switchToMainFrame();
        meetingsElements.clicknewMeeting();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewMeetingPm(){
        topMenu.clicktopmenuMeetings();
        topMenu.clicktopmenuMeetingsPM();
        commonMethods.switchToMainFrame();
        meetingsElements.clicknewParticipant();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewReceiversList(){
        topMenu.clicktopmenuNew();
        topMenu.clicktopmenuNewReceiversList();
        commonMethods.switchToChildWindowToFrame();
    }
}
