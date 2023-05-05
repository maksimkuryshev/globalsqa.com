import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class SortCustomerTest {
    public static ListCustomerPage listcustPage;

    public static OpenAccountPage openAccountPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        listcustPage = new ListCustomerPage(driver);
        openAccountPage = new OpenAccountPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager");

        @Test
        public void sortTest()
    {
        openAccountPage.clickCustomerButton();
        listcustPage.checkCollection();
    }
        @AfterClass
        public static void tearDown() {
            driver.quit();
        }
    }