package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.LoginPage_Vesna;
import com.wolves_sprint_2.utilities.ConfigurationReader;
import com.wolves_sprint_2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginVesna_StepDefinitions {

    LoginPage_Vesna loginPageVesna = new LoginPage_Vesna();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    String actualTitle = Driver.getDriver().getTitle();
    String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("I login using HR email and password")
    public void iLoginUsingHREmailAndPassword() {
        loginPageVesna.login(ConfigurationReader.getProperty("hr_username_vesna"),ConfigurationReader.getProperty("password_vesna"));
    }

    @Then("I land on the home page")
    public void iLandOnTheHomePage() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle = "Portal";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("I login using marketing email and password")
    public void iLoginUsingMarketingEmailAndPassword() {
        loginPageVesna.login(ConfigurationReader.getProperty("marketing_username_vesna"),ConfigurationReader.getProperty("password_vesna"));
    }

    @When("I login using Helpdesk email and password")
    public void iLoginUsingHelpdeskEmailAndPassword() {
        loginPageVesna.login(ConfigurationReader.getProperty("helpdesk_username_vesna"),ConfigurationReader.getProperty("password_vesna"));
    }

    @When("I login using valid email and incorrect password")
    public void iLoginUsingValidEmailAndIncorrectPassword() {
        loginPageVesna.login(ConfigurationReader.getProperty("helpdesk_username_vesna"),"incorrect");
    }


    @Then("I should see error message for invalid credentials")
    public void iShouldSeeErrorMessageForInvalidCredentials() {
        Assert.assertTrue(loginPageVesna.errorMessage.isDisplayed());
    }

    @When("I login using invalid email and valid password")
    public void iLoginUsingInvalidEmailAndValidPassword() {
        loginPageVesna.login("invalid@invalid.com",ConfigurationReader.getProperty("password_vesna"));
    }

    @When("I login using invalid email and invalid password")
    public void iLoginUsingInvalidEmailAndInvalidPassword() {
        loginPageVesna.login("invalid@invalid.com","invalid");
    }

    @When("I login with correct username and empty password")
    public void i_login_with_correct_username_and_empty_password() {
        loginPageVesna.login(ConfigurationReader.getProperty("helpdesk_username_vesna"),"");
    }
    @Then("I should see error message {string}")
    public void i_should_see_error_message(String string) {
       Assert.assertTrue("Error message is not properly displayed",loginPageVesna.errorMessage.equals(string));
    }

    @When("I login with empty username and correct password")
    public void i_login_with_empty_username_and_correct_password() {
        loginPageVesna.login("",ConfigurationReader.getProperty("password"));
    }
}
