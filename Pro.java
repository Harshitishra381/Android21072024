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
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Pro extends Functions  {


	
	

    @Test(priority = 01)
    public void ProBagesTet01() throws InterruptedException 
{
    	
    
			if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
			{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
			        System.out.println("TC01- open side nav from old homapage");
			}
			else
			{
			    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
			    System.out.println("TC02- open side nav from New homapage");
			}
        
        if (isVisibleWithXPath1("//android.widget.ImageView[@content-desc=\"Pro\"]")) {
            System.out.println("TC03- Pro badges is visible");
            driver.findElement(By.xpath("//*[contains(@text,'Extend Pro')]")).click();
           System.out.println("TC04- Click onn Extend pro");
            clickAndWaitForElementWithId("com.threesixteen.app:id/web_view");
            System.out.println("TC05- Web view is visible");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();
            System.out.println("TC06- Back from Extend pro");
            Thread.sleep(2000);
            if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView"))
			{   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
			        System.out.println("TC07- open side nav from old homapage");
			}
			else
			{
			    clickAndWaitForElementWithId("com.threesixteen.app:id/layout_nav_profile");
			    System.out.println("TC08- open side nav from New homapage");
			
			}
                clickAndWaitForElementWithId("com.threesixteen.app:id/txt_name");
                System.out.println("TC09- opens self profile");
                clickAndWaitForElementWithId("com.threesixteen.app:id/pro_user_icon");
                System.out.println("TC10- Profile badges present on profile page");
        }
      else
        {
            driver.findElement(By.xpath("//*[contains(@text,'Buy Pro')]")).click();
            System.out.println("TC11- Click on Buy pro");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/web_view");
            System.out.println("TC12- Web view is visible");


            
        }
      System.out.println("TC13- Profile badges test pass");

    	 }
            
    

    
    @Test(priority = 02)
    
    
    public void ProStreamComment02() throws InterruptedException 
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
	        System.out.println("TC02- opened feed");
            clickAndWaitForElementWithId("com.threesixteen.app:id/et_comment_collapsed");
            System.out.println("TC03- clicked comment section.....");
            if (isVisibleWithId("com.threesixteen.app:id/et_comment"))
            {
            (driver).findElement(By.id("com.threesixteen.app:id/et_comment")).sendKeys("Hi");
            System.out.println("TC04- Typed Hi comment section.....");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post");
            System.out.println("TC05- Send the  comment on live stream");
            }
            else
            {
                System.out.println("TC05- Only followers comment allowed");

            }
        }
    
   
    
    
    @Test(priority = 03)
    
    public void ProCreatorTagoProfileTest03() throws InterruptedException, MalformedURLException 
{


    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("lidoma");
        System.out.println("TC03- Type lidoma in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC05- open Lidoma profile");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC06- pro creator tag is coming");

    }
    
    
    
    @Test(priority = 04)
    
    public void ProCreatorlist04() throws InterruptedException, MalformedURLException 
{


    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_view_all");
        System.out.println("TC03- open pro creator list");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
        System.out.println("TC04- open profile from pro cerartor list");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator(
              "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
        System.out.println("TC05- List scrolled");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView");
        System.out.println("TC06- open profile from pro cerartor list");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("TC07- Back from list");

    }
 
    
    
    
    @Test(priority = 05)
        public void ProStreamOpenedFanRank5() throws InterruptedException, MalformedURLException 
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
        System.out.println("TC02- opened feed");
        Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/live_rew"))
        {
  		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
  		System.out.println("TC03-  stream Backwarded");
   		Thread.sleep(1000);
        }
        else
        {
       		Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
       		if (isVisibleWithId("com.threesixteen.app:id/live_rew"))
            {
      		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
      		System.out.println("TC03-  stream Backwarded in 2nd time");
       		Thread.sleep(1000);
            }

        }
   		Thread.sleep(7000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
        System.out.println("TC04- Exist from Live chat");
        if (isVisibleWithId("com.threesixteen.app:id/layout_fan_rank")) {
            clickAndWaitForElementWithId("com.threesixteen.app:id/layout_fan_rank");
            System.out.println("TC05- Open Fan Rank live session");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
            System.out.println("TC05- Open 1st Fan Rank userprofile");
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_open_profile");
            System.out.println("TC06- Creators Profile opened in full view");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_back");
            System.out.println("TC07- Back from creators profile");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_refresh");
            System.out.println("TC10- Refresh  the Fan rank");
            System.out.println("TC11- Scrolling Fan rank");
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
            clickAndWaitForElementWithId("com.threesixteen.app:id/tv_winning");
            System.out.println("TC12- Click on Winnings");
            Thread.sleep(1000);
            driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_info_button");
            System.out.println("TC13- Click on Eye button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/btn_continue");
            System.out.println("TC14- Click on Close button");
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
            System.out.println("TC15- Exist from Fan Rank");
        }
        else
        {
            System.out.println("TC16-  Fan Rank not enable for this stream");

        }
    	
    }
    
    
    
    
    
    @Test(priority = 06)
    
    
    public void Protabliveplayerrortate06() throws InterruptedException 
{	     
    	
    	Thread.sleep(1000);
    	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
    	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
	        System.out.println("TC01- Pro stream tab opened");
    	}
    	else
    	{
            clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
	        System.out.println("TC01- Pro stream tab opened");
    	}   
	    Thread.sleep(2000);
	    if(isVisibleWithId("com.threesixteen.app:id/layout_comment")) {
        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
        System.out.println("TC02- opened stream");
        }
         else
        {
    	 clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
         System.out.println("TC02- opened stream");
         }
        Thread.sleep(7000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC03- Mini player  send to Full screen");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC04- Player rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC05- Player rotate to portrait");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC06- Player rotate to landscape");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
        System.out.println("TC07- Player rotate to portrait");
		Thread.sleep(1000);

        


    }
    
     
    
    @Test(priority = 07)
    
    public void FreePreviewTimerForPro07() throws InterruptedException 

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
					Thread.sleep(2000);

		    	 if(isVisibleWithId("com.threesixteen.app:id/layout_comment")) {
		    	        clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
		    	        System.out.println("TC02- opened stream");
		    	        }
		    	         else
		    	        {
		    	    	 clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
		    	         System.out.println("TC02- opened stream");
		    	         }
				Thread.sleep(7000);
				if (isVisibleWithId("com.threesixteen.app:id/tv_timer_fls")) 
				{
				clickAndWaitForElementWithId("com.threesixteen.app:id/tv_timer_fls");
				System.out.println("TC03- Free review timer is working");
				clickAndWaitForElementWithId("com.threesixteen.app:id/web_view");
				}
				else
				{
					System.out.println("TC04- Pro user not seeing free preview");

				}
				}
    
    
    
    

    @Test(priority = 8)
    
    public void ProCreatorTagOnJonthanTest08() throws InterruptedException, MalformedURLException 
{


    	OpenSearch();
        clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
        (driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("jonathan");
        System.out.println("TC03- Type jonathan in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
        System.out.println("TC05- open Jonathan profile");
        clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC06- pro creator tag is coming");
        
    }
    
    
    
    
    @Test(priority = 9)
    
	public void ProRecordedStreamForProUsers9() throws InterruptedException, MalformedURLException 
{
		
    	OpenSearch();
      clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
        System.out.println("TC02- Click on search box");
   		Thread.sleep(1000);
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zainab");
		System.out.println("TC03- Type Zainab in search");
		 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	   		System.out.println("TC04- Click on ENTER");
	   		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Zainab's profile");
		Thread.sleep(1000);
		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
        System.out.println("TC06- pro creator tag is coming");
   		Thread.sleep(1000);
        driver.navigate().back();
   		Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Zainab's profile");
		Thread.sleep(1000);
        if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
        {
    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
			System.out.println("TC07- open recorded stream");
        Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
		System.out.println("TC08- stream duration is visible");
        Thread.sleep(7000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
		System.out.println("TC09- stream forwarded");
	   }
    else 
    {
    	driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));	
    	 if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
         {
         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
 	   	System.out.println("TC10- open recorded stream");
         Thread.sleep(7000);
         }
    }
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
 		System.out.println("TC11- stream exo duration is visible");
        Thread.sleep(7000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_position");
 		System.out.println("TC12- stream exo Position is visible");
         Thread.sleep(7000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
 		System.out.println("TC13- recorded stream forwarded");
 		 Thread.sleep(7000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
  		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
  		System.out.println("TC14- recorded stream Backwarded");
	  	System.out.println("TC15- Pro recorded stream playing for pro users");
 	   }
        
    
 
    @Test(priority = 11)
    
   	public void MidtioerRecordedStreamForProUsers11() throws InterruptedException, MalformedURLException 
      {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Mr WolF");
   		System.out.println("TC03- Type Mr wolf in search");
   		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
        Thread.sleep(2000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open wolf's profile");
        Thread.sleep(1000);
           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
           {
       		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
   			System.out.println("TC06- open recorded stream");
           Thread.sleep(7000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
   		System.out.println("TC07- stream duration is visible");
           Thread.sleep(7000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
   		System.out.println("TC08- stream forwarded");
   	   }
       else 
       {
       	driver.findElement(
   				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
       	 if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
            {
            clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
    	   	System.out.println("TC09- open recorded stream");
            }
       }
           Thread.sleep(7000);
    		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
    		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_duration");
    		System.out.println("TC10- stream exo duration is visible");
           Thread.sleep(7000);
    		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
    		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_position");
    		System.out.println("TC11- stream exo Position is visible");
            Thread.sleep(7000);
    		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
    		clickAndWaitForElementWithId("com.threesixteen.app:id/live_ffwd");
    		System.out.println("TC12- recorded stream forwarded");
    		 Thread.sleep(7000);
     		clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
     		clickAndWaitForElementWithId("com.threesixteen.app:id/live_rew");
     		System.out.println("TC13- recorded stream Backwarded");
   	  		System.out.println("TC14- Pro recorded stream playing for pro users");
    	   }
           
    
    
    
    
    @Test(priority = 12)
	public void RegaltosRecordedStreamPro12() throws InterruptedException, MalformedURLException 
   {
		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
		System.out.println("TC03- Type regaltos in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open regaltos's profile");
        Thread.sleep(1000);
        MuteRecordedStream();       
         }
    

    
    
    @Test(priority = 13)
    
	public void SoulZerefRecordedStreamPro13() throws InterruptedException, MalformedURLException 
{
		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zeref");
		System.out.println("TC03- Type Zeref in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
		Thread.sleep(2000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open zeref's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
    }
    
    
    
    @Test(priority = 14)
 	public void Bit8GoldyRecordedStreamPro14() throws InterruptedException, MalformedURLException
      {
		
    	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit Goldy");
		System.out.println("TC03- Type 8bit goldy in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open goldy's profile");
        Thread.sleep(1000);
        MuteRecordedStream();

    }
        
    
    
    @Test(priority = 15)
    
   	public void ScoutOPRecordedStreamPro15() throws InterruptedException, MalformedURLException
    {
 
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("sc0ut op");
   		System.out.println("TC03- Type scout in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open scout op's profile");
   		Thread.sleep(1000);
        MuteRecordedStream();
   		Thread.sleep(1000);

       }
    
    
    
    @Test(priority = 16)
   	public void Mamba8bitRecordedstreamPro16() throws InterruptedException, MalformedURLException 
   {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8 bit mamba");
   		System.out.println("TC03- Type 8bit mamba in search");
   		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open mamba's profile");
   		Thread.sleep(1000);
   		MuteRecordedStream();

       }
    
    
    
    @Test(priority = 17)
    
   	public void Rusherw0w8bitRecordedstreampro17() throws InterruptedException, MalformedURLException
   {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit rusherwow");
   		System.out.println("TC03- Type 8bit rusherwow in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bit rusherwow's profile");
   		Thread.sleep(1000);
          MuteRecordedStream();
       }
    
    
    
    @Test(priority = 18)
    
   	public void Binks698bitRecordedStreamPro18() throws InterruptedException, MalformedURLException
  {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("bink 8bit");
   		System.out.println("TC03- Type 8bit Binks 69 in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bit binks's profile");
           Thread.sleep(1000);
          MuteRecordedStream();
       }
    
    
   
    @Test(priority = 19)
    
   	public void SoulViperRecordedStreamPro19() throws InterruptedException, MalformedURLException 
 {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SouL Viper");
   		System.out.println("TC03- Type soul viper in search");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open viper's profile");
   		Thread.sleep(1000);
         MuteRecordedStream();
          
       }
    
    
    
    @Test(priority = 20)
    
   	public void SoulSidRecordedStreamPro20() throws InterruptedException, MalformedURLException 
  {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SouL sid");
   		System.out.println("TC03- Type soul sid in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open sid's profile");
           Thread.sleep(1000);
          MuteRecordedStream();
       }
    
    
    
    
    @Test(priority = 21)
   	public void SoulOxyRecordedStreamPro21() throws InterruptedException, MalformedURLException 
   {
   		
    	OpenSearch();
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		Thread.sleep(1000);
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("soul oxy");
   		System.out.println("TC03- Type soul oxy in search");
   		Thread.sleep(1000);
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   		Thread.sleep(1000);
   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open oxy's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
       }
    
      
    
    @Test(priority = 22)
    
   	public void HeadFlicker8bitRecordedStreamPro22() throws InterruptedException, MalformedURLException 
   {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit headflicker");
   		System.out.println("TC03- Type 8bitHeadFlicker in search");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");   		
	    Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open 8bitheadflicker's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
       }
    
    
    
    @Test(priority = 23)
   	public void RAESportsRecordedStreamPro22() throws InterruptedException, MalformedURLException 
  {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RA esports");
   		System.out.println("TC03- Type RA esports in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open RA sports's profile");
           Thread.sleep(1000);
          MuteRecordedStream();
       }
    
    
    
    
    @Test(priority = 24)
    
   	public void RAWSOMERecordedstreampro24() throws InterruptedException, MalformedURLException 
   {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Rawsome");
   		System.out.println("TC03- Type Rawsome in search");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open Rawsome's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
       }
    
    
    
    
    @Test(priority = 25)
   	public void ZainabRecordedStreamPro25() throws InterruptedException, MalformedURLException 
   {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Zainab");
   		System.out.println("TC03- Type Zainab in search");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
   	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open ZAINAB's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
       }
    
    
    
    
    @Test(priority = 26)
    
   	public void Mafia8BitRecordedStreamPro26() throws InterruptedException, MalformedURLException 
 {
   		
    	OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit mafia");
   		System.out.println("TC03- Type 8bit mafia in search");
   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
   		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open MAFIA's profile");
        Thread.sleep(1000);
        MuteRecordedStream();
       }
    
    
    
//    @Test(priority = 27)
//   	public void RecordedStreamQlityChange27() throws InterruptedException, MalformedURLException 
// {
//   		
//   		clickAndWaitForElementWithXpath1(
//   		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//   		System.out.println("TC01- Open Search");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//   		System.out.println("TC02- Click on search box");
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("RA esports");
//   		System.out.println("TC03- Type RA esports in search");
//   	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		System.out.println("TC04- Click on serach button");
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//   		System.out.println("TC05- open RA sports's profile");
//        Thread.sleep(1000);
//           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
//	        {
//	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//				System.out.println("TC06- open recorded stream");
//	        Thread.sleep(10000);
//            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//    		clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//			System.out.println("TC06- Exo paused");
//	        Thread.sleep(10000);
//	          ExoQualityChange();
//
//	        }
//           else
//           {
//        	   driver.findElement(
//						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//		        Thread.sleep(1000);
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//		 	   	System.out.println("TC08- open recorded stream");
//		         Thread.sleep(10000);
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//		    		clickAndWaitForElementWithXpath1("//android.widget.ImageButton[@content-desc=\"Pause\"]");
//					System.out.println("TC06- Exo paused");
//			        Thread.sleep(10000);
//          ExoQualityChange();
//           }
//       }
 
 
 
// @Test(priority = 28)
//   	public void RecordedstreamRotate28() throws InterruptedException, MalformedURLException 
//   	
//   {
//		
//   		clickAndWaitForElementWithXpath1(
//   		"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
//   		System.out.println("TC01- Open Search");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//   		System.out.println("TC02- Click on search box");
//   		Thread.sleep(1000);
//   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
//   		System.out.println("TC03- Type Regaltos in search");
//   		Thread.sleep(1000);
//    	 driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//		System.out.println("TC04- Click on serach button");
//   		Thread.sleep(1000);
//   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//   		System.out.println("TC05- open RA sports's profile");
//   		Thread.sleep(1000);
//           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
//	        {
//	    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//				System.out.println("TC06- open recorded stream");
//
//	        }
//           else
//           {
//        	   driver.findElement(
//						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
//		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//		 	   	System.out.println("TC08- open recorded stream");
//
//           }
//	        Thread.sleep(10000);
//          ExoRotate();
//       }
 
 
 
 @Test(priority = 29)
   	public void RecordedstreamUIcheck29() throws InterruptedException, MalformedURLException 
  {
 
		
	        OpenSearch();
			clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
			System.out.println("TC02- Click on search box");
	         Thread.sleep(1000);
			(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Regaltos");
			System.out.println("TC03- Type regaltos in search");
	         Thread.sleep(1000);
			driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
				System.out.println("TC04- Click on serach button");
		         Thread.sleep(1000);
			clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
			System.out.println("TC05- open regaltos's profile");
	         Thread.sleep(1000);
	           if (isVisibleWithId("com.threesixteen.app:id/replay_tag"))
		        {
		    		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
					System.out.println("TC06- open recorded stream");
		        Thread.sleep(1000);}
		  
			  else 
				
		    {
		    	driver.findElement(
						AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));	
		         clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
		         Thread.sleep(1000);
		 	   	System.out.println("TC08- open recorded stream");
		         Thread.sleep(1000);
		    }
		         Thread.sleep(4000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
		            System.out.println("TC09- time watching data is coming from backkend for stream");
			         Thread.sleep(1000);
			clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView");
	         Thread.sleep(1000);
			clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView");
            System.out.println("TC10- Game Name and language coming ");
	         Thread.sleep(1000);
	         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_time_and_watching");
	            System.out.println("TC11- Follower count is Visible on recorded stream page");
		         Thread.sleep(1000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
		         Thread.sleep(1000);
		         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_follow");
		            System.out.println("TC12- Folow and unfolow working fine");
			         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_support");
			            System.out.println("TC13- Likes count coming from BE");
				         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_shares");
				            System.out.println("TC14- Share count coming from BE");
					        Thread.sleep(1000);
				            driver.navigate().back();
					        Thread.sleep(1000);
					         clickAndWaitForElementWithId("com.threesixteen.app:id/tv_num_comment");
					            System.out.println("TC15- Comment count coming from BE");


	         }

 
//     @Test(priority = 30)
// 
//		 public void liveplayerPIP30() throws InterruptedException 
//		{
//		
//				 if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
//			            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//			            System.out.println("TC01- Pro stream opened"); 
//			          
//			        } 
//			        else 
//			        {
//			 	        driver.findElement(By.xpath("//*[contains(@text,'Following')]")).click();
//			            System.out.println("TC01- Following tab opened");
//			        }
//				 
//		     clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
//		     System.out.println("TC02- opened stream");
//		     Thread.sleep(10000);
//		     ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//             Thread.sleep(5000);
//         
//         clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//         Thread.sleep(5000);
//     
//     System.out.println("F--> PIP switch done 10 times");
//     Thread.sleep(2000);
//		     PIPSwitch();
//		     driver.navigate().back();
//	         Thread.sleep(1000);
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//	         System.out.println("TC08- Mini player paused & send to Full screen");
//	         Thread.sleep(10000);
//	         clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	         if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	            System.out.println("TC11- UnMute the Stream");
//	        }
//	         else 
//	        {
//	            driver.navigate().back();
//	            Thread.sleep(1000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
//	            System.out.println("TC12- Mini player paused & send to Full screen");
//	            Thread.sleep(7000);
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
//	            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
//	            System.out.println("TC13- UnMute the Stream");
//	            Thread.sleep(1000);
//	        }
//		 }
 
 
 
     @Test(priority = 31)
  	public void BitRebelRecordedStreamPro31() throws InterruptedException, MalformedURLException
       {
 		
    	 OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("8bit Rebel");
 		System.out.println("TC03- Type 8bit Rebel in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    		System.out.println("TC04- Click on ENTER");	
     		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Rebel's profile");
         Thread.sleep(1000);
         MuteRecordedStream();

     }

     
     
     @Test(priority = 32)
   	public void KeizerRecordedStreamPro32() throws InterruptedException, MalformedURLException
        {
  		
    	 OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Keizer");
  		System.out.println("TC03- Type Kaizer in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     		System.out.println("TC04- Click on ENTER");		
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open keizer's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

      }
     
     
     
     
     @Test(priority = 33)
    	public void UpthrustEsportsRecordedStreamPro33() throws InterruptedException, MalformedURLException 
    {
    		
    	 OpenSearch();
    		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
    		System.out.println("TC02- Click on search box");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Upthrust Esports");
    		System.out.println("TC03- Type Upthrust Esports in search");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
    	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on serach button");
    		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    		System.out.println("TC05- open uphtust's profile");
         Thread.sleep(1000);
         MuteRecordedStream();
        }
     
     
     
     
     
     @Test(priority = 34)
 	public void GamersFleetRecordedStreamPro34() throws InterruptedException, MalformedURLException 
 {
 		
    	 OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("GamersFleet");
 		System.out.println("TC03- Type GamersFleet in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open Gamersfleet's profile");
      Thread.sleep(1000);
      MuteRecordedStream();
     }
    
     
     
     @Test(priority = 35)
   	public void nightmmareesportsRecordedStreamPro35() throws InterruptedException, MalformedURLException
        {
  		
    	 OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("NIGHTMARE ESPORTS");
  		System.out.println("TC03- Type NIGHTMARE ESPORTS in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     		System.out.println("TC04- Click on ENTER");	
      		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open NIGHTMARE ESPORTS's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

      }
  
     
     
     @Test(priority = 36)
    	public void LidomaAsiaBahasaRecordedStreamTest36() throws InterruptedException, MalformedURLException 
    {
    		
    	 OpenSearch();
    		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
    		System.out.println("TC02- Click on search box");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lidoma Asia | Bahasa");
    		System.out.println("TC03- Type Lidoma Asia bahasa in search");
    		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
    	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on serach button");
    		Thread.sleep(1000);
    		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
    		System.out.println("TC05- open lidoma's profile");
         Thread.sleep(1000);
         MuteRecordedStream();
        }
     
     
     
     
     @Test(priority = 37)
 	public void LidomaAsiaRecordedStreamTest37() throws InterruptedException, MalformedURLException 
 {
 		
    	 OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lidoma Asia ");
 		System.out.println("TC03- Type Lidoma Asia in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	     driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open lidoma's profile");
      Thread.sleep(1000);
      MuteRecordedStream();
     }
     
     
     
     @Test(priority = 38)
   	public void PitajiplayzRecordedStreamPro38() throws InterruptedException, MalformedURLException
        {
  		
    	 OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Pitaji Playz");
  		System.out.println("TC03- Type Pitaji Playz in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     		System.out.println("TC04- Click on ENTER");	
      		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open pitaji's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

      }
     
     
     
     @Test(priority = 39)
   	public void IGRIRecordedStreamPro39() throws InterruptedException, MalformedURLException
        {
  		
    	 OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("IGRI");
  		System.out.println("TC03- Type IGRI in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
     		System.out.println("TC04- Click on ENTER");	
      		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open IGRI's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

      }
     
     
     @Test(priority = 40)
    	public void kaztroRecordedStreamPro40() throws InterruptedException, MalformedURLException
         {
   		
    	 OpenSearch();
   		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
   		System.out.println("TC02- Click on search box");
   		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("kaztro");
   		System.out.println("TC03- Type kaztro in search");
   		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
      		System.out.println("TC04- Click on ENTER");	
       		Thread.sleep(1000);
   		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
   		System.out.println("TC05- open kaztro's profile");
           Thread.sleep(1000);
           MuteRecordedStream();

       }
     
     
     
     @Test(priority = 41)
 	public void DemondproXRecordedStreamPro41() throws InterruptedException, MalformedURLException
      {
		
    	 OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("DemondproX Gaming");
		System.out.println("TC03- Type DemondproX Gaming in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
   		System.out.println("TC04- Click on ENTER");	
    		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open DemondproX Gaming profile");
        Thread.sleep(1000);
        MuteRecordedStream();

    }
     
     
     
     
     @Test(priority = 42)
     
     
     public void ProStreamPIP42() throws InterruptedException 
     
     
     
    {	      
     	   Thread.sleep(3000);
     	   
       	if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button"))
       	{ clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
   	        System.out.println("TC01- Pro stream tab opened");
       	}
       	else
       	{
               clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
   	        System.out.println("TC01- Pro stream tab opened");

       	}
      	
 		 if (isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	        System.out.println("TC02- opened feed");
 	        Thread.sleep(7000);	 
 		 }
 		 else
 		 {
 		    driver.findElement(AppiumBy.androidUIAutomator(
 	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)")); 
 		  if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	        System.out.println("TC03- opened feed");
 	 	        Thread.sleep(7000);
 		  }
 	 	        else
 	 	        {
 	 	        	driver.findElement(AppiumBy.androidUIAutomator(
 	 	 	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	        	if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	    			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	    	        System.out.println("TC04- opened feed");
 	 	    	        Thread.sleep(7000);	 
 	 	    		 }
 	 	    		 else
 	 	    		 {
 	 	    		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	    	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	    		  if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	      			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	      	        System.out.println("TC05- opened feed");
 	 	      	        Thread.sleep(7000);	 
 	 	      		 }
 	 	      		 else
 	 	      		 {
 	 	      		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	      	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	      		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	    			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	    	        System.out.println("TC06- opened feed");
 	 	    	        Thread.sleep(7000);	 
 	 	    		 }
 	 	    		 else
 	 	    		 {
 	 	    		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	    	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	      	if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	  	        System.out.println("TC07- opened feed");
 	 	  	        Thread.sleep(7000);	 
 	 	  		 }
 	 	  		 else
 	 	  		 {
 	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	  	        System.out.println("TC08- opened feed");
 	 	  	        Thread.sleep(7000);	 
 	 	  		 }
 	 	  		 else
 	 	  		 {
 	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	  	        System.out.println("TC09- opened feed");
 	 	  	        Thread.sleep(7000);	 
 	 	  		 }
 	 	  		 else
 	 	  		 {
 	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	  	        System.out.println("TC10- opened feed");
 	 	  	        Thread.sleep(7000);	 
 	 	  		 }
 	 	  		 else
 	 	  		 {
 	 	  		    driver.findElement(AppiumBy.androidUIAutomator(
 	 	  	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
 	 	  		if(isVisibleWithId("com.threesixteen.app:id/stream_tier_tag")) {		 
 	 	  			clickAndWaitForElementWithId("com.threesixteen.app:id/stream_tier_tag");
 	 	  	        System.out.println("TC11- opened feed");
 	 	  	        Thread.sleep(7000);	 
 	 	  		 }
 	 	  		 else
 	 	  		 {
  	        System.out.println("TC12- Can not find Pro stream Right Now so Mid Tier stream opened");
  	      driver.findElement(AppiumBy.androidUIAutomator(
	               "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(4)"));
  	      clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	        System.out.println("TC04- opened feed");
 	        Thread.sleep(7000);	 
 		           }
 	 	  		 }
 	 	       }
 	 	 	 }
 	 	   }
 	 	 }
 	   }
     }
   }
 }
 
     
// 		PIPSwitch();
         Thread.sleep(5000);
 		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
        Thread.sleep(5000);
        System.out.println("TC13- Presseed Home button on handset");
       clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
       System.out.println("TC14- Switch to full screen from PIP");

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(1000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
        clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
        System.out.println("TC15- Mini player paused & send to Full screen");
        Thread.sleep(10000);
        clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
        if (isVisibleWithId("com.threesixteen.app:id/iv_volume")) {
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
           System.out.println("TC17- UnMute the video");
       } else {
           driver.navigate().back();
           Thread.sleep(2000);
           clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
           clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
           System.out.println("TC18- Mini player paused & send to Full screen");
           Thread.sleep(7000);
           clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
           clickAndWaitForElementWithId("com.threesixteen.app:id/iv_volume");
           System.out.println("TC19- UnMute the video");
           Thread.sleep(1000);
       }
 		 }
   
 		
     
     
     
 			 
      @Test(priority = 43)
     	public void SIGIRecordedStreamPro43() throws InterruptedException, MalformedURLException
       {
 		
 		OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SIGI-South India GTA Invitational");
 		System.out.println("TC03- Type SIGI-South India GTA Invitational in search");
 		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    		System.out.println("TC04- Click on ENTER");		
 		Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open SIGI's profile");
         Thread.sleep(1000);
         MuteRecordedStream();

     }
      
      
      
      @Test(priority = 44)
    	public void FEARLESSESPORTSRecordedStreamPro44() throws InterruptedException, MalformedURLException
     {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("FEARLESS ESPORTS");
		System.out.println("TC03- Type FEARLESS ESPORTS in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open FEARLESS ESPORTS's profile");
       Thread.sleep(1000);
       MuteRecordedStream();

   }

      
      
      @Test(priority = 45)
  	public void UltraOPRecordedStreamPro45() throws InterruptedException, MalformedURLException
   {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Ultra OP");
		System.out.println("TC03- Type ULTRA OP in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open ULTRA OP's profile");
     Thread.sleep(1000);
     MuteRecordedStream();

 }
      
      
      
      
      @Test(priority = 46)
    	public void AdenRecordedStreamPro46() throws InterruptedException, MalformedURLException
     {
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("AdEn");
  		System.out.println("TC03- Type AdEn in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open AdEn's profile");
       Thread.sleep(1000);
       MuteRecordedStream();

   }
     
      
      
      @Test(priority = 47)
  	public void GAmingPUJARecordedStreamPro47() throws InterruptedException, MalformedURLException
   {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Gaming PUJA");
		System.out.println("TC03- Type AdEn in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Gaming with PUJA's profile");
     Thread.sleep(1000);
     MuteRecordedStream();

 }
     
      
      
      
      @Test(priority = 48)
    	public void FBDJAATGAMERRecordedStreamPro48() throws InterruptedException, MalformedURLException
     {
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Jaat Gamer");
  		System.out.println("TC03- Type AdEn in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open FBD Jaat Gamer's profile");
       Thread.sleep(1000);
       MuteRecordedStream();

   }
      
      
      
      
      
      @Test(priority = 49)
  	public void RepublicArmyRecordedStreamPro49() throws InterruptedException, MalformedURLException
   {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Republic Army");
		System.out.println("TC03- Type Republic Army in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Republic Army's profile");
        Thread.sleep(1000);
        MuteRecordedStream();

 }
      
      
      
      @Test(priority = 50)
    	public void LuciferSauravRecordedStreamPro50() throws InterruptedException, MalformedURLException
     {
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Lucifer SaUrav");
  		System.out.println("TC03- Type Lucifer SaUrav in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open Lucifer SaUrav's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

   }
      
      
      
      @Test(priority = 51)
  	public void IYDLazyRecordedStreamPro51() throws InterruptedException, MalformedURLException
   {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("iYD LAZY");
		System.out.println("TC03- Type iYD LAZY in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open iYD LAZY's profile");
        Thread.sleep(1000);
        MuteRecordedStream();

 }
        
      
      
      @Test(priority = 52)
    	public void SuRYanShExDRecordedStreamPro52() throws InterruptedException, MalformedURLException
     {
  		
   		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("SuRYanSh ExD");
  		System.out.println("TC03- Type SuRYanSh ExD in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open SuRYanSh ExD's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

   }
      
      
      
      
      @Test(priority = 53)
      public void livestreamGiftstickerINLANDSCAPE53() throws InterruptedException {
    	  
          Thread.sleep(2000);
          if (isVisibleWithXPath1(
                  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button")) {
              clickAndWaitForElementWithXpath1(
                      "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
              System.out.println("TC01- Pro stream opened");
          } else {
              driver.findElement(By.xpath("//*[contains(@text,'Pro Streams')]")).click();
              System.out.println("TC02- pro tab opened");
          }
          if (isVisibleWithId("com.threesixteen.app:id/iv_post_support")) {
              clickAndWaitForElementWithId("com.threesixteen.app:id/iv_post_support");
              System.out.println("TC03- Like session");
          }
	        clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
          System.out.println("TC04- Open stream ");
          Thread.sleep(1000);
          
          driver.navigate().back();
          Thread.sleep(1000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
          clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
          System.out.println("TC02- Mini player  send to Full screen");
          Thread.sleep(5000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
          System.out.println("TC03- Player rotate to landscape");
          Thread.sleep(3000);
          
          if (isVisibleWithXPath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
          { clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]");
          System.out.println("TC05- Open first gift stiker");
          Thread.sleep(1000);

          clickAndWaitForElementWithId(
                  "com.threesixteen.app:id/tv_gems");
          System.out.println("TC06- Open Dimaond log");

          Thread.sleep(1000);
          driver.navigate().back();
          System.out.println("TC07- Exist from Dimaond log");

          Thread.sleep(1000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_close");
          System.out.println("TC08- Exist from gift sticker");
          }

          driver.findElement(AppiumBy.androidUIAutomator(
                  "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
          System.out.println("TC09- scroll gift stickers");

          driver.findElement(AppiumBy.androidUIAutomator(
                  "new UiScrollable(new UiSelector().resourceId(\"com.threesixteen.app:id/stickers_rv\")).setAsHorizontalList().scrollForward()"));
          System.out.println("TC10- scroll gift stickers Again");
          
          if (isVisibleWithId("com.threesixteen.app:id/emote_layout")) {
              clickAndWaitForElementWithId("com.threesixteen.app:id/emote_layout");
              System.out.println("TC05- Open emojis layout");
              Thread.sleep(1000); 
          }
             
          
          }
      
      
      
      
      
      @Test(priority = 55)
  	public void ThoppiRecordedStreamPro55() throws InterruptedException, MalformedURLException
   {
		
   		OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Thoppi");
		System.out.println("TC03- Type Thoppi in search");
		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on ENTER");		
		Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open Thoppi's profile");
        Thread.sleep(1000);
        MuteRecordedStream();

 }
      
      
      
      
      
      @Test(priority = 56)
      
      
      public void Followingtabliveplayerrortate56() throws InterruptedException 
    {	     
      	
      	Thread.sleep(1000);
        if(isVisibleWithXPath1("//*[contains(@text,'Following')]")) {
              clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
  	        System.out.println("TC01- Pro stream tab opened");

  	    Thread.sleep(2000);
  	    if(isVisibleWithId("com.threesixteen.app:id/layout_comment")) {
          clickAndWaitForElementWithId("com.threesixteen.app:id/layout_comment");
          System.out.println("TC02- opened stream");
          }
		      else
		      {
		      	 clickAndWaitForElementWithId("com.threesixteen.app:id/click_view");
		           System.out.println("TC02- opened stream");
		      }
          Thread.sleep(7000);
          driver.navigate().back();
          Thread.sleep(1000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/miniPlayerPlayPause");
          clickAndWaitForElementWithId("com.threesixteen.app:id/player_touch_anchor");
          System.out.println("TC03- Mini player  send to Full screen");
          Thread.sleep(10000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
          System.out.println("TC04- Player rotate to landscape");
          Thread.sleep(10000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
          System.out.println("TC05- Player rotate to portrait");
          Thread.sleep(10000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
          System.out.println("TC06- Player rotate to landscape");
          Thread.sleep(10000);
          clickAndWaitForElementWithId("com.threesixteen.app:id/exo_overlay");
          clickAndWaitForElementWithId("com.threesixteen.app:id/iv_fs");
          System.out.println("TC07- Player rotate to portrait");
  		Thread.sleep(1000);

        }
        else
        {
            System.out.println("TC07- Following tab is not vsiible . this is old homepoage");

        }


      }
      
      
      
      
      
      @Test(priority = 57)
    	public void APLEsportsRecordedStreamPro51() throws InterruptedException, MalformedURLException
     {
  		
     		OpenSearch();
  		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
  		System.out.println("TC02- Click on search box");
  		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("APL ESPORTS");
  		System.out.println("TC03- Type APL ESPORTS in search");
  		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
  		System.out.println("TC04- Click on ENTER");		
  		Thread.sleep(1000);
  		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
  		System.out.println("TC05- open APL ESPORTS's profile");
          Thread.sleep(1000);
          MuteRecordedStream();

   }
          
        

    
      
  @Test(priority = 58)
      
      
      public void DataCheckHomePage58() throws InterruptedException 
      
    {	     
      	
      	Thread.sleep(3000);
//        if(isVisibleWithXPath1("//*[contains(@text,'Following')]")) {
//              clickAndWaitForElementWithXpath1("//*[contains(@text,'Following')]");
//  	        System.out.println("TC01- Following tab opened");
//  	      	Thread.sleep(5000);
//  	  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//            System.out.println("TC02- Feed Present in Follwoing Tab");
//  	      	Thread.sleep(5000);
//  	      	driver.navigate().back();
//  	      	Thread.sleep(5000);

        if (isVisibleWithXPath1("//*[contains(@text,'Missed')]")) {
        
          clickAndWaitForElementWithXpath1("//*[contains(@text,'Pro Streams')]");
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
	      	
		      	
		          clickAndWaitForElementWithXpath1("//*[contains(@text,'Videos')]");
	      	    System.out.println("TC05- Videos tab opened");
	      	    Thread.sleep(5000); 
		  		clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
	            System.out.println("TC06- Feed Present in  Tab");
	      	    Thread.sleep(5000); 
		      	driver.navigate().back();
	      	    Thread.sleep(5000); 
		      	
		      	
     
        
            driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().text(\"Esports\")).setAsHorizontalList().scrollForward(2)"));
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
											      	    
											      	if (isVisibleWithXPath1("//*[contains(@text,'All Streams')]"))   {
											      	    
											      	  clickAndWaitForElementWithXpath1("//*[contains(@text,'All Streams')]");
											      	    System.out.println("TC11- All streams tab opened");
											      	    Thread.sleep(5000); 
											      	    
											      	    
											      	  driver.findElement(
											                  AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)"));
											      	    System.out.println("TC12- All streams scrolled");
											      	  clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
											            System.out.println("TC13- Feed Present in Tab");

					                       	    Thread.sleep(1000);
											      	}
        }
        else
        {
            System.out.println("TC14- This is Old Homepage so test stopped ");

        }

        }
        
    
  
  @Test(priority = 59)
  
 	public void SnaxgamingRecordedStreamPro59() throws InterruptedException, MalformedURLException 
 {
 		
  	OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Snax Gaming");
 		System.out.println("TC03- Type snax gaming in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");   		
	    Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open snax's profile");
      Thread.sleep(1000);
      MuteRecordedStream();
     }
          
  
  
  
  
  @Test(priority = 60)
 
	public void sp4hariRecordedStreamPro60() throws InterruptedException, MalformedURLException 
{
		
	OpenSearch();
		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
		System.out.println("TC02- Click on search box");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("HARI");
		System.out.println("TC03- Type Hari in search");
		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
		System.out.println("TC04- Click on serach button");   		
	    Thread.sleep(1000);
		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
		System.out.println("TC05- open SP4HARI's profile");
    Thread.sleep(1000);
    MuteRecordedStream();
   }
  
  
  
  @Test(priority = 61)
  
 	public void CalvinnReyecordedStreamPro61() throws InterruptedException, MalformedURLException 
 {
 		
 	OpenSearch();
 		clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 		System.out.println("TC02- Click on search box");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Calvin");
 		System.out.println("TC03- Type calvin in search");
 		(driver).findElement(By.id("com.threesixteen.app:id/et_search")).click();
 	    driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 		System.out.println("TC04- Click on serach button");   		
 	    Thread.sleep(1000);
 		clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 		System.out.println("TC05- open calvin's profile");
     Thread.sleep(1000);
     MuteRecordedStream();
     
    }
  
  
  
  
  @Test(priority = 62)
  public void SidenavExtendpro62() throws InterruptedException {

      OpenSideNav();
      String targetText = "Extend Pro";
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

      clickAndWaitForElementWithXpath1("//android.view.View[@content-desc=\"Rooter Extend Plan Rooter\"]/android.widget.TextView");
      System.out.println("TC03- click on Extend plan");
      Thread.sleep(3000); 
      

      clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button[1]");
    System.out.println("TC03- click on buy button for 7 day");
    Thread.sleep(3000);  
    
    driver.navigate().back();
    Thread.sleep(3000);  
	OpenSearch();

    
    
//  driver.findElement(By.xpath("//*[contains(@text,'Continue')]")).click();
//  System.out.println("TC03- click on continue");
//  Thread.sleep(3000);  

     
  }
  
  
  
  
  @Test(priority = 63)
	public void EXTROVERTOGRecordedStreamPro63() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("EXTROVERT OG");
	System.out.println("TC03- Type EXTROVERT OG in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open EXTROVERT OG's profile");
 Thread.sleep(1000);
 MuteRecordedStream();

}
  
  
  
  @Test(priority = 64)
	public void BlackDaYGamingRecordedStreamPro64() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("BlackDay Gaming");
	System.out.println("TC03- Type BlackDaY Gaming in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open BlackDaY Gaming's profile");
Thread.sleep(1000);
MuteRecordedStream();

}
  
  
  
  
  @Test(priority = 65)
 	public void KIARAAGAMINGRecordedStreamPro65() throws InterruptedException, MalformedURLException
 {
 	
 		OpenSearch();
 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	System.out.println("TC02- Click on search box");
 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("KIARAA GAMING");
 	System.out.println("TC03- Type KIARAA GAMING in search");
 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	System.out.println("TC04- Click on ENTER");		
 	Thread.sleep(1000);
 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	System.out.println("TC05- open KIARAA GAMING's profile");
 Thread.sleep(1000);
 MuteRecordedStream();

 }
  
  
  @Test(priority = 66)
	public void AdiiPLaYZRecordedStreamPro66() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Adii PLaYZ ");
	System.out.println("TC03- Type Adii PLaYZ  in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open Adii PLaYZ 's profile");
Thread.sleep(1000);
MuteRecordedStream();

}
  
  
  
  
  
  @Test(priority = 67)
 	public void  CaramelRecordedStreamPro67() throws InterruptedException, MalformedURLException
 {
 	
 		OpenSearch();
 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	System.out.println("TC02- Click on search box");
 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys(" Caramel");
 	System.out.println("TC03- Type  Caramel  in search");
 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	System.out.println("TC04- Click on ENTER");		
 	Thread.sleep(1000);
 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	System.out.println("TC05- open  Caramel 's profile");
 Thread.sleep(1000);
 MuteRecordedStream();

 }
  
  
  
  @Test(priority = 68)
	public void  VENOMGAMINGRecordedStreamPro68() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("VENOM GAMING");
	System.out.println("TC03- Type  VENOM GAMING  in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open  VENOM GAMING's profile");
Thread.sleep(1000);
MuteRecordedStream();

}
  
  
  @Test(priority = 69)
 	public void YtbotfluxRecordedStreamPro69() throws InterruptedException, MalformedURLException
 {
 	
 		OpenSearch();
 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	System.out.println("TC02- Click on search box");
 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Ytbotflux");
 	System.out.println("TC03- Type  Ytbotflux  in search");
 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	System.out.println("TC04- Click on ENTER");		
 	Thread.sleep(1000);
 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	System.out.println("TC05- open  Ytbotflux's profile");
 Thread.sleep(1000);
 MuteRecordedStream();

 }
  
  
  @Test(priority = 70)
	public void RaphopRecordedStreamPro70() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Raph op");
	System.out.println("TC03- Type Raph op  in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open  Raph op's profile");
Thread.sleep(1000);
MuteRecordedStream();

}
  
  
  
  @Test(priority = 71)
	public void RaphopRecordedStreamPro71() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Slayer Gaming");
	System.out.println("TC03- Type Slayer Gaming  in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open  Slayer Gaming's profile");
Thread.sleep(1000);
MuteRecordedStream();

}
  
  
  
//  
//  @Test(priority = 72)
//	public void RaphopRecordedStreamPro72() throws InterruptedException, MalformedURLException
//{
//	
//		OpenSearch();
//	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
//	System.out.println("TC02- Click on search box");
//	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("AFZAL GAMING");
//	System.out.println("TC03- Type AFZAL GAMING in search");
//	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
//	System.out.println("TC04- Click on ENTER");		
//	Thread.sleep(1000);
//	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
//	System.out.println("TC05- open  AFZAL GAMING's profile");
//Thread.sleep(1000);
//MuteRecordedStream();
//
//}
//  
  
  
  
 
 
  @Test(priority = 73)
	public void CrockyMDRecordedStreamPro73() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Crocky MD");
	System.out.println("TC03- Type Crocky MD in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open Crocky MD's profile");
    Thread.sleep(1000);
    MuteRecordedStream();

}
  
  
  
  @Test(priority = 74)
	public void hreemanlegendRecordedStreamPro74() throws InterruptedException, MalformedURLException
{
	
		OpenSearch();
	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
	System.out.println("TC02- Click on search box");
	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("shreeman legend");
	System.out.println("TC03- Type shreeman legend in search");
	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	System.out.println("TC04- Click on ENTER");		
	Thread.sleep(1000);
	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
	System.out.println("TC05- open shreeman legend's profile");
    Thread.sleep(1000);
    MuteRecordedStream();

}

  
  
  
  
  @Test(priority = 75)
 	public void Karnnu4545RecordedStreamPro75() throws InterruptedException, MalformedURLException
 {
 	
 		OpenSearch();
 	clickAndWaitForElementWithId("com.threesixteen.app:id/title_image");
 	System.out.println("TC02- Click on search box");
 	(driver).findElement(By.id("com.threesixteen.app:id/et_search")).sendKeys("Karnu4545");
 	System.out.println("TC03- Type Karnu4545 in search");
 	driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
 	System.out.println("TC04- Click on ENTER");		
 	Thread.sleep(1000);
 	clickAndWaitForElementWithId("com.threesixteen.app:id/tv_name");
 	System.out.println("TC05- open Karnu4545's profile");
     Thread.sleep(1000);
     MuteRecordedStream();

 }

  
  
  
      
// @Test(priority = 30)
//	public void internet30() throws InterruptedException, MalformedURLException 
//{
//	    
//	   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.GridView/android.view.ViewGroup[1]/android.widget.Button");
//       System.out.println("TC01- Pro stream tab opened");
//       Thread.sleep(1000);
//       clickAndWaitForElementWithId("com.threesixteen.app:id/player_layout");
//       System.out.println("TC02- opened feed");
//       Thread.sleep(20000);
//       ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//       Thread.sleep(5000);
//       System.out.println("TC02- Send to PIP");
//       clickAndWaitForElementWithId("//android.widget.TextView[@content-desc=\"Setting");
//       System.out.println("TC02- Open setting");
//       Thread.sleep(1000);
//
//	   clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
//       System.out.println("TC02- Go to wifi setting");
//       Thread.sleep(1000);
//
//	   clickAndWaitForElementWithXpath1("//android.widget.Switch[@content-desc=\"Wi-Fi\"]");
//       System.out.println("TC02- turn off wifi");
//       Thread.sleep(1000);
//       ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//       Thread.sleep(5000);
//       System.out.println("TC02- Pressed home buttonb on handset");
//       Thread.sleep(1000);
//       clickAndWaitForElementWithXpath1("//android.widget.TextView[@content-desc=\"Rooter\"]");
//       Thread.sleep(5000);
//       System.out.println("TC02Switch to full screen");
//
//	 
//}

		
  
  
//android.widget.TextView[@content-desc="Settings"]
 
  
  
  
  
  
  
  
  
  
  
  
    
      
//        
//        
//        
//        @Test(priority = 40)
//        public void ReelTaskLandingtes40() throws InterruptedException, MalformedURLException {	
//        	
//        	
//        	clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//            System.out.println("TC01- open side nav");
//            driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
//            System.out.println("TC02- Task Page Opened");
//            Thread.sleep(2000);
//
////            MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));
////            String TaskName = ((WebElement) element).getText();
////            System.out.println("TC03- Task Name is " + TaskName);
//             Thread.sleep(3000);
//            
//            if (isVisibleWithXPath1("//*[contains(@text,'Watch 10 Reels')]"))
//            {
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch 10 Reels')]");
//            System.out.println("TC04- Reel Opened");
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.Button");
//                Thread.sleep(8000);
//                if (isVisibleWithId("com.threesixteen.app:id/iv_share")) 
//                {
//                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
//                System.out.println("TC05- Task landed correctly, Reel Opened");
//                Thread.sleep(2000);
//                }
//                else
//                {
//                    Thread.sleep(500);
//                	if (isVisibleWithId("com.threesixteen.app:id/lav_coin")) 
//                	{
//                        Thread.sleep(500);
//                        System.out.println("TC06- Task was already completed , Coins collected");
//                	}
//                }
//             }     
//            else
//            {
//                Thread.sleep(500);
//                System.out.println("TC07- 10 Reels task is already Completed");
//            }
//        }
//        
//        
//        
//        
//        @Test(priority = 41)
//        public void ReelsTaskLandingtest41() throws InterruptedException, MalformedURLException {	
//        	
//        	
//        	clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//            System.out.println("TC01- open side nav");
//            driver.findElement(
//                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
//            System.out.println("TC02- Task Page Opened");
//            Thread.sleep(2000);
//
////            MobileElement element = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView"));
////            String TaskName = ((WebElement) element).getText();
////            System.out.println("TC03- Task Name is " + TaskName);
//             Thread.sleep(3000);
//            
//            if (isVisibleWithXPath1("//*[contains(@text,'Watch 30 Reels')]"))
//            {
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Watch 30 Reels')]");
//            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.Button");
//            Thread.sleep(5000);
//            System.out.println("TC04- 30 Reel Task Opened");
//                Thread.sleep(3000);
//                if (isVisibleWithId("com.threesixteen.app:id/iv_share")) 
//                {
//                clickAndWaitForElementWithId("com.threesixteen.app:id/iv_share");
//                System.out.println("TC05- Task landed correctly, Reel Opened");
//                Thread.sleep(2000);
//                }
//                else
//                {
//                    Thread.sleep(500);
//                	if (isVisibleWithId("com.threesixteen.app:id/lav_coin")) 
//                	{
//                        Thread.sleep(2000);
//                        System.out.println("TC05- Task was already completed , Coins collected");
//                	}
//                }
//            }
//            else
//            {
//                Thread.sleep(2000);
//                System.out.println("TC04- Watch 30 Reels task is Completed");
//            }
//        }
//        	
//        	
//        
//        
//        
//        @Test(priority = 42)
//        public void VideoTaskLandingtest42() throws InterruptedException, MalformedURLException {	
//        	
//        	
//        	clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//            System.out.println("TC01- open side nav");
////            driver.findElement(
////                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
////            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
//            System.out.println("TC02- Task Page Opened");
//             Thread.sleep(3000);
//            
//            if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 7 Minutes')]"))
//            {
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
//               System.out.println("TC03- 7 minutes Video Task Opened");
//                Thread.sleep(10000);
//               
//                clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//                Thread.sleep(1000);
//                System.out.println("TC04- 7 minutes Video Task landed correctly, Video Opened");
//                Thread.sleep(2000);
//            }
//            else
//            {
//                System.out.println("TC05- Watch 7 Minutes Video task is already Completed");
//            }
//        }
//        	
//        
//        
//        
//        @Test(priority = 43)
//        public void VideoTaskLandingtest043() throws InterruptedException, MalformedURLException {	
//        	
//        	
//        	clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//            System.out.println("TC01- open side nav");
////            driver.findElement(
////                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
////            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
//            System.out.println("TC02- Task Page Opened");
//             Thread.sleep(3000);
//            
//            if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 20 Minutes')]"))
//            {
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
//               System.out.println("TC03- 20 minutes Video Task Opened");
//                Thread.sleep(10000);
//                clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//                Thread.sleep(1000);
//                System.out.println("TC04- 20 minutes Video Task landed correctly, Video Opened");
//                Thread.sleep(2000);
//                System.out.println("TC05- Watch 20 Minutes Video task is already Completed");
//
//            }
//            else
//            {
//            	driver.findElement(
//                      AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
//            	if (isVisibleWithXPath1("//*[contains(@text,'Watch Videos for 20 Minutes')]"))
//                {
//            		clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.Button");
//                    System.out.println("TC03- 20 minutes Video Task Opened");
//                     Thread.sleep(10000);
//                     clickAndWaitForElementWithId("com.threesixteen.app:id/thumbnail");
//                     Thread.sleep(1000);
//                     System.out.println("TC04- 20 minutes Video Task landed correctly, Video Opened");
//                     Thread.sleep(2000);
//                     System.out.println("TC05- Watch 20 Minutes Video task is already Completed");
//                }
//            	else
//            	{
//                    System.out.println("TC05- Watch 20 Minutes Video task is already Completed");
//
//            	}
//            }
//            
//        }
//        
//     
//        
//        
//        
//        
//        @Test(priority = 44)
//        public void LivestreamTaskLandingtest44() throws InterruptedException, MalformedURLException {	
//        	
//        	
//        	clickAndWaitForElementWithXpath1(
//                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
//            System.out.println("TC01- open side nav");
////            driver.findElement(
////                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
////            Thread.sleep(1000);
//            clickAndWaitForElementWithXpath1("//*[contains(@text,'Tasks')]");
//            System.out.println("TC02- Task Page Opened");
//             Thread.sleep(3000);
//            
//            if (isVisibleWithXPath1("//*[contains(@text,'Watch Live Gaming Streams for 15 minutes')]"))
//            {
//                clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.Button");
//               System.out.println("TC03- Watch Live Gaming Streams for 15 minutes Task Opened");
//                Thread.sleep(10000);
//                clickAndWaitForElementWithXpath1("//*[contains(@text,'Live Chat')]");
//                Thread.sleep(1000);
//                System.out.println("TC04- Watch Live Gaming Streams for 15 minutes landed correctly, Stream Opened");
//
//            }
//            else
//            {
//                    System.out.println("TC05- Watch Live Gaming Streams for 15 minutes task is already Completed");
//
//            	}
//            }
//            
//        

        
        
        
        
        
        
        

        @Test(priority = 110)
        public void Logout110() throws InterruptedException 
{

            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView");
            System.out.println("TC01- open side nav");
            Thread.sleep(1000);
            clickAndWaitForElementWithId("com.threesixteen.app:id/iv_arrow_username_lrps");
            System.out.println("TC02- open profile");
            Thread.sleep(1000);
            clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView");
            System.out.println("TC03- Click on three dots");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(@text,'Edit Channel')]")).click();
            System.out.println("TC04- Click on Edit channel");
            Thread.sleep(1000);
            driver.findElement(AppiumBy.androidUIAutomator(
    	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(2)"));
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[contains(@text,'Logout')]")).click();
            System.out.println("TC05- Click on Logout");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(@text,'Yes')]")).click();
            Thread.sleep(1000);
   		    clickAndWaitForElementWithXpath1("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView");
            System.out.println("TC06- Click on Gmail");

           
            
    }


        
        
        
        
	
	
	
	
	@AfterMethod
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
