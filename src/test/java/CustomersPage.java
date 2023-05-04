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
    private WebElement deleteCustomer;


    public void searchCustomer(){
        searchCustomer.sendKeys("Ivan");
    }

    public void clickDeleteCustomer() {
        deleteCustomer.click();
    }

}




