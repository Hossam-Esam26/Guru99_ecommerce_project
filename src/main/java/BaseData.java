import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BaseData {
    public WebDriver driver;
    public BaseData (WebDriver driver){
        this.driver=driver;
    }

    public void clicker(WebElement element){
        element.click();
    }

    public void sendText(WebElement element , String value){
        element.sendKeys(value);
    }

}
