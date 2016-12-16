package com.balazspap.docler.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import pages.CheckPage;
import pages.HomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class testRequirementsCoverageTest {

    WebDriver driver;
    HomePage homePage;
    CheckPage checkPage;
    String firefoxFolder = System.getProperty("firefox.folder");

    @Before
    public void setUp ()throws Exception {
        File pathToBinary = new File(firefoxFolder);
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile ffprofile = new FirefoxProfile();
        ffprofile.setAcceptUntrustedCertificates(true);
        driver = new FirefoxDriver(ffBinary, ffprofile);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown ()throws Exception {
        driver.quit();
    }

    @Given("^the UI Testing Site is available$")
    public void theUITestingSiteIsAvailable() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateTo();
    }

    // formButtonFunctionalityTest
    @When("^I click the Form button$")
    public void iClickTheFormButton() throws Throwable {
        homePage.ClickFormButton();
    }

    @Then("^I get navigated to the Form page$")
    public void iGetNavigatedToTheFormPage() throws Throwable {
        checkPage = new CheckPage(driver);
        checkPage.checkFormNavigationPageUrl();
    }

    @And("^Form button is active$")
    public void formButtonIsActive() throws Throwable {
        checkPage.checkFormButtonIsActive();
    }

    // formPageFunctionalityTest

    @When("^you type \"([^\"]*)\" into input field$")
    public void youTypeValueIntoInputField(String arg1) throws Throwable {
        homePage.ClickFormButton();
        checkPage = new CheckPage(driver);
        checkPage.sendKeysToInputForm(arg1);
    }

    @And("^submit the form$")
    public void submitTheForm() throws Throwable {
        checkPage.submitForm();
    }

    @Then("^you should get redirected to the Hello Page$")
    public void youShouldGetRedirectedToTheHelloPage() throws Throwable {
        checkPage.checkRedirectedPage();
    }

    @And("\"([^\"]*)\" should appear$")
    public void resultShouldAppear(String arg2) throws Throwable {
        checkPage.checkIfTextAppeared(arg2);
    }

    // homeButtonFunctionalityTest

    @When("^I click the Home button$")
    public void iClickTheHomeButton() throws Throwable {
        homePage.ClickHomeButton();
    }

    @Then("^I get navigated to the Home page$")
    public void iGetNavigatedToTheHomePage() throws Throwable {
        checkPage = new CheckPage(driver);
        checkPage.checkHomeNavigationPageUrl();
    }

    @And("^Home button is active$")
    public void homeButtonIsActive() throws Throwable {
        checkPage.checkHomeButtonIsActive();
    }

    // homePageFunctionalityTest

    @When("^I navigate to the Home Page$")
    public void iNavigateToTheHomePage() throws Throwable {
        homePage.ClickHomeButton();
    }

    @Then("^The Title of the page is UI Testing Site$")
    public void theTitleOfThePageIsUITestingSite() throws Throwable {
        checkPage = new CheckPage(driver);
        checkPage.checkPageTitle();
    }

    @And("^The Company Logo Is Visible$")
    public void theCompanyLogoIsVisible() throws Throwable {
        checkPage.checkLogoIsVisible();
    }

    @And("^Welcome Text is visible$")
    public void welcomeTextIsVisible() throws Throwable {
        checkPage.checkWelcomeTextIsVisible();
    }

    @And("^Exercise test is visible$")
    public void exerciseTestIsVisible() throws Throwable {
        checkPage.checkExerciseTestIsVisible();
    }

    // logoButtonFunctionality

    @When("^I click the Logo button$")
    public void iClickTheLogoButton() throws Throwable {
        homePage.ClickLogoButton();
    }

    @Then("^I get directed to the Home page$")
    public void iGetDirectedToTheHomePage() throws Throwable {
        checkPage = new CheckPage(driver);
        checkPage.checkHomeNavigationPageUrl();
    }
}
