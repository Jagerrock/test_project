package steps;

import pageobjects.BaseTest;
import pageobjects.clipboard.ClipBoard;
import pageobjects.commonmethods.CommonMethods;
import pageobjects.objects.CommonBtns;
import pageobjects.objects.article.ArticleProperties;
import pageobjects.objects.company.CompanyProperties;
import pageobjects.objects.deed.DeedProperties;
import pageobjects.objects.document.DocumentProperties;
import pageobjects.objects.usualcase.CaseProperties;

public class FolderSteps extends BaseTest {
    CommonMethods commonMethods = new CommonMethods(getDriver());
    CommonBtns commonBtns = new CommonBtns(getDriver());
    ClipBoard clipBoardElements = new ClipBoard(getDriver());

    public void navigateToNewDocument(){
        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderTreeFrame();
        commonBtns.clickfolder();
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderView();
        clipBoardElements.clicknewDocument();
        commonMethods.switchToChildWindowToFrame();
    }

    public void navigateToNewMail(){
        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderTreeFrame();
        commonBtns.clickfolder();
        commonMethods.switchToDefaultContent();
        commonMethods.switchToMainFrame();
        commonMethods.switchToFolderView();
        clipBoardElements.clicknewMail();
        commonMethods.switchToChildWindowToFrame();
    }
}
