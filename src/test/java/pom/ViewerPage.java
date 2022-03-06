package pom;

import helpers.Generators;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.URLs.videoUrl;
import static org.junit.Assert.assertEquals;
import static pom.pageElements.ViewerElements.*;

public class ViewerPage {
    public static void videoCheck() {
        video.should(visible, Duration.ofSeconds(30000));
        String source = executeJavaScript("return arguments[0].currentSrc;", video);
        assertEquals(videoUrl,source);
    }

    public static void openVideoTool() {
        video.hover();
        videoArrowDown.hover().click();
    }

    public static void goToSettings() {
        settingsBtn.click();
        settingsContent.shouldBe(visible);
    }

    public static void updateEmail () {
        String newEmail = Generators.generateRandomString(true,"new.com");
        workEmailInput.setValue(newEmail);
        updateEmailBtn.click();
        workEmailInput.shouldHave(value(newEmail));
    }

    public static void openEditProfile () {
        editProfileBtn.click();
        editProfileBackBtn.shouldBe(visible);
    }

    public static void updateUsername () {
        String newUsername = Generators.generateRandomString(false,"");
        usernameInput.setValue(newUsername);
        saveProfileChangesBtn.click();
        usernameLabel.shouldHave(text(newUsername));
    }

    public static void popupAction() {
        popupContainer.shouldBe(visible,Duration.ofSeconds(60000));
        randomAnswer.shouldBe(visible,Duration.ofSeconds(30000)).click();
    }
}
