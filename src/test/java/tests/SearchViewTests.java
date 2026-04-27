package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchViewPage;
import pages.ViewsPage;

public class SearchViewTests extends BaseTest {

    @Test
    public void  verifySearchFunctionality() {

        String searchText = "Renewable Energy " ;

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        SearchViewPage searchView = new SearchViewPage();

        home.openViews();
        views.openSearchView();

        searchView.openActionBar();
        searchView.tapSearchIcon();
        searchView.enterSearchText(searchText);

        Assert.assertEquals(searchView.getSearchText(), searchText);
    }
}