package com.wolves_sprint_2.pages;


import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Vesna {
    public LoginPage_Vesna(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name="USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name="USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement signInButton;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }
    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement errorMessage;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMe;

    @FindBy(id="USER_REMEMBER")
    public WebElement checkboxRememberMe;
}
