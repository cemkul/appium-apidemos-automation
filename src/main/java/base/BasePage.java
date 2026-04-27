package base;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.LogUtils;
import utils.ScreenshotUtils;
import utils.WaitUtils;

public class BasePage {

    protected AndroidDriver driver;

    public BasePage() {
        this.driver = DriverFactory.getDriver();
    }

    protected void click(By locator) {
        LogUtils.info("Clicking element: " + locator);
        WaitUtils.waitForClickable(locator).click();
        attachScreenshot("After click: " + locator);
    }

    protected void type(By locator, String text) {
        LogUtils.info("Typing text '" + text + "' into element: " + locator);
        WebElement element = WaitUtils.waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
        attachScreenshot("After typing: " + text);
    }

    protected String getText(By locator) {
        LogUtils.info("Getting text from element: " + locator);
        attachScreenshot("Before getting text: " + locator);
        return WaitUtils.waitForVisibility(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        LogUtils.info("Checking visibility of element: " + locator);
        attachScreenshot("Before visibility check: " + locator);
        return WaitUtils.waitForVisibility(locator).isDisplayed();
    }

    @Attachment(value = "{screenshotName}", type = "image/png")
    protected byte[] attachScreenshot(String screenshotName) {
        return ScreenshotUtils.takeScreenshot();
    }
}