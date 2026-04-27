package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchViewPage extends BasePage {

    private final By actionBarOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Action Bar\")");

    private final By searchIcon =
            AppiumBy.accessibilityId("Search");

    private final By searchInput =
            AppiumBy.id("android:id/search_src_text");

    @Step("Open Action Bar Search View")
    public void openActionBar() {
        click(actionBarOption);
    }

    @Step("Tap search icon")
    public void tapSearchIcon() {
        click(searchIcon);
    }

    @Step("Enter search text: {text}")
    public void enterSearchText(String text) {
        type(searchInput, text);
    }

    @Step("Get entered search text")
    public String getSearchText() {
        return getText(searchInput);
    }
}