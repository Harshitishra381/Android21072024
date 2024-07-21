package Trial;

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

public class SideNav_Script<MobileElement, Rotatable> extends Functions {


	
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
//    public void OpenSideNav() { 
//    
//
//	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
//	{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//	        System.out.println("TC01- open side nav from old homapage");
//	}
//	else
//	{
//	    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
//	    System.out.println("TC02- open side nav from New homapage");
//	}
//    }
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
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
//		cap.setCapability("deviceName", "13793294180004Z");
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
//            Thread.sleep(2000);
//       }
//
//   }
//    
//    
//    
//    
//    
    

    
// boolean isVisibleWithXpath1(String s) {
//
//        return false;
//    }
//  
 

    @Test(priority = 1)
    public void CreatebtnIRL1() throws InterruptedException, MalformedURLException {

        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        System.out.println("TC02- Click on create");
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_irl_live");
        System.out.println("TC03- Click on IRL");
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC04- Back from IRL");

    }
    

    @Test(priority = 2)
    public void SidenNavCreateVideo2() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_upload");
        System.out.println("TC03- Click on Video upload");
        driver.navigate().back();
    }
    
    
    
    
    @Test(priority = 3)

    public void SidenNavchnageFavoriteGame3() throws InterruptedException {

        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Setting')]");
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView");
        System.out.println("TC02- Click on Setting");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
        System.out.println("TC03- click on select games");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- click on GTA-V");
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_done");
        System.out.println("TC05- click on next");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on Done");

    }

    @Test(priority = 4)
    public void SidenNavDataSaver4() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC02- Data Saver clicked ");
        if (isVisibleWithXPath1("//*[contains(@text,'Always On')]")) {
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Always On')]");
        System.out.println("TC03- Click on always On ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC04- Data Saver turn on ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Only on Mobile Network')]");
        System.out.println("TC05- Click on only on miobile network ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC06- Data Saver clicked ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Off')]");
        System.out.println("TC07- Click on off");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
        System.out.println("TC08- Data Saver clicked ");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_title_settings");
        System.out.println("TC08- Click on dvance setting ");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_down_mode");
        System.out.println("TC08- Click on down button on top ");
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Always On')]");
        System.out.println("TC03- Click on always On ");
        }
        else
        {
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Data Saver')]");
            System.out.println("TC04- Data Saver turn off ");
        }


    }

    @Test(priority = 5)
    public void SideNavContest5() throws InterruptedException {

        OpenSideNav();
        String targetText = "Contests";
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
        Thread.sleep(1000);  
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_history");
        System.out.println("TC03- open Contest history");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Contest history");

    }

    @Test(priority = 6)
    public void SideNavcreateBtn6() throws InterruptedException {

        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_esports");
        System.out.println("TC03- Click on lIVE STREAM");
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC04- Back from live stream");
        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
        System.out.println("TC06- Click on create");
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_irl_live");
        System.out.println("TC07- Click on IRL");
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_back");
        System.out.println("TC08- Back from IRL");
    }

    @Test(priority = 7)
    public void SidenNavCreateBtn7() throws InterruptedException {

        OpenSideNav();
        clickAndWaitForElementWithXpath1("//*[contains(@text,'Create')]");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_post");
        System.out.println("TC03- Click on Image upload");
        Thread.sleep(1000);

    }
    
    
    
    

    @Test(priority = 9)
    public void SideNavRewards9() throws InterruptedException {

        OpenSideNav();
        String targetText = "Rewards";
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
        Thread.sleep(1000);  
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Gaming\"]");
        System.out.println("TC02- Gaming section  open in Rewards");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
        System.out.println("TC03- Coins count is coming on reward page");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Minecraft')]"))
        {
            driver.findElement(By.xpath("//*[contains(@text,'Minecraft')]")).click();
            System.out.println("TC04- Click on Minecraft");
        }
        driver.findElement(By.xpath("//*[contains(@text,'BGMI')]")).click();
        System.out.println("TC05- Click on BGMI");
        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
        {
        System.out.println("TC06- Coupons Available in BGMI section");
        driver.findElement(By.xpath("//*[contains(@text,'LEAF')]")).click();
        System.out.println("TC07- Click on LEAF");
        }
        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
        {
        System.out.println("TC08- Coupons Available in LEAF section");
        driver.findElement(By.xpath("//*[contains(@text,'Myntra')]")).click();
        System.out.println("TC09- Click on Myntra");
        }
        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
        {
        System.out.println("TC10- Coupons Available in Myntra section");
        driver.findElement(By.xpath("//*[contains(@text,'All')]")).click();
        System.out.println("TC11- Click on All");
        }
        if (isVisibleWithId("com.threesixteen.app:id/redeem_now"))
        {
            System.out.println("TC12- Coupons Available in All section");
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Redeemed\"]");
        System.out.println("TC13- Redemmed section  open in Rewards");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        }
    }
  
    
        

    @Test(priority = 10)
    public void SidenNavOffersTask10() throws InterruptedException {
    	
    	
        Thread.sleep(1000);
        OpenSideNav();
        String targetText = "Tasks";
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
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
        System.out.println("TC03- Coin log coming ");
        Thread.sleep(5000);
        driver.navigate().back();

        System.out.println("TC03- Back from Coin log ");
        Thread.sleep(3000);

//          clickAndWaitForElementWithId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
//          System.out.println("TC04- Title coming for task page");
//          Thread.sleep(1000);

          if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.Button")) {
          
              System.out.println("TC05- Watch button is visible for tasks ");
              Thread.sleep(1000);
              driver.navigate().back();
              Thread.sleep(1000);
            System.out.println("TC06- Back from task page  ");
            Thread.sleep(1000);

          }
          else
          {
              Thread.sleep(1000);
              clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
              System.out.println("TC07- Watch button not visible" );

          }
          
    }
    
    

    private boolean isvisibleithXpath1(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	@Test(priority = 11)
    public void SidenNavInviteAndWin11() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        String targetText = "Invite & Win";
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
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]");
//        System.out.println("TC34- open Invite & WIn page");
////	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_see_invited_iib");
////	System.out.println("TC35- open See all invites");
////	driver.findElement(AppiumBy.androidUIAutomator(
////		    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
////	clickAndWaitForElementWithId("com.threesixteen.app:id/backIV");
////	System.out.println("TC36- Back from all invites");
////   driver.navigate().back();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/backIV");
//        System.out.println("TC37- Back from invite & Win  page");
        driver.navigate().back();

    }

    @Test(priority = 12)
    public void SidenNavWatccchHistory12() throws InterruptedException {
    	
        OpenSideNav();
         Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'Watch History')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_watch_history");
        System.out.println("TC01- open Watch history");
        Thread.sleep(2000);

        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC02- open watch history feed");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("TC0A- Back from feed");
        Thread.sleep(2000);
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/iv_profile_image")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
        Thread.sleep(3000);
        }
        else
        {
            driver.navigate().back();
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
            Thread.sleep(3000);

        }
        driver.findElement(By.xpath("//*[contains(@text,'Watch History')]")).click();
        System.out.println("TC03- open Watch history Again");
        Thread.sleep(2000);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        Thread.sleep(2000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView");
        System.out.println("TC04- open watch history feed after scrolling");
        Thread.sleep(2000);

    }
    
    

    @SuppressWarnings("unchecked")
	@Test(priority = 13)
    public void SidenNavcChangeProfileName13() throws InterruptedException {

        OpenSideNav();
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.ImageView");
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_name"));
	     String UserName = ((WebElement) element).getText();
	     System.out.println("TC03- Current user Name is " + UserName);  
	        Thread.sleep(1000);
	        
	        if (UserName.equals("Idali vlambir"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_name");
        (driver).findElement(By.id("com.threesixteen.app:id/et_name")).sendKeys("Idali vlambir1");
        System.out.println("TC04- changed the user name to Idali vlambir1");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC02- opens self profile");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView[1]"));
	     String UserName1 = ((WebElement) element1).getText();
	        Thread.sleep(1000);
	     System.out.println("TC08- Updated user Name is " + UserName1);  
	        Thread.sleep(1000);
	        
	        if (UserName1.equals("Idali vlambir1"))
	        {
	            System.out.println("TC09- User Name sucessfully updated");
	        }
	        else
	        {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	            System.out.println("TC10- User Name Not updated");
	        }
	      }
	        else
	        {
	        	 clickAndWaitForElementWithId("com.threesixteen.app:id/et_name");
	             (driver).findElement(By.id("com.threesixteen.app:id/et_name")).sendKeys("Idali vlambir");
	             System.out.println("TC11- changed the user name to Idali vlambir ");
	             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	             System.out.println("TC12- click on done");
	             OpenSideNav();

	             clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
	             System.out.println("TC02- opens self profile");
	             Thread.sleep(1000);
	             MobileElement element11 = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView[1]"));
	     	     String UserName11 = ((WebElement) element11).getText();
	             Thread.sleep(1000);
	     	     System.out.println("TC15- Updated user Name is " + UserName11);  
	     	        Thread.sleep(1000);
	     	        
	     	        if (UserName11.equals("Idali vlambir"))
	     	        {
	     	            System.out.println("TC16- User Name sucessfully updated");
	     	        }
	     	        else
	     	        {
	     	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	     	            System.out.println("TC17- User Name Not updated");
	     	        }
	     	      }
	        }
	        
    

    
    
    @Test(priority = 14)

    public void SidenNavChangeLocation14() throws InterruptedException {

        OpenSideNav();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     String Location = ((WebElement) element).getText();
	     System.out.println("TC03- Current Location is " + Location);  
	        Thread.sleep(1000);
	        
	        if (Location.equals("Delhi"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_location");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_location")).sendKeys("Mumbai");
        System.out.println("TC04- Location chnaged to Mumbai");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");
        Thread.sleep(1000);
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     String Location1 = ((WebElement) element1).getText();
	     System.out.println("TC08- Updated Location is " + Location1);  
        if (Location1.equals("Mumbai"))
        {
   	     System.out.println("TC09- Location sucessfully updated");  
        }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
      	     System.out.println("TC10- Location not updated");  

        }
   
	        }
	        else
	        {
	        	 clickAndWaitForElementWithId("com.threesixteen.app:id/et_location");
	             Thread.sleep(1000);
	             (driver).findElement(By.id("com.threesixteen.app:id/et_location")).sendKeys("Delhi");
	             System.out.println("TC11- Location chnaged to Delhi");
	             Thread.sleep(1000);
	             clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	             System.out.println("TC12- click on done");
	             Thread.sleep(1000);
	             OpenSideNav();

	             Thread.sleep(1000);
	             driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	             System.out.println("TC14- Click on Setting");
	             Thread.sleep(1000);
	             MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_location"));
	     	     String Location11 = ((WebElement) element11).getText();
	             Thread.sleep(1000);
	     	     System.out.println("TC15- Updated Location is " + Location11);  
	     	        Thread.sleep(1000);
	             if (Location11.equals("Delhi"))
	             {
	        	     System.out.println("TC16- Location sucessfully updated");  
	             }
	             else
	             {
	                 clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
	           	     System.out.println("TC17- Location not updated");  

	             }
	        }
	        	
    }
    
    
    
    
    

    @Test(priority = 15)

    public void SidenNavChangeBio15() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);

         MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	     String Bio = ((WebElement) element).getText();
	     System.out.println("TC03- Current Bio is " + Bio);  
	        Thread.sleep(1000);
        
	        if (Bio.equals("Pro BGMI content Creator"))
	        {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_bio");
        Thread.sleep(1000);
        (driver).findElement(By.id("com.threesixteen.app:id/et_bio")).sendKeys("Sigma BGMI content Creator");
        System.out.println("TC04- changed Location");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");
        Thread.sleep(2000);
       
        
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	     String Bio1 = ((WebElement) element1).getText();
	     System.out.println("TC08- updated Bio is " + Bio1);  
	        Thread.sleep(1000);
	        if (Bio1.equals("Sigma BGMI content Creator"))
	        {
	   	     System.out.println("TC09- Updated Bio is Sigma BGMI content Creator");  
	        }
	        else 	
	        {
	            Thread.sleep(1000);
	             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
		   	     System.out.println("TC10- Changes BIo doesnt get updated");  
	        }
	     }
	        else
	        {
	        	clickAndWaitForElementWithId("com.threesixteen.app:id/et_bio");
	            (driver).findElement(By.id("com.threesixteen.app:id/et_bio")).sendKeys("Pro BGMI content Creator");
	            System.out.println("TC11- changed Location");
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	            System.out.println("TC12- click on done");
	            OpenSideNav();

	            Thread.sleep(1000);
	            driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	            System.out.println("TC14- Click on Setting");
	            Thread.sleep(1000);
	            MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_bio"));
	    	     String Bio11 = ((WebElement) element11).getText();
	    	     System.out.println("TC15- updated Bio is " + Bio11); 
	    	        Thread.sleep(1000);
	    	        if (Bio11.equals("Pro BGMI content Creator"))
	    	        {
	    	   	     System.out.println("TC16- Updated Bio is Sigma BGMI content Creator");  
	    	        }
	    	        else 	
	    	        {
	    	             clickAndWaitForElementWithXpath1("//*[contains(@text,'720p')]");
	    		   	     System.out.println("TC17- Changes BIo doesnt get updated");  
	    		         Thread.sleep(1000);
	    	        } 	        
	    	     }
	        }

    
    
    
    
    @Test(priority = 31)
    public void SidenNavlightTheme31() throws InterruptedException {

        OpenSideNav();

        driver.findElement(By.xpath("//*[contains(@text,'Theme')]")).click();
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]");
        System.out.println("TC02- Click on themes");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_lite_mode");
        System.out.println("TC03- Switch to Light Mode");
        Thread.sleep(2000);

    }

    @Test(priority = 16)
    public void SidenNavDarkTheme16() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Theme')]")).click();
        System.out.println("TC02- Click on themes");
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_dark_mode");
        System.out.println("TC03- Switch to dark Mode");
        Thread.sleep(1000);
    }
    
    
        
    @Test(priority = 17)
    public void NormalLiveStream17() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(500);
        driver.findElement(By.xpath("//*[contains(@text,'Create')]")).click();
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_create");
        System.out.println("TC02- Click on create");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_esports");
        System.out.println("TC03- Click on lIVE STREAM");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- Select BGMI game");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/rl_select_tag");
        System.out.println("TC05- click on select tag");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
        System.out.println("TC06- select tag 1");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.TextView");
        System.out.println("TC07- select tag 2");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC08- click on done");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/rl_video_quality");
        System.out.println("TC09- click on Video quality");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[5]/android.widget.LinearLayout/android.widget.TextView[1]");
        System.out.println("TC10- click on Video quality 1080p");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_thumbnail");
        System.out.println("TC11- click on Thumbnail");
        Thread.sleep(500);
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        driver.findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(3)"));
        System.out.println("TC12- Thumbnail scrolled");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
        System.out.println("TC13- click on next");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/card_thumbnail_container");
        System.out.println("TC14- click on Edit thumbnail");
        Thread.sleep(500);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
        System.out.println("TC15- Remove thumbnail");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC16- click on next");
        Thread.sleep(2000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_overlay");
        System.out.println("TC17- Click on overlay");
        Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/btn_buy")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
            System.out.println("TC18- Click on Done");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/img_add_overlay");
            System.out.println("TC19- Click on Edit overlay");
            Thread.sleep(1000);
        }
        driver.findElement(By.xpath("//*[contains(@text,'Change Overlay')]")).click();
//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC20- Click on change overlay");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
        System.out.println("TC21- Select an overlay");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/img_more_settings");
        System.out.println("TC22- Click on more setting");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/switch_shield_mode");
        System.out.println("TC21- Switch to sheild mode");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/switch_stream_delay");
        System.out.println("TC22- Click on stream delay");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/container_stream_delay");
        System.out.println("TC23- Apply 60s stream delay");
        Thread.sleep(500);
        if (isVisibleWithId("com.threesixteen.app:id/btn_select")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_select");
            System.out.println("TC24- Clicked on Done");
        }
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC25- Click on Save & go Back");
        Thread.sleep(500);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_next");
        System.out.println("TC26- Click on Next-Select Channels");

    }

    
    @Test(priority = 20)
    public void SideNavCreateBtnReel20() throws InterruptedException, MalformedURLException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Create')]")).click();
        System.out.println("TC02- Click on create");
        System.out.println("TC03- Click on Reel upload");
        Thread.sleep(1000);
        driver.navigate().back();

    }

    
    @Test(priority = 21)
    public void GooglePlayCouponRedeem21() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Rewards')]"))
        {
        driver.findElement(By.xpath("//*[contains(@text,'Rewards')]")).click();
        System.out.println("TC02- Rewards Open from  side nav");
        }
        else
        {
        	   driver.findElement(
                     AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        	   driver.findElement(By.xpath("//*[contains(@text,'Rewards')]")).click();
               System.out.println("TC03- Rewards Open from  side nav");
        }
        	
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Gaming\"]");
        System.out.println("TC04- Gaming section  open in Rewards");
        Thread.sleep(1000);
        if (isVisibleWithXPath1("//*[contains(@text,'Google Play Gift Card')]"))
        {
        driver.findElement(By.xpath("//*[contains(@text,'Google Play Gift Card')]")).click();
        System.out.println("TC05- Clicked on google play gift card");
        }
        else
        {
        	driver.findElement(
              AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        	driver.findElement(By.xpath("//*[contains(@text,'Google Play Gift Card')]")).click();
            System.out.println("TC06- Clicked on google play gift card");
        }

        if (isVisibleWithId("com.threesixteen.app:id/et_mobile")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_mobile");
            System.out.println("TC07- Clicked on box");
            clickAndWaitForElementWithId("com.google.android.gms:id/cancel");
            (driver).findElement(By.id("com.threesixteen.app:id/et_mobile")).sendKeys("8285655501");
            System.out.println("TC08- Typed a Mobile number");
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_btn");
            System.out.println("TC09- Click on continue");
            
        } 
        else
        {
            driver.navigate().back();
            System.out.println("TC10- This coupon is not Valid for mobile numbers");
           
        }
    }
    
   
    @Test(priority = 22)
     public void RedeemCouponCopy22() throws InterruptedException {

        OpenSideNav();

        String targetText = "Rewards";
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
        Thread.sleep(1000);  
//       
        clickAndWaitForElementWithXpath1("//android.widget.LinearLayout[@content-desc=\"Redeemed\"]");
        System.out.println("TC03- Redemmed section  open in Rewards");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
        System.out.println("TC04- clicked on copy button");

    }

    @Test(priority = 23)
    public void SideNavCouponPageTopCarousal23() throws InterruptedException {

        OpenSideNav();

        String targetText = "Rewards";
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
        Thread.sleep(1000);  
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView");
        System.out.println("TC04- Top carousal is working");
        Thread.sleep(1000);

    }

    @Test(priority = 24)
    public void SideNavBuyyPro24() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Pro\"]")) {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(@text,'Extend Pro')]")).click();
            System.out.println("TC02- Click onn Extend pro");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            System.out.println("TC03- Back from Extend pro");
            Thread.sleep(1000);
            OpenSideNav();

            clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
            System.out.println("TC05- opens self profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/pro_user_icon");
            System.out.println("TC06- Profile badges present on profile page");
        } else {
            driver.findElement(By.xpath("//*[contains(@text,'Buy Pro')]")).click();
            System.out.println("TC07- Click on Buy pro");
            Thread.sleep(2000);
            driver.navigate().back();
            System.out.println("TC08- Back from Buy pro");
            Thread.sleep(2000);
        }

    }

    @Test(priority = 25)
    public void SideNavRooterShop25() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        String targetText = "Rooter Shop";
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
        driver.navigate().back();
        System.out.println("TC03- Back from shop");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Data Saver')]")).click();
        System.out.println("TC05- Click on data saver");

    }

    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 26)

    public void ChangeCommunicationEmailId26() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        
	   	 MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
	     String communicationemail = ((WebElement) element).getText();
	     System.out.println("TC03- Initial communication email is " + communicationemail);
	        Thread.sleep(1000);
	  
	        if (communicationemail.equals("EFGH123@gmail.com"))
	     {
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comm_email");
        (driver).findElement(By.id("com.threesixteen.app:id/et_comm_email")).sendKeys("ABCD123@Gmail.com");
        System.out.println("TC04- changed communication email id is ABCD123@Gmail.com");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC05- click on done");
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC07- Click on Setting");
        Thread.sleep(2000);
        MobileElement element1 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
	     String communicationemail1 = ((WebElement) element1).getText();
	     System.out.println("TC08- Updated communication email is " + communicationemail1);  
	        Thread.sleep(1000);

	        if (communicationemail1.equals("ABCD123@Gmail.com"))
        {
            System.out.println("TC09- Communication Email id sucessfully updated");
        }
        else
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
            System.out.println("TC10- Communication Email id not updated");
        }
        
	     }
	     else
	     {
	        
	        clickAndWaitForElementWithId("com.threesixteen.app:id/et_comm_email");
	        (driver).findElement(By.id("com.threesixteen.app:id/et_comm_email")).sendKeys("EFGH123@gmail.com");
	        System.out.println("TC11- changed communication email id is EFGH123@gmail.com");
	        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
	        System.out.println("TC12- click on done");
	        OpenSideNav();

	        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
	        System.out.println("TC14- Click on Setting");
	        Thread.sleep(1000);
		   	 MobileElement element11 = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_comm_email"));
		     String communicationemail11 = ((WebElement) element11).getText();
		     System.out.println("TC15- Updated communication email is " + communicationemail11);   
		        Thread.sleep(1000);
	        if (communicationemail11.equals("EFGH123@gmail.com"))
	        {
	            System.out.println("TC16- Communication Email id sucessfully updated");
	        }
	        else
	        {
	            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
	            System.out.println("TC17- Communication Email id not updated");
	        }
	     }

      }
    
    

    
    @Test(priority = 27)

    public void SideNavCoinandDiamondlog29() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_diamonds");
        System.out.println("TC02- Opened Diamond log");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC03- Back Diamond log");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
	            "//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout[1]");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_coins");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
        System.out.println("TC05- Opened Coin log");
        Thread.sleep(1000);

    
    }
    
    
    @SuppressWarnings("unchecked")
	@Test(priority = 28)

    public void SidenNavcChangeContentlocaleTamil28() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)")); 
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on tamil video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
       
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);
        
        if (ContentLocale.equals("Tamil"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");
            Thread.sleep(1000);

        }
    }
    
    
    
    @Test(priority = 29)

    public void SidenNavcChangeContentlocaleTelugu29() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));  
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on telugu video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);

        if (ContentLocale.equals("Telugu"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
        	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    
    
    @Test(priority = 30)

    public void SidenNavcChangeContentlocaleBengali30() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));  
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Bengali video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);

        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);
        
        if (ContentLocale.equals("Bengali"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
    Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    @Test(priority = 31)

    public void SidenNavcChangeContentlocaleMarathi31() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Marathi video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);

        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        
        if (ContentLocale.equals("Marathi"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
    Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
	
    
    
    
    @Test(priority = 32)

    public void SidenNavcChangeContentlocaleKannda32() throws InterruptedException {

    	
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Kannda video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);
        
        if (ContentLocale.equals("Kannada"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
    Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    @Test(priority = 33)

    public void SidenNavcChangeContentlocaleHindi33() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)")); 
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_content_locale");
        
        System.out.println("TC03- Click on Content locale");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("TC04- Click on Hindi video");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
        System.out.println("TC05- click on done");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC06- click on done");
        Thread.sleep(1000);
        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC08- Click on Setting");
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));      
        Thread.sleep(1000);
        MobileElement element = (MobileElement) driver.findElement(By.id("com.threesixteen.app:id/et_content_locale"));
        String ContentLocale = ((WebElement) element).getText();
        System.out.println("TC09- Updated Content locale is " + ContentLocale);
        Thread.sleep(1000);

        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC10- click on done");
        Thread.sleep(1000);
        if (ContentLocale.equals("Hindi"))
        {
        
        	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
        	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
    	        System.out.println("TC01- Pro stream tab opened");
        	}
        	else
        	{
                clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
    	        System.out.println("TC01- Pro stream tab opened");
        	}   
    Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	System.out.println("TC12- stream opened");
	Thread.sleep(1000);
    
    }
        else
        	
        {
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_comment");
        	System.out.println("TC13- Content Locale not updated");

        }
    }
    
    
    
    
    @Test(priority = 34)

    public void SideNavAddsocialmedialinkYoutube34() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_youtube");
        (driver).findElement(By.id("com.threesixteen.app:id/et_youtube")).sendKeys("https://www.youtube.com/@Rooter");
        System.out.println("TC03- added Youtube link to profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC04- click on done");
        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC06- opens self profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_youtube");
        System.out.println("TC07- Click on Youtube icon");
        driver.findElement(By.xpath("//*[contains(@text,'Youtube')]")).click();
        System.out.println("TC08- Opoen Youtube");
        Thread.sleep(1000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
        System.out.println("TC03- Switched to PIP");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("TC10- Youtube link added sucessfully");

    }
    
    
    

    @Test(priority = 35)

    public void SideNavAddsocialmedialinkinstagram35() throws InterruptedException {

        OpenSideNav();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Setting')]")).click();
        System.out.println("TC02- Click on Setting");
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
        clickAndWaitForElementWithId("com.threesixteen.app:id/et_instagram");
        (driver).findElement(By.id("com.threesixteen.app:id/et_instagram")).sendKeys("123");
        System.out.println("TC03- added insta link to profile");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_save");
        System.out.println("TC04- click on done");
        OpenSideNav();

        clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
        System.out.println("TC06- opens self profile");
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.ImageView");
        System.out.println("TC07- Click on instagram icon");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[contains(@text,'Instagram')]")).click();
        System.out.println("TC08- Opoen instagram");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Close tab\"]");
        System.out.println("TC09- Close browser");
        Thread.sleep(1000);
        clickAndWaitForElementWithXpath1(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.ImageView");
        System.out.println("TC10- instagram link added sucessfully");
        Thread.sleep(1000);

    }
    
    
    
    
    
    @Test(priority = 36)
    public void day1buypro36() throws InterruptedException {

        OpenSideNav();
        String targetText = "Buy Pro";
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
        Thread.sleep(3000);  


//        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
//      System.out.println("TC03- click on buy button for 7 day");
//      Thread.sleep(3000);  

      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[1]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 1 day");
      Thread.sleep(3000);  
      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 1 day");
      Thread.sleep(3000);  
      
//    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//    System.out.println("TC03- click on continue");
//    Thread.sleep(3000);  

       
    }
    
    
    
    
    @Test(priority = 37)
    public void day7buypro37() throws InterruptedException {

        OpenSideNav();
        String targetText = "Buy Pro";
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
        Thread.sleep(3000);  


        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
      System.out.println("TC03- click on buy button for 7 day");
      Thread.sleep(3000);  

      
//    driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//    System.out.println("TC03- click on continue");
//    Thread.sleep(3000);  

       
    }
    
    
	
	@AfterMethod
	
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}



