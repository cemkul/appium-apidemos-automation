package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PopupMenuPage extends BasePage {

    private final By makePopupButton = AppiumBy.accessibilityId("Make a Popup!");
    private final By searchOption = AppiumBy.xpath("//android.widget.TextView[@text='Search']");

    public void openPopup() {
        click(makePopupButton);
    }

    public boolean isSearchOptionVisible() {
        return isDisplayed(searchOption);
    }
}