package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage ClickHomeButton() {
        WebElement homeButton = driver.findElement(By.id("home"));
        homeButton.click();
        return new HomePage(driver);
    }

    public HomePage ClickFormButton() {
        WebElement formButton = driver.findElement(By.id("form"));
        formButton.click();
        return new HomePage(driver);
    }

    public HomePage ClickLogoButton() {
        WebElement logoButton = driver.findElement(By.id("site"));
        logoButton.click();
        return new HomePage(driver);
    }
}
