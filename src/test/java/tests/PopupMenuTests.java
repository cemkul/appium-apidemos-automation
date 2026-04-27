package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PopupMenuPage;
import pages.ViewsPage;

public class PopupMenuTests extends BaseTest {

    @Test
    public void verifyPopupMenu() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        PopupMenuPage popup = new PopupMenuPage();

        home.openViews();
        views.openPopupMenu();
        popup.openPopup();

        Assert.assertTrue(popup.isSearchOptionVisible());
    }
}