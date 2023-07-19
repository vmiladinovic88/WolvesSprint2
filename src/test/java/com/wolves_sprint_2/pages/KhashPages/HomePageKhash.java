package com.wolves_sprint_2.pages.KhashPages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageKhash {
    public HomePageKhash(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement profileIconButton;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileButton;
}
