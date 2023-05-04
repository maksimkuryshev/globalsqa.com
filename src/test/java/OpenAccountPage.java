import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OpenAccountPage {
    public WebDriver driver;

    public OpenAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "userSelect")
    private WebElement customerButton;

    @FindBy(id = "currency")
    private WebElement currencyButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    private WebElement processButton;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[7]")
    private WebElement personCustomer;

    @FindBy(xpath = "//*[@id=\"currency\"]/option[2]")
    private WebElement СurrencyDollar;


    public void clickCustomerButton() {
        customerButton.click();
    }

    public void clickCurrencyButton() {
        currencyButton.click();
    }

    public void clickProcessButton() {
       processButton.click();
    }
    public void clickPersonCustomer() {
        personCustomer.click();
    }
    public void clickСurrencyDollar() {
        СurrencyDollar.click();
    }
}

