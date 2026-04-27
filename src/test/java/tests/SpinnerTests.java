package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SpinnerPage;
import pages.ViewsPage;

public class SpinnerTests extends BaseTest {

    @Test
    public void verifySpinnerOptionSelection() {

        String option = "blue";

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        SpinnerPage spinner = new SpinnerPage();

        home.openViews();
        views.openSpinner();

        spinner.openColorSpinner();
        spinner.selectOption(option);

        Assert.assertTrue(
                spinner.isOptionVisible(option),
                "Selected spinner option should be visible: " + option
        );
    }
}