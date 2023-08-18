package StepDefinitions;

import Pages._02_LoginPageElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _02_LoginFunctionality extends BaseDriver {
    _02_LoginPageElements loginPageElements = new _02_LoginPageElements();

    @And("Enter valid {string}")
    public void enterValidUsername(String username) {
        loginPageElements.loginUsername.sendKeys(username);
    }

    @And("Enter invalid {string}")
    public void enterInvalidPassword(String password) {
        loginPageElements.loginPassword.sendKeys(password);
    }

    @And("Click on LoginButton")
    public void clickOnLoginButton() {
        loginPageElements.loginButton.click();
    }

//    @Then("User should not be login successfully")
//    public void userShouldNotBeLoginSuccessfully() {
//        WebElement actualResult = driver.findElement(By.xpath("//h1[.='Error!']"));
//        String expectedResult = "An internal error has occurred and has been logged.";
//        Assert.assertEquals(expectedResult, actualResult);
//    }
}
