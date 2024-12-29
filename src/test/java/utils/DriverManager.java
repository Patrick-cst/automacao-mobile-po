package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            
            capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            capabilities.setCapability("app", new File(ConfigReader.getProperty("appPath")).getAbsolutePath());
            capabilities.setCapability("appActivity", ConfigReader.getProperty("appActivity"));
            capabilities.setCapability("appWaitActivity", ConfigReader.getProperty("appWaitActivity"));

            try {
                driver = new AndroidDriver(new URL(ConfigReader.getProperty("appiumServer")), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Failed to initialize Appium driver: " + e.getMessage());
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
