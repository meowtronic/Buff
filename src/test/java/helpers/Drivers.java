package helpers;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Drivers {
    public static ChromeDriver driver;

    public static void setCommonCapabilities() {
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        driver.manage().window().maximize();
        clearBrowserCache();
    }

    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
