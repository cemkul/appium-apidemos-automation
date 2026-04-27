package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

public class DarkThemePage extends BasePage {

    private final By inputField = AppiumBy.id("io.appium.android.apis:id/edit");
    private final By checkbox = AppiumBy.id("io.appium.android.apis:id/check1");
    private final By radioButton = AppiumBy.id("io.appium.android.apis:id/radio1");
    @Step("Enter text: {text}")
    public void enterText(String text) {
        type(inputField, text);
    }
    @Step("Select checkbox")
    public void selectCheckbox() {
        click(checkbox);
    }
    @Step("Select radio button")
    public void selectRadioButton() {
        click(radioButton);
    }

    public String getEnteredText() {
        return getText(inputField);
    }
}