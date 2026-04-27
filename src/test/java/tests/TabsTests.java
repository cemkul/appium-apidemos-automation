package tests;

import base.BasePage;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TabsPage;
import pages.ViewsPage;

public class TabsTests extends BaseTest {

    @Test
    public void verifyTabsNavigation() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        TabsPage tabs = new TabsPage();

        home.openViews();
        views.openTabs();

        tabs.openContentById();
        tabs.openTab2();
        tabs.openTab3();
    }
}