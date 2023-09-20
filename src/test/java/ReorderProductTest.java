import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReorderProductTest extends BaseTest{
    ReorderProduct reorderProduct;
    MobilePage mobilePage;
    PurchaseProducts purchaseProducts;
    CreateAccount createAccount;

    @Test
    public void reorderProduct(){
        reorderProduct = new ReorderProduct(driver);
        mobilePage = new MobilePage(driver);
        purchaseProducts = new PurchaseProducts(driver);
        createAccount = new CreateAccount(driver);
        createAccount.clickAccountButton();
        createAccount.clickMyAccountButton();
        purchaseProducts.enterEmailToLogin("AutomatioonTest@live.com");
        purchaseProducts.enterpasswordToLogin("123456789");
        purchaseProducts.clickOnLogin();
        reorderProduct.clickReorderLink();
        String beforeChange = driver.findElement(By.cssSelector("strong .price")).getText();
        mobilePage.enterNumberInQTYfield("10");
        mobilePage.clickUpdateButton();
        String afterChange = driver.findElement(By.cssSelector("strong .price")).getText();
        Assert.assertNotEquals(afterChange , beforeChange);
        purchaseProducts.clickOnProceedToCheckout();
        purchaseProducts.clickOnContinueButton();
        purchaseProducts.clickOnContinueButton_shipping_method_buttons_container();
        purchaseProducts.clickOnchoosePaymentWay();
        purchaseProducts.clickOnContinueButton_payment_buttons_container();
        purchaseProducts.clickOnplaceOrderButton();

        String expected = "YOUR ORDER HAS BEEN RECEIVED.";
        String actual = driver.findElement(By.xpath("//h1[text()='Your order has been received.']")).getText();
        Assert.assertEquals(actual,expected);

        String printOrderId = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]")).getText();
        System.out.println(printOrderId);

    }
}
