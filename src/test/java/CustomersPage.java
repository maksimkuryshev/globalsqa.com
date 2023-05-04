import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CustomersPage {
    public WebDriver driver;

    public CustomersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")
    private WebElement searchCustomer;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button")
    private WebElement delete1Customer;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[5]/button")
    private WebElement delete2Customer;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[5]/button")
    private WebElement delete3Customer;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[4]/td[5]/button")
    private WebElement delete4Customer;

    public void searchCustomer(){
        searchCustomer.sendKeys("Ivan");
    }

    public void clickdelete1Customer() {
        delete1Customer.click();
    }
    public void clickdelete2Customer() {
        delete2Customer.click();
    }
    public void clickdelete3Customer() {
        delete3Customer.click();
    }
    public void clickdelete4Customer() {
        delete4Customer.click();
    }
}




