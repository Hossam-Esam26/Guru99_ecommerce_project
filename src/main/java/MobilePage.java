import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class MobilePage extends BaseData{

    public MobilePage(WebDriver driver) {
        super(driver);
    }

    By mobileButton = By.xpath("//a[contains(text(),'Mobile')]");
        WebElement mobileButtonElement;
    By dropdown = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]");
        WebElement dropdownElement;
    By priceOfMobileSony = By.xpath("//span[text() = '$100.00']");
        WebElement priceOfMobileSonyElement;
    By xperiaImg = By.xpath("//img[@alt = 'Xperia']");
        WebElement xperiaImgElement;
    By xperiaPriceInDetials = By.xpath("//span[text() = '$100.00']");
       WebElement xperiaPriceInDetailsElement;
    By addToCartXperiaMobile = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/button[1]");
        WebElement addToCartXperiaMobileElement;
    By discountField = By.id("coupon_code");
        WebElement discountFieldElement;
    By applyButton = By.xpath("//button[@title='Apply']");
        WebElement applyButtonElement;
    By  inputQTY = By.xpath("//input[@title = 'Qty']");
        WebElement inputQTYElement;
    By updateButton = By.xpath("//button[@title = 'Update']");
        WebElement updateButtonElment ;
     By emptyCartButton = By.xpath("//span[text() = 'Empty Cart']");
        WebElement emptyCartButtomElement;
     By addToCompareSonyXperia = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]");
        WebElement addToCompareSonyXperiaElement;
     By addToCompareIphone = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[2]/a[1]");
        WebElement addToCompareIphoneElement;
     By compareButton = By.xpath("//button[@title = 'Compare']");
        WebElement compareButtonElement;


    public void clickMobileButton(){
        mobileButtonElement = driver.findElement(mobileButton);
        clicker(mobileButtonElement);
    }

    public void dropdown(){
        dropdownElement = driver.findElement(dropdown);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText("Name");
    }

    public String getPrice(){
        priceOfMobileSonyElement = driver.findElement(priceOfMobileSony);
       String priceInListPage = priceOfMobileSonyElement.getText();

        return priceInListPage;
    }

    public void clickXperisImg(){
        xperiaImgElement = driver.findElement(xperiaImg);
        clicker(xperiaImgElement);
    }

    public String getPriceInDetailsPage(){
        xperiaPriceInDetailsElement = driver.findElement(xperiaPriceInDetials);
        String priceInDetial =  xperiaPriceInDetailsElement.getText();
        return priceInDetial;
    }

    public void clickAddToCartXperia(){
        addToCartXperiaMobileElement = driver.findElement(addToCartXperiaMobile);
        clicker(addToCartXperiaMobileElement);
    }

    public void enterDiscountCode(String value){
        discountFieldElement = driver.findElement(discountField);
        sendText(discountFieldElement , value);
    }

    public void clickOnApplyButton(){
        applyButtonElement = driver.findElement(applyButton);
        clicker(applyButtonElement);
    }

    public void enterNumberInQTYfield(String value){
        inputQTYElement = driver.findElement(inputQTY);
        inputQTYElement.clear();
        sendText(inputQTYElement,value);
    }

    public void clickUpdateButton(){
        updateButtonElment = driver.findElement(updateButton);
        clicker(updateButtonElment);
    }

    public void clickEmptyCartButton(){
        emptyCartButtomElement = driver.findElement(emptyCartButton);
        clicker(emptyCartButtomElement);
    }

    public  void addToCompareSonyXperia(){
        addToCompareSonyXperiaElement = driver.findElement(addToCompareSonyXperia);
        clicker(addToCompareSonyXperiaElement);
    }

    public  void addToCompareIphone(){
        addToCompareIphoneElement = driver.findElement(addToCompareIphone);
        clicker(addToCompareIphoneElement);
    }

    public void clickInCompareButton(){
        compareButtonElement = driver.findElement(compareButton);
        clicker(compareButtonElement);
    }

    /*public void screenshot() throws IOException {
        WebElement screenshot = driver.findElement(By.xpath("//body/div[1]"));
        File photo = screenshot.getScreenshotAs(OutputType.FILE);
        File place = new File("page.png");
        FileHandler.copy(photo , place);
    }*/
    public void switchToWindow() throws IOException {
        String parent = driver.getWindowHandle();

        Set<String> allWindows= driver.getWindowHandles();

        for (String window : allWindows){
            if (!window.equalsIgnoreCase(parent)){
                driver.switchTo().window(window);
                String title = driver.getTitle();
                System.out.println(title);
                WebElement screenshot = driver.findElement(By.xpath("//body/div[1]"));
                File photo = screenshot.getScreenshotAs(OutputType.FILE);
                File place = new File("page.png");
                FileHandler.copy(photo , place);
                driver.findElement(By.xpath("//span[text() = 'Close Window']")).click();
            }
        }
    }

}
