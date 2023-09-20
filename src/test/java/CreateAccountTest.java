import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{

    CreateAccount createAccount;
    TvPage tvPage;

   @Test
   public void createAccount(){
       createAccount=new CreateAccount(driver);
       createAccount.clickAccountButton();
       createAccount.clickMyAccountButton();
       createAccount.clickCreateAnAccountButton();
       createAccount.enterFirstNameData("hossam");
       createAccount.enterMiddleNameData("hoss");
       createAccount.enterlastNameData("ahmed");
       createAccount.enteremailData("AutoomationTest@live.com");
       createAccount.enterpassword("123456789");
       createAccount.enterConfirmPassword("123456789");
       createAccount.clickRegisterButton();

       //verify register successfully
       String expected = "Thank you for registering with Main Website Store.";
       String actual = driver.findElement(By.xpath("//span[text() = 'Thank you for registering with Main Website Store.']"))
               .getText();
       Assert.assertEquals(actual,expected);

       //go to TV page
       tvPage = new TvPage(driver);
       tvPage.clickTvPageLink();
       tvPage.clickAddToWishList();
       tvPage.clickshareWishListButton();
       tvPage.enterEmailAddresses("sdfs@live.com");
       tvPage.enterMessage("Thanks");
       tvPage.clickshareWishListButton();

       //verify share wishlist was successfully
        String expectedMessage = "Your Wishlist has been shared.";
        String actualMessage = driver.findElement(By.xpath("//span[text() = 'Your Wishlist has been shared.']"))
                .getText();
        Assert.assertEquals(actualMessage,expectedMessage);
   }
}
