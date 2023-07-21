package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOutPage_Karim {

    public LoginOutPage_Karim() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;
     

    public void logOut() {
        logOut.click();

    }




}








