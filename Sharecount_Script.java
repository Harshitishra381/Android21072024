package Trial;

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

public class Sharecount_Script<MobileElement, Rotatable>  {


	
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
    
    
    public static void PIPSwitch() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
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


    
    public static void OpenLivetStream () throws InterruptedException {
    	
    	if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
            Thread.sleep(2000);


        } else
        {
            driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
            System.out.println("TC01- Following tab opened");
            Thread.sleep(2000);

        }

        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
        System.out.println("TC02- First Live session Opened");
        Thread.sleep(10000);
    }
    
    
    
    public static void OpenRecommendedFeed() throws InterruptedException {
    	
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
         Thread.sleep(7000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
         Thread.sleep(1000);
         System.out.println("F--> Open Recommended Feed 10 times");

         
    }
    
    
    @SuppressWarnings("unchecked")
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
    
    
    
    
    
    static AppiumDriver driver;

    private Capabilities cap;
    private int index;

    
    @BeforeMethod
    public void setup2() throws MalformedURLException, InterruptedException  {

        DesiredCapabilities cap = new DesiredCapabilities();
        URL url = new URL("http://127.0.0.1:4723/wd/hub/");
        driver = new AndroidDriver(url, cap);
    	
    	 DesiredCapabilities cap1 = new DesiredCapabilities();
//		cap.setCapability("deviceName", "5SU4BEVW7H9LPZAE");
//	     cap1.setCapability("deviceName", "RZ8T907T67Y");
//		cap.setCapability("deviceName", "13793294180004Z");
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
        Thread.sleep(10000);
   
   

       if (isVisibleWithId("android:id/button2")) 
       {
           clickAndWaitForElementWithId("android:id/button2");
           System.out.println("Click on close");
       }

//		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
//			System.out.println("Gmail Login Done");

	        if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android."))
	        {
	            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
	            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
	            System.out.println("Spinwheel rotate");
           }
       if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) 
       {
           clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
           System.out.println("Notification permission allowed");

       }
       
//       driver.navigate().back();

   }

    
    
    


   
    
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 01)
    public void ShareCountOnLiveStreamHomePage01() throws InterruptedException, MalformedURLException {

        if (isVisibleWithXPath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
            System.out.println("TC01- Pro stream opened");
            Thread.sleep(1000);

        } 
        else 
        {
            driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
            System.out.println("TC02- Following tab opened");
            Thread.sleep(1000);
        }
        

       TestShareCount();
     
    }     
    
    
    
    @Test(priority = 02)
    public void ShareCountOnLiveStreaSearch02() throws InterruptedException, MalformedURLException {

    	 clickAndWaitForElementWithXpath1(
                 "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
         System.out.println("TC01- Open Search");
         Thread.sleep(3000);
         clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
         System.out.println("TC02- Click on search box");
         Thread.sleep(3000);
         (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BGMI");
         System.out.println("TC03- Type BGMI in search");
         Thread.sleep(3000);   
         driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC05- Click on ENTER");
        Thread.sleep(5000);   
         driver.findElement(By.xpath("//*[contains(@text,'Live')]")).click();
         System.out.println("TC04- Click on Live tab");
         Thread.sleep(5000);
       
        

       TestShareCount();
     
    }     
        
    
    
    
    
    
        
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



