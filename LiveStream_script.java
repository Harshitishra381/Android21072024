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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.SupportsRotation;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LiveStream_script<MobileElement, Rotatable> extends Functions {


	
//    public static void clickAndWaitForElementWithXpath1(final String xpath) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver arg0) {
//                try {
//                    WebElement element = (driver).findElement(By.xpath(xpath));
//                    element.click();
//                    return true;
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//        };
//        wait.until(condition);
//    }
//
//    public static void clickAndWaitForElementWithId(final String id) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver arg0) {
//                try {
//                    WebElement element = (driver).findElement(By.id(id));
//
////				    	(driver).findElement(null);
//                    element.click();
//                    return true;
//                } catch (Exception e) {
//                    return false;
//                }
//            }
//        };
//        wait.until(condition);
//    }
//
//    // Function for if else element
//
//    public static boolean isVisibleWithId(final String id) {
//        boolean isVisible;
//        isVisible = !driver.findElements(By.id(id)).isEmpty();
//        return isVisible;
//    }
//
//    public static boolean isVisibleWithXPath1(final String xPath) {
//        boolean isVisible;
//        isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
//        return isVisible;
//    }
//    
// public static void OpenNotificationtab() throws InterruptedException {
//    	
//        Thread.sleep(1000);
//    	if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView"))
//        {
//        	
//    		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView");
//            Thread.sleep(1000);
//
//        } 
//    	
//    		if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView"))
//     	{
//    			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView");
//    	        Thread.sleep(1000);
//
//     	}
//    		else
//    			
//    		{
//    		
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_notification");
//             Thread.sleep(1000);
//	
//    		}
//        
//        System.out.println("TC01 - Notification tab opened");
//    }
//    
//    
//    
//    public static void miniplayertofullplayerSwitch() throws InterruptedException {
//        int repeats = 10;
//        for (int i = 0; i < repeats; i++) {
//            Thread.sleep(2000);
//            driver.navigate().back();
//            Thread.sleep(2000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//        }
//        System.out.println("F--> " + repeats + " times Mini Player to Full screen done");
//        Thread.sleep(2000);
//    }
//    
//    
//    
//    public static void OpenSearch() throws InterruptedException {
//    	
//    	
//    	
//    	 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	 	{  
//    	 		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//    	     System.out.println("TC01- Open Search");
//    	     Thread.sleep(1000);
//    	 	}
//    	 	else
//    	 	{
//    	 		if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	 	 {
//    	 			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//    	     System.out.println("TC01- Open Search");
//    	     Thread.sleep(1000);		
//    	 	 }
//    	 		else
//    	 		{
//    	             clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
//    	             System.out.println("TC01- Open Search0111");
//
//
//    	 		}
//    	 	}
//   
//}
//   
// 
// public static void TabSwitch() throws InterruptedException {
//	    for (int i = 0; i < 5; i++) {
//	        clickAndWaitForElementWithXpath1(
//	            "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
//	        clickAndWaitForElementWithXpath1(
//	            "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout[1]");
//	        clickAndWaitForElementWithXpath1(
//	            "//android.widget.FrameLayout[@content-desc=\"Explore\"]/android.widget.FrameLayout/android.widget.ImageView");
//	        // clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Gaming Zone\"]");
//	        clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
//	        System.out.println("F--> Tabs Switch Done " + (i + 1) + " times");
//	    }
//
//	}
//    
//    
//    public static void PIPSwitch() throws InterruptedException {
//        for (int i = 1; i <= 10; i++) {
//            if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
//                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//                Thread.sleep(5000);
//            }
//            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//            Thread.sleep(5000);
//        }
//        System.out.println("F--> PIP switch done 10 times");
//        Thread.sleep(2000);
//
//    }
//    
//    public static void  OpenVideo() {
//    
//    if (isVisibleWithXPath1("//android.widget.Button[contains(@text, 'Videos')]"))
//	{
//    clickAndWaitForElementWithXpath1("//android.widget.Button[contains(@text, 'Videos')]");
//    System.out.println("TC01- Video tab opened");
//    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//    System.out.println("TC02- Video Opened from videos tab");
//	}
//	else
//	{
//    driver.findElement(AppiumBy.androidUIAutomator(
//            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//    if (isVisibleWithId("com.threesixteen.app:id/video_timer"))
//    {
//    clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
//    System.out.println("TC02- Video Opened from homepage");
//	}
//    else
//    {
//    	 driver.findElement(AppiumBy.androidUIAutomator(
// 	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
// 	    System.out.println("TC02- Video Opened from homepage");
//    }
//   }
//    }
//    
//    
//    public static void ExoQualityChnage() throws InterruptedException {
//
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
//         System.out.println("TC07- Clicked on video player setting");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
//         System.out.println("TC08- clicked on video quality");
//         Thread.sleep(2000);
//         if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//             System.out.println("TC09- changed the video qulaity to 1080p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
//             System.out.println("TC10- changed the Video qulaity to 720p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
//             System.out.println("TC11- changed the Video qulaity to 480p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
//             System.out.println("TC12- changed the video qulaity to 240p");
//             Thread.sleep(2000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
//             System.out.println("TC13- changed the Video qulaity to 360p");
//             Thread.sleep(2000);
//         }
//
//     }
//
//
//    
//    public static void OpenLivetStream () throws InterruptedException {
//    	
//    	if (isVisibleWithXPath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
//            clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//            System.out.println("TC01- Pro stream opened");
//            Thread.sleep(1000);
//
//
//        } else
//        {
//            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
//            System.out.println("TC01- pro tab opened");
//            Thread.sleep(1000);
//
//        }
//
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC02- First Live session Opened");
//        Thread.sleep(10000);
//    }
//    
//    
//    
//    public static void OpenRecommendedFeed() throws InterruptedException {
//    	
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(2000);
//         System.out.println("F--> Open Recommended Feed 10 times");
//
//         
//    }
//    
//    
//    
//    static AppiumDriver driver;
//
//    private Capabilities cap;
//    private int index;
//
//    
//    @BeforeMethod
//    public void setup2() throws MalformedURLException, InterruptedException  {
//
//        DesiredCapabilities cap = new DesiredCapabilities();
//        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
//        driver = new AndroidDriver(url, cap);
//    	
//    	 DesiredCapabilities cap1 = new DesiredCapabilities();
////		cap.setCapability("deviceName", "5SU4BEVW7H9LPZAE");
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
////		cap.setCapability("deviceName", "13793294180004Z");
//       cap.setCapability("deviceName", "13793294180004Z");
//       cap1.setCapability("platformName", "Android");
//       cap1.setCapability("platformVersion", "14");
////	    cap.setCapability("platformVersion", "12");
//       cap1.setCapability("appPackage", "com.threesixteen.app");
////       cap.setCapability("appPackage", "com.threesixteen.app.dev");
//       cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
//       cap1.setCapability("autoGrantPermissions", true);
//       cap1.setCapability("ignoreHiddenApiPolicyError", true);
//       cap1.setCapability("noReset", true);
//
//       
//       URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url1, cap1);
//
//       System.out.println("Application started");
//        Thread.sleep(3000);
//   
//   
//
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
//       Thread.sleep(1000);
//       
//       if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//         
//           driver.navigate().back();
//            System.out.println("Exist from Update");
//            Thread.sleep(1000);
//       }
//   }
//
//    
//    



   
     

    @Test(priority = 1)
    public void LiveMiniplayertabswittch1() throws InterruptedException {

         OpenLivetStream();
        driver.navigate().back();
        TabSwitch();
    }

    
    
   
    @Test(priority = 2)
    public void livestreamwatccanwin2() throws InterruptedException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");

        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- Pro tab opened");
        }
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Live chat");
        Thread.sleep(2000);
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/iv_top_donors_support_lottie\")).setAsHorizontalList().scrollForward(3)"));
        System.out.println("TC04- scroll left ");
        Thread.sleep(2000); 
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/iv_top_donors_support_lottie\")).setAsHorizontalList().scrollForward(3)"));
        System.out.println("TC04- scroll left ");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[contains(@text,'Watch & Win')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
        System.out.println("TC04- open watch & winn");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- refresh watch & winn");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- Open coins log");
        Thread.sleep(2000); 
        driver.navigate().back();
        Thread.sleep(2000); 
        System.out.println("TC07- Back from coins log");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC08- Back from task page");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Live chat");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//*[contains(@text,'Watch & Win')]")).click();
        System.out.println("TC08A- open watch & winn");
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more_task");
        System.out.println("TC09- Open see more tasks");
        Thread.sleep(2000); 
        driver.navigate().back();
        Thread.sleep(2000); 
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC10- Close bottom sheet");

    }
    

    @Test(priority = 3)
    public void liveplayercomennt3() throws InterruptedException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");

        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- Pro tab opened");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
        System.out.println("TC06- clicked comment section.....");
        if (isVisibleWithId("com.threesixteen.app:id/et_comment"))
        {
         
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
        System.out.println("TC07- Typed Hi comment section.....");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC08- Send the  comment on live stream");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Live chat");
        Thread.sleep(1000);
        }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC10- Only Followers chat allowed");
        }
    }

    
    @Test(priority = 4)
    public void liveplayerFanrank4() throws InterruptedException {

    	OpenLivetStream();
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC03- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/layout_fan_rank")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
            System.out.println("TC04- Open Fan Rank live session");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            System.out.println("TC05- Open 1st Fan Rank userprofile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC06- Creators Profile opened in full view");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC07- Back from creators profile");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_refresh")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC09- Refresh  the Fan rank");
            Thread.sleep(1000);
            }
            else
            {
            	 clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
                 System.out.println("TC10- Open Fan Rank live session");
                 Thread.sleep(1000);
                 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
                 System.out.println("TC11- Refresh  the Fan rank");
                 Thread.sleep(1000);
            }
            Thread.sleep(1000);
            System.out.println("TC12- Scrolling Fan rank");
            Thread.sleep(1000);

            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_winning");
            System.out.println("TC13- Click on Winnings");
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_info_button");
            System.out.println("TC14- Click on Eye button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
            System.out.println("TC15- Click on Close button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC16- Exist from Fan Rank");
            Thread.sleep(1000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_top_donors_support_lottie");
        System.out.println("TC17- Opned  Top Donors list");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/refresh_btn");
        System.out.println("TC18- Refreshed top donors list");
        Thread.sleep(1000);
        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
            System.out.println("TC19- Opened Top donor's profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC19A- Creators channel opened in full view");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC20- Back from creators profile");
            Thread.sleep(1000);
     
        }
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/refresh_btn")) {
        	driver.navigate().back();
        System.out.println("TC22- Existed from top donors list");
        Thread.sleep(1000);
        }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_top_donors_support_lottie");
            System.out.println("TC23- Opned  Top Donors list");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC24- Existed from top donors list");
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
        System.out.println("TC25- Open live chat again");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("TC26- Switch to mini player");
    }

    
    
    @Test(priority = 6)
    public void livestreamwatchandwin6() throws InterruptedException {

        OpenLivetStream();
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_watch_n_view_lottie");
        System.out.println("TC03- open watch & Win for live stream");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC04- Refresh watch & Win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- Refresh watch & Win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- open coins page");
        Thread.sleep(500);
        driver.navigate().back();
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
        System.out.println("TC07- back from coins page");
        driver.navigate().back();
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
//        System.out.println("TC08- Back to Watch and win");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC09- Exist from Watch and win");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC10- Exist from Live chat");
        }

    }

    
    @Test(priority = 7)
    public void livestreaminetractivepolls7() throws InterruptedException {

        OpenLivetStream();
        if (isVisibleWithId("com.threesixteen.app:id/iv_interactive")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_interactive");
        System.out.println("TC03- Open interactive center");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- Open Live stream polls");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/ic_refresh");
        System.out.println("TC05- refresh page");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC06- Close Polls");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC07- Open Top donors from interactive center");
        driver.navigate().back();
    }
    else
    {
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         System.out.println("TC09- Exist from Live chat");
         Thread.sleep(1000);
         
        System.out.println("TC07-  Interactive center not available");
    }
    }
    
    

    @Test(priority = 8)
    public void livestreaminetractivemoreIRL8() throws InterruptedException {

        OpenLivetStream();
        if (isVisibleWithId("com.threesixteen.app:id/iv_interactive")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_interactive");
        System.out.println("TC03- Open interactive center");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'More IRLs')]")) {
            driver.findElement(By.xpath("//*[contains(@text,'More IRLs')]")).click();
            System.out.println("TC03- Click on more IRLs");
            Thread.sleep(1000);
        } else {
            driver.findElement(By.xpath("//*[contains(@text,'More Streams')]")).click();
            System.out.println("TC03- Click on more IRLs");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]");
        System.out.println("TC03- Click on stream layout");
        Thread.sleep(1000);
       
    }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
            System.out.println("TC01- Open Donation box");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_magic_chat");
            System.out.println("TC02- Click on Gift Magic chat");
            Thread.sleep(1000);
            driver.navigate().back();
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_gift_donation");
            System.out.println("TC03- Open donation box");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_sticker");
            System.out.println("TC04- Open gift sticker");
            Thread.sleep(1000);
        }
    }
    




    @Test(priority = 10)
    public void Livebuttonotimeronstreaminprotab10() throws InterruptedException, MalformedURLException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
            Thread.sleep(1000);

        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- Pro tab opened");
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_live")) {
            System.out.println("TC02- Live button is visbile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
            System.out.println("TC03- Open streamer profile");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC04- Backk from streamer profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC04- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
            System.out.println("TC05- Click on About button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
            System.out.println("TC06- Click on Done button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC07- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
            System.out.println("TC08- Click on Follow button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC09- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
            System.out.println("TC10-  unFollow creator");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC11- open stream");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC12- Exist from Live chat");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
            System.out.println("TC13- time watching data is coming from backkend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC14- Game Name is coming from backend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
            System.out.println("TC15- Game Language is coming from backend for stream");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC16- Follow streamer");
            Thread.sleep(500);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC17- UnFollow streamer");
            Thread.sleep(1000);
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC17- Live button not visible");

        }
    }

    
    @Test(priority = 11)

    public void LivebuttonotimeronstreamINSEARCH11() throws InterruptedException, MalformedURLException {

      OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
//        driver.findElement(By.xpath("//*[contains(@text,'BGMS')]")).click();
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC04- Click on BGMS in search suggestion");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Live')]")).click();
        System.out.println("TC05- Click on Live tab");
        Thread.sleep(1000);
        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")) {
            System.out.println("TC06- Live button is visbile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
            System.out.println("TC07- Open streamer profile");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC08- Backk from streamer profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
            System.out.println("TC09- Click on more button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
            System.out.println("TC10- Click on About button");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
            System.out.println("TC11- Click on Done button");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
            System.out.println("TC16- open stream");
            Thread.sleep(3000);
        
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
                System.out.println("TC17- Exist from Live chat");
                Thread.sleep(1000);
            
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
            System.out.println("TC18- time watching data is coming from backkend for stream");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC19- Game Name is coming from backend for stream");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView");
            System.out.println("TC20- Game Language is coming from backend for stream");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC21- Follow streamer");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC22- UnFollow streamer");
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
            System.out.println("TC06- Live button not visible");

        }
    }
    
    
    @Test(priority = 12)
    public void liveplayershare12() throws InterruptedException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");

        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- Pro tab opened");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/layout_img_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_img_like");
            System.out.println("TC04- live session Liked");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_share");
        System.out.println("TC03- Click on share icon");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
        System.out.println("TC04- Copy link");
        

    }
    

    @Test(priority = 13)
    public void livestreamemojis13() throws InterruptedException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC01- pro tab opened");
        }
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- opened feed");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_post_support")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_support");
            System.out.println("TC02- Like session");
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC03- Click on live chat ");
        Thread.sleep(1000);
        
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC04- scroll gift stickers");
        Thread.sleep(1000);  
       
        if (isVisibleWithId("com.threesixteen.app:id/emote_layout")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/emote_layout");
            System.out.println("TC05- Open emojis layout");
            Thread.sleep(1000); 
        }
        
        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]");
        System.out.println("TC06- emoji 1");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[2]");
        System.out.println("TC07- emoji 2");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[3]");
        System.out.println("TC08- emoji 3");

        clickAndWaitForElementWithXpath1(
              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[4]");
        System.out.println("TC09- emoji 4");
        
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]");
          System.out.println("TC06- emoji 1");

//
//        clickAndWaitForElementWithXpath1(
//              "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[5]");
//        System.out.println("TC06- emoji 5");
//
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[5]");
//        System.out.println("TC06- emoji 6");
//
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[6]");
//        System.out.println("TC07- Sended emojis ");
     
     
    

       
        
       
        
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[7]");
//        System.out.println("TC11- Click on crossed icon");
//        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
//        { clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
//        System.out.println("TC12- Open first gift stiker");
//        Thread.sleep(1000);
//
//        clickAndWaitForElementWithId(
//                "com.threesixteen.app:id/tv_gems");
//        System.out.println("TC13- Open Dimaond log");
     
        }

       
    
       
    
	
	
    @Test(priority = 14)
    public void liveStreaRecommendedFeed14() throws InterruptedException {

    	OpenLivetStream();
    	Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC02- First Live session Opened");
//        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        Thread.sleep(2000);
        OpenRecommendedFeed();
    }
    
    
    
    
    
   
    @Test(priority = 15)
    public void livestreamGiftsticker15() throws InterruptedException {

    	
        Thread.sleep(2000);
        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
            System.out.println("TC02- pro Streams tab opened");
        }
        Thread.sleep(2000);

        if (isVisibleWithId("com.threesixteen.app:id/iv_post_support")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_support");
            System.out.println("TC03- Like session");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC04- open stream ");
        Thread.sleep(2000);
        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
        { clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
        System.out.println("TC05- Open first gift stiker");
        Thread.sleep(2000);

        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC06- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC07- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC08- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC09- scroll gift stickers");
        Thread.sleep(2000);

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC10- scroll gift stickers Again");
        Thread.sleep(2000);

        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
        { clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[1]");
        System.out.println("TC11- Open 2nd gift sticker");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC12- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC13- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC14- Exist from gift sticker");
        }
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[1]");
        System.out.println("TC15- Open 3rd gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC16- Open Dimaond log");
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("TC17- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC18- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC19- scroll gift stickers");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView[1]");
        System.out.println("TC20- Open 4th gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC21- Open Dimaond log");

        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC22- Exist from Dimaond log");
        Thread.sleep(2000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC23- Exist from gift sticker");
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
        System.out.println("TC24- scroll gift stickers");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ImageView[1]");
        System.out.println("TC25- Open 5th gift sticker");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_diamonds");
        System.out.println("TC26- Open Dimaond log");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC27- Exist from Dimaond log");

        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC28- Exist from gift sticker");
        
        }
        }
        
	
    @Test(priority = 16)
    
    
    public void HomepageTabsDataCheck16() throws InterruptedException 
    
  {	     
    	
    	Thread.sleep(3000);


      if (isVisibleWithXPath1("//*[contains(@text,'Pro Missed Stream')]"))
      {
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Missed Stream')]");
    	    System.out.println("TC01- Pro tab opened");
    	    Thread.sleep(5000); 
	  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
          System.out.println("TC02- Feed Present in Tab");
    	    Thread.sleep(5000); 
	      	driver.navigate().back();
    	    Thread.sleep(5000); 
	      	
	          clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
	      	    System.out.println("TC03- Following tab opened");
	      	    Thread.sleep(5000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TC04- Feed Present in Tab");
	      	    Thread.sleep(5000); 
		      	driver.navigate().back();
	      	    Thread.sleep(5000); 
	      	
		      	if (isVisibleWithXPath1("//*[contains(@text,'Videos')]")) {
		          clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
	      	    System.out.println("TC05- Videos tab opened");
	      	    Thread.sleep(5000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TC06- Feed Present in  Tab");
	      	    Thread.sleep(5000); 
		      	driver.navigate().back();
	      	    Thread.sleep(5000); 
		      	
		      	
   
      
          driver.findElement(AppiumBy.androidUIAutomator(
          "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
	    driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
		    driver.findElement(AppiumBy.androidUIAutomator(
		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
			    driver.findElement(AppiumBy.androidUIAutomator(
			            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
				    System.out.println("TC07- scroll Top Bar");
	    
				    
			          clickAndWaitForElementWithXpath1("//*[contains(@text,'Missed')]");
		      	    System.out.println("TC08- Missed tab opened");
		      	    Thread.sleep(5000); 
			  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		            System.out.println("TC09- Feed Present in Tab");
		      	    Thread.sleep(5000); 
			      	driver.navigate().back();
		      	    Thread.sleep(5000); 
			      	
		      	  driver.findElement(AppiumBy.androidUIAutomator(
				            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
			      	  driver.findElement(AppiumBy.androidUIAutomator(
					            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
				      	  driver.findElement(AppiumBy.androidUIAutomator(
						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
				      	 driver.findElement(AppiumBy.androidUIAutomator(
						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
				      	 driver.findElement(AppiumBy.androidUIAutomator(
						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
				      	 driver.findElement(AppiumBy.androidUIAutomator(
						            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
							    System.out.println("TC10- scroll Top Bar");
					      	    Thread.sleep(5000); 
				    
			      	
//			      	
//			      	 driver.findElement(AppiumBy.androidUIAutomator(
//					            "new UiScrollable(new UiSelector().text(\"Indoneisa\")).setAsHorizontalList().scrollForward()"));
//			      	    Thread.sleep(2000); 

						    clickAndWaitForElementWithXpath1("//*[contains(@text,'Indonesia')]");
				      	    System.out.println("TC11- indonesia tab opened");
				      	    Thread.sleep(5000); 
						    
						    if (isVisibleWithId("com.threesixteen.app:id/player_layout")) {
						    clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
				            System.out.println("TC12- Feed Present in Tab");
					      	Thread.sleep(5000);
					      	driver.navigate().back();
					      	Thread.sleep(5000);
						    }
						    else
						    {
						      	Thread.sleep(1000);
							    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_try_again");
					            System.out.println("TC13- click on watch other streanms ");

						    }
						    
						    
						     driver.findElement(AppiumBy.androidUIAutomator(
						             "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
						 	    driver.findElement(AppiumBy.androidUIAutomator(
						 	            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
						 		    driver.findElement(AppiumBy.androidUIAutomator(
						 		            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward()"));
						 			    driver.findElement(AppiumBy.androidUIAutomator(
						 			            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
						 				    System.out.println("TC07- scroll Top Bar");
						 				   driver.findElement(AppiumBy.androidUIAutomator(
										            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
									      	  driver.findElement(AppiumBy.androidUIAutomator(
											            "new UiScrollable(new UiSelector().text(\"Missed\")).setAsHorizontalList().scrollForward()"));
										      	  driver.findElement(AppiumBy.androidUIAutomator(
												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
										      	 driver.findElement(AppiumBy.androidUIAutomator(
												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
										      	 driver.findElement(AppiumBy.androidUIAutomator(
												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
										      	 driver.findElement(AppiumBy.androidUIAutomator(
												            "new UiScrollable(new UiSelector().text(\"Giveaways 💎\")).setAsHorizontalList().scrollForward()"));
													    System.out.println("TC10- scroll Top Bar");
											      	    Thread.sleep(5000); 
											      	    
											      	    
											      	    
											      	  clickAndWaitForElementWithXpath1("//*[contains(@text,'All Streams')]");
											      	    System.out.println("TC11- All streams tab opened");
											      	    Thread.sleep(5000); 
											      	    
											      	    
											      	  driver.findElement(
											                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
											      	    System.out.println("TC12- All streams scrolled");
											      	  clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
											            System.out.println("TC13- Feed Present in Tab");

						    Thread.sleep(10000);
		      	}
		      	else
		      	{
		            System.out.println("TC14- This is old homepage ");

		      	}
      }
      else
      {
          System.out.println("TC14- This is old homepage ");

      }
      
	    
//	    driver.findElement(AppiumBy.androidUIAutomator(
//              "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/iv_top_donors_support_lottie\")).setAsHorizontalList().scrollForward(3)"));
//      System.out.println("TC04- scroll left ");
//      Thread.sleep(2000); 

      }
    
    
    
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



