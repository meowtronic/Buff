package pom.pageElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ViewerElements {
    public static SelenideElement buffTitle = $(".BuffInfo_title__3RDez");

    // shadow elements
    public static SelenideElement shadowTarget = $(shadowCss("#SportBuff-buff","#SportBuff-container"));

    public static SelenideElement editProfileBtn = shadowTarget.$(byAttribute("data-testid","userSummary__button-edit"));
    public static SelenideElement editProfileBackBtn = shadowTarget.$(byAttribute("data-testid","editProfile__back-button"));
    public static SelenideElement popupContainer = shadowTarget.$(byAttribute("data-testid","buffcore-children-container"));
    public static SelenideElement randomAnswer = shadowTarget.$(".button");
    public static SelenideElement settingsBtn = shadowTarget.$(byAttribute("data-testid","tab-Settings"));
    public static SelenideElement settingsContent = shadowTarget.$(byAttribute("data-testid","settings-content"));
    public static SelenideElement saveProfileChangesBtn = shadowTarget.$(byText("Save Profile Changes"));
    public static SelenideElement usernameInput = shadowTarget.$("#username");
    public static SelenideElement usernameLabel = shadowTarget.$(".flex.mt-2.mb-3");
    public static SelenideElement updateEmailBtn = shadowTarget.$(byText("Update email"));
    public static SelenideElement video = $("#video");
    public static SelenideElement videoArrowDown = $(shadowCss("#SportBuff-buff","#SportBuff-container")).$(byAttribute("data-testid","points-deck-right-button"));
    public static SelenideElement workEmailInput = shadowTarget.$("#email");
}
