package StepDefinitions;
import Pages._01_RegisterPageElements;
import Utilities.BaseDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class _01_RegisterFunctionality extends BaseDriver {
    _01_RegisterPageElements registerPage = new _01_RegisterPageElements();

    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click on Register")
    public void clickOnRegister() {
        registerPage.register.click();
    }

    @And("Fill the form")
    public void fillTheForm() {
        registerPage.firstName.sendKeys("Mary");
        registerPage.lastName.sendKeys("Smith");
        registerPage.address.sendKeys("Medow Forest St 123");
        registerPage.city.sendKeys("Atlanta");
        registerPage.state.sendKeys("Georgia");
        registerPage.zipCode.sendKeys("000003");
        registerPage.phoneNumber.sendKeys("4444555666");
        registerPage.ssn.sendKeys("1213456789");
        registerPage.username.sendKeys("mary12.smith@mail");
        registerPage.password.sendKeys("123456");
        registerPage.confirm.sendKeys("123456");
    }

    @And("Click on register Button")
    public void clickOnRegisterButton() {
        registerPage.registerButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        String expectedResult = "Your account was created successfully. You are now logged in.";
        WebElement actualResult = driver.findElement(By.xpath("//p[.='Your account was created successfully. You are now logged in.']"));
        Assert.assertEquals(expectedResult, actualResult);
    }
}
