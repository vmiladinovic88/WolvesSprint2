package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.LoginOutPage_Karim;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class LogOutKarim_StepDefinition {

    LoginOutPage_Karim loginOutPage_karim = new LoginOutPage_Karim();


    @When("Users on the stream page and click logout button")
    public void usersOnTheStreamPageAndClickLogoutButton() {
        loginOutPage_karim.logOut.click();
    }



    @Then("Users should be able to log out from the app")
    public void users_should_be_able_to_log_out_from_the_app() {
         String actualTitle = loginOutPage_karim.submit.getText();
            String expectedTitle = "Log In";
            Assert.assertEquals(actualTitle,expectedTitle);
    }



}
