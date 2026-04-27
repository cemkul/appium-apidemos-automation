package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.GestureUtils;

public class ViewsPage extends BasePage {

    private final By controlsOption = AppiumBy.accessibilityId("Controls");
    private final By dateWidgetsOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Date Widgets\")");
    private final By expandableListsOption =
            AppiumBy.androidUIAutomator("new UiSelector().text(\"Expandable Lists\")");



    public void openControls() {
        click(controlsOption);
    }

    @Step("Open Popup Menu screen")
    public void openPopupMenu() {
        GestureUtils.scrollDownToTextAndClick("Popup Menu");
    }
    @Step("Open Date Widgets screen")
    public void openDateWidgets() {
        click(dateWidgetsOption);
    }
    @Step("Open Expandable Lists screen")
    public void openExpandableLists() {
        GestureUtils.scrollDownToTextAndClick("Expandable Lists");
    }

    @Step("Open Search View screen")
    public void openSearchView() {
        GestureUtils.scrollDownToTextAndClick("Search View");
    }
    @Step("Open Tabs screen")
    public void openTabs() {
        GestureUtils.scrollDownToTextAndClick("Tabs");
    }
    @Step("Open WebView screen")
    public void openWebView() {
        GestureUtils.scrollDownToTextAndClick("WebView");
    }
    @Step("Open Spinner screen")
    public void openSpinner() {
        GestureUtils.scrollDownToTextAndClick("Spinner");
    }
    @Step("Open Buttons screen")
    public void openButtons() {
        GestureUtils.scrollDownToTextAndClick("Buttons");
    }
}