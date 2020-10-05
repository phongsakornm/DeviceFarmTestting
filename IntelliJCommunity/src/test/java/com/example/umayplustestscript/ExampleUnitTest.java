package com.example.umayplustestscript;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ExampleUnitTest {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("app", "C:\\Users\\Phongsakorn\\Desktop\\umay_plus_2.8.0.apk");
        desiredCapabilities.setCapability("autoGrantPermissions", true);
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        desiredCapabilities.setCapability("language", "th");
        desiredCapabilities.setCapability("locale", "TH");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() throws InterruptedException {
//      Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement loginButton = (MobileElement) driver.findElementById("com.aim.android.umay:id/iconLogin");
        loginButton.click();


        MobileElement el2 = (MobileElement) driver.findElementById("com.aim.android.umay:id/editUser");
        el2.sendKeys("HHHH0505");
        MobileElement el3 = (MobileElement) driver.findElementById("com.aim.android.umay:id/editPass");
        el3.sendKeys("Hhhh55555");
        MobileElement el4 = (MobileElement) driver.findElementById("com.aim.android.umay:id/flLogin");
        el4.click();

        MobileElement editBirthDate = (MobileElement) driver.findElementById("com.aim.android.umay:id/editBirthDate");
        editBirthDate.click();
        MobileElement datePickerYear = (MobileElement) driver.findElementById("com.aim.android.umay:id/date_picker_year");
        datePickerYear.click();

//        WebDriverWait wait1s = new WebDriverWait(driver, 1);

        MobileElement year2510 = null;
        for (int i = 0; i < 50; i++) {

//            year2510 = (MobileElement) wait1s.until(
//                    ExpectedConditions.presenceOfElementLocated(By.id("2510")));

            try {
                year2510 = (MobileElement) driver.findElementByAccessibilityId("2510");
            }
            catch(Exception e) {
                year2510 = null;
            }

            if (year2510 != null)
            {
                break;
            }

            (new TouchAction(driver))
                .press(PointOption.point(679, 1229))
                .moveTo(PointOption.point(685, 1809))
                .release()
                .perform();
        }

        if (year2510 == null)
        {
            throw new RuntimeException("Could not find year 2510");
        }else {
            year2510.click();
        }



        MobileElement dateMonth = null;

        for (int i = 0; i < 12; i++) {
            try {
                dateMonth = (MobileElement) driver.findElementByAccessibilityId("18 July 1967");
            }
            catch(Exception e) {
                dateMonth = null;
            }

            if (dateMonth != null)
            {
                break;
            }

            (new TouchAction(driver))
                    .press(PointOption.point(712, 1144))
                    .moveTo(PointOption.point(699, 1893))
                    .release()
                    .perform();
        }

        if (dateMonth == null)
        {
            throw new RuntimeException("Could not find 18 July 1967");
        }else {
            dateMonth.click();
        }




        MobileElement el9 = (MobileElement) driver.findElementById("com.aim.android.umay:id/ok");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementById("com.aim.android.umay:id/editThaiID");
        el10.sendKeys("3509900336372");
        MobileElement el11 = (MobileElement) driver.findElementById("com.aim.android.umay:id/flNext");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementById("com.aim.android.umay:id/flClose");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("com.aim.android.umay:id/otpView");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementById("com.aim.android.umay:id/otpView");
        el14.sendKeys("123456");
        MobileElement el15 = (MobileElement) driver.findElementById("com.aim.android.umay:id/flConfirm");
        el15.click();


        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[3]/android.widget.FrameLayout");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[2]/android.widget.FrameLayout");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[3]/android.widget.FrameLayout");
        el21.click();

        Thread.sleep(5000);

        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[2]/android.widget.FrameLayout");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[3]/android.widget.FrameLayout");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]/android.widget.FrameLayout");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[2]/android.widget.FrameLayout");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[3]/android.widget.FrameLayout");
        el27.click();


        MobileElement el28 = (MobileElement) driver.findElementById("com.aim.android.umay:id/flClose");
        el28.click();



//        com.aim.android.umay:id/textCreditAvailable
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
