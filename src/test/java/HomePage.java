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
    private WebElement customerLogin;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/button")
    private WebElement managerLogin;

    @FindBy(id="userSelect")
    private WebElement yourName;

    @FindBy(xpath = "//*[@id='userSelect']/option[3]")
    private WebElement harryPotter;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/form/button")
    private WebElement  loginBtn;

    public void clickcustomerLogin() {
        customerLogin.click();
    }
    public void clickmanagerLogin() {
        managerLogin.click();
    }
    public void clickyourName(){
        yourName.click();
    }
    public void clickharrypotter(){
        harryPotter.click();
    }
    public void clickloginBtn(){
        loginBtn.click();
    }

}
