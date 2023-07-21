package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.KhashPages.HomePageKhash;
import com.wolves_sprint_2.pages.KhashPages.MyProfilePageKhash;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Khash_SD_VerificationTabsAndEmail {
    @Given("User is on CRM homepage as {string}")
    public void userIsOnCRMHomepageAs(String userType) {
        System.out.println("User is on CRM homepage as a " + userType);
    }
    HomePageKhash homePageKhash = new HomePageKhash();
    @And("User click on Profile icon")
    public void userClickOnProfileIcon() {
        homePageKhash.profileIconButton.click();
    }

    @And("User click on My profile option")
    public void userClickOnMyProfileOption() {
        homePageKhash.myProfileButton.click();
    }
    MyProfilePageKhash myProfilePageKhash = new MyProfilePageKhash();
    @Then("User sees {string} on My Profile page first")
    public void userSeesOnMyProfilePageFirst(String expectedGeneralTab) {
        String actualGeneralTab = myProfilePageKhash.generalTab.getText();
        Assert.assertEquals(actualGeneralTab, expectedGeneralTab);

    }

    @Then("User sees {string} on My Profile page second")
    public void userSeesOnMyProfilePageSecond(String expectedDriveTab) {
        String actualDriveTab = myProfilePageKhash.driveTab.getText();
        Assert.assertEquals(actualDriveTab, expectedDriveTab);

    }

    @Then("User sees {string} on My Profile page third")
    public void userSeesOnMyProfilePageThird(String expectedTasksTab) {
        String actualTasksTab = myProfilePageKhash.tasksTab.getText();
        Assert.assertEquals(actualTasksTab, expectedTasksTab);
    }

    @Then("User sees {string} on My Profile page forth")
    public void userSeesOnMyProfilePageForth(String expectedCalendarTab) {
        String actualCalendarTab = myProfilePageKhash.calendarTab.getText();
        Assert.assertEquals(actualCalendarTab, expectedCalendarTab);
    }

    @Then("User sees {string} on My Profile page fifth")
    public void userSeesOnMyProfilePageFifth(String expectedConverstationsTab) {
        String actualConversationsTab = myProfilePageKhash.conversationsTab.getText();
        Assert.assertEquals(actualConversationsTab, expectedConverstationsTab);
    }

    @And("User click on General tab button")
    public void userClickOnGeneralTabButton() {
        myProfilePageKhash.generalTab.click();
    }

    @Then("User sees email address under General tab")
    public void userSeesEmailAddressUnderGeneralTab() {
        String expectedEmailAddress = "hr1@cybertekschool.com";
        String actualEmailAddressTab = myProfilePageKhash.emailAddressLink.getText();
        Assert.assertEquals(actualEmailAddressTab, expectedEmailAddress);

    }
}
