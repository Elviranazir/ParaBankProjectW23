package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_LoginPageElements extends BaseDriver {
    public _02_LoginPageElements() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsername ;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton ;



}
