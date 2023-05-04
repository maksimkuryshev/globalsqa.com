import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[contains(@ng-click,'customer()')]")
    private WebElement customerLoginButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/button")
    private WebElement managerLoginButton;

    @FindBy(id="userSelect")
    private WebElement choiceYourName;

    @FindBy(xpath = "//*[@id='userSelect']/option[3]")
    private WebElement customerHarryPotter;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
    private WebElement  loginButton;

    public void clickcustomerLogin() {
        customerLoginButton.click();
    }
    public void clickmanagerLogin() {
        managerLoginButton.click();
    }
    public void clickYourName(){
        choiceYourName.click();
    }
    public void clickHarryPotter(){
        customerHarryPotter.click();
    }
    public void clickLoginBtn(){
        loginButton.click();
    }

}
