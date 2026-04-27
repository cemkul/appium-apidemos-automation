package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ExpandableListsPage extends BasePage {

    private final By customAdapterOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"1. Custom Adapter\")");

    private final By peopleNamesGroup =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")");

    private final By dogNamesGroup =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Dog Names\")");

    private final By arnoldName =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Arnold\")");

    @Step("Open 1. Custom Adapter screen")
    public void openCustomAdapter() {
        click(customAdapterOption);
    }

    @Step("Expand People Names group")
    public void expandPeopleNames() {
        click(peopleNamesGroup);
    }

    @Step("Expand Dog Names group")
    public void expandDogNames() {
        click(dogNamesGroup);
    }

    @Step("Verify Arnold name is visible")
    public boolean isArnoldVisible() {
        return isDisplayed(arnoldName);
    }
}