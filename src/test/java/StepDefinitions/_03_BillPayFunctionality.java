package StepDefinitions;

import Pages._01_RegisterPageElements;
import Pages._02_LoginPageElements;
import Pages._03_BillPayFunctionalityElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _03_BillPayFunctionality {
    _02_LoginPageElements loginPageElements = new _02_LoginPageElements();
    _03_BillPayFunctionalityElements billPayFunctionalityElements = new _03_BillPayFunctionalityElements();
    @And("Login with valid username and valid password")
    public void loginWithValidUsernameAndValidPassword() {
        loginPageElements.loginUsername.sendKeys("mary1.smith@mail");
        loginPageElements.loginPassword.sendKeys("123456");
        loginPageElements.loginButton.click();
    }

    @And("Click on Pay Bill Button")
    public void clickOnPayBillButton() {
        billPayFunctionalityElements.payBill.click();
    }

    @When("fill the form with valid data")
    public void fillTheFormWithValidData(DataTable formInfo) {
        List<String> formInfoList = formInfo.asList(String.class);
        System.out.println(formInfoList.get(0));
        System.out.println(formInfoList.get(1));
        System.out.println(formInfoList.get(2));
        System.out.println(formInfoList.get(3));
    }

    @Then("Click on send payment button")
    public void clickOnSendPaymentButton() {
    }
}
