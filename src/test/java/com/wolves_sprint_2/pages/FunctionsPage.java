package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionsPage{

    public FunctionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//span[@class='menu-item-link-text']")
    public WebElement employeeLink;

    @FindBy(xpath = "//div[@id='bx_visual_structure']")
    public WebElement structureDisplay;
















}
