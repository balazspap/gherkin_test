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

public class formButtonFunctionalityTest {

    WebDriver driver;
    HomePage homePage;
    CheckPage checkPage;

    @Given("^I navigate to UI Testing home page$")
    public void iNavigateToUITestingHomePage() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateTo();
    }

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
