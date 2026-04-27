package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

public class HomePage extends BasePage {

    private final By viewsOption = AppiumBy.accessibilityId("Views");
    private final By appOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")");


    @Step("Open Views screen")
    public void openViews() {
        click(viewsOption);
    }
    @Step("Open App screen")
    public void openApp() {
        click(appOption);
    }
}