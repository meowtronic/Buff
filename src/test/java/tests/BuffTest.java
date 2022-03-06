package tests;

import org.junit.Test;
import pom.LoginPage;
import pom.ViewerPage;

public class BuffTest {

    @Test
    public void TestTask() {
        LoginPage.login();
        ViewerPage.videoCheck();
        ViewerPage.openVideoTool();
        ViewerPage.goToSettings();
        ViewerPage.updateEmail();
        ViewerPage.openEditProfile();
        ViewerPage.updateUsername();
        ViewerPage.popupAction();
    }
}
