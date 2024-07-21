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

public class Reel_Script<MobileElement, Rotatable> extends Functions {


	
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
//   
//    }
//    
//    
//    public void OpenSideNav() { 
//        
//
//    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
//    	{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//    	        System.out.println("TC01- open side nav from old homapage");
//    	}
//    	else
//    	{
//    	    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
//    	    System.out.println("TC02- open side nav from New homapage");
//    	}
//        }
//    
//
//    
//    public static void TabSwitch() throws InterruptedException {
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
//    public static void ReelTest() throws InterruptedException {
//    	
//    	
//    	 if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
//	            System.out.println("TC01- Reels Liked");
//    	 }
//         Thread.sleep(2000);
//         if(isVisibleWithXPath1("//*[contains(@text,'Follow')]"))
//         {
//   	     System.out.println("TC02- Follow buton present");
//         Thread.sleep(2000);
//    	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//  	     System.out.println("TC03- Volume buton present");
//         Thread.sleep(2000);
//         }
//         else
//         {  	  
//        	 System.out.println("TC04- You already followed this creator ");
//        	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//       	    System.out.println("TC05- Volume buton present");
//            Thread.sleep(2000);
//         }
//  	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
//	    System.out.println("TC06- Reel keyword present");
//        Thread.sleep(2000);
//  	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_reels2");
//	    System.out.println("TC07- Reel icon present");
//        Thread.sleep(2000);
//	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
//	    System.out.println("TC08- Reel views present");
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
//	    System.out.println("TC09- Clicked on Three dots");
//        Thread.sleep(2000);
//	    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
//	         Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
//        System.out.println("TC10- Clicked on report");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithXpath1(
//                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
//        System.out.println("TC11- select tag inappropriate");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
//        System.out.println("TC12- Reel Reported");
//        Thread.sleep(2000);
//        if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
//        {
//            Thread.sleep(2000);
//        	driver.navigate().back();
//            Thread.sleep(2000);
//            System.out.println("TC13- This reel is already Reported");
//        }
//    }
//        Thread.sleep(2000);
//     clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
////   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
//    System.out.println("TC14- Opened the comment section.....");
//    Thread.sleep(2000);
//    if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
//        System.out.println("TC15- clicked comment section.....");
//        Thread.sleep(2000);
//        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
//        System.out.println("TC16- Typed wow comment section");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
//        System.out.println("TC17- Comment on Reel Done");
//        Thread.sleep(2000);
//        (driver).findElement(By.xpath(
//                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
//                .click();
//        System.out.println("TC18- Opened the list of likes in reel");
//        Thread.sleep(2000);
//        (driver).findElement(By.xpath(
//                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
//                .click();
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
//        System.out.println("TC19- Opened user from list of likes in reel");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//        System.out.println("TC20- Back from creators profile");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//        System.out.println("TC21- Existed from creators profile Card");
//        Thread.sleep(2000);
//        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
//        System.out.println("TC22- Existed from comment section"); 
//        Thread.sleep(2000);
//    } else {
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
////      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
//        System.out.println("TC22- Opened the comment section.....");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
//        System.out.println("TC23- clicked comment section.....");
//        Thread.sleep(2000);
//        (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
//        System.out.println("TC24- Typed wow comment section");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
//        System.out.println("TC25- Comment on Reel Done");
//        Thread.sleep(2000);
//        (driver).findElement(By.xpath(
//                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
//                .click();
//        Thread.sleep(2000);
//        System.out.println("TC26- Opened the list of likes in reel");
//        Thread.sleep(2000);
//        (driver).findElement(By.xpath(
//                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
//        .click();
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
//        System.out.println("TC27- Opened user from list of likes in reel");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//        System.out.println("TC28- Back from creators profile");
//        Thread.sleep(2000);
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//        System.out.println("TC29- Existed from creators profile Card");
//        Thread.sleep(2000);
//        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
//            System.out.println("TC30- Existed from comment section"); 
//            Thread.sleep(2000);
//    }
//    }
//    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//    System.out.println("TC31- Creators Profile opened");
//    Thread.sleep(2000);
//    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
//    System.out.println("TC32- Creators Profile opened in full view");
//    Thread.sleep(2000);
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
//    System.out.println("TC33- Back from creators profile");
//    Thread.sleep(2000);
//    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
//    System.out.println("TC34- Existed from creators profile Card"); }
//    Thread.sleep(2000);
//    if (isVisibleWithId("com.threesixteen.app:id/iv_share"))
//    {
//   
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
//    System.out.println("TC35- Clicked on share icon on reel");
//    }
//    else
//    {
//    	driver.navigate().back();
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
//    	    System.out.println("TC35- Clicked on share icon on reel");
//    	
//    }
//    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
//    System.out.println("TC36- share link is copied");
//    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
//    System.out.println("TC37- clicked on share icon on reel");
//    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
//    System.out.println("TC38- Clicked on Download button button on reel");
//    Thread.sleep(1000);
//    if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage"))
//    {
//    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
//    	    System.out.println("TC39- creator profile image present");
//    }
//    else
//    {
//    
//    	driver.navigate().back();
//    	if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage")) {
//    
//    	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
//    	    System.out.println("TC40- creator profile image present");
//    	}
//    }
//    }
//   
//}
//    
//    
//  public static void OpenSearch() throws InterruptedException {
//    	
//    	
//    	
//		if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	{  
//    		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);
//    	}
//    	else
//    	{
//    		if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
//    	 {
//    			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        System.out.println("TC01- Open Search");
//        Thread.sleep(1000);		
//    	 }
//    		else
//    		{
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
//                System.out.println("TC01- Open Search0111");
//
//
//    		}
//    	}
//   
//}
//    
//    
//public static void OpenLivetStream () throws InterruptedException {
//    	
//    Thread.sleep(2000);
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
//        	if (isVisibleWithXPath1("//*[contains(@text,'Pro Streams')]")) {
//        	
//            driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
//            System.out.println("TC01- Pro tab opened");
//            Thread.sleep(2000);
//        	}
//        	else
//        	{
//        		 driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
//                 System.out.println("TC01- Following tab opened");
//                 Thread.sleep(2000);
//             	}
//        	}
//
//        
//
//        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//        System.out.println("TC02- First Live session Opened");
//        Thread.sleep(10000);
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
//    	 
//	     cap1.setCapability("deviceName", "13793294180004Z");
////         cap.setCapability("deviceName", "6381e3e");
//         cap1.setCapability("platformName", "Android");
//         cap1.setCapability("platformVersion", "14");
////	     cap.setCapability("platformVersion", "12");
//         cap1.setCapability("appPackage", "com.threesixteen.app");
////       cap.setCapability("appPackage", "com.threesixteen.app.dev");
//	     cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
//	     cap1.setCapability("autoGrantPermissions", true);
//	     cap1.setCapability("ignoreHiddenApiPolicyError", true);
//	     cap1.setCapability("noReset", true);
//
//       
//       URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url1, cap1);
//
//       System.out.println("Application started");
//       Thread.sleep(3000);
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
  
   

    @Test(priority = 1)
    public void CentralReelTest1() throws InterruptedException {
    	
        clickAndWaitForElementWithXpath1(
                "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC01- Central Reel Tab opened");
        Thread.sleep(1000);
//        driver.findElement(
//                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//        System.out.println("TC01- Reel Scolled");
//        Thread.sleep(3000);
         ReelTest();
    }
     
            

    @Test(priority = 2)
    public void SearchReelTest2() throws InterruptedException, MalformedURLException {

        
       OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bgmi");
        System.out.println("TC03- Type bgmi in search");
//        driver.findElement(By.xpath("//*[contains(@text,'bgmi')]")).click();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView");
        System.out.println("TC04- clicked on  bgmi in search");
        driver.findElement(By.xpath("//*[contains(@text,'Reels')]")).click();
        System.out.println("TC05- open reels tab from search");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]");
        System.out.println("TC06- Open first reel from search");
        ReelTest();
    }
        
       

    @Test(priority = 3)
    public void SelfProfieReelTest3() throws InterruptedException {
    	

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"80\"]");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC04- Open First reel");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
        System.out.println("TC07- Opened the comment section.....");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC08- clicked comment section.....");
            Thread.sleep(1000);
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
            System.out.println("TC09- Typed wow comment section");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC10- Comment on Reel Done");
            Thread.sleep(1000);
            (driver).findElement(By.xpath(
                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                    .click();
            System.out.println("TC11- Opened the list of likes in reel");
            Thread.sleep(2000);
            (driver).findElement(By.xpath(
                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
                    .click();
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC12- Opened user from list of likes in reel");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC13- Back from creators profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC14- Existed from creators profile Card");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
            System.out.println("TC15- Existed from comment section"); }
            Thread.sleep(1000);
        } else {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
            System.out.println("TC07- Opened the comment section.....");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
            System.out.println("TC08- clicked comment section.....");
            Thread.sleep(1000);
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
            System.out.println("TC09- Typed wow comment section");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC10- Comment on Reel Done");
            Thread.sleep(1000);
            (driver).findElement(By.xpath(
                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
                    .click();
            System.out.println("TC11- Opened the list of likes in reel");
            Thread.sleep(2000);
//            (driver).findElement(By.xpath(
//                            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
//                    .click();
//            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/btn_open_profile"))
            {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC12- Opened user from list of likes in reel");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC13- Back from creators profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC14- Existed from creators profile Card");
            Thread.sleep(1000);
            if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
                (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
                System.out.println("TC15- Existed from comment section"); }
                Thread.sleep(1000);
        }
      
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC15- Existed from comment section"); }
        Thread.sleep(1000);
        
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC16- Creators Profile opened");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
        System.out.println("TC17- Creators Profile opened in full view");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC18- Back from creators profile");
        Thread.sleep(1000);
//        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
//            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
//            System.out.println("TC19- Existed from comment section"); }
//            Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_close")) 
        {
        	driver.navigate().back();
            System.out.println("CLICK BACK ");

         } 
    
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
        System.out.println("TC20- Clicked on share icon on reel");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
        System.out.println("TC21- share link is copied");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
        System.out.println("TC22- clicked on share icon on reel");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
        System.out.println("TC23- Clicked on Download button button on reel");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        
    }

    
    
    

 
    @Test(priority = 4)
    public void CentralReelMuteUnmute4() throws InterruptedException, MalformedURLException {

        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC01- Central Reel Tab opened");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TC03- Reel mute & UnMute");
        Thread.sleep(2000);

        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC04- Reels Liked");
            Thread.sleep(1000);
        }

    }

   
    
    @Test(priority = 5)
    public void HorizontalReelTabTest5() throws InterruptedException, MalformedURLException {

    	
    	
    	
    	

    		
    		String targetText = "Reels";
         boolean textFound = false;
         int maxScrolls = 5; 

         for (int i = 0; i < maxScrolls && !textFound; i++) {
             try {
                 driver.findElement(
                		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
                 textFound = true;
                 System.out.println("TC02- Product description scrolled and found");
             } catch (Exception e) {
                 driver.findElement(
                     AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                 Thread.sleep(1000); 
             }
         }
         driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
         System.out.println("Clicking on: " + targetText);
         Thread.sleep(2000); 
         
         if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")) {
//         driver.findElement(By.xpath("//*[contains(@text,'View All')]")).click();
         System.out.println("TC05- Click on view al button to open horizontal reels tab");
         driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
         System.out.println("TC05- Reel opened");

         Thread.sleep(3000);
         }
         else
         {
        	 String targetText1 = "Watch More Reels";
             boolean textFound1 = false;
             int maxScrolls1 = 5; 

             for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
                 try {
                     driver.findElement(
                    		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
                     textFound1 = true;
                     System.out.println("TC02- Product description scrolled and found");
                 } catch (Exception e) {
                     driver.findElement(
                         AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                     Thread.sleep(1000); 
                 }
             }
             driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
             System.out.println("Clicking on: " + targetText1);
             Thread.sleep(2000); 
         }
         
            ReelTest();
    }
  
    
 
   
    @Test(priority = 6)
    public void OthersProfileReellTest6() throws InterruptedException, MalformedURLException {

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
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"27\"]");
        System.out.println("TC07- open reels tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView");
        System.out.println("TC08- Open First reel");
        Thread.sleep(1000);
        ReelTest();
        
    }
    
   

    @Test(priority = 7)

    public void ReelsTestAfterTabsSwitch7() throws InterruptedException {

        TabSwitch();
        clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        ReelTest();
        
    }
    
    

    @Test(priority = 8)

    public void CentralReelsScroll50TimesAndTest8() throws InterruptedException {
    	
        clickAndWaitForElementWithXpath1(
                "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC01- Central reels tab opened");
        Thread.sleep(1000);
  	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	    System.out.println("TC02- Volume buton present");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC03- Central reels tabs scrolled 1");
        driver.findElement(
               AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
       System.out.println("TC04- Central reels tabs scrolled 2");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	    System.out.println("TC04a- Volume buton present");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC05- Central reels tabs scrolled 3");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC06- Central reels tabs scrolled 4");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
        System.out.println("TC07- Reels Liked");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC08- Central reels tabs scrolled done 50 times");
        if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC09- Reels Liked");
				 }
				  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
				    System.out.println("TC10- Volume buton present");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
			    System.out.println("TC11- Reel views present");
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
			    System.out.println("TC12- Clicked on Three dots");
			    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
			    driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
			    System.out.println("TC13- Clicked on report");
			    clickAndWaitForElementWithXpath1(
			            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
			    System.out.println("TC14- select tag inappropriate");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
			    System.out.println("TC15- Reel Reported");
			    if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
			    {
			    	driver.navigate().back();
			        System.out.println("TC16- This reel is already Reported");
			    }
			}
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
			//clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
			System.out.println("TC17- Opened the comment section.....");
			Thread.sleep(1000);
			if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
			    System.out.println("TC18- clicked comment section.....");
			    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
			    System.out.println("TC19- Typed wow comment section");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
			    System.out.println("TC20- Comment on Reel Done");
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
			            .click();
			    System.out.println("TC21- Opened the list of likes in reel");
			    Thread.sleep(1000);
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
			            .click();
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			    System.out.println("TC22- Opened user from list of likes in reel");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			    System.out.println("TC23- Back from creators profile");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			    System.out.println("TC24- Existed from creators profile Card");
			    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC25- Existed from comment section"); }
		            Thread.sleep(1000);
			} else {
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
			//  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
			    System.out.println("TC26- Opened the comment section.....");
			    Thread.sleep(1000);
			    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
			    System.out.println("TC27- clicked comment section.....");
			    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
			    System.out.println("TC28- Typed wow comment section");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
			    System.out.println("TC29- Comment on Reel Done");
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
			            .click();
			    System.out.println("TC30- Opened the list of likes in reel");
			    Thread.sleep(1000);
			    (driver).findElement(By.xpath(
			                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
			            .click();
			    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			    System.out.println("TC31- Opened user from list of likes in reel");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			    System.out.println("TC32- Back from creators profile");
			    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
			    System.out.println("TC33- Existed from creators profile Card");
			    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC34- Existed from comment section"); }
		            Thread.sleep(1000);
			}
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC35- Creators Profile opened");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
			System.out.println("TC36- Creators Profile opened in full view");
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
			System.out.println("TC37- Back from creators profile");
			 if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
		            (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
		            System.out.println("TC38- Existed from section"); }
		            Thread.sleep(1000);
			if (isVisibleWithId("com.threesixteen.app:id/iv_close"))
			{
				driver.navigate().back();
			}
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
			System.out.println("TC39- Clicked on share icon on reel");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
			System.out.println("TC40- share link is copied");
			clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
			System.out.println("TC41- clicked on share icon on reel");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
			System.out.println("TC42- Clicked on Download button button on reel");
			if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage"))
			{
				 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
				    System.out.println("TC43- creator profile image present");
			}
			else
			{
				 driver.navigate().back();
				    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
				    System.out.println("TC44- creator profile image present");
			}    }

  

    @Test(priority = 10)
    public void OthersPofileReelScroll10() throws InterruptedException {

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
        driver.findElement(By.xpath("//*[contains(@text,'Creators')]")).click();
        System.out.println("TC05- Click on creator tab");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
        System.out.println("TC06- open profile");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"27\"]");
        System.out.println("TC07- open reels tab");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[2]/android.widget.ImageView");
        System.out.println("TC08- Open First reel");

        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        System.out.println("TC09- Reels scrolled");
        	

    }
   
    
    @Test(priority = 11)
    
    public void ReelTestonSeachAllTab11() throws InterruptedException {

        OpenSearch();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
        System.out.println("TC03- Type BGMI in search");
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
        Thread.sleep(1000);
        driver.findElement(By.id("com.threesixteen.app:id/tv_view_all_reel")).click();        
        System.out.println("TC04- Click on view All");

    }
    
    
    
 @Test(priority = 12)
    

 public void ReelTestAfterVideoMiniPlayer12() throws InterruptedException {

        OpenVideo();    
        Thread.sleep(7000);
        driver.navigate().back();
        System.out.println("TC02- switch to mini player");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC01- Central Reel Tab opened");
        Thread.sleep(1000);
        ReelTest();

    }
	
    
 @Test(priority = 13)
 
 public void ReelTestAfterLiveStreamMiniPlayer13() throws InterruptedException {

     Thread.sleep(5000);
     OpenLivetStream();    
     Thread.sleep(10000);
     driver.navigate().back();
     System.out.println("TC02- switch to mini player");
     clickAndWaitForElementWithXpath1(
             "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
     System.out.println("TC01- Central Reel Tab opened");
     Thread.sleep(1000);
     ReelTest();

 }
 
 
 
@Test(priority = 14)
 
 public void HorizontalReelTestAfterMiniPlayer14() throws InterruptedException {

     OpenLivetStream();    
     Thread.sleep(10000);
     driver.navigate().back();
     System.out.println("TC02- switch to mini player");
//     clickAndWaitForElementWithXpath1(
//	            "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout[1]");
//     Thread.sleep(2000);
     clickAndWaitForElementWithXpath1("//*[contains(@text,'For You')]");
     System.out.println("TC03- For you tab opened");

     String targetText = "Reels";
     boolean textFound = false;
     int maxScrolls = 5; 

     for (int i = 0; i < maxScrolls && !textFound; i++) {
         try {
             driver.findElement(
            		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText + "\"))"));         
             textFound = true;
             System.out.println("TC02- Product description scrolled and found");
         } catch (Exception e) {
             driver.findElement(
                 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
             Thread.sleep(1000); 
         }
     }
     driver.findElement(By.xpath("//*[contains(@text,'" + targetText + "')]")).click();
     System.out.println("Clicking on: " + targetText);
     Thread.sleep(2000); 
     
     if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")) {
//     driver.findElement(By.xpath("//*[contains(@text,'View All')]")).click();
//     System.out.println("TC05- Click on view al button to open horizontal reels tab");
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
     System.out.println("TC05- Reel opened");

     Thread.sleep(3000);
     }
     else
     {
    	 String targetText1 = "Watch More Reels";
         boolean textFound1 = false;
         int maxScrolls1 = 5; 

         for (int i = 0; i < maxScrolls1 && !textFound1; i++) {
             try {
                 driver.findElement(
                		 AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + targetText1 + "\"))"));         
                 textFound1 = true;
                 System.out.println("TC02- Product description scrolled and found");
             } catch (Exception e) {
                 driver.findElement(
                     AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
                 Thread.sleep(1000); 
             }
         }
         driver.findElement(By.xpath("//*[contains(@text,'" + targetText1 + "')]")).click();
         System.out.println("Clicking on: " + targetText1);
         Thread.sleep(2000); 
     }
     
     
     ReelTest();

 }
//    @Test(priority = 30)
//   public void TaskPageReelTest30() throws InterruptedException 
//  {
//
//   
//       Thread.sleep(2000);
//       clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
//       System.out.println("TC01- Task page opened");
//       Thread.sleep(2000);
//       driver.findElement(
//               AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//       System.out.println("TC01- Task page scrolled");
//      
//      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.Button");
//      System.out.println("TC02- Clicked on watch ");
//
//      if (isVisibleWithId("com.threesixteen.app:id/iv_like"))
//      {
//   	   ReelTest();
//      }
//      else {  
//  	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
//  	            System.out.println("TC01- Reels Not foud");
//  	 }
//   	
//   }
    
    //EXPLORE PAGE REEL Script Test pending
	

 
 
 
 
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



