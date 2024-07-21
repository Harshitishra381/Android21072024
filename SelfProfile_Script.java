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

public class SelfProfile_Script<MobileElement, Rotatable>  {


	
    public static void clickAndWaitForElementWithXpath1(final String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
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
	     cap1.setCapability("deviceName", "13793294180004Z");
//		cap.setCapability("deviceName", "13793294180004Z");
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
        Thread.sleep(4000);
   
   

       if (isVisibleWithId("android:id/button2")) 
       {
           clickAndWaitForElementWithId("android:id/button2");
           System.out.println("Click on close");
       }

//		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
//		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
//			System.out.println("Gmail Login Done");

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
            Thread.sleep(2000);
       }

   }

    
    
 

    @Test(priority = 1)
   public void Threedotsonnprofilepage1() throws InterruptedException {

        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
        System.out.println("TC01- opens side nav");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_share");
        System.out.println("TC03- Click on share icon");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC04- Copy profile link");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
        System.out.println("TC06- View details stats");
        driver.navigate().back();

    }
    
    
    

    @Test(priority = 2)
    public void SelfprofilefollowerandfollowigllistandUICheck2() throws InterruptedException {

        OpenSideNav();
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_city");
        System.out.println("TC03- City Name is comming on Profile page");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_since");
        System.out.println("TC04- Channel starting date is comming on Profile page");
        clickAndWaitForElementWithId("com.threesixteen.app:id/coupon_desc");
        System.out.println("TC05- Profile page Coupons carousal are comming on Profile page");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Pro Creator')]")).click();
        System.out.println("TC06- Pro creator coming on self profile");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_followers");
        System.out.println("TC07- Open followers list");
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC08- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC09- Back from Profile");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
        System.out.println("TC10- Open following list");
        Thread.sleep(1000);
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC11- Open profile");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC12- Back from Profile");
        Thread.sleep(1000);
        driver.navigate().back();

    }

    
    
    
    @Test(priority = 3)
    public void SelfprofileGamePage3() throws InterruptedException {
    	
    	
    	

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC03- Open first game");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC04-Open profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- Back from Profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC06- Back from frist game");

    }

  
 


    @Test(priority = 4)
    public void SelfProfileGamePage4() throws InterruptedException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC03- Open Second game");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC04-Open profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- Back from Profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC06- Back from Second game");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC07- Open 3rd game");
        Thread.sleep(1000);
        driver.navigate().back();

    }
    
    
    


    @Test(priority = 5)
    public void SelfProfileChangeAppLanguage5() throws InterruptedException, MalformedURLException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
        System.out.println("TC04- Click on Change app language");
        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
//        System.out.println("TC13- Click on Hindi");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
//        System.out.println("TC13A- Click on Change app language");
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView");
        System.out.println("TC05- Click on English");
        driver.navigate().back();

    }

  

   
    

   
    

    @Test(priority = 6)
    public void DonationLink6() throws InterruptedException, MalformedURLException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView");
        System.out.println("TC04- Click on Donation link");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        System.out.println("TC05- Copy Donation link");
    }

    
    
    @Test(priority = 7)
    public void ChangeAppLanguage7() throws InterruptedException, MalformedURLException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithId(
                "com.threesixteen.app:id/iv_settings");
        System.out.println("TC05- Click on three dots");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
        System.out.println("TC12- Click on Change app language");
        Thread.sleep(1000);
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
//        System.out.println("TC13- Click on Hindi");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");
//        System.out.println("TC13A- Click on Change app language");
//        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView");
        System.out.println("TC13B- Click on English");
        Thread.sleep(1000);
        driver.navigate().back();

    }


    
    @Test(priority = 8)
    public void SelfProfieReelLandingTest8() throws InterruptedException {

        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"80\"]");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC03- Open First reel");
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("TC04- Back from Reel");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC05- Reel Landed on self profile");
        Thread.sleep(1000);
        
        
    }
	
	
    
    
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



