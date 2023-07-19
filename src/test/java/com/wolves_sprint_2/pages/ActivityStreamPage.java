package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

   public ActivityStreamPage(){

       PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span")
    public List<WebElement> activityStreamOptions;


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;


   @FindBy(xpath = "//div[@class='menu-popup-items']/span")
    public List<WebElement> moreTabOptions;
}
