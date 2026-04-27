package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    private static final ThreadLocal<AndroidDriver> driverThreadLocal = new ThreadLocal<>();

    public static void initDriver() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("appium:app",
                    System.getProperty("user.dir") +
                            "/src/test/resources/apps/ApiDemos-debug.apk");
            caps.setCapability("platformName", ConfigReader.getProperty("platformName"));
            caps.setCapability("appium:automationName", ConfigReader.getProperty("automationName"));
            caps.setCapability("appium:deviceName", ConfigReader.getProperty("deviceName"));
            caps.setCapability("appium:noReset",
                    Boolean.parseBoolean(ConfigReader.getProperty("noReset")));

            AndroidDriver driver = new AndroidDriver(
                    new URL(ConfigReader.getProperty("serverUrl")),
                    caps
            );

            driver.manage().timeouts().implicitlyWait(
                    Duration.ofSeconds(Long.parseLong(ConfigReader.getProperty("implicitWait")))
            );

            driverThreadLocal.set(driver);

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize driver", e);
        }
    }

    public static AndroidDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void quitDriver() {
        AndroidDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }
}