package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.FunctionsPage;
import com.wolves_sprint_2.pages.LoginPage;
import com.wolves_sprint_2.utilities.BrowserUtils;
import com.wolves_sprint_2.utilities.ConfigurationReader;
import com.wolves_sprint_2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FunctionStep_Definitions {

    FunctionsPage functionsPage = new FunctionsPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the company login page")
    public void userIsOnTheCompanyLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
    loginPage.userName.sendKeys(username);
    loginPage.password.sendKeys(password);
    }

    @And("user clicks on the employees link")
    public void user_clicks_on_the_employees_link() {
        functionsPage.employeeLink.click();
    }

    @And("the user is on the company structure page")
    public void the_user_is_on_the_company_structure_page() {
        BrowserUtils.verifyURLContains("structure");
    }

    @Then("user sees the company structure is displayed correctly")
    public void user_sees_the_company_structure_is_displayed_correctly() {
Assert.assertEquals(functionsPage.structureDisplay.getText(),"Company Structure");
    }

    @And("user clicks on add department")
    public void userClicksOnAddDepartment() {

    }

    @And("user enters new department name")
    public void userEntersNewDepartmentName() {
    }

    @And("user verifies if the new department is successfully added")
    public void userVerifiesIfTheNewDepartmentIsSuccessfullyAdded() {
    }

    @And("user clicks on the add button")
    public void userClicksOnTheAddButton() {
    }
}

