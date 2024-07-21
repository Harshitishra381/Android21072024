package Trial;

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

public class Functions<MobileElement, Rotatable>  {


	
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
    

 public static void OpenLivetStream () throws InterruptedException {
    	
	 Thread.sleep(2000);
 	if (isVisibleWithXPath1(
             "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
         clickAndWaitForElementWithXpath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
         System.out.println("TC01- Pro stream opened");
         Thread.sleep(2000);


     } else
     {
     	if (isVisibleWithXPath1("//*[contains(@text,'Pro Streams')]")) {
     	
         driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
         System.out.println("TC01- Pro tab opened");
         Thread.sleep(2000);
     	}
     	else
     	{
     		 driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
              System.out.println("TC01- Following tab opened");
              Thread.sleep(2000);
          	}
     	}

     

     clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
     System.out.println("TC02- First Live session Opened");
     Thread.sleep(10000);
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
     for (int i = 1; i <= 10; i++) {
         if (isVisibleWithId("com.threesixteen.app:id/tv_time_and_watching")) {
             ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
             Thread.sleep(3000);
         }
         clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
         Thread.sleep(3000);
     }
     System.out.println("F--> PIP switch done 10 times");
     Thread.sleep(1000);

 }
 
 public static void  OpenVideo() throws InterruptedException {
 
 	 if (isVisibleWithXPath1("//*[contains(@text,'Videos')]")) {
          clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
          System.out.println("TC09- click on videos tab");
          Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
          System.out.println("TC09- click on video");

          Thread.sleep(1000);
      }
 	 else
 		 
 	 {

 	
 	String targetId = "com.threesixteen.app:id/video_timer"; 
 	boolean idFound = false;
 	int maxScrolls = 10; 

 	for (int i = 0; i < maxScrolls && !idFound; i++) {
 	    try {
 	        driver.findElement(
 	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"" + targetId + "\"))"));
 	        idFound = true;
 	        System.out.println("TC - Video found");
 	    } catch (Exception e) {
 	        driver.findElement(
 	            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
 	        Thread.sleep(1000); 
 	    }
 	}
 	if (idFound) {
 	    System.out.println("Opened video");
 	    driver.findElement(AppiumBy.id(targetId)).click(); 
 	} else {
 	    System.out.println("Element with resource ID: " + targetId + " not found after " + maxScrolls + " scrolls");
 	}
 	Thread.sleep(1000); 

 
 	 }

 }
 

 
 public static void ExoQualityChange() throws InterruptedException {
 	
   	 Thread.sleep(10000);
   	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
	 if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]"))
	 {  clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
         System.out.println("TC07- Clicked on video player setting");
	 }
	 else
	 {           
    	 Thread.sleep(10000);
   	 clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
   	 clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Hide player controls\"]/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView[2]");
        System.out.println("TC08- Clicked on video player setting");
   	 }
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Video Quality')]");
        System.out.println("TC08- clicked on video quality");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'1080p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'1080p')]");
            System.out.println("TC09- changed the video qulaity to 1080p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'720p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
            System.out.println("TC10- changed the Video qulaity to 720p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'480p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'480p')]");
            System.out.println("TC11- changed the Video qulaity to 480p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'240p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'240p')]");
            System.out.println("TC12- changed the video qulaity to 240p");
            Thread.sleep(1000);
        }

        if (isVisibleWithXPath1("//*[contains(@text,'360p')]")) {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'360p')]");
            System.out.println("TC13- changed the Video qulaity to 360p");
            Thread.sleep(1000);
        }

    }

 
 
 public static void MuteRecordedStream() throws InterruptedException
 
 {
     Thread.sleep(1000);
 	if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
     {
 		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			System.out.println("TCA- open recorded stream 1st");
     Thread.sleep(10000);
     clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
     if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
     {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TCB- UnMute the video");
     } 
     else 
     {
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
        System.out.println("TCC- UnMute the video");
     }
     }
 	
     
	  else 
		
      {
	        Thread.sleep(1000);
 	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
     Thread.sleep(1000);
     if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
     {
      clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	   	System.out.println("TCD- open recorded stream 1st");
     Thread.sleep(10000);
     
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_volume"))
      {
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
         System.out.println("TCE- UnMute the video");
         Thread.sleep(1000);

     }
      else 
      {
         Thread.sleep(10000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
         System.out.println("TCF- UnMute the video");
         Thread.sleep(1000);
     } 
      }
     else
     {
     	 driver.findElement(
  				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
          Thread.sleep(1000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");

     }
      }
     Thread.sleep(1000);
     driver.navigate().back();
     Thread.sleep(1000);
     driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
     Thread.sleep(1000);
     if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
     {
      clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	   	System.out.println("TCG- open recorded stream 2nd");
     Thread.sleep(7000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
         System.out.println("TCH- UnMute the video");
         Thread.sleep(1000);

     } else {
         Thread.sleep(10000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
         System.out.println("TCI- UnMute the video");
         Thread.sleep(1000);
     }
     }
     else
     {
     	driver.findElement(
  				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
          Thread.sleep(7000);
     }
      driver.navigate().back();
      Thread.sleep(1000);
      
      driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
      if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
      {
       clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	   	System.out.println("TCJ- open recorded stream 3rd");
      Thread.sleep(7000);
      
       clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
       if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
          System.out.println("TCK- UnMute the video");
          Thread.sleep(1000);

      } else {
          Thread.sleep(10000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
         System.out.println("TCL- UnMute the video");
          Thread.sleep(1000);
      }
      }
 }
 
 
 public static void OpenRecommendedFeed() throws InterruptedException {
 	
 	
 
 	 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(1000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
      Thread.sleep(10000);
      if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close"); }
      System.out.println("F--> Open Recommended Feed 10 times");
      Thread.sleep(3000);

      
 }
 
 

 
 
public static void TabSwitch() throws InterruptedException {
	    for (int i = 0; i < 5; i++) {
	        clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Reels\"]/android.widget.FrameLayout/android.widget.ImageView");
	        clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout[1]");
	        clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Explore\"]/android.widget.FrameLayout/android.widget.ImageView");
	        // clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Gaming Zone\"]");
	        clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
	        System.out.println("F--> Tabs Switch Done " + (i + 1) + " times");

	    }

	}



public static void ExoRotate() throws InterruptedException {
  for (int i = 1; i <= 2; i++) {
  	
      Thread.sleep(20000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
      {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      else
      {
          Thread.sleep(5000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      Thread.sleep(20000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
     clickAndWaitForElementWithXpath1("//[@content-desc=\"Play\"]");
	    clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
      if (isVisibleWithId("com.threesixteen.app:id/iv_fs"))
      {
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      else
      {
          Thread.sleep(5000);
      clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
      }
      System.out.println("TC" + String.format("%02d", i + 1) + "- Exo player screen Rotate");
      Thread.sleep(5000);
  }
}
 
 
public static void OpenSearch() throws InterruptedException {
	
	
	
	 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
	{  
		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
  System.out.println("TC01- Open Search");
  Thread.sleep(1000);
	}
	else
	{
		if (isVisibleWithId("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView"))
	 {
			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\" \"]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
  System.out.println("TC01- Open Search");
  Thread.sleep(1000);		
	 }
		else
		{
          clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
          System.out.println("TC01- Open Search0111");


		}
	}
}
 
 
public void OpenSideNav() { 
    

	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
	{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
	        System.out.println("TC01- open side nav from old homapage");
	}
	else
	{
	    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
	    System.out.println("TC02- open side nav from New homapage");
	}
    }


public static void OpenNotificationtab() throws InterruptedException {
	
    Thread.sleep(1000);
	if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView"))
    {
    	
		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[2]/android.widget.ImageView");
        Thread.sleep(1000);

    } 
	
		if (isVisibleWithXPath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView"))
 	{
			clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Notifications\"]/android.widget.FrameLayout[1]/android.widget.TextView");
	        Thread.sleep(1000);

 	}
		else
			
		{
		
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_notification");
         Thread.sleep(1000);

		}
    
    System.out.println("TC01 - Notification tab opened");
}
 
 
 
public void TestShareCount() throws InterruptedException {
    
    MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String initialShareCount = ((WebElement) element).getText();
    System.out.println("TC03- Initial share count is " + initialShareCount);
    Thread.sleep(2000);

    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_whatsapp");
    System.out.println("TC04- Clicked on share button");
    Thread.sleep(5000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
    System.out.println("TC05- Clicked on More button");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);

    MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String updatedShareCount = ((WebElement) element1).getText();
    System.out.println("TC06- Updated share count is " + updatedShareCount);
    Thread.sleep(2000);


    int difference = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount);
    Thread.sleep(2000);

    if (difference == 1) 
    {
    	
   
         Thread.sleep(30000);
        System.out.println("Difference between updated share count and initial share count is 1");
    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
    System.out.println("TC07- opened stream");
    Thread.sleep(10000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC08- Exist from Live chat");
    Thread.sleep(1000);
    
   
    
    MobileElement element2 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String initialShareCount11 = ((WebElement) element2).getText();
    System.out.println("TC09- Initial share count is " + initialShareCount11);
    Thread.sleep(2000);
    
    int difference1 = Integer.parseInt(updatedShareCount) - Integer.parseInt(initialShareCount11);
    Thread.sleep(2000);
    if (difference1 == 0) {
    	

    System.out.println("Difference between internal share count and external share count is 0");    
    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
    System.out.println("TC10- Clicked on share button");
    Thread.sleep(5000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_more");
    System.out.println("TC11- Clicked on More button");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(15000);

    MobileElement element111 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/tv_num_shares"));
    String updatedShareCount1 = ((WebElement) element111).getText();
    System.out.println("TC12- Updated share count is " + updatedShareCount1);
    Thread.sleep(2000);


    // Check if the difference between updated share count and initial share count is 1
    int difference11 = Integer.parseInt(updatedShareCount1) - Integer.parseInt(initialShareCount11);
    Thread.sleep(2000);

    if (difference11 == 1) {
        System.out.println("Share Count is Working fine for Live stream");
    } 
    }
    
    else
    {
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        System.out.println("Share count count mismatched ");
    }
   }
}    
    
    
 
 
 




public static void ReelTest() throws InterruptedException {
	
	
	 if (isVisibleWithId("com.threesixteen.app:id/iv_like")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_like");
            System.out.println("TC01- Reels Liked");
	 }
     Thread.sleep(2000);
     if(isVisibleWithXPath1("//*[contains(@text,'Follow')]"))
     {
	     System.out.println("TC02- Follow buton present");
     Thread.sleep(2000);
	  clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
	     System.out.println("TC03- Volume buton present");
     Thread.sleep(2000);
     }
     else
     {  	  
    	 System.out.println("TC04- You already followed this creator ");
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
   	    System.out.println("TC05- Volume buton present");
        Thread.sleep(2000);
     }
	    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_reel_title");
    System.out.println("TC06- Reel keyword present");
    Thread.sleep(2000);
	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_reels2");
    System.out.println("TC07- Reel icon present");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_post_date");
    System.out.println("TC08- Reel views present");
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_more");
    System.out.println("TC09- Clicked on Three dots");
    Thread.sleep(2000);
    if (isVisibleWithXPath1("//*[contains(@text,'Report')]")) {
         Thread.sleep(2000);
    driver.findElement(By.xpath("//*[contains(@text,'Report')]")).click();
    System.out.println("TC10- Clicked on report");
    Thread.sleep(2000);
    clickAndWaitForElementWithXpath1(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
    System.out.println("TC11- select tag inappropriate");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_submit");
    System.out.println("TC12- Reel Reported");
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/btn_submit"))
    {
        Thread.sleep(2000);
    	driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("TC13- This reel is already Reported");
    }
}
    Thread.sleep(2000);
 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
//clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
System.out.println("TC14- Opened the comment section.....");
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/tv_comment")) {
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
    System.out.println("TC15- clicked comment section.....");
    Thread.sleep(2000);
    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
    System.out.println("TC16- Typed wow comment section");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
    System.out.println("TC17- Comment on Reel Done");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
            .click();
    System.out.println("TC18- Opened the list of likes in reel");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
            .click();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
    System.out.println("TC19- Opened user from list of likes in reel");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
    System.out.println("TC20- Back from creators profile");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC21- Existed from creators profile Card");
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
    (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
    System.out.println("TC22- Existed from comment section"); 
    Thread.sleep(2000);
} else {
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_comment");
//  clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.LinearLayout[2]/android.widget.ImageView");
    System.out.println("TC22- Opened the comment section.....");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
    System.out.println("TC23- clicked comment section.....");
    Thread.sleep(2000);
    (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("wow");
    System.out.println("TC24- Typed wow comment section");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
    System.out.println("TC25- Comment on Reel Done");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"))
            .click();
    Thread.sleep(2000);
    System.out.println("TC26- Opened the list of likes in reel");
    Thread.sleep(2000);
    (driver).findElement(By.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView"))
    .click();
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
    System.out.println("TC27- Opened user from list of likes in reel");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
    System.out.println("TC28- Back from creators profile");
    Thread.sleep(2000);
    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
    System.out.println("TC29- Existed from creators profile Card");
    Thread.sleep(2000);
    if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
        (driver).findElement(By.id("com.threesixteen.app:id/iv_close")).click();
        System.out.println("TC30- Existed from comment section"); 
        Thread.sleep(2000);
}
}
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
System.out.println("TC31- Creators Profile opened");
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
System.out.println("TC32- Creators Profile opened in full view");
Thread.sleep(2000);
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
System.out.println("TC33- Back from creators profile");
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/iv_close")) {
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
System.out.println("TC34- Existed from creators profile Card"); }
Thread.sleep(2000);
if (isVisibleWithId("com.threesixteen.app:id/iv_share"))
{

clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
System.out.println("TC35- Clicked on share icon on reel");
}
else
{
	driver.navigate().back();
	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
	    System.out.println("TC35- Clicked on share icon on reel");
	
}
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_copy_link");
System.out.println("TC36- share link is copied");
clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
System.out.println("TC37- clicked on share icon on reel");
clickAndWaitForElementWithId("com.threesixteen.app:id/tv_download");
System.out.println("TC38- Clicked on Download button button on reel");
Thread.sleep(1000);
if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage"))
{
	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
	    System.out.println("TC39- creator profile image present");
}
else
{

	driver.navigate().back();
	if (isVisibleWithId("com.threesixteen.app:id/iv_profileImage")) {

	    clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profileImage");
	    System.out.println("TC40- creator profile image present");
	}
}
}
}

    
    
    
    
    
    static AppiumDriver driver;

    @BeforeMethod
    public void setup2() throws MalformedURLException, InterruptedException  {

        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AndroidDriver(url, cap);
    	
    	 DesiredCapabilities cap1 = new DesiredCapabilities();
    	 
    	 
//		cap.setCapability("deviceName", "5SU4BEVW7H9LPZAE");
//	     cap1.setCapability("deviceName", "RZ8T907T67Y");
		cap.setCapability("deviceName", "13793294180004Z");
//       cap.setCapability("deviceName", "6381e3e");
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
        Thread.sleep(5000);
  
       
        if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
            
            driver.navigate().back();
             System.out.println("Exist from Update");
             Thread.sleep(2000);
        }
   }

    

  
   
    
    
    
 
    
    
    
 
    
        
	
	
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



