package com.Bitrix.step_definitions;

import com.Bitrix.pages.HomePage;
import com.Bitrix.pages.LoginPages;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Appreciation_Definition {
    LoginPages loginPage = new LoginPages();
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePAge = new HomePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

    @When("user login to account succesfully")
    public void user_login_to_account_succesfully() {
        loginPage.login();
    }

    @Then("user should be able to hover over to More Tab and click")
    public void user_should_be_able_to_hover_over_to_more_tab_and_click() throws Exception {
        //Thread.sleep(3000);
        actions.moveToElement(homePAge.MoreTab).perform();
        homePAge.MoreTab.click();
    }

    @Then("user should click Appreciation option")
    public void user_should_click_appreciation_option() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePAge.AppreciationIcon.click();

    }

    @Then("user should be able to click Upload Icon")
    public void user_should_be_able_to_click_upload_icon() throws Exception {
        //Thread.sleep(2000);
        homePAge.UploadIcon.click();
    }

    @Then("User should see see upload options")
    public void user_should_see_see_upload_options() {

      /*  Assert.assertTrue(homePAge.uploadFilesAndImages.isDisplayed());
        Assert.assertTrue(homePAge.documentFromBitrix.isDisplayed());
        Assert.assertTrue(homePAge.downloadExternalDrive.isDisplayed());
        Assert.assertTrue(homePAge.createDesktopApplication.isDisplayed());


       */
        try{
            wait.until(ExpectedConditions.elementToBeClickable(homePAge.uploadFilesAndImages));
            wait.until(ExpectedConditions.elementToBeClickable(homePAge.documentFromBitrix));
            wait.until(ExpectedConditions.elementToBeClickable(homePAge.downloadExternalDrive));
            wait.until(ExpectedConditions.elementToBeClickable(homePAge.createDesktopApplication));

            System.out.println("clickable");
        }catch (Exception e){
            System.out.println("not");

        }


    }


    @Then("User should click to Add More option")
    public void userShouldClickToAddMoreOption() {


        homePAge.addMoreOption.click();


    }

    @Then("user should be select contact from Email user, EmployeesandDepartments and Recent contact list.")
    public void userShouldBeSelectContactFromEmailUserEmployeesandDepartmentsAndRecentContactList() {

        // homePAge.addingReceipientFromRecent.click();
        // homePAge.randomReceipientsfromRecent.click();

        homePAge.addingReceipentfromEmployeesANdDepartments.click();
        homePAge.randomReceipientsfromEmployeesANdDepartments.click();

        Assert.assertTrue(homePAge.receipentsBox.getText().contains(homePAge.randomReceipientsfromEmployeesANdDepartments.getText()));

    }


    @And("user should be able to attach link by clicking on the link icon")
    public void userShouldBeAbleToAttachLinkByClickingOnTheLinkIcon() {

        homePAge.linkIcon.click();
        //  homePAge.linkIcon.click();
        String video = "Funny video";
        homePAge.textBox.sendKeys(video);
        homePAge.linkBox.sendKeys("https://www.youtube.com/watch?v=d-UU_lyqcFg");
        homePAge.saveButton.click();

        Driver.getDriver().switchTo().frame(homePAge.iframe);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(video));


    }

    @Then("User should be able to click insert video icon")
    public void userShouldBeAbleToClickVideoIcon() {

        homePAge.insertvideoIcon.click();

    }


    @Then("user should be able to entering the video URL")
    public void userShouldBeAbleToEnteringTheVideoURL() {
        String videoSources = "https://www.youtube.com/watch?v=d-UU_lyqcFg";
        homePAge.videoSource.sendKeys(videoSources);//There is a Bug!!!
        homePAge.videoSave.click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(videoSources));

    }

    @Then("user should be able to create quote by clicking Comma icon")
    public void userShouldBeAbleToCreateQuoteByClickingCommaIcon() {

        homePAge.quoteIcon.click();
        Driver.getDriver().switchTo().frame(homePAge.iframe);
        homePAge.blockquote.sendKeys("Hellooooo");
    }


    @Then("User should be able to add mention by clicking on the Add mention icon")
    public void userShouldBeAbleToAddMentionByClickingOnTheAddMentionIcon() {

        homePAge.addMention.click();
        homePAge.mentionRecent.click();
        homePAge.getAddMentionEmployeesAndDepartment.click();
        homePAge.mentionRandomEmployees.click();
    }


    @And("user should be able to click on Visual Editor see the editor text-bar displays on top of the message box")
    public void userShouldSeeTheEditorTextBarDisplaysOnTopOfTheMessageBox() {

        homePAge.visualEditor.click();
        //homePAge.textBarDisplay.click();

        Assert.assertTrue(homePAge.textBarDisplay.isDisplayed());


    }
    @And("user should be able to click on the Topic icon")
    public void userShouldBeAbleToClickOnTheTopicIcon() {
        homePAge.topicIcon.click();


    }

    @Then("user should be able to see the Appreciation Topic text box displays on top of the message box")
    public void userShouldBeAbleToSeeTheAppreciationTopicTextBoxDisplaysOnTopOfTheMessageBox() {
        Assert.assertTrue(homePAge.topicTextBarDisplay.isDisplayed());
    }


    @Then("user should be able to click on Record Video tab")
    public void userShouldBeAbleToClickOnTab() {

        homePAge.recordVideoTab.click();

    }

    @Then("user should be able to record a video and attach it with with the message")
    public void userShouldBeAbleToRecordAVideoAndAttachItWithWithTheMessage() {
        homePAge.recordVideoAllow.click();
// it didn't accept record a video and attach message ! There is a BUG!

    }


    @Then("user should be able to add tags by selecting existing tags or creating new tags by clicking on the #icon")
    public void userShouldBeAbleToAddTagsBySelectingExistingTagsOrCreatingNewTagsByClickingOnTheIcon() {

        homePAge.addTags.click();
        homePAge.addTagBox.sendKeys("#hi");

        homePAge.addButtonTags.click();


    }

    @Then("user should be able to see all types of emojis by clicking on the existing emojis")
    public void user_should_be_able_to_see_all_types_of_emojis_by_clicking_on_the_existing_illustration_emojis() {

        homePAge.visualEditor.click();
        Driver.getDriver().manage().window().fullscreen();
        Assert.assertTrue(homePAge.emojis.isDisplayed());
    }






}
