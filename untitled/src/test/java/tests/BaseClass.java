package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class BaseClass {
    AppiumDriver driver;

    @BeforeTest
    public void setup(){
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, 13);
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
            caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            URL url = new URL("https://127.0.0.1:4724/wd/hub");
            driver=new AppiumDriver(url, caps);
    }catch(Exception exp){
        System.out.println("cause is " +exp.getCause());
        System.out.println("Message is " +exp.getMessage());
        exp.getStackTrace(); //collecting the trace
        }
    }
    @Test
    public void SampleTest(){
        System.out.println("I am inside sample Test");
    }
    @AfterTest
    public void teardown(){

    }
}
