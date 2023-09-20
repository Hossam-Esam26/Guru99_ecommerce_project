import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.navigate().to("http://live.techpanda.org/index.php/");
        driver.manage().window().maximize();
    }

   @AfterTest
    public void quit (){
        driver.quit();
    }
}
