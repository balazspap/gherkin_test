package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage extends PageBase{

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    public NavigationPage checkHomeNavigationPageUrl() {
        Assert.assertEquals("http://uitest.duodecadits.com/", driver.getCurrentUrl());
        return new NavigationPage(driver);
    }

    public NavigationPage checkHomeButtonIsActive() {
        WebElement activeElement = driver.switchTo().activeElement();
        String className = activeElement.getAttribute("class");
        Assert.assertEquals("active", className);
        return new NavigationPage(driver);
    }

    public NavigationPage checkFormNavigationPageUrl() {
        Assert.assertEquals("http://uitest.duodecadits.com/form.html", driver.getCurrentUrl());
        return new NavigationPage(driver);
    }

    public NavigationPage checkFormButtonIsActive() {
        WebElement activeElement = driver.switchTo().activeElement();
        String className = activeElement.getAttribute("class");
        Assert.assertTrue(className == "active");
        return new NavigationPage(driver);
    }
}
