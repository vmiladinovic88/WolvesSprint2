package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MsgPage_Claritza {

    public MsgPage_Claritza(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "")
    public WebElement msgBtn;

    @FindBy(id = "")
    public WebElement sendBtn;
}
