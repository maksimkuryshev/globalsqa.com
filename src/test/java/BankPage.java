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
    private WebElement customerButton;
    @FindBy(xpath = "//*[contains(@ng-click, 'openAccount()')]")
    private WebElement accountButton;
    @FindBy(xpath = "//*[contains(@ng-click, 'showCust()')]")
    private WebElement showButton;
    @FindBy(xpath = "//*[contains(@ng-click, 'home()')]")
    private WebElement homeButton;


        public void clickCustomerButton() {
            customerButton.click();
        }
        public void clickAccountButton() {
            accountButton.click();
        }
        public void clickShowButton () {
            showButton.click();
        }
        public void clickHomeButton () {
            homeButton.click();
        }

}