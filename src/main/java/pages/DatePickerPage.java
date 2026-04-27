package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DatePickerPage extends BasePage {

    private final By okButton =
            AppiumBy.id("android:id/button1");

    @Step("Select day: {day}")
    public void selectDay(int day) {
        By dayLocator = AppiumBy.xpath(
                "//android.view.View[contains(@content-desc,'" + day + "')]"
        );

        click(dayLocator);
    }

    @Step("Confirm date selection")
    public void confirmDate() {
        click(okButton);
    }
}