package pages;

import org.openqa.selenium.WebDriver;

public class PageBase {

    protected WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage navigateTo() {
        driver.navigate().to("http://uitest.duodecadits.com");
//        Assert.assertEquals("UI Testing Site", driver.getTitle());
        return new HomePage(driver);
    }
}
