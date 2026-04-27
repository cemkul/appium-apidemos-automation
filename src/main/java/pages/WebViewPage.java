package pages;

import base.BasePage;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class WebViewPage extends BasePage {

    private final By webViewElement =
            AppiumBy.className("android.webkit.WebView");

    @Step("Verify WebView is displayed")
    public boolean isWebViewDisplayed() {
        return isDisplayed(webViewElement);
    }
}