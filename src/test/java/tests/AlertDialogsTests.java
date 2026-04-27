package tests;

import base.BasePage;
import org.testng.annotations.Test;
import pages.AlertDialogsPage;
import pages.AppPage;
import pages.HomePage;

public class AlertDialogsTests extends BaseTest {

    @Test
    public void verifyOkCancelDialog() {

        HomePage home = new HomePage();
        AppPage app = new AppPage();
        AlertDialogsPage dialog = new AlertDialogsPage();

        home.openApp(); // we need to add this method
        app.openAlertDialogs();

        dialog.openOkCancelDialog();
        dialog.clickOk();
    }
}