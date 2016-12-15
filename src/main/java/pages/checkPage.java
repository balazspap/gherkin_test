package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPage extends PageBase{

    public CheckPage(WebDriver driver) {
        super(driver);
    }

    public CheckPage checkHomeNavigationPageUrl() {
        Assert.assertEquals("http://uitest.duodecadits.com/", driver.getCurrentUrl());
        return new CheckPage(driver);
    }

    public CheckPage checkHomeButtonIsActive() {
        String activeElement = driver.findElement(By.xpath(".//li[contains(@class, 'active')]")).getText();
        Assert.assertEquals("Home", activeElement);
        return new CheckPage(driver);
    }

    public CheckPage checkFormNavigationPageUrl() {
        Assert.assertEquals("http://uitest.duodecadits.com/form.html", driver.getCurrentUrl());
        return new CheckPage(driver);
    }

    public CheckPage checkFormButtonIsActive() {
        String activeElement = driver.findElement(By.xpath(".//li[contains(@class, 'active')]")).getText();
        Assert.assertEquals("Form", activeElement);
        return new CheckPage(driver);
    }

    public CheckPage checkPageTitle(){
        Assert.assertEquals("UI Testing Site", driver.getTitle());
        return new CheckPage(driver);
    }

    public CheckPage checkLogoIsVisible(){
        Assert.assertTrue(driver.findElement(By.id("dh_logo")).isDisplayed());
        return new CheckPage(driver);
    }

    public CheckPage checkWelcomeTextIsVisible() {
        String welcomeElement = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Welcome to the Docler Holding QA Department", welcomeElement);
        return new CheckPage(driver);
    }

    public CheckPage checkExerciseTestIsVisible() {
        String welcomeElement = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals("This site is dedicated to perform some exercises and demonstrate automated web testing.", welcomeElement);
        return new CheckPage(driver);
    }

    public CheckPage sendKeysToInputForm(String string) {
        WebElement inputElement = driver.findElement(By.id("hello-input"));
        inputElement.sendKeys(string);
        return new CheckPage(driver);
    }

    public CheckPage submitForm() {
        WebElement submitButton = driver.findElement(By.id("hello-submit"));
        submitButton.click();
        return new CheckPage(driver);
    }

    public CheckPage checkRedirectedPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("hello"));
        return new CheckPage(driver);
    }

    public CheckPage checkIfTextAppeared(String string) {
        WebElement helloTextElement = driver.findElement(By.id("hello-text"));
        Assert.assertEquals(string, helloTextElement.getText());
        return new CheckPage(driver);
    }

}
