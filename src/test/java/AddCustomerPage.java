import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddCustomerPage {
    public WebDriver driver;

    public AddCustomerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    private WebElement firstName;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    private WebElement lastName;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    private WebElement postCode;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
    private WebElement addCustomer;
    }
    public void clickaddCustomer() {
        addCustomer.click();
    }
    public void inputfirstName() {
        firstName.sendKeys("Ivan");

    }

    public void inputlastName(){
        lastName.sendKeys("Ivanov");
    }

    public void inputpostCode(){
        postCode.sendKeys("Text");
    }

}