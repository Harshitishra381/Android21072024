package Trial;

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

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Video_Script<MobileElement, Rotatable> extends Functions  {

	
//
//    public static void clickAndWaitForElementWithXpath1(final String xpath) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
//    public static void PIPSwitch() throws InterruptedException {
//        for (int i = 1; i <= 10; i++) {
//            if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
//                ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//                Thread.sleep(3000);
//            }
//            clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//            Thread.sleep(3000);
//        }
//        System.out.println("F--> PIP switch done 10 times");
//        Thread.sleep(1000);
//
//    }
//    
//    public static void  OpenVideo() throws InterruptedException {
//    
//    	 if (isVisibleWithXPath1("//*[contains(@text,'Videos')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
//             System.out.println("TC09- click on videos tab");
//             Thread.sleep(1000);
//           clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//             System.out.println("TC09- click on video");
//
//             Thread.sleep(1000);
//         }
//    	 else
//    		 
//    	 {
//
//    	
//    	String targetId = "com.threesixteen.app:id/video_timer"; 
//    	boolean idFound = false;
//    	int maxScrolls = 10; 
//
//    	for (int i = 0; i < maxScrolls && !idFound; i++) {
//    	    try {
//    	        driver.findElement(
//    	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"" + targetId + "\"))"));
//    	        idFound = true;
//    	        System.out.println("TC - Video found");
//    	    } catch (Exception e) {
//    	        driver.findElement(
//    	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
//    	        Thread.sleep(1000); 
//    	    }
//    	}
//    	if (idFound) {
//    	    System.out.println("Opened video");
//    	    driver.findElement(AppiumBy.id(targetId)).click(); 
//    	} else {
//    	    System.out.println("Element with resource ID: " + targetId + " not found after " + maxScrolls + " scrolls");
//    	}
//    	Thread.sleep(1000); 
//
//    
//    	 }
//   
//    }
//    
//    
//    
//    
//    
//    
//    public static void ExoQualityChange() throws InterruptedException {
//    	
//    	 Thread.sleep(10000);
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//    	 if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
//    	 {  clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
//             System.out.println("TC07- Clicked on video player setting");
//    	 }
//    	 else
//    	 {        
//     	 Thread.sleep(10000);
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//    	 clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
//         System.out.println("TC07- Clicked on video player setting");
//    	 }
//         Thread.sleep(1000);
//         clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
//         System.out.println("TC08- clicked on video quality");
//         Thread.sleep(1000);
//         if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
//             System.out.println("TC09- changed the video qulaity to 1080p");
//             Thread.sleep(1000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
//             System.out.println("TC10- changed the Video qulaity to 720p");
//             Thread.sleep(1000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
//             System.out.println("TC11- changed the Video qulaity to 480p");
//             Thread.sleep(1000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
//             System.out.println("TC12- changed the video qulaity to 240p");
//             Thread.sleep(1000);
//         }
//
//         if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
//             clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
//             System.out.println("TC13- changed the Video qulaity to 360p");
//             Thread.sleep(1000);
//         }
//
//     }
//
//    
//    
//    public static void OpenRecommendedFeed() throws InterruptedException {
//    	
//    	
//    
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         System.out.println("F--> Open Recommended Feed 10 times");
//
//         
//    }
//    
//    
// public static void OpenNotificationtab() {
//    	
//    	if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView"))
//        {
//        	clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView");
//        } else  {
//     	clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView");
//        }
//        System.out.println("TC01 - Notification tab opened");
//
//    }
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
//
//	    }
//
//	}
//
//
//
// public static void ExoRotate() throws InterruptedException {
//     for (int i = 1; i <= 2; i++) {
//     	
//         Thread.sleep(20000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
//         {
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//         }
//         else
//         {
//             Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//               clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//         }
//         Thread.sleep(20000);
//   	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithXpath1("//[@content-desc=\"Play\"]");
//   	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//         if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
//         {
//             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//         }
//         else
//         {
//             Thread.sleep(5000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//               clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//         }
//         System.out.println("TC" + String.format("%02d", i + 1) + "- Exo player screen Rotate");
//         Thread.sleep(5000);
//     }
// }
//    
//    
// public static void OpenSearch() throws InterruptedException {
// 	
// 	
// 	
//	 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
// 	{  
// 		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//     System.out.println("TC01- Open Search");
//     Thread.sleep(1000);
// 	}
// 	else
// 	{
// 		if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
// 	 {
// 			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//     System.out.println("TC01- Open Search");
//     Thread.sleep(1000);		
// 	 }
// 		else
// 		{
//             clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
//             System.out.println("TC01- Open Search0111");
//
//
// 		}
// 	}
//}
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
//    
    
//    static AppiumDriver driver;
//
//    private Capabilities cap;
//    private int index;
//
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
//    	 
//    	 
//		cap.setCapability("deviceName", "13793294180004Z");
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
////       cap.setCapability("deviceName", "6381e3e");
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
//        Thread.sleep(5000);
//
//       System.out.println("Application started");
//       
////      driver.navigate().back();
//		Thread.sleep(3000);
//       
////       if (isVisibleWithId("android:id/button2")) 
////       {
////           clickAndWaitForElementWithId("android:id/button2");
////           System.out.println("Click on close");
////       }
////
//////		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//////		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
//////			System.out.println("Gmail Login Done");
////
////	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android."))
////	        {
////	            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
////	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//////				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
////	            System.out.println("Spinwheel rotate");
////           }
////       if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) 
////       {
////           clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
////           System.out.println("Notification permission allowed");
////
////       }
//		 if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//	         
//	           driver.navigate().back();
//	            System.out.println("Exist from Update");
//	            Thread.sleep(1000);
//	       }
//
//
//   }
//    
//    
    
    


    @Test(priority = 1)
    public void videoplayerQualitychangeminiplayertofull01() throws InterruptedException, MalformedURLException {


            OpenVideo();
            Thread.sleep(10000);
            
            miniplayertofullplayerSwitch();
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC02- Mini player  send to Full screen");
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
            {	clickAndWaitForElementWithXpath1(
                    "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
            System.out.println("TC03A- Clicked on video player setting");
            }
            else
            {
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
            { clickAndWaitForElementWithXpath1(
                    "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
            System.out.println("TC03B- Clicked on video player setting");
            }
            else
            {
            	 Thread.sleep(10000);
                 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            	 clickAndWaitForElementWithXpath1(
                         "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                 System.out.println("TC03C- Clicked on video player setting");
            }
    }   
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Playback Speed')]");
            System.out.println("TC05- clicked on video playback speed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Normal')]");
            System.out.println("TC06- changed the video palyback speed to Normal");
            Thread.sleep(1000);
      
    }

   
    

	@Test(priority = 2)
	
    public void PIPtofullscreentest2() throws InterruptedException, MalformedURLException {

		
            OpenVideo();
            Thread.sleep(10000);
            PIPSwitch();
            clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
            System.out.println("TC40- Open suggested video");
            Thread.sleep(10000);
            PIPSwitch();

        }
      




//    @Test(priority = 3)
//    public void Screenrotation3() throws InterruptedException, MalformedURLException {
//
//        if (isVisibleWithXPath1("//android.widget.Button[contains(@text, 'Videos')]"))
//        {
//            driver.findElement(By.xpath("//android.widget.Button[contains(@text, 'Videos')]")).click();
//            System.out.println("TC01- Video tab opened");
//            Thread.sleep(1000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//            System.out.println("TC02- Video Opened from videos tab");
//            Thread.sleep(7000);
//
//        }
//        else
//        {
//            driver.findElement(AppiumBy.androidUIAutomator(
//                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            if (isVisibleWithId("com.threesixteen.app:id/video_timer")) {
//                clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//                System.out.println("TC02- Video Opened from homepage");
//                Thread.sleep(10000);
//            }
//
//        }
//
////        ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
////        System.out.println("TC02- Handset rotate to landscape");
////        Thread.sleep(7000);
////        ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
////        System.out.println("TC02- Handset rotate to Portrait");
////        Thread.sleep(7000);
//
//    }



    @Test(priority = 4)
    public void VideomuteunmuteafterPIP4() throws InterruptedException, MalformedURLException {


         OpenVideo();
         Thread.sleep(5000);
         PIPSwitch();
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
         System.out.println("TC08- Mini player paused & send to Full screen");
         Thread.sleep(10000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC11- UnMute the video");
        } 
         else 
        {
//            driver.navigate().back();
//            Thread.sleep(2000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//            System.out.println("TC12- Mini player paused & send to Full screen");
//            Thread.sleep(7000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC13- UnMute the video");
            Thread.sleep(1000); 
            }
            else
            {
                Thread.sleep(7000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC14- UnMute the video");
                Thread.sleep(1000); 

            }
        }

    }
   
    
    
    

    @Test(priority = 5)
    
    public void VideoQualitychangeafterPIP5() throws InterruptedException, MalformedURLException {

            OpenVideo();
            Thread.sleep(10000);
            PIPSwitch();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC06- Mini player paused & send to Full screen");
            Thread.sleep(2000);
            ExoQualityChange();
            Thread.sleep(1000);

        }
       

    private boolean isVisibleWithXpath1(String s) {

        return false;
    }



  



    @Test(priority = 6)

    public void VideoPlayerForwardBackward6() throws InterruptedException {

            OpenVideo();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/exo_rew"))
            {
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_rew");
                System.out.println("TC04- Video forwarded & revverse 5 sec");
                driver.navigate().back();
            }
            else
            {
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_rew");
                System.out.println("TC05- Video forwarded & revverse 5 sec");
                driver.navigate().back();
            }

            }
           

      
        



    @Test(priority = 7)
    

    public void VideoPlayerComment7() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
            System.out.println("TC01- Comment section  opened");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC02- Clicked comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Nice played");
            System.out.println("TC03- Typed Nice played comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC04- Send the  comment");
            Thread.sleep(3000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
            System.out.println("TC05- open likes list");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC06- closed bottom sheet");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
    }
    


    @Test(priority = 8)
    
    public void VideoWatcchAndWinCoinsDetailsandRecommededVideo8() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
            System.out.println("TC03- open watch & Win");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC04- Refresh watch & Win");
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
            System.out.println("TC05- open coins page");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC06- Back from coins log");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC08- Bottom sheet closed");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]");
            System.out.println("TC09- click on share  button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
            System.out.println("TC10- Download the video");
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            }
           OpenRecommendedFeed();
           Thread.sleep(1000);

        }
       


    @Test(priority = 9)

    public void VideoMiniPlayerTabSwittch9() throws InterruptedException {

         OpenVideo();
         Thread.sleep(10000);
         driver.navigate().back();
         System.out.println("TC03- switch to mmini player");
         Thread.sleep(1000);
         TabSwitch();
        

    }

    
    
    
    
    @Test(priority = 10)

    public void SearcchVideoplayerComment10() throws InterruptedException {

        OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(2000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC02- Type bgmi in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_live_comments");
        System.out.println("TC61- Comment section  opened");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        System.out.println("TC62- Clicked comment section");
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment");
        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
        System.out.println("TC63- Typed Hi comment section");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
        System.out.println("TC64- Send the  comment");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }



    @Test(priority = 11)

    public void searchvideoplayerLikeWatchNWin11() throws InterruptedException {

        OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC02- Type bgmi in search");
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
        System.out.println("TC03- Open watch & Win");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC04- Refresh watch & Win");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
        System.out.println("TC05- Refresh watch & Win");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC06- Open coins page");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

    }

   


    @Test(priority = 12)
    
    public void IRLSearchVideoTest12() throws InterruptedException, MalformedURLException {

        OpenSearch();

        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
            Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("irl");
        System.out.println("TC02- Type irl in search");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC03- First Video Opened");
        Thread.sleep(1000);
    }

    
    
    
    @Test(priority = 13)
    
    public void MinecraftSearchVideoTest13() throws InterruptedException, MalformedURLException {
       
        OpenSearch();

        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("minecraft");
        System.out.println("TC03- Type Minercraft in search");
        Thread.sleep(3000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Videos tab");
        Thread.sleep(3000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay"); 
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TC07- First Video muted");
        }
        else
        {
            Thread.sleep(10000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
              System.out.println("TC09- UnMute the video");
              Thread.sleep(1000);
        }
        
    }


    @Test(priority = 14)
    
    public void Videoplayerrotate14() throws InterruptedException {

        OpenVideo();
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC04- Rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC05- Rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC07- Rotate to portrait");
//        ExoRotate();
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_watch_and_win");
        System.out.println("TC08- watch & win clicked video");
        driver.navigate().back();

    }

    

    @Test(priority = 15)
    

    public void videoqualitychnage15() throws InterruptedException {

            OpenVideo();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to Full screen");
            Thread.sleep(5000);
            ExoQualityChange();
            Thread.sleep(5000);

    }
    

    @Test(priority = 16)

    public void Videoplayermuteunute16() throws InterruptedException {

            OpenVideo();
            Thread.sleep(10000);
            driver.navigate().back();
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to Full screen");
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC04- Mute the video");
            Thread.sleep(1000);

            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC06- UnMute the video");
                Thread.sleep(1000);
            } else {
                driver.navigate().back();
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC06- Mini player paused & send to Full screen");
                Thread.sleep(2000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
                System.out.println("TC07- UnMute the video");
                Thread.sleep(1000);
            }

    }



    @Test(priority = 17)

    public void Videoplayerplaybackspeed17() throws InterruptedException {

                OpenVideo();
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                System.out.println("TC02- Switch to mini player");
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC03- Mini player paused & send to Full screen");
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                {	clickAndWaitForElementWithXpath1(
                        "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                      System.out.println("TC04A- Clicked on video player setting");
                }
                else
                {
                Thread.sleep(10000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                {  clickAndWaitForElementWithXpath1(
                        "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                System.out.println("TC04B- Clicked on video player setting");
                }
                else
                {
                    Thread.sleep(20000);
                    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                    if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
                    {
                    clickAndWaitForElementWithXpath1(
                            "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                    System.out.println("TC04C- Clicked on video player setting");
                    }      
                    else
                    {
                    	 Thread.sleep(20000);
                         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
                         clickAndWaitForElementWithXpath1(
                                 "//android.widget.FrameLayout[@content-desc=\"Show player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
                         System.out.println("TC04C- Clicked on video player setting");
                    }
                }
              }
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Playback Speed')]");
                System.out.println("TC05- clicked on video 	Playback speed");
                Thread.sleep(1000);
                clickAndWaitForElementWithXpath1("//*[contains(@text,'2x')]");
                System.out.println("TC06- changed the video qulaity to 2x");
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
                System.out.println("TC07- Mini player paused & send to Full screen");
                Thread.sleep(1000);
                System.out.println("TC08- Mini player paused & send to Full screen");
                Thread.sleep(1000);
                clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
                System.out.println("TC09- Open suggested video");
                Thread.sleep(8000);
                driver.navigate().back();
                Thread.sleep(1000);
            }
        
    



    @Test(priority = 18)
    

    public void VideoPlayerTimerMuteButton18() throws InterruptedException {

         OpenVideo();
         Thread.sleep(1500);
         driver.navigate().back();
         Thread.sleep(1500);
         if (isVisibleWithId("com.threesixteen.app:id/iv_more")) {
             Thread.sleep(1500);
        	 clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
             System.out.println("TC05- Open creators profile");
             Thread.sleep(1500);
             driver.navigate().back();
             Thread.sleep(1500);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
             System.out.println("TC09- Click on more button");
             Thread.sleep(1500);
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Follow')]");
             System.out.println("TC10- Click on Follow button");
             Thread.sleep(2000);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
             System.out.println("TC11- Click on more button");
             Thread.sleep(1500);
             clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
             System.out.println("TC12- Click on ABout button");
             Thread.sleep(1500);
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
             System.out.println("TC13- Click on Done button");
             Thread.sleep(1500);
             clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
             System.out.println("TC11- Click on more button");
             Thread.sleep(1500);
         
             clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
             System.out.println("TC13-  unFollow creator");
             Thread.sleep(1500);
           
             }
        clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
        System.out.println("TC03- Video timer available");
        Thread.sleep(1500);
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume_switch")) {
            System.out.println("TC04- Video mute/unmute button available");
            Thread.sleep(1500);
        }

        if (isVisibleWithId("com.threesixteen.app:id/tv_num_support")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
        System.out.println("TC06- Like count is coming from backend");
        Thread.sleep(1500);
//        driver.navigate().back();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC07- Comment count is coming from backend");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
        System.out.println("TC08- Share count is coming from backend");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        }
       
    
    }



    @Test(priority = 19)
    
    public void MinecraftSearchVideolikecommentandsharecount19() throws InterruptedException, MalformedURLException {

        OpenSearch();

        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(5000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Minecraf");
        System.out.println("TC02- Type Minercraf in search");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
        System.out.println("TC02- clicked on Minecraft in search");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC03- Click on Videos tab");
        Thread.sleep(5000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_author");
        System.out.println("TC05- Open creators profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_num_support")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
        System.out.println("TC06- Like count is coming from backend");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC07- Comment count is ccoming from backend");
        Thread.sleep(2000);
        driver.navigate().back();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
        System.out.println("TC08- Share count is coming from backend");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
        System.out.println("TC09- Click on more button");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'About')]");
        System.out.println("TC12- Click on About button");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Done')]");
        System.out.println("TC13- Click on Done button");
        Thread.sleep(2000);

    }

    

    @Test(priority = 191)
    
    
    public void Videotagsandtimer191() throws InterruptedException, MalformedURLException {

         OpenVideo();
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
        System.out.println("TC13- time watching data is coming from backkend for Video");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
        System.out.println("TC14- Game Name is coming from backend for Video");
        Thread.sleep(1000);

    }

   
    
    @Test(priority = 20)  
    
    public void VideomuteUnmuteAfterScreenRtoatatE20() throws InterruptedException, MalformedURLException {

    	OpenVideo();         
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
       clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[6]"))
        {
        clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[6]");
        System.out.println("TC04- Video player screen Rotate to landscape");
        Thread.sleep(5000);
        }
        else
        {
            Thread.sleep(10000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC05- Video player screen Rotate to landscape");
            Thread.sleep(5000);

        }
        Thread.sleep(5000);
        if (isVisibleWithId("com.threesixteen.app:id/miniPlayerPlayPause")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player paused & send to portrait");
        Thread.sleep(5000);
        }
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Video player screen Rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC07- mute/UnMute the video");
            Thread.sleep(5000);
        } 
        else 
        {
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC08- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC09- mute/UnMute the video");
            Thread.sleep(5000);

        }
         Thread.sleep(5000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC10- Mute/unmute the video");
            Thread.sleep(5000);
        } 
        else 
        {
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC12- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC11- mute/UnMute the video");
            Thread.sleep(5000);
            }
            else
            {
            	
            }
            driver.navigate().back();
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC12- Mini player paused & send to portrait");
            Thread.sleep(5000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
            System.out.println("TC13- mute/UnMute the video");
            Thread.sleep(5000);
        }
            }

        
    
    @Test(priority = 21)
    
	public void SearchVideoPIP21() throws InterruptedException, MalformedURLException {
	

	
		
        OpenSearch();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
        System.out.println("TC03- Type BGMS in search");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC04- Click on BGMS in search suggestion");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
        System.out.println("TC05- Click on Video tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC06- First Video Opened");
        Thread.sleep(40000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
        System.out.println("TC07- Switched to PIP");
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC08- Switched PIP to full screen");
        Thread.sleep(000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC09- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC10- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC11- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC12- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC13- Switched to PIP");
            Thread.sleep(2000);
        }
        clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
        System.out.println("TC14- Switched PIP to full screen");
        Thread.sleep(2000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching"))
        {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
            System.out.println("TC15- Switched to PIP");
            Thread.sleep(2000);
        }
        
	}
    
    
	
    @Test(priority = 22)
    
	public void SearchVideoRotate22() throws InterruptedException, MalformedURLException {	
		
//		clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//        System.out.println("TC02- Click on search box");
//        Thread.sleep(1000);
//        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMS");
//        System.out.println("TC03- Type BGMS in search");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
//        System.out.println("TC04- Click on BGMS in search suggestion");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[contains(@text,'Videos')]")).click();
//        System.out.println("TC05- Click on Video tab");
//        Thread.sleep(1000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC06- First Video Opened");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        if (isVisibleWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]"))
//        {
//        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//        System.out.println("TC07- exo paused");
//        }
//        else
//        {
//        	 Thread.sleep(10000);
//             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");	
//             clickAndWaitForElementWithId("com.threesixteen.app:id/exo_play_pause");
//             System.out.println("TC07- exo paused");
//
//        }
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC08- Rotate to landscape");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC09- Rotate to portrait");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC10- Rotate to landscape");
//        Thread.sleep(10000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
//        System.out.println("TC11- Rotate to portrait");
//		ExoRotate();
	}
   
    
    
    
    @Test(priority = 23)
    
    public void VideoqualityChangeAfterRotation23() throws InterruptedException, MalformedURLException  {

            OpenVideo();
            Thread.sleep(10000);
            driver.navigate().back();
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            Thread.sleep(15000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC04- Video player screen Rotate to landscape");
            Thread.sleep(15000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
            System.out.println("TC05- Video player screen Rotate to portrait");
            Thread.sleep(15000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//            System.out.println("TC03- Mini player paused & send to portrait");
//            Thread.sleep(10000);
            ExoQualityChange();  
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
            System.out.println("TC03- Mini player paused & send to portrait");
            Thread.sleep(10000);
    }


	
   
    
//@Test(priority = 24)
//    
//    public void ScreenAutoRotation24() throws InterruptedException, MalformedURLException  {
//
//                OpenVideo();
//                Thread.sleep(10000);
//	
//           
////            ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
////             System.out.println("TC02- Handset rotate to landscape");
////            Thread.sleep(30000);
////            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
////            System.out.println("TC02- Handset rotate to Portrait");
////            Thread.sleep(30000);
//            
//          
//            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
//            System.out.println("TC02- Handset rotate to Portrait");
//            Thread.sleep(30000);
//
//            // Rotate to reverse portrait (180 degrees)
//            ((SupportsRotation) driver).rotate(ScreenOrientation.PORTRAIT);
//            System.out.println("TC02- Handset rotate to Reverse Portrait");
//            Thread.sleep(30000);
//
//            // Rotate to landscape (270 degrees)
//            ((SupportsRotation) driver).rotate(ScreenOrientation.LANDSCAPE);
//            System.out.println("TC02- Handset rotate to Landscape (effectively 90 degrees)");
//            Thread.sleep(30000);
            
            
//}
	
	





	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



