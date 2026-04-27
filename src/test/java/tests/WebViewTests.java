package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ViewsPage;
import pages.WebViewPage;

public class WebViewTests extends BaseTest {

    @Test
    public void verifyWebViewScreenDisplayed() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        WebViewPage webView = new WebViewPage();

        home.openViews();
        views.openWebView();

        Assert.assertTrue(webView.isWebViewDisplayed(),
                "WebView should be displayed");
    }
}