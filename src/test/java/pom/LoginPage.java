package pom;

import helpers.Generators;
import pom.pageElements.LoginElements;
import testData.ViewerData;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static helpers.URLs.demo;
import static pom.pageElements.LoginElements.*;
import static pom.pageElements.ViewerElements.*;
import static testData.LoginData.WelcomeWords;

public class LoginPage {
    public static void login() {
        open(demo);
        h2.shouldHave(text(WelcomeWords), Duration.ofSeconds(30000));
        LoginElements.workEmailInput.setValue(Generators.generateRandomString(true, "test.com"));
        LoginElements.usernameInput.setValue(Generators.generateRandomString(false, null));
        startDemoBtn.click();
        buffTitle.shouldHave(text(ViewerData.DemoWords), Duration.ofSeconds(30000));
    }
}
