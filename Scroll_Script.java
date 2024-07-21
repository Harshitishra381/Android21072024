package Trial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



public class Scroll_Script<MobileElement, Rotatable>  {


	
    public static void clickAndWaitForElementWithXpath1(final String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver arg0) {
                try {
                    WebElement element = (driver).findElement(By.xpath(xpath));
                    element.click();
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        };
        wait.until(condition);
    }

    public static void clickAndWaitForElementWithId(final String id) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver arg0) {
                try {
                    WebElement element = (driver).findElement(By.id(id));

//				    	(driver).findElement(null);
                    element.click();
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        };
        wait.until(condition);
    }

    // Function for if else element

    public static boolean isVisibleWithId(final String id) {
        boolean isVisible;
        isVisible = !driver.findElements(By.id(id)).isEmpty();
        return isVisible;
    }

    public static boolean isVisibleWithXPath1(final String xPath) {
        boolean isVisible;
        isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
        return isVisible;
    }
    
    
    
    public static void miniplayertofullplayerSwitch() throws InterruptedException {
        int repeats = 10;
        for (int i = 0; i < repeats; i++) {
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        }
        System.out.println("F--> " + repeats + " times Mini Player to Full screen done");
        Thread.sleep(2000);
    }
    
    
    public static void PIPSwitch() throws InterruptedException {
        for (int i = 1; i <= 2; i++) {
            if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
                Thread.sleep(5000);
            }
            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
            Thread.sleep(5000);
        }
        System.out.println("F--> PIP switch done 10 times");
        Thread.sleep(2000);

    }
    
    
    
    public static void  OpenVideo() {
    
    if (isVisibleWithXPath1("//android.widget.Button[contains(@text, 'Videos')]"))
	{
    clickAndWaitForElementWithXpath1("//android.widget.Button[contains(@text, 'Videos')]");
    System.out.println("TC01- Video tab opened");
    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
    System.out.println("TC02- Video Opened from videos tab");
	}
	else
	{
    driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
    if (isVisibleWithId("com.threesixteen.app:id/video_timer"))
    {
    clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
    System.out.println("TC02- Video Opened from homepage");
	}
    else
    {
    	 driver.findElement(AppiumBy.androidUIAutomator(
 	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
 	    System.out.println("TC02- Video Opened from homepage");
    }
   }
    }
    
    
    
    public static void ExoQualityChnage() throws InterruptedException {

    	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
         System.out.println("TC07- Clicked on video player setting");
         Thread.sleep(2000);
         clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
         System.out.println("TC08- clicked on video quality");
         Thread.sleep(2000);
         if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
             System.out.println("TC09- changed the video qulaity to 1080p");
             Thread.sleep(2000);
         }

         if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
             System.out.println("TC10- changed the Video qulaity to 720p");
             Thread.sleep(2000);
         }

         if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
             System.out.println("TC11- changed the Video qulaity to 480p");
             Thread.sleep(2000);
         }

         if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
             System.out.println("TC12- changed the video qulaity to 240p");
             Thread.sleep(2000);
         }

         if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
             clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
             System.out.println("TC13- changed the Video qulaity to 360p");
             Thread.sleep(2000);
         }

     }


    
    
    
    static AppiumDriver driver;

    private Capabilities cap;
    private int index;

    
    @BeforeMethod
    public void setup2() throws MalformedURLException, InterruptedException  {

        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AndroidDriver(url, cap);
    	
    	 DesiredCapabilities cap1 = new DesiredCapabilities();
//	     cap1.setCapability("deviceName", "RZ8T907T67Y");
       cap.setCapability("deviceName", "6381e3e");
       cap1.setCapability("platformName", "Android");
       cap1.setCapability("platformVersion", "14");
//	    cap.setCapability("platformVersion", "12");
       cap1.setCapability("appPackage", "com.threesixteen.app");
//       cap.setCapability("appPackage", "com.threesixteen.app.dev");
       cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
       cap1.setCapability("autoGrantPermissions", true);
       cap1.setCapability("ignoreHiddenApiPolicyError", true);
       cap1.setCapability("noReset", true);

       
       URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
		driver = new AndroidDriver(url1, cap1);

       System.out.println("Application started");
        Thread.sleep(2000);
   
   

//       if (isVisibleWithId("android:id/button2")) 
//       {
//           clickAndWaitForElementWithId("android:id/button2");
//           System.out.println("Click on close");
//       }
//
////		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
////		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
////			System.out.println("Gmail Login Done");
//
//	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android."))
//	        {
//	            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
////				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
//	            System.out.println("Spinwheel rotate");
//           }
//       if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) 
//       {
//           clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
//           System.out.println("Notification permission allowed");
//
//       }
        if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
            
            driver.navigate().back();
             System.out.println("Exist from Update");
             Thread.sleep(1000);
        }//
   }

    
    
   
    
    
    @Test(priority = 1)
    
    
    public void BGMiSearchCreatorListScroll1() throws InterruptedException, MalformedURLException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
		Thread.sleep(2000);
    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC07- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC08- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC09- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC10- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        Thread.sleep(1000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC11- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC12- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC13- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC14- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC15- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC16- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC17- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC18- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC19- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC20- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC21- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(4)"));
        System.out.println("TC22- Creator List Scrolled");
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC23- open profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
        }

    }
	
    
    
   

    @Test(priority = 2)
    
    public void MinecraftSearchReelScroll2() throws InterruptedException, MalformedURLException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraft");
        System.out.println("TC02- Type Minecraft in search");
		Thread.sleep(2000);
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC05- open reels tab from search");
		Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC06- Open first reel from search");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
        	 driver.findElement(
                     AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
            Thread.sleep(1000);
            System.out.println("TC07-  Reel from search Scrolled");
        }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC08-  Reel from search Scrolled");
       }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC09-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC10-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC11-  Reel from search Scrolled");
       }

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC12-  Reel from search Scrolled");
       }
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
       	 driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);
           System.out.println("TC13-  Reel from search Scrolled");
       }


        
    }
    
    
    
	
    @Test(priority = 03)

    public void SearchVideoScroll03() throws InterruptedException {

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
        System.out.println("TC01- Open Search");
		Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
		Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC03- Type bgmi in search");
		Thread.sleep(2000);
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(3000);
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC06- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC07- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC08- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC09- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC10- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC11- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC12- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC13- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC14- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC15- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC16- Video page Page scrolled");
           }
        if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
        	driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
           Thread.sleep(1000);   
           System.out.println("TC17- Video page Page scrolled");
           }
       
        
    }
    
 
 
 
 
 
 

	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



