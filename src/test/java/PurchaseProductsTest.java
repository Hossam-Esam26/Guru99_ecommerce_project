import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PurchaseProductsTest extends BaseTest{
    PurchaseProducts purchaseProducts;
    CreateAccount createAccount;

  @Test
    public void verifyPurchaseProducts() throws InterruptedException {
      createAccount = new CreateAccount(driver);
      purchaseProducts = new PurchaseProducts(driver);
      createAccount.clickAccountButton();
      createAccount.clickMyAccountButton();
      purchaseProducts.enterEmailToLogin("AutoomationTest@live.com");
      purchaseProducts.enterpasswordToLogin("123456789");
      purchaseProducts.clickOnLogin();
      purchaseProducts.clickOnmyWishlistButton();
      purchaseProducts.clickOnAddToCartButton();
      purchaseProducts.clickOnProceedToCheckout();
      purchaseProducts.enterFirstName("Test");
      purchaseProducts.enterMiddlename("For");
      purchaseProducts.enterLastname("Automation");
      purchaseProducts.enterCompany("valeo");
      purchaseProducts.enterAddress("Masr");
      purchaseProducts.enterStreetAddress("street9");
      purchaseProducts.enterCity("NewYork");
      purchaseProducts.selectState("Colorado");
      purchaseProducts.enterPostcode("542896");
      purchaseProducts.selectCountry("United States");
      purchaseProducts.enterTelephone("12345678");
      purchaseProducts.enterFax("134679");
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
