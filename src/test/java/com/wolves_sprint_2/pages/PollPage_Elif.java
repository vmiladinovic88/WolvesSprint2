package com.wolves_sprint_2.pages;

import com.wolves_sprint_2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage_Elif {

    public PollPage_Elif() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Activity Stream")
    public WebElement streamLink;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement pollBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployeesOption;

    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;

    @FindBy(id = "question_0")
    public WebElement questionField;

    @FindBy(xpath = "//input[@placeholder='Question ']")
    public List<WebElement> questionsField;

    @FindBy(xpath = "//*[@id='answer_0__0_']")
    public WebElement answer1Field;

    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2Field;

    @FindBy(xpath = "//input[@id='answer_0__2_']")
    public WebElement answer3Field;

    @FindBy(xpath = "//input[@class='vote-block-inp adda']")
    public List<WebElement> answersField;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(linkText = "Add question")
    public WebElement addQuestionLink;

    @FindBy(id = "multi_0")
    public WebElement allowMultiChoiceBtn;

    @FindBy(xpath = "//button[.='Vote']")
    public WebElement voteBtn;

    @FindBy(xpath = "(//div[@class='bx-vote-question-title'])[1]")
    public WebElement questionTitle;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement pollTitle;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement displayAllEmployees;

    public void switchToTextAreaFrame() {
        Driver.getDriver().switchTo().frame(iframe);
    }

    public void switchToParentFrame() {
        Driver.getDriver().switchTo().parentFrame();
    }

}
