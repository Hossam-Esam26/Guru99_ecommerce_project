import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PurchaseProducts extends BaseData{
    public PurchaseProducts(WebDriver driver)
    {
        super(driver);
    }

    //login page
    By emailAddressField = By.xpath("//input[@title='Email Address']");
        WebElement emailAdressElement;
    By passwordField = By.xpath("//input[@title='Password']");
       WebElement passwordElement;
    By loginButton = By.xpath("//button[@title='Login']");
        WebElement loginButtonElement;

    //other locator
    By myWishlistButton = By.xpath("//li[8]/a[text()='My Wishlist']");
        WebElement myWishListButtonElement;
    By addToCartButton = By.xpath("//div[1]/button[1]/span[1]/span[text() = 'Add to Cart']");
        WebElement addTocartButtonElement;
    By proceedToCheckout = By.cssSelector(".cart-totals .checkout-types span span");
        WebElement proceedToCheckoutElement ;

    // checkout page
    By firstName = By.xpath("//input[@id = 'billing:firstname']");
        WebElement firstNameElement;
    By middlename = By.xpath("//input[@id = 'billing:middlename']");
        WebElement middlenameElement;
    By lastname = By.xpath("//input[@id = 'billing:lastname']");
        WebElement lastnameElement;
    By company = By.xpath("//input[@id = 'billing:company']");
        WebElement companyElement;
    By address = By.xpath("//input[@id = 'billing:street1']");
        WebElement addressElement;
    By streetAddress = By.xpath("//input[@id = 'billing:street2']");
        WebElement streetAddressElement;
    By city = By.xpath("//input[@id = 'billing:city']");
        WebElement cityElement;
    By postcode = By.xpath("//input[@id = 'billing:postcode']");
        WebElement postcodeElement;
    By telephone = By.xpath("//input[@id = 'billing:telephone']");
        WebElement telephoneElement;
    By fax = By.xpath("//input[@id = 'billing:fax']");
        WebElement faxElement;
    By continueButton_billing_buttons_container = By.cssSelector("#billing-buttons-container button");
        WebElement continueButton_billing_buttons_containerElement;
    By continueButton_shipping_method_buttons_container = By.cssSelector("#shipping-method-buttons-container button");
        WebElement continueButton_shipping_method_buttons_containerElement;
    By continueButton_payment_buttons_container = By.cssSelector("#payment-buttons-container button");
        WebElement continueButton_payment_buttons_containerElement;
    By choosePaymentWay = By.xpath("//label[contains(text(),'Check / Money order')]");
        WebElement choosePaymentWayElement;
    By placeOrderButton = By.xpath("//span[text() = 'Place Order']");
        WebElement placeOrderButtonElement;




    public void enterEmailToLogin(String  value)
    {
        emailAdressElement = driver.findElement(emailAddressField);
        sendText(emailAdressElement , value);
    }

    public void enterpasswordToLogin(String  value)
    {
        passwordElement = driver.findElement(passwordField);
        sendText(passwordElement , value);
    }

    public void clickOnLogin()
    {
        loginButtonElement = driver.findElement(loginButton);
        clicker(loginButtonElement);
    }

    public void clickOnmyWishlistButton()
    {
        myWishListButtonElement = driver.findElement(myWishlistButton);
        clicker(myWishListButtonElement);
    }

    public void clickOnAddToCartButton()
    {
        addTocartButtonElement = driver.findElement(addToCartButton);
        clicker(addTocartButtonElement);
    }

    public void clickOnProceedToCheckout()
    {
        proceedToCheckoutElement = driver.findElement(proceedToCheckout);
        clicker(proceedToCheckoutElement);
    }

    public void enterFirstName(String  value)
    {
        firstNameElement = driver.findElement(firstName);
        sendText(firstNameElement , value);
    }

    public void enterMiddlename(String  value)
    {
        middlenameElement = driver.findElement(middlename);
        sendText(middlenameElement , value);
    }

    public void enterLastname(String  value)
    {
        lastnameElement = driver.findElement(lastname);
        sendText(lastnameElement , value);
    }

    public void enterCompany(String  value)
    {
        companyElement = driver.findElement(company);
        sendText(companyElement , value);
    }

    public void enterAddress(String  value)
    {
        addressElement = driver.findElement(address);
        sendText(addressElement , value);
    }

    public void enterStreetAddress(String  value)
    {
        streetAddressElement = driver.findElement(streetAddress);
        sendText(streetAddressElement , value);
    }

    public void enterCity(String  value)
    {
        cityElement = driver.findElement(city);
        sendText(cityElement , value);
    }

    public void enterPostcode(String  value)
    {
        postcodeElement = driver.findElement(postcode);
        sendText(postcodeElement , value);
    }

    public void enterTelephone(String  value)
    {
        telephoneElement = driver.findElement(telephone);
        sendText(telephoneElement , value);
    }

    public void enterFax(String  value)
    {
        faxElement = driver.findElement(fax);
        sendText(faxElement , value);
    }

    public void clickOnContinueButton()
    {
        continueButton_billing_buttons_containerElement = driver.findElement(continueButton_billing_buttons_container);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clicker(continueButton_billing_buttons_containerElement);
    }

    public void selectState(String value)
    {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='billing:region_id']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public void selectCountry(String value)
    {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='billing:country_id']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public void clickOnContinueButton_shipping_method_buttons_container()
    {
        continueButton_shipping_method_buttons_containerElement = driver.findElement(continueButton_shipping_method_buttons_container);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clicker(continueButton_shipping_method_buttons_containerElement);
    }

    public void clickOnContinueButton_payment_buttons_container()
    {
        continueButton_payment_buttons_containerElement = driver.findElement(continueButton_payment_buttons_container);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clicker(continueButton_payment_buttons_containerElement);
    }

    public void clickOnchoosePaymentWay()
    {
        choosePaymentWayElement = driver.findElement(choosePaymentWay);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clicker(choosePaymentWayElement);
    }

    public void clickOnplaceOrderButton()
    {
        placeOrderButtonElement = driver.findElement(placeOrderButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        clicker(placeOrderButtonElement);
    }
}
