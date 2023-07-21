package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.MsgPage_Claritza;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class SendMsgClaritza_StepDefs {

    MsgPage_Claritza msgPage = new MsgPage_Claritza();

    @When("user is on the active stream page")
    public void user_is_on_the_active_stream_page() {

    }
    @When("user clicks message button")
    public void user_clicks_message_button() {
        msgPage.msgBtn.click();
    }
    @Then("user should see Send button")
    public void user_should_see_send_button() {
        Assert.assertEquals(msgPage.sendBtn.getText(),"Send");

    }






}
