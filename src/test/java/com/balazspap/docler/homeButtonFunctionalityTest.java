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

public class homeButtonFunctionalityTest {

    WebDriver driver;
    HomePage homePage;
    CheckPage checkPage;

    @Given("^I go to UI Testing home page$")
    public void iGoToUITestingHomePage() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateTo();
    }

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
