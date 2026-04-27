package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ControlsPage;
import pages.DarkThemePage;
import pages.HomePage;
import pages.ViewsPage;

public class LightThemeTests extends BaseTest {

    @Test
    public void verifyLightThemeFlow() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        ControlsPage controls = new ControlsPage();
        DarkThemePage lightTheme = new DarkThemePage();

        home.openViews();
        views.openControls();
        controls.openLightTheme();

        lightTheme.enterText("Light Theme Test");
        lightTheme.selectCheckbox();
        lightTheme.selectRadioButton();

        Assert.assertEquals(lightTheme.getEnteredText(), "Light Theme Test");
    }
}