package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.AddLinkInMsgPage;
import com.wolves_sprint_2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class addLinkInMessage_stepDefs {

    AddLinkInMsgPage addLinkInMsgPage = new AddLinkInMsgPage();
    @When("User clicks on Send message field")
    public void user_clicks_on_send_message_field() {

        addLinkInMsgPage.messageField.click();

    }
    @When("User sees attach link button is displayed")
    public void user_sees_attach_link_button_is_displayed() {
        addLinkInMsgPage.attachLinkButton.isDisplayed();

    }
    @Then("User clicks on attach button")
    public void user_clicks_on_attach_button() {
        addLinkInMsgPage.attachLinkButton.click();

    }
    @Then("User sees {string} field")
    public void user_sees_field(String link) {
        addLinkInMsgPage.linkPopUp.isDisplayed();

    }
    @Then("User types Google URL")
    public void user_types_google_url() {
        addLinkInMsgPage.linkPopUp.sendKeys("www.google.com");

    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String save) {
        addLinkInMsgPage.saveButton.click();


    }
    @When("User clicks {string} button that is displayed")
    public void user_clicks_button_that_is_displayed(String send) {
        addLinkInMsgPage.sendButton.click();


    }
    @When("User clicks on the {string} URL")
    public void user_clicks_on_the_url(String google) {
        addLinkInMsgPage.googleLinkNewTab.click();

        Set<String> tabs = Driver.getDriver().getWindowHandles();
        for (String eachTab : tabs) {
            Driver.getDriver().switchTo().window(eachTab);

        }

    }
    @Then("Google page opens up in the new tab")
    public void google_page_opens_up_in_the_new_tab() {
        String expectedTitle = "Google";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());


    }
}
