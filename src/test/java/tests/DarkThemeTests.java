package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ControlsPage;
import pages.DarkThemePage;
import pages.HomePage;
import pages.ViewsPage;

public class DarkThemeTests extends BaseTest {

    @Test
    public void verifyDarkThemeFlow() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        ControlsPage controls = new ControlsPage();
        DarkThemePage dark = new DarkThemePage();

        home.openViews();
        views.openControls();
        controls.openDarkTheme();

        dark.enterText("Hello Appium");
        dark.selectCheckbox();
        dark.selectRadioButton();

        Assert.assertEquals(dark.getEnteredText(), "Hello Appium");
    }
}