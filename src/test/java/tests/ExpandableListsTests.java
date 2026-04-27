package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExpandableListsPage;
import pages.HomePage;
import pages.ViewsPage;

public class ExpandableListsTests extends BaseTest {

    @Test
    public void verifyExpandableListPeopleNames() {

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        ExpandableListsPage expandableLists = new ExpandableListsPage();

        home.openViews();
        views.openExpandableLists();

        expandableLists.openCustomAdapter();
        expandableLists.expandPeopleNames();

        Assert.assertTrue(
                expandableLists.isArnoldVisible(),
                "Arnold should be visible after expanding People Names"
        );
    }
}