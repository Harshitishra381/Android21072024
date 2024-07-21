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

public class TaskPage_Script<MobileElement, Rotatable>  {


	
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
       Thread.sleep(3000);
   
   

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
       }
   }

    
    
    @Test(priority = 1)
    public void Taskpage1() throws InterruptedException {


        clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
        System.out.println("TC01- Task page opened");
        Thread.sleep(3000);
        if (isVisibleWithXPath1(
                "//android.widget.FrameLayout[@content-desc=\" \"]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")) {
            System.out.println("TS- Old task page test starting");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
            System.out.println("TC02- Open coin logs");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC03- Back from coin logs");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
            System.out.println("TC04- Open Diamond logs");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC05- Back from Diamond logs");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "//android.widget.FrameLayout[@content-desc=\" \"]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]");
            System.out.println("TC06- click on Rewards");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC07- Back from Rewards");
            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("android.widget.FrameLayout[@content-desc=\" \"]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
//            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Buy Diamonds\"]");
            driver.findElement(By.xpath("//*[contains(@text,'Buy Diamonds')]")).click();

            System.out.println("TC08- click on buy diamond");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC09- Back from Diamond purchase");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Offers\"]");
            System.out.println("TC10- click on Offers");
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
            Thread.sleep(1000);
            System.out.println("TC11- offers page scrolled downside");

            if (isVisibleWithXPath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")) {
                Thread.sleep(1000);
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
                System.out.println("TC12- Ads found and scrolling upside");
                Thread.sleep(1000);

            }
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "//android.widget.LinearLayout[@content-desc=\"Win Coins\"]/android.widget.TextView");
            System.out.println("TC013- Open win coins page");
            Thread.sleep(1000);
            System.out.println("TC14- scrolled task page");
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.TextView[5]");
            System.out.println("TC15- opened task");
            Thread.sleep(1000);

            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
            Thread.sleep(1000);
            if (isVisibleWithXPath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]")) {
                clickAndWaitForElementWithXpath1(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]");
                System.out.println("TC16- Coin collected");

            }

            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
            Thread.sleep(1000);
            if (isVisibleWithXPath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]")) {
                clickAndWaitForElementWithXpath1(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]");
                System.out.println("TC17- Coin collected");
            }
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
            Thread.sleep(1000);
            if (isVisibleWithXPath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]")) {
                Thread.sleep(1000);
            	clickAndWaitForElementWithXpath1(
                        "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[3]");
                System.out.println("TC18- Coin collected");
                Thread.sleep(1000);
            }
        } else {
            Thread.sleep(1000);
            System.out.println("TS- New task page test starting");
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
            System.out.println("TC19- Open coin logs");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC20- Back from coin logs");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_diamond");
            System.out.println("TC21- Open Diamond logs");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            System.out.println("TC22- Back from Diamond logs");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(@text,'Buy Diamonds')]")).click();
            System.out.println("TC23- click on buy diamond");
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC24- Back from Diamond purchase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(@text,'Offer')]")).click();

//            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.ImageView");
            System.out.println("TC25- click On offers");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.ImageView");
//            System.out.println("TC012- Open invite & Win");
//            Thread.sleep(1000);
//            Thread.sleep(1000);
            if (isVisibleWithXPath1("//*[contains(@text,'Spin & Streak')]"))
            {
            driver.findElement(By.xpath("//*[contains(@text,'Spin & Streak')]")).click();
            System.out.println("TC26- click On Spin & Streak");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            }
            else
            {
            	driver.findElement(By.xpath("//*[contains(@text,'Spin & Win')]")).click();
                System.out.println("TC26- click On Spin & Win");
                Thread.sleep(1000);
                driver.navigate().back();
                Thread.sleep(1000);
            }
//            System.out.println("TC013- Back from invite & Win page");
//            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView");
//            System.out.println("TC014- Open Spin wheel");
//            Thread.sleep(1000);
//            driver.navigate().back();
//            System.out.println("TC014- Back from Spin wheel");
            driver.findElement(By.xpath("//*[contains(@text,'Rewards')]")).click();
            System.out.println("TC27- click On Rewards");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);

        }

    }



    
	 
	 
	 @Test(priority = 2)
		public void Taskpagecoincollect2() throws InterruptedException {
	 
		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
		Thread.sleep(3000);
		System.out.println("TC01- Task page opened");
	 driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
			clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
			System.out.println("TC02- Coin collected");
			Thread.sleep(1000);

		} 
		
		else 

		{
				clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
				System.out.println("TC03- Opened see More tasks");
				Thread.sleep(3000);

				if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
					clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
					System.out.println("TC04- Coin collected");
				}
				Thread.sleep(1000);
				driver.navigate().back();
				System.out.println("TC05- Back from see more tasks");

			}
		}
		
	 
		
		@Test(priority = 3)
		public void Taskpagequestions3() throws InterruptedException {
		
		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
		Thread.sleep(3000);
		System.out.println("TC01- Task page opened");
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(40)"));		
		System.out.println("TC03- Scroll to down");	
		if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]"))
		{
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]");
		System.out.println("TC04- Open Questioon 1");
		}
		else
		{
			driver.findElement(
					AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(30)"));
			System.out.println("TC03- Scroll to down");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]");
			System.out.println("TC04- Open Questioon 1");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.ImageView[2]");
		System.out.println("TC05- Open Questioon 2");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView[2]");
		System.out.println("TC06- Open Questioon 3");
		Thread.sleep(1000);
		driver.navigate().back();
	}
	 
		
		
	 
		
		
		
		
		
		
		
		@Test(priority = 4)
		public void Taskdone4() throws InterruptedException, MalformedURLException {
		
		
		clickAndWaitForElementWithXpath1("//android.widget.FrameLayout[@content-desc=\"Win Coins\"]");
		Thread.sleep(3000);
		System.out.println("TC01- Task page opened");	
	 driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
		if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
			clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
			System.out.println("TC02- Coin collected");

		} else 
		
		{
				clickAndWaitForElementWithXpath1("//*[contains(@text,'See More Tasks')]");
				System.out.println("TC03- Opened see More tasks");
				if (isVisibleWithXPath1("//*[contains(@text,'Collect')]")) {
					clickAndWaitForElementWithXpath1("//*[contains(@text,'Collect')]");
					System.out.println("TC04- Coin collected");
				}
				else
				if (isVisibleWithXPath1("//*[contains(@text,'Watch')]")) {
					clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch')]");
					System.out.println("TC04- Tasks Opened");
				}

			}
		}
		
		
		
		
		
		

	
	
	
	
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



