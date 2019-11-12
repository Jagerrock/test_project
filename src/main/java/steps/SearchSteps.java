package steps;

import pageobjects.BaseTest;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.meetings.Meetings;
import pageobjects.search.*;
import pageobjects.search.Object;
import pageobjects.topmenu.TopMenu;

public class SearchSteps extends BaseTest {
    Article articleSearch = new Article(getDriver());
    CommonSearchBtnsAndFields searchBtns = new CommonSearchBtnsAndFields(getDriver());
    CommonMethods commonMethods = new CommonMethods(getDriver());
    Case caseSearch = new Case(getDriver());
    Company companySearch = new Company(getDriver());
    Deed deedSearch = new Deed(getDriver());
    Document documentSearch = new Document(getDriver());
    Instance instanceSearch = new Instance(getDriver());
    JournalizedCase journalizedCaseSearch = new JournalizedCase(getDriver());
    Object objectSearch = new Object(getDriver());
    Meetings meetingsElements = new Meetings(getDriver());
    ReceiversList rlSearch = new ReceiversList(getDriver());

    public void searchForArticle(){
        articleSearch.sendKeysDesignation("Article_creation_and_search_by_Oleh");
        articleSearch.sendKeysDescription("WebDriver_Chrome_12345");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();
    }
    public void searchForCase(){
        caseSearch.sendKeysTitle("Case_creation_and_search_by_Oleh");
        caseSearch.sendKeysDescription("WebDriver_Chrome");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();
    }
    public void searchForCompany(){
        companySearch.sendKeysclientName("Company_creation_and_search_by_Oleh");
        companySearch.sendKeysdescription("WebDriver_Chrome");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();

    }
    public void searchForDeed(){
        deedSearch.sendKeystitle("Deed_creation_and_search_by_Oleh");
        deedSearch.sendKeysdescription("Deed_creation_and_search_by_Oleh");
        deedSearch.sendKeysname("Oleh Feshchenko");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();

    }
    public void searchForDocument(){
        documentSearch.sendKeysTitle("Document_creation_and_search_by_Oleh");
        documentSearch.sendKeysDescription("WebDriver_Chrome");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();

    }
    public void searchForInstance(){
        commonMethods.switchToMainFrame();
        commonMethods.switchToSearchFrame();
        instanceSearch.sendKeysinstancename("Instance_creation_and_search_by_Oleh");
        instanceSearch.sendKeysdescription("WebDriver_Chrome");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();

    }
    public void searchForJournalizedCase(){
        journalizedCaseSearch.sendKeystitle("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseSearch.sendKeyscaseDescription("Journalized_case_creation_and_search_by_Oleh_WebDriver");
        journalizedCaseSearch.sendKeyscasename("of_Oleh_WebDriver");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();

    }
    public void searchForMail(){
        objectSearch.sendKeysobjectTitle("Mail_creation_and_search_by_Oleh");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();
    }
    public void searchForMeeting(){
        objectSearch.sendKeysobjectDescription("Meeting_creation_and_search_by_Oleh");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();
    }
    public void searchForParticipant() throws Exception{
        meetingsElements.sendKeysname("Oleh Feshchenko");
        meetingsElements.clickSeach();
        Thread.sleep(1000);

    }
    public void searchForReceiversList(){
        rlSearch.sendKeysReceiversListTitle("Recievers_list_creation_and_search_by_Oleh");
        rlSearch.sendKeysReceiversListDescription("WebDriver_Chrome");
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        searchBtns.clickbtnSearch();
        commonMethods.switchToSearchResultFrame();
    }
}
