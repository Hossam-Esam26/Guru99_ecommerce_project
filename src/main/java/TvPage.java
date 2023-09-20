import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvPage extends BaseData{
    public TvPage(WebDriver driver){
        super(driver);
    }

    By tvPage = By.xpath("//a[text() = 'TV']");
        WebElement tvPageElement;
    By addToWishList = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
        WebElement addToWishListElement;
    By shareWishListButton = By.xpath("//button[@title='Share Wishlist']");
        WebElement shareWishListButtonElement;
    By emailAddressesField = By.id("email_address");
        WebElement emailAdressesFieldElement;
    By messageFiled = By.id("message");
        WebElement messageFieldElement;



    public void clickTvPageLink()
    {
        tvPageElement = driver.findElement(tvPage);
        clicker(tvPageElement);
    }

    public void clickAddToWishList()
    {
        addToWishListElement = driver.findElement(addToWishList);
        clicker(addToWishListElement);
    }

    public void clickshareWishListButton()
    {
        shareWishListButtonElement = driver.findElement(shareWishListButton);
        clicker(shareWishListButtonElement);
    }

    public void enterEmailAddresses(String value)
    {
        emailAdressesFieldElement =driver.findElement(emailAddressesField);
        sendText(emailAdressesFieldElement , value);
    }

    public void enterMessage(String value)
    {
        messageFieldElement = driver.findElement(messageFiled);
        sendText(messageFieldElement , value);
    }

}
