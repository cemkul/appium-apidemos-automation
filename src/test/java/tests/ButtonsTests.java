package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ButtonsPage;
import pages.HomePage;
import pages.ViewsPage;

public class ButtonsTests extends BaseTest {

    @Test
    public void verifyButtonsAreDisplayed() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        ButtonsPage buttons = new ButtonsPage();

        home.openViews();
        views.openButtons();

        Assert.assertTrue(buttons.isNormalButtonVisible(), "Normal button should be visible");
        Assert.assertTrue(buttons.isSmallButtonVisible(), "Small button should be visible");
    }
}