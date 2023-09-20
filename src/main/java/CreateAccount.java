import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount extends BaseData{

    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    By accountButton = By.xpath("//a/span[text() = 'Account']");
        WebElement accountButtonElement;
    By myAccountButton = By.xpath("//div[1]/ul/li/a[text() = 'My Account']");
        WebElement myAccountButtonElement;
    By createAnAccount = By.xpath("//span[text()='Create an Account']");
        WebElement createAnAccountElement;
    By firstNameField = By.xpath("//input[@title = 'First Name']");
        WebElement firstNameFieldElement;
    By middleNameField = By.xpath("//input[@title = 'Middle Name/Initial']");
        WebElement middleNameFieldElement;
    By lastNameField = By.xpath("//input[@title = 'Last Name']");
        WebElement lastNameFieldElement;
    By emailField = By.xpath("//input[@title ='Email Address']");
        WebElement emailFieldElement;
    By passwordField = By.xpath("//input[@title ='Password']");
        WebElement passwordFieldElement;
    By confirmPasswordField = By.xpath("//input[@title ='Confirm Password']");
        WebElement confirmPasswordFieldElement;
    By registerButton = By.xpath("//button[@title ='Register']");
        WebElement registerButtonElement;




    public void clickAccountButton ()
    {
        accountButtonElement = driver.findElement(accountButton);
        clicker(accountButtonElement);
    }

    public void clickMyAccountButton()
    {
        myAccountButtonElement = driver.findElement(myAccountButton);
        clicker(myAccountButtonElement);
    }

    public void clickCreateAnAccountButton()
    {
        createAnAccountElement = driver.findElement(createAnAccount);
        clicker(createAnAccountElement);
    }

    public void enterFirstNameData (String  value)
    {
        firstNameFieldElement = driver.findElement(firstNameField);
        sendText(firstNameFieldElement , value);
    }

    public void enterMiddleNameData (String  value)
    {
        middleNameFieldElement = driver.findElement(middleNameField);
        sendText(middleNameFieldElement , value);
    }

    public void enterlastNameData (String  value)
    {
        lastNameFieldElement = driver.findElement(lastNameField);
        sendText(lastNameFieldElement , value);
    }

    public void enteremailData (String  value)
    {
        emailFieldElement = driver.findElement(emailField);
        sendText(emailFieldElement , value);
    }

    public void enterpassword (String  value)
    {
        passwordFieldElement = driver.findElement(passwordField);
        sendText(passwordFieldElement , value);
    }

    public void enterConfirmPassword (String  value)
    {
        confirmPasswordFieldElement = driver.findElement(confirmPasswordField);
        sendText(confirmPasswordFieldElement , value);
    }

    public void clickRegisterButton()
    {
        registerButtonElement = driver.findElement(registerButton);
        clicker(registerButtonElement);
    }
};
