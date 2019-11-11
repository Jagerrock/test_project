package pageobjects.commonmethods;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends BasePage {

    public CommonMethods(WebDriver driver) {
      super(driver);
    }

    public void switchToChildWindowToFrame(){
        try {
            Set<String> windowHandles = Sets.newLinkedHashSet(driver.getWindowHandles());
            windowHandles.remove(driver.getWindowHandle());
            driver.switchTo().window(Iterables.getLast(windowHandles));
            WebElement MyFrame =  driver.findElement(By.cssSelector("iframe.tabContent"));
            driver.switchTo().frame(MyFrame);
        }
        catch (NullPointerException e){
            System.out.println("Something went wrong.");
        }
    }

    public void switchToMainFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='defaultFrame']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToMainFrameStartPage(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='Form1']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToFrame(){
        WebElement MyFrame =  driver.findElement(By.cssSelector("iframe.tabContent"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToFolderTreeFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='FolderTree']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToPostlistFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='TodaysPostListContainer']/iframe"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToFolderView(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='ObjList']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToDeedListFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='DeedListFrame']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToSearchResultFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='resultFrame']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToSearchFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='searchFormSearchForm']"));
        driver.switchTo().frame(MyFrame);
    }

    public void switchToParentWindow(){
        List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        String windowParent = windowHandles.get(0);
        driver.switchTo().window(windowParent);
    }

    public void childWindowCloseCheck(){
        List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertEquals(windowHandles.size(), 1);
    }

    public void switchToNavigationPanelAdmin(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='NavigationPanelFrame']"));
        driver.switchTo().frame(MyFrame);

    }

    public void switchToContentPanelFrame(){
        WebElement MyFrame =  driver.findElement(By.xpath("//*[@id='ContentPanelFrame']"));
        driver.switchTo().frame(MyFrame);

    }

    public void implicitWait(){
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        catch (NullPointerException e){
            System.out.println("Something went wrong.");
        }

    }

    public void windowMaximize() {
        try {
            driver.manage().window().maximize();
        }
        catch (NullPointerException e){
            System.out.println("Something went wrong.");
        }
    }

    public void closePage(){
        driver.close();
    }

    public void navigateToSite(){
        try {
            driver.get("https://vm-pld-45.i.sigmaukraine.com/Platina/framesetStandards.aspx");
        }
        catch (NullPointerException e){
            System.out.println("Something went wrong.");
        }
    }

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }
}
