package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class TabsPage extends BasePage {

    private final By contentByIdOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"1. Content By Id\")");

    private final By tab2 =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"TAB2\")");

    private final By tab3 =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"TAB3\")");

    @Step("Open Content By Id tabs screen")
    public void openContentById() {
        click(contentByIdOption);
    }

    @Step("Open Tab 2")
    public void openTab2() {
        click(tab2);
    }

    @Step("Open Tab 3")
    public void openTab3() {
        click(tab3);
    }
}