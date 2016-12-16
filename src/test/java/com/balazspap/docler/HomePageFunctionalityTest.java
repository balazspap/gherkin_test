package com.balazspap.docler;

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

public class homePageFunctionalityTest {

    WebDriver driver;
    HomePage homePage;
    CheckPage checkPage;

    @Given("^The UI Testing Site$")
    public void theUITestingSite() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateTo();
    }

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

    @Before
    public void setUp ()throws Exception {
        File pathToBinary = new File("C:\\Selenium\\Mozilla Firefox\\firefox.exe");
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
}
