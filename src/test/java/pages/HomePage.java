package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    // Locator for page heading
    private final By heading = By.tagName("h1");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}
