package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.PollPage_Elif;
import com.wolves_sprint_2.utilities.BrowserUtils;
import com.wolves_sprint_2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class PollElif_StepDefinitions {


    PollPage_Elif pollPageElif = new PollPage_Elif();

    @Given("the user is on the stream page")
    public void the_user_is_on_the_stream_page() {
       pollPageElif.streamLink.click();
    }

    @When("user click on the Poll tab")
    public void user_click_on_the_poll_tab() {
        pollPageElif.pollBtn.click();
    }

    @Then("user should see {string} by default for delivery option")
    public void user_should_see_by_default_for_delivery_option(String deliveryOption) {
        Assert.assertEquals(pollPageElif.allEmployeesOption.getText(), deliveryOption);
    }


    @When("user enter the poll title as {string}")
    public void user_enter_the_poll_title_as(String pollTitle) {
       pollPageElif.switchToTextAreaFrame();
        pollPageElif.textArea.sendKeys(pollTitle);
        pollPageElif.switchToParentFrame();

    }

    @When("user add the {string}")
    public void user_add_the(String question) {
        pollPageElif.questionField.sendKeys(question);
    }

    @When("user add the Answers")
    public void user_add_the_answers(List<String> answers) {

        List<WebElement> answersField = pollPageElif.answersField;
        for (int i = 0; i < answers.size(); i++) {
            String answer  = answers.get(i);
            answersField.get(i).sendKeys(answer);
        }
    }


    @When("user submit the poll by clicking send button")
    public void user_submit_the_poll_by_clicking_send_button() {
        pollPageElif.sendBtn.click();
    }

    @Then("user should see a {string} on the page")
    public void user_should_see_a_on_the_page(String expectedPollTitle) {
        Assert.assertEquals(pollPageElif.pollTitle.getText(), expectedPollTitle);
    }

    @When("user click Allow multiple choice checkbox")
    public void user_click_allow_multiple_choice_checkbox() {
       pollPageElif.allowMultiChoiceBtn.click();
    }


    @Then("user should see Allow multiple choice is selected")
    public void user_should_see_allow_multiple_choice_is_selected() {
        Assert.assertTrue(pollPageElif.allowMultiChoiceBtn.isSelected());
    }
    @When("user leave poll title empty")
    public void user_leave_poll_title_empty() {
        pollPageElif.switchToTextAreaFrame();
        pollPageElif.textArea.clear();
        pollPageElif.switchToParentFrame();
    }
    @Then("user should see {string} error message")
    public void user_should_see_error_message(String errorMsg) {
        Assert.assertEquals(pollPageElif.errorMessage.getText(),errorMsg);
    }

    @When("user enter the poll title {string}")
    public void user_enter_the_poll_title(String poolTitle) {
        pollPageElif.switchToTextAreaFrame();
        pollPageElif.textArea.sendKeys(poolTitle);
        pollPageElif.switchToParentFrame();

    }


    @When("user display All employees option")
    public void user_display_all_employees_option() {
        pollPageElif.displayAllEmployees.click();
    }

    @When("user leave question field empty")
    public void user_leave_question_field_empty() {
       pollPageElif.questionField.clear();
    }
    @When("user enter answer {string}")
    public void user_enter_answer(String answerField) {
       pollPageElif.answer1Field.sendKeys(answerField);
    }

    @When("user enter question {string}")
    public void user_enter_question(String question) {
      pollPageElif.questionField.sendKeys(question);
    }
    @When("user leave answer fields empty")
    public void user_leave_answer_fields_empty() {
       pollPageElif.answersField.clear();
    }


    @Then("user should see {string} \"\"Question\"\" {string} error message")
    public void user_should_see_question_error_message(String string, String string2) {
        String expectedErrorMsg = string+ "\"" + "\"" + string2;
       Assert.assertEquals(pollPageElif.errorMessage.getText(),expectedErrorMsg);
    }

}
