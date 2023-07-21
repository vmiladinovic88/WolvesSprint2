package com.wolves_sprint_2.step_definitions;

import com.wolves_sprint_2.pages.ActivityStreamPage;
import com.wolves_sprint_2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStreamStepDef {


    ActivityStreamPage activityStream=new ActivityStreamPage();


    @Given("user land on the {string} page")
    public void userLandOnThePage(String expectedWordInURL) {

        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedWordInURL));
    }


    @And("user view the following options on Activity stream page")
    public void user_view_the_following_options_on_activity_stream_page(List<String>expectedOptions) {

        List<String>actualOptions=new ArrayList<>();



        for (WebElement eachOption : activityStream.activityStreamOptions) {

            actualOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);


    }

    @And("user clicks the MORE tab")
    public void userClicksTheMORETab() {

        activityStream.moreTab.click();

    }


    @And("user views the following options under more tab")
    public void user_views_the_following_options_under_more_tab(List<String>expectedDropdownOptions) {


        List<String>actualDropdownOptions=new ArrayList<>();


        for (WebElement eachOption : activityStream.moreTabOptions) {

            actualDropdownOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedDropdownOptions, actualDropdownOptions);

    }



}
