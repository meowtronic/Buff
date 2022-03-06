package pom.pageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginElements {
    public static SelenideElement h2 = $("h2");
    public static SelenideElement startDemoBtn = $(".Login_inputContainer__button__2meZo");
    public static SelenideElement usernameInput = $("#username");
    public static SelenideElement workEmailInput = $("#email");
}
