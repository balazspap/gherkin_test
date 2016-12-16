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

public class formPageFunctionalityTest {

    WebDriver driver;
    HomePage homePage;
    CheckPage checkPage;

    @Given("^the Form page$")
    public void theFormPage() throws Throwable {
        homePage = new HomePage(driver);
        homePage.navigateTo();
        homePage.ClickFormButton();
    }

    @When("^you type \"([^\"]*)\" into input field$")
    public void youTypeValueIntoInputField(String arg1) throws Throwable {
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
