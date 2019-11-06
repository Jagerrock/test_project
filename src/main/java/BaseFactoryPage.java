import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseFactoryPage {
    private WebDriver driver;

    public BaseFactoryPage(){

        PageFactory.initElements(driver, this);
    }
}
