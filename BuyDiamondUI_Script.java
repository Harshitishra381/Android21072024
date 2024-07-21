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

public class BuyDiamondUI_Script<MobileElement, Rotatable>  extends Functions{

//	public static void clickAndWaitForElementWithXpath1(final String xpath) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//			@Override
//			public Boolean apply(WebDriver arg0) {
//				try {
//					WebElement element = (driver).findElement(By.xpath(xpath));
//					element.click();
//					return true;
//				} catch (Exception e) {
//					return false;
//				}
//			}
//		};
//		wait.until(condition);
//	}
//
//	public static void clickAndWaitForElementWithId(final String id) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
//			@Override
//			public Boolean apply(WebDriver arg0) {
//				try {
//					WebElement element = (driver).findElement(By.id(id));
//
////				    	(driver).findElement(null);
//					element.click();
//					return true;
//				} catch (Exception e) {
//					return false;
//				}
//			}
//		};
//		wait.until(condition);
//	}
//
//	// Function for if else element
//
//	public static boolean isVisibleWithId(final String id) {
//		boolean isVisible;
//		isVisible = !driver.findElements(By.id(id)).isEmpty();
//		return isVisible;
//	}
//
//	public static boolean isVisibleWithXPath1(final String xPath) {
//		boolean isVisible;
//		isVisible = !driver.findElements(By.xpath(xPath)).isEmpty();
//		return isVisible;
//	}
	
	
//	 public void OpenSideNav() { 
//		    
//
//			if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
//			{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//			        System.out.println("TC01- open side nav from old homapage");
//			}
//			else
//			{
//			    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
//			    System.out.println("TC02- open side nav from New homapage");
//			}
//		    }
//	

//	static AppiumDriver driver;
//
//	private Capabilities cap;
//	private int index;
//
//	@BeforeMethod
//	public void setup2() throws MalformedURLException, InterruptedException {
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//		URL url = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url, cap);
//
//		DesiredCapabilities cap1 = new DesiredCapabilities();
//
////	     cap1.setCapability("deviceName", "RZ8T907T67Y");
//		cap.setCapability("deviceName", "13793294180004Z");
//		cap1.setCapability("platformName", "Android");
//		cap1.setCapability("platformVersion", "14");
////	    cap.setCapability("platformVersion", "12");
//		cap1.setCapability("appPackage", "com.threesixteen.app");
////       cap.setCapability("appPackage", "com.threesixteen.app.dev");
//		cap1.setCapability("appActivity", "com.threesixteen.app.ui.activities.SplashActivity");
//		cap1.setCapability("autoGrantPermissions", true);
//		cap1.setCapability("ignoreHiddenApiPolicyError", true);
//		cap1.setCapability("noReset", true);
//
//		URL url1 = new URL("http://127.0.0.1:4723/wd/hub/");
//		driver = new AndroidDriver(url1, cap1);
//
//		System.out.println("Application started");
//		Thread.sleep(3000);
//
//		if (isVisibleWithId("android:id/button2")) {
//			clickAndWaitForElementWithId("android:id/button2");
//			System.out.println("Click on close");
//		}
//
////		 clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
////		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
////			System.out.println("Gmail Login Done");
//
//		if (isVisibleWithXPath1(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button//android.")) {
//			clickAndWaitForElementWithXpath1(
//					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
//			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
////				    	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neg");
//			System.out.println("Spinwheel rotate");
//		}
//		if (isVisibleWithId("com.android.permissioncontroller:id/permission_allow_button")) {
//			clickAndWaitForElementWithId("com.android.permissioncontroller:id/permission_allow_button");
//			System.out.println("Notification permission allowed");
//
//		}
//		 if (isVisibleWithXPath1("//*[contains(@text,'Update')]"))  {
//	         
//	           driver.navigate().back();
//	            System.out.println("Exist from Update");
//	            Thread.sleep(1000);
//	       }
////
//	}
//
//	boolean isVisibleWithXpath1(String s) {
//
//		return false;
//	}
	
	

	@Test(priority = 1)
	public void SideNavigationDiamond1() throws InterruptedException {

		clickAndWaitForElementWithId("com.threesixteen.app:id/iv_profile_image");
		System.out.println("TC01- opens side nav");
		clickAndWaitForElementWithId("com.threesixteen.app:id/txt_diamonds");
		System.out.println("TC02- open Diamond history from side nav");
		driver.findElement(By.xpath("//*[contains(@text,'Received')]")).click();
		System.out.println("TC03- open Earned tab");
		driver.findElement(By.xpath("//*[contains(@text,'Spent')]")).click();
		System.out.println("TC04- Open spent tab");
		driver.findElement(By.xpath("//*[contains(@text,'Bought')]")).click();
		System.out.println("TC5- open Offer winnings");
		driver.findElement(By.xpath("//*[contains(@text,'Redeemed')]")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
//	 clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
		System.out.println("TC06- back from diamond log");

	}

	
	
	
	
	@Test(priority = 2)
	public void DiamondPurchase2() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
		System.out.println("TC03 -Openn diammond log");
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("TC04 -Back from diamond log diammond log");
	}
	
	
	
	

	@Test(priority = 3)
	public void Diamondpurchase3() throws InterruptedException {

		OpenSideNav();

		Thread.sleep(1000);
      String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC05 -Click on 10RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC06 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC07 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC08 -Click on paytm");
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC09 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC10 -Click on close");
	}

	@Test(priority = 4)

	public void DiamondPurchase4() throws InterruptedException {
	
		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC11 -Click on 29RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC12 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC13 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC14 -Click on paytm");
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC15 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC16 -Click on close");
	}

	@Test(priority = 5)
	public void DiamondPurchase5() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC17 -Click on 50RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC18 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC19 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC20 -Click on paytm");
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC21 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC22 -Click on close");
	}

	@Test(priority = 6)
	public void DiamondPurchase6() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		Thread.sleep(500);
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[5]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC23 -Click on 100RS Diamond card");
		Thread.sleep(500);
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC24 -Click on Buy now");
		Thread.sleep(500);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC25 -Click on continue");
		Thread.sleep(500);
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC26 -Click on paytm");
		Thread.sleep(500);
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC27 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC28 -Click on close");
	}

	@Test(priority = 7)
	public void DiamondPurchase7() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[6]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC29 -Click on 250RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC30 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC31 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC32 -Click on paytm");
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC33 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC34 -Click on close");
	}

	
	
	
	@Test(priority = 8)
	public void DiamondPurchase8() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(3)"));
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[7]/android.view.ViewGroup/android.widget.ImageView[1]");
		System.out.println("TC35 -Click on 500RS Diamond card");
		clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
		System.out.println("TC36 -Click on Buy now");
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
		System.out.println("TC37 -Click on continue");
		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
		System.out.println("TC38 -Click on paytm");
		driver.navigate().back();
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC39 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC40 -Click on close");

	}

	@Test(priority = 9)
	public void Diamond600Purchase9() throws InterruptedException {
		

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
	     	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
	    	if (isVisibleWithXPath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[8]/android.view.ViewGroup/android.widget.ImageView[1]")) {
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[8]/android.view.ViewGroup/android.widget.ImageView[1]");
			System.out.println("TC41 -Click on 600RS Diamond card");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
			System.out.println("TC42 -Click on Buy now");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC43 -Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
			System.out.println("TC44 -Click on paytm");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC45 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC46 -Click on close");
	}

	@Test(priority = 10)
	public void DiamondPurchase10() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		    clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
			System.out.println("TC47 -Click on 5RS Diamond card");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
			System.out.println("TC48 -Click on Buy now");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC49 -Click on continue");
			clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
			System.out.println("TC50 -Click on paytm");
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC51 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC52 -Click on close");
	}

	@Test(priority = 11)
	public void DiamondPurchaseGooglePurchase11() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
			System.out.println("TC47 -Click on 5RS Diamond card");
			clickAndWaitForElementWithId("com.threesixteen.app:id/btn_buy");
			System.out.println("TC48 -Click on Buy now");
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC49 -Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView");
			System.out.println("TC50 -Click on Google pay");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_neutral");
			Thread.sleep(1000);

//        clickAndWaitForElementWithId("net.one97.paytm:id/tv_yes");
//        System.out.println("TC51 -Click cancel payment");
//        clickAndWaitForElementWithId("com.threesixteen.app:id/btn_close");
//        System.out.println("TC52 -Click on close");
	}

	@Test(priority = 12)
	public void DiamondPageUICheck12() throws InterruptedException {

		OpenSideNav();
		Thread.sleep(1000);
		 String targetText = "Buy Diamonds";
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
		clickAndWaitForElementWithId("com.threesixteen.app:id/purchase_history_cta");
		System.out.println("TC03 - Click on Dimaond purchase history");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_coins");
		System.out.println("TC04 - Diamond count is coming Dimaond purchase history");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_title");
		System.out.println("TC05 - Purchase history is coming Dimaond purchase history");
		Thread.sleep(1000);
		if (isVisibleWithXPath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button")) {
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
			System.out.println("TC06 - Click on Retry in Dimaond purchase history");
			Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_proceed_dcd");
			System.out.println("TC07 - Click on continue");
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView");
			Thread.sleep(1000);
			driver.navigate().back();
			System.out.println("TC08 - Back from paytm page");
			Thread.sleep(1000);
		}
		driver.navigate().back();
		System.out.println("TC09 - Back from purchase history page");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_gems");
		System.out.println("TC10 -Open diamond log ");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_title");
		System.out.println("TC11 - Diamond History page title is visible ");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/textView30");
		System.out.println("TC12 - Current balance title is visible");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/ic_currency");
		System.out.println("TC13 - Diamond icon is visible");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_user_coins");
		System.out.println("TC14 - Diamond count is coming");
		Thread.sleep(1000);

		if (isVisibleWithId("com.threesixteen.app:id/btn_earn_more")) {
			clickAndWaitForElementWithXpath1(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
			System.out.println("TC15 - Purchase title is coming");
			Thread.sleep(1000);
		}

		clickAndWaitForElementWithXpath1(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]");
		System.out.println("TC16 - Order Id is coming");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
		System.out.println("TC17 - Clciked on Back");

	}

	
	@AfterMethod

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
