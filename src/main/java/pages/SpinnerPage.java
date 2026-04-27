package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SpinnerPage extends BasePage {

    private final By colorSpinner =
            AppiumBy.id("io.appium.android.apis:id/spinner1");

    private By spinnerOption(String optionText) {
        return AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"" + optionText + "\")"
        );
    }

    @Step("Open color spinner")
    public void openColorSpinner() {
        click(colorSpinner);
    }

    @Step("Select spinner option: {optionText}")
    public void selectOption(String optionText) {
        click(spinnerOption(optionText));
    }

    @Step("Verify selected option is visible: {optionText}")
    public boolean isOptionVisible(String optionText) {
        return isDisplayed(spinnerOption(optionText));
    }
}