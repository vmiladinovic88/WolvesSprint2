package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkInMsgPage {

    public AddLinkInMsgPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath = "//div[@class='feed-add-post-micro']")
    public WebElement messageField;

@FindBy (xpath = "//span[@title='Link']/i")
    public WebElement attachLinkButton;

@FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkPopUp;

@FindBy (xpath = "//input[@name='undefined']")
    public WebElement saveButton;


@FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

@FindBy (xpath = "//div[@id='blg-post-2021']/div/div/div/div/a")
    public WebElement googleLinkNewTab;
}
