package Trial;

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

public class LikesCount_Script<MobileElement, Rotatable>  extends Functions {


	
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
//            Thread.sleep(2000);
//
//
//        } else
//        {
//            driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
//            System.out.println("TC01- Following tab opened");
//            Thread.sleep(2000);
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
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//         Thread.sleep(7000);
//         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//         Thread.sleep(1000);
//         System.out.println("F--> Open Recommended Feed 10 times");
//
//         
//    }
//    
//    
//    
//    
// 
//
//    
//    @SuppressWarnings("unchecked")
//    
//	public void TestShareCount() throws InterruptedException {
//    
//    MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
//    String initialShareCount = ((WebElement) element).getText();
//    System.out.println("TC03- Initial share count is " + initialShareCount);
//    Thread.sleep(2000);
//
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_whatsapp");
//    System.out.println("TC04- Clicked on share button");
//    Thread.sleep(5000);
//    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
//    System.out.println("TC05- Clicked on More button");
//    Thread.sleep(5000);
//    driver.navigate().back();
//    Thread.sleep(5000);
//
//    MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
//    String updatedShareCount = ((WebElement) element1).getText();
//    System.out.println("TC06- Updated share count is " + updatedShareCount);
//    Thread.sleep(2000);
//
//
//    int difference = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount);
//    Thread.sleep(2000);
//
//    if (difference == 1) 
//    {
//    	
//   
//         Thread.sleep(30000);
//        System.out.println("Difference between updated share count and initial share count is 1");
//    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
//    System.out.println("TC07- opened stream");
//    Thread.sleep(10000);
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//    System.out.println("TC08- Exist from Live chat");
//    Thread.sleep(1000);
//    
//   
//    
//    MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
//    String initialShareCount11 = ((WebElement) element2).getText();
//    System.out.println("TC09- Initial share count is " + initialShareCount11);
//    Thread.sleep(2000);
//    
//    int difference1 = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount11);
//    Thread.sleep(2000);
//    if (difference1 == 0) {
//    	
//
//    System.out.println("Difference between internal share count and external share count is 0");    
//    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
//    System.out.println("TC10- Clicked on share button");
//    Thread.sleep(5000);
//    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
//    System.out.println("TC11- Clicked on More button");
//    Thread.sleep(5000);
//    driver.navigate().back();
//    Thread.sleep(15000);
//
//    MobileElement element111 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
//    String updatedShareCount1 = ((WebElement) element111).getText();
//    System.out.println("TC12- Updated share count is " + updatedShareCount1);
//    Thread.sleep(2000);
//
//
//    // Check if the difference between updated share count and initial share count is 1
//    int difference11 = Integer.parseInt(updatedShareCount1) - Integer.parseInt(initialShareCount11);
//    Thread.sleep(2000);
//
//    if (difference11 == 1) {
//        System.out.println("Share Count is Working fine for Live stream");
//    } 
//    }
//    
//    else
//    {
//        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//        System.out.println("Share count count mismatched ");
//    }
//   }
//}    
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
//	private String initialLikeCount;
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
//    
//
//
//   
    
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 01)
    public void LikesCountOnReel01() throws InterruptedException, MalformedURLException {

        clickAndWaitForElementWithXpath1(
                "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC01- Central Reel Tab opened");
        Thread.sleep(1000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
       System.out.println("TC02- Opened the comment section.....");
       Thread.sleep(1000);
   
        MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String initialLikeCount = ((WebElement) element).getText();
        System.out.println("TC03- Initial Likes count is " + initialLikeCount);
       
    	   
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
        System.out.println("TC04- Reels Liked");
        Thread.sleep(10000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
       System.out.println("TC05- Opened the comment section.....");
       Thread.sleep(1000);

        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String updatedLikeCount = ((WebElement) element1).getText();
        System.out.println("TC06- Updated Like count is " + updatedLikeCount);
        Thread.sleep(1000);
        
        
     
     int initialLikeCountValue = Integer.parseInt(initialLikeCount.split(" ")[0]);
     int updatedLikeCountValue = Integer.parseInt(updatedLikeCount.split(" ")[0]);

     int difference = updatedLikeCountValue - initialLikeCountValue;

     if (difference == 1) {
         System.out.println("Difference between updated Like count and initial Like count is 1");
     } 
     else 
     {
    	 
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
         System.out.println("Difference between updated Like count and initial Like count is not 1");
     }

    }
    
    
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 02)
    public void LikesCountOnVideo02() throws InterruptedException, MalformedURLException {
    	
    	
    	
      	OpenVideo();
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC03- Open Comment section");
        Thread.sleep(2000);
    	 MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
         String initialLikeCount = ((WebElement) element).getText();
         System.out.println("TC05- Initial Likes count is " + initialLikeCount);
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/layout_img_like");
         System.out.println("TC06- click on  Like Video");
         Thread.sleep(10000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
        System.out.println("TC07- Open Likes List");
        Thread.sleep(1000);

        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
        String updatedLikeCount = ((WebElement) element1).getText();
        System.out.println("TC08- Updated Like count is " + updatedLikeCount);
        Thread.sleep(1000);
    	
    	
    	
        int initialLikeCountValue = Integer.parseInt(initialLikeCount.split(" ")[0]);
        int updatedLikeCountValue = Integer.parseInt(updatedLikeCount.split(" ")[0]);

        int difference = updatedLikeCountValue - initialLikeCountValue;

        if (difference == 1) {
        	
            System.out.println("TC09- Difference between updated Like count and initial Like count is 1");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

    		clickAndWaitForElementWithId("com.threesixteen.app:id/video_timer");
            Thread.sleep(10000);
            System.out.println("TC10- Video opened");

       	    MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_support"));
            String initialLikeCount1 = ((WebElement) element11).getText();
            System.out.println("TC11- Initial Likes count is " + initialLikeCount1);

            int initialLikeCountValue1 = Integer.parseInt(initialLikeCount1.split(" ")[0]);
            int updatedLikeCountValue1 = Integer.parseInt(updatedLikeCount.split(" ")[0]);

            int difference1 = updatedLikeCountValue1 - initialLikeCountValue1;

            if (difference1 == 0) {
                System.out.println("Likes Count on video is working fine , count is matching inside and outside of Video layout");	
            }
            else
            {
                clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
                System.out.println("Likes Count on video inside and outside not Matching");	

            }
        	
        
        	
        } else {
        	
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("Difference between updated Like count and initial Like count is not 1");
            
           
        }
    		}
    	
       
   
    
    
    
        
	
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



