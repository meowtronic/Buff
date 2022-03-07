package tests;

import helpers.Drivers;
import org.junit.Test;
import pom.LoginPage;
import pom.ViewerPage;

public class BuffTest {

    @Test
    public void TestTask() {
        Drivers.setCommonCapabilities();
        LoginPage.login();
        ViewerPage.videoCheck();
        ViewerPage.openVideoTool();
        ViewerPage.goToSettings();
        ViewerPage.updateEmail();
        ViewerPage.openEditProfile();
        ViewerPage.updateUsername();
        ViewerPage.popupAction();
        Drivers.tearDown();
    }
}
