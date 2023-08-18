package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_BillPayFunctionalityElements extends BaseDriver {
    public _03_BillPayFunctionalityElements() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement payBill ;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement payeeAddress ;

    @FindBy(xpath = "//input[@ng-model=\"payee.address.city\"]")
    public WebElement payeeCity ;

    @FindBy(xpath = "//input[@name=\"payee.address.zipCode\"]")
    public WebElement payeeZipCode ;


    @FindBy(xpath = "//input[@ng-model=\"payee.phoneNumber\"]")
    public WebElement payeePhone ;


    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement payeeAccount ;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement payeeVerifyAccount ;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payeeAmount ;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement payeeSendPayment ;

}
