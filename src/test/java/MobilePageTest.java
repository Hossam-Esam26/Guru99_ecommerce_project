import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class MobilePageTest extends BaseTest{
    MobilePage mobilePage;

    SoftAssert softAssert = new SoftAssert();

    @Test (priority = 1)
    public void verify(){
        mobilePage= new MobilePage(driver);
        String expected = "THIS IS DEMO SITE FOR   ";
        String actual = driver.findElement(By.cssSelector(".page-title h2")).getText();
        Assert.assertTrue(actual.contains(expected));

        mobilePage.clickMobileButton();

        String expectedMobileTitlePage = "MOBILE";
        String actualMobileTitlePage = driver.findElement(By.cssSelector(".page-title h1")).getText();
        Assert.assertTrue(actualMobileTitlePage.contains(expectedMobileTitlePage));
    }

    @Test (priority = 2)
    public void verifyPrice(){
        mobilePage.dropdown();

        String priceInListPage = mobilePage.getPrice();

        mobilePage.clickXperisImg();

        String priceInDetialsPage = mobilePage.getPriceInDetailsPage();

        Assert.assertEquals(priceInListPage , priceInDetialsPage);
        driver.navigate().back();
    }

    @Test (priority = 3)
    public void verifyErrorMessageInCartPage()  {
        mobilePage.clickAddToCartXperia();
        //verify price before discount code and after
        String before = driver.findElement(By.cssSelector("strong .price")).getText();
        mobilePage.enterDiscountCode("GURU50");
        mobilePage.clickOnApplyButton();
        String after = driver.findElement(By.cssSelector("strong .price")).getText();
        softAssert.assertNotEquals(after,before);
        //---------------------------------------------
        mobilePage.enterNumberInQTYfield("1000");
        mobilePage.clickUpdateButton();

        //verify error message
        String expectedErrorMessageForQuantity = "The requested quantity for sony xperia is not available";
        String actualErrorMessageForQuantity= driver.findElement(By.xpath("//p[contains(text(),'* The maximum quantity allowed for purchase is 500')]"))
                .getText();
        softAssert.assertTrue(actualErrorMessageForQuantity.contains(expectedErrorMessageForQuantity));
        softAssert.assertAll();
    }

    @Test (priority = 4)
    public void verifyMessageAfterClickEmptyCartButton(){
        mobilePage.clickEmptyCartButton();

        String expectedMessageAfterClickEmptyCartButton = "SHOPPING CART IS EMPTY";
        String actualMessageAfterClickEmptyCartButton = driver.findElement(By.xpath("//h1[text() = 'Shopping Cart is Empty']"))
                .getText();
        Assert.assertTrue(actualMessageAfterClickEmptyCartButton.contains(expectedMessageAfterClickEmptyCartButton));
        driver.get("http://live.techpanda.org/index.php/mobile.html");
    }

    @Test (priority = 5)
    public void comparePhones() throws IOException {
        mobilePage.addToCompareSonyXperia();
        mobilePage.addToCompareIphone();
        mobilePage.clickInCompareButton();
        mobilePage.switchToWindow();
    }
}
