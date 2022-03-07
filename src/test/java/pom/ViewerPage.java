package pom;

import helpers.Drivers;
import helpers.Generators;
import org.junit.Assert;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.network.Network;
import org.openqa.selenium.devtools.v97.network.model.Response;

import java.time.Duration;
import java.util.Optional;

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
        sleep(2000);
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
        DevTools devTools = Drivers.driver.getDevTools();
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
        devTools.addListener(Network.responseReceived(), responseReceived ->
        {
            Response res = responseReceived.getResponse();
            int code= res.getStatus();
            Assert.assertEquals(200, code);

        });
        popupContainer.shouldBe(visible,Duration.ofSeconds(60000));
        randomAnswer.shouldBe(visible,Duration.ofSeconds(30000)).click();
    }
}
