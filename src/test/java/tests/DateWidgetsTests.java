package tests;

import base.BasePage;
import org.testng.annotations.Test;
import pages.DatePickerPage;
import pages.DateWidgetsPage;
import pages.HomePage;
import pages.ViewsPage;

public class DateWidgetsTests extends BaseTest {

    @Test
    public void verifyDynamicDateSelection() {

        int dayToSelect = 15;

        HomePage home = new HomePage();
        ViewsPage views = new ViewsPage();
        DateWidgetsPage dateWidgets = new DateWidgetsPage();
        DatePickerPage picker = new DatePickerPage();

        home.openViews();
        views.openDateWidgets();

        dateWidgets.openDialog();
        dateWidgets.clickChangeDate();

        picker.selectDay(dayToSelect);
        picker.confirmDate();
    }
}