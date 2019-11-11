package steps;

import pageobjects.BaseTest;
import pageobjects.clipboard.ClipBoard;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.article.ArticleProperties;
import pageobjects.objects.company.CompanyProperties;
import pageobjects.objects.deed.DeedProperties;
import pageobjects.objects.document.DocumentProperties;
import pageobjects.objects.instance.InstanceProperties;
import pageobjects.objects.journalizedcase.JournalizedCaseProperties;
import pageobjects.objects.mail.MailProperties;
import pageobjects.objects.meeting.MeetingProperties;
import pageobjects.objects.participant.ParticipantProperties;
import pageobjects.objects.usualcase.CaseProperties;
import pageobjects.search.Document;

public class ObjectSteps extends BaseTest {
    CommonMethods commonMethods = new CommonMethods(getDriver());
    ArticleProperties articleElements = new ArticleProperties(getDriver());
    CommonBtns commonBtns = new CommonBtns(getDriver());
    CaseProperties caseElements = new CaseProperties(getDriver());
    CompanyProperties companyElements = new CompanyProperties(getDriver());
    DeedProperties deedElements = new DeedProperties(getDriver());
    DocumentProperties documentElements = new DocumentProperties(getDriver());
    InstanceProperties instanceElements = new InstanceProperties(getDriver());
    JournalizedCaseProperties journalizedCaseElements = new JournalizedCaseProperties(getDriver());
    MailProperties mailElements = new MailProperties(getDriver());
    MeetingProperties meetingElements = new MeetingProperties(getDriver());
    ParticipantProperties participantElements = new ParticipantProperties(getDriver());

    public void fillInArticleDataAndSave(){
        articleElements.sendKeysarticleDesignation("Article_is_created_by_me");
        articleElements.sendKeysarticleDescription("WebDriver_Chrome");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInCaseDataAndSave(){
        caseElements.sendKeysusualcaseTitle("Case_creation_and_search_by_Oleh");
        caseElements.sendKeysusualcaseDescription("WebDriver_Chrome");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();

    }

    public void fillInCompanyDataAndSave(){
        companyElements.sendKeyscompanyClientName("Company_creation_and_search_by_Oleh");
        companyElements.sendKeyscompanyClientDescription("WebDriver_Chrome");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInDeedDataAndSave() throws Exception{
        deedElements.clickEnterdeedCreated();
        deedElements.clickdeedCreatedElement();
        deedElements.clickdeedDiary();
        deedElements.clickdeedDiaryElement();
        Thread.sleep(1000);
        deedElements.sendKeysdeedBusinessCode("of");
        Thread.sleep(1000);
        deedElements.sendKeysdeedDeedType("of");
        Thread.sleep(1000);
        deedElements.sendKeysdeedTitle("Deed_creation_and_search_by_Oleh");
        deedElements.sendKeysdeedName("Oleh Feshchenko");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInDocumentDataAndSave() throws Exception{
        documentElements.sendKeysdocumentTitle("Document_creation_and_search_by_Oleh");
        documentElements.sendKeysdocumentDescription("WebDriver_Chrome");
        Thread.sleep(1000);
        documentElements.clickEnterdocumentType();
        Thread.sleep(1000);
        documentElements.clickEntertemplate();
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInInstanceDataAndSave() throws Exception{
        instanceElements.sendKeysinstanceName("Instance_creation_and_search_by_Oleh");
        instanceElements.sendKeysinstanceDescription("WebDriver_Chrome");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInJournalizedCaseAndSave() throws Exception{
        journalizedCaseElements.clickEnterjournalizedcaseCreated();
        journalizedCaseElements.clickjournalizedcaseDiary();
        journalizedCaseElements.clickjournalizedcaseDiaryElement();
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysEnterjournalizedcaseBusinessCode("of");
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysEnterjournalizedcaseCaseType("of");
        Thread.sleep(1000);
        journalizedCaseElements.sendKeysjournalizedcaseTitle("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseElements.sendKeysjournalizedcaseName("of_Oleh_WebDriver");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInMailDataAndSave(){
        mailElements.sendKeysto("oleh.feshchenko@sigmaukraine.com");
        mailElements.sendKeyssubject("Mail_creation_and_search_by_Oleh");
        mailElements.sendKeysbody("WebDriver_Chrome");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInMeetingDataAndSave() throws Exception{
        meetingElements.clickEnterInstance();
        Thread.sleep(500);
        meetingElements.SendKeysDescription("Meeting_creation_and_search_by_Oleh");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }

    public void fillInMeetingParticipantDataAndSave(){
        participantElements.sendKeysfirstName("Oleh");
        participantElements.sendKeyslastNmae("Feshchenko");
        commonBtns.enablestatusNotSaved();
        commonBtns.clickbtnApply();
        commonBtns.enablestatusSaved();
        commonBtns.clickbtnOk();
        commonMethods.closePage();
        commonMethods.childWindowCloseCheck();
    }
}
