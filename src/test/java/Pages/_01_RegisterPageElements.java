package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_RegisterPageElements extends BaseDriver{
    public _01_RegisterPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Register']")
    public WebElement register;


    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "//input[@value=\"Register\"]")
    public WebElement registerButton;

}
