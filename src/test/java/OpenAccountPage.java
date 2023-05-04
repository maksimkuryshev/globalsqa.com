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
    private WebElement Btncustomer;

    @FindBy(id = "currency")
    private WebElement Btncurrency;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    private WebElement buttonProcess;

    @FindBy(xpath = "//*[@id=\"userSelect\"]/option[7]")
    private WebElement personCustomer;

    @FindBy(xpath = "//*[@id=\"currency\"]/option[2]")
    private WebElement currencyDollar;


    public void clickBtncustomer() {
        Btncustomer.click();
    }

    public void clickBtncurrency() {
        Btncurrency.click();
    }

    public void clickbuttonProcess() {
        buttonProcess.click();
    }
    public void clickpersonCustomer() {
        personCustomer.click();
    }
    public void clickcurrencyDollar() {
        currencyDollar.click();
    }
}

