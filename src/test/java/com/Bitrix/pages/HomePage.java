package com.Bitrix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id ="feed-add-post-form-link-text")
    public WebElement MoreTab ;

    @FindBy(xpath = "//span[.='Appreciation']")
    public WebElement AppreciationIcon;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement UploadIcon;

    @FindBy(xpath = "(//table[@class='diskuf-selector-table wd-fa-add-file-light-table']//tbody//tr[1]//td[1])[1]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement documentFromBitrix;

    @FindBy(xpath = "//span[@clas='wd-fa-add-file-light-title-text']")
    public WebElement downloadExternalDrive;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text'])[1]")
    public WebElement createDesktopApplication;


    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreOption;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement addingReceipientFromRecent;

    @FindBy(xpath = "(//div[.='All employees'])[1]")
    public WebElement randomReceipientsfromRecent;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement addingReceipentfromEmployeesANdDepartments;

    @FindBy(xpath = "//div[.='marketing29@cybertekschool.com']")
    public WebElement randomReceipientsfromEmployeesANdDepartments;

    @FindBy(id = "destEmailTab_destination8783609")
    public WebElement addingReceipentfromEmailUsers;

    @FindBy(xpath = "(//span[@class='feed-add-destination-input-box'])[1]")
    public WebElement randomReceipientsfromEmailUsers;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']")
    public WebElement receipentsBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;


    @FindBy(xpath = "//input[@name='undefined']")
    public WebElement saveButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertvideoIcon;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoSource;

    @FindBy(xpath = "(//input[@class='adm-btn-save'])[1]")
    public WebElement videoSave;

    @FindBy(xpath = "//span[contains(@class,'bxhtmled-top-bar-btn bxhtmled-button-quote')]")
    public WebElement quoteIcon;

    @FindBy(xpath = "//blockquote[contains (@class,'bxhtmled-quote')]")
    public WebElement blockquote;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMention;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement mentionRecent;

    @FindBy(xpath = "//a[contains(@class,'bx-finder-box-tab bx-lm-tab-department')]")
    public WebElement getAddMentionEmployeesAndDepartment;

    @FindBy(xpath = "(//a[.='helpdesk47@cybertekschool.com'])")
    public WebElement mentionRandomEmployees;

    @FindBy(xpath = "(//span[@class='feed-add-post-form-editor-btn'])[1]")
    public WebElement visualEditor;

    @FindBy(id = "bx-html-editor-tlbr-cnt-idPostFormLHE_blogPostForm")
    public WebElement textBarDisplay;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicIcon;

    @FindBy(id = "POST_TITLE")
    public WebElement topicTextBarDisplay;

    @FindBy(xpath = "//span[@class='feed-add-post-form-but-cnt feed-add-videomessage']")
    public WebElement recordVideoTab;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement recordVideoAllow;

    @FindBy()
    public WebElement attachWithMessage;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement addTags;

    @FindBy(xpath = "//input[@class='search-tags']")
    public WebElement addTagBox;

    @FindBy(xpath = "//div[@class='popup-window-buttons']")
    public WebElement addButtonTags;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-smile']")
    public WebElement emojis;






}
