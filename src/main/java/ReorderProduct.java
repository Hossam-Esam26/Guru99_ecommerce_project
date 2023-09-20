import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReorderProduct extends BaseData{
    public ReorderProduct(WebDriver driver) {
        super(driver);
    }

    By reorderLink = By.xpath("//tr[1]/td[6]/span[1]/a[2][text() = 'Reorder']");
        WebElement reorderLinkElement;


    public void clickReorderLink()
    {
        reorderLinkElement = driver.findElement(reorderLink);
        clicker(reorderLinkElement);
    }
}
