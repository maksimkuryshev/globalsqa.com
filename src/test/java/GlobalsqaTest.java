import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GlobalsqaTest {

    public static AddCustomerPage addCustomerPage;
    public static BankPage bankPage;
    public static OpenAccountPage openAccountPage;

    public static CustomersPage customersPage;
    public static HomePage homePage;
    public static SystemAlertPage systemAlertPage;



    @BeforeClass

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/home/IdeaProjects/test123/src/test/java/chromedriver");
        WebDriver driver = new ChromeDriver();
        bankPage = new BankPage(driver);
        addCustomerPage = new AddCustomerPage(driver);
        openAccountPage = new OpenAccountPage(driver);
        customersPage = new CustomersPage(driver);
        homePage = new HomePage(driver);
        systemAlertPage = new SystemAlertPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");
    }

    @Test
    public void GlobalsqaTest() {

        bankPage.clickCustomerButton();
        addCustomerPage.inputFirstName();
        addCustomerPage.inputLastName();
        addCustomerPage.inputPostCode();
        addCustomerPage.clickAddCustomer();
        systemAlertPage.closeSystemAlert();
        bankPage.clickAccountButton();
        openAccountPage.clickCustomerButton();
        openAccountPage.clickPersonCustomer();
        openAccountPage.clickCurrencyButton();
        openAccountPage.clickСurrencyDollar();
        openAccountPage.clickPersonCustomer();
        bankPage.clickShowButton();
        customersPage.searchCustomer();
        customersPage.clickDeleteCustomer();
        bankPage.clickHomeButton();
        homePage.clickcustomerLogin();
        homePage.clickYourName();
        homePage.clickHarryPotter();
        homePage.clickLoginBtn();
    }
}


