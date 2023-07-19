package com.wolves_sprint_2.pages.KhashPages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePageKhash {
    public MyProfilePageKhash(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='General']")
    public WebElement generalTab;

    @FindBy(xpath = "//a[.='Drive\t\t\t\t\t\t']")
    public  WebElement driveTab;

    @FindBy(xpath = "//a[.='Tasks\t\t\t\t\t\t']")
    public  WebElement tasksTab;

    @FindBy(xpath = "//a[.='Calendar\t\t\t\t\t\t']")
    public  WebElement calendarTab;

    @FindBy(xpath = "//a[.='Conversations\t\t\t\t\t\t']")
    public  WebElement conversationsTab;

    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement emailAddressLink;

}
