Feature:  Sending Appreciation
  Agile Story 6 : As a user, I should be able to send
  appreciation by clicking on Appreciation subheading from ""More"" tab under Activity Stream.


  @upload
  Scenario: User should be able to click on upload files icon to upload files
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then user should be able to click Upload Icon
    Then User should see see upload options

  @AddUsers
  Scenario: User should be able to add users and recipients
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then User should click to Add More option
    Then user should be select contact from Email user, EmployeesandDepartments and Recent contact list.

  @attach
  Scenario: User should be able to attach link
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    And user should be able to attach link by clicking on the link icon

    #There is a Bug @video scenario
  @video
  Scenario: User should be able to insert videos
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then User should be able to click insert video icon
    Then user should be able to entering the video URL


  @quote
  Scenario: User should be able to create quote
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then user should be able to create quote by clicking Comma icon

  @mention
  Scenario: User should be able to add mention
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then User should be able to add mention by clicking on the Add mention icon


  @visual
  Scenario: User should be able to click on Visual Editor
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    And user should be able to click on Visual Editor see the editor text-bar displays on top of the message box

  @topic
  Scenario: User should be able to click on the Topic icon
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    And user should be able to click on the Topic icon
    Then user should be able to see the Appreciation Topic text box displays on top of the message box


  @record
  Scenario: User should be able to click on "Record Video" tab
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then user should be able to click on Record Video tab
    Then user should be able to record a video and attach it with with the message

  @tags
  Scenario: User should be able to add tags
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then user should be able to add tags by selecting existing tags or creating new tags by clicking on the #icon

  @emojis
  Scenario: User should be able to see all types off appreciation illustration/emojis
    When user login to account succesfully
    Then user should be able to hover over to More Tab and click
    Then user should click Appreciation option
    Then user should be able to see all types of emojis by clicking on the existing emojis
