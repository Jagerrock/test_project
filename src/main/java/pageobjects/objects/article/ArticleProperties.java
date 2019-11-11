package pageobjects.objects.article;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;
import pageobjects.search.Object;

public class ArticleProperties extends BasePage {

    public ArticleProperties(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id='descp1']")
    private WebElement articleDesignation;

    @FindBy(xpath = "//*[@id='descp2']")
    private WebElement articleDescription;

    @FindBy(xpath = "//*[@id='articleNo']")
    private WebElement articleArticleNBR;

    @FindBy(xpath = "//*[@id='material']")
    private WebElement articleMaterial;

    @FindBy(xpath = "//*[@id='unit']")
    private WebElement articleUnit;

    @FindBy(xpath = "//*[@id='safetyStock']")
    private WebElement articleSafetyStock;

    @FindBy(xpath = "//*[@id='UserControl_countryID']//div[@class='filter-option-inner-inner']")
    private WebElement articleCounrtyOfOrigin;

    @FindBy(xpath = "//*[@id='stdCost']")
    private WebElement articleStandardCost;

    @FindBy(xpath = "//*[@id='stdPrice']")
    private WebElement articleStandardPrice;

    @FindBy(xpath = "//*[@id='calcPrice']")
    private WebElement articleCalculatedManufacturedCost;

    @FindBy(xpath = "//*[@id='vatCode']")
    private WebElement articleVatCode;

    @FindBy(xpath = "//*[@id='Tab_2']/span[2]/div/button/div/div/div")
    private WebElement articleMainSupplier;

    @FindBy(xpath = "//*[@id='Tab_2']/span[3]/div/button/div/div/div")
    private WebElement articleSecondarySupplier;

    @FindBy(xpath = "//*[@id='UserControl_statusID']/div/button/div/div/div")
    private WebElement articleStatus;

    public ArticleProperties sendKeysarticleDesignation(String a){
        articleDesignation.sendKeys(a);
        return this;
    }
    public ArticleProperties sendKeysarticleDescription(String a){
        articleDescription.sendKeys(a);
        return this;
    }
}
