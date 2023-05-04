import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BankPage {
    public WebDriver driver;

    public BankPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[contains(@ng-click, 'addCust()')]")
    private WebElement customerBtn;
    @FindBy(xpath = "//*[contains(@ng-click, 'openAccount()')]")
    private WebElement accountBtn;
    @FindBy(xpath = "//*[contains(@ng-click, 'showCust()')]")
    private WebElement showBtn;
    @FindBy(xpath = "//*[contains(@ng-click, 'home()')]")
    private WebElement buttonHome;


        public void clickcustomerBtn() {
            customerBtn.click();
        }
        public void clickAccountBtn() {
            accountBtn.click();
        }
        public void clickshowBtn () {
            showBtn.click();
        }
        public void clickbuttonHome () {
            buttonHome.click();
        }

}