package New_One;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class EverSty_Lish
    {

	    public static void main(String[] args) throws InterruptedException, IOException
	       
	     {
		print ("hello")
	    	//Launch Browser
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay Bhavsar\\Desktop\\jar\\chromedriver.exe");
            WebDriver w=new ChromeDriver();
			print("Dfdfdf");
            //Open URL    
			print("vinit")
     	    w.get("https://everstylish.com/");
	        w.manage().window().maximize();
	        Thread.sleep(1000);
	        Actions c=new Actions(w);
    	    JavascriptExecutor js=(JavascriptExecutor) w; 
    	
    	    //Click on EverStylish Symbol
    	    WebElement Eve = w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/div[1]/strong[1]/img[1]"));
	        Eve.click();
	        String s = w.getTitle();
	        System.out.println(s);
	      
	 	    //Check the functionality of Home tab
	        Thread.sleep(1000);
       	    w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")).click();
	        System.out.println("Home Page Open");
      	
	        //Scroll down 
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,1000)","");
            System.out.println("Page down");
            Thread.sleep(3000);
          
           //Scroll up
           js.executeScript("window.scrollBy(0,-1000)","");
           System.out.println("Page up");
           Thread.sleep(1000);
          
          //open the profile tab And Login using Credential
      	  w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]/i[1]")).click();
  		  System.out.println("Profile Tab Open ");
  		
  		  //Select Login/sigup button
  	      w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).click();
  	      w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/form[1]/fieldset[1]/div[2]/div[2]/a[1]/span[1]")).click();
  	     
  	      //Login using Emailid
  	      w.findElement(By.cssSelector("input#email")).sendKeys("Vinita@gmail.com");
  	      w.findElement(By.cssSelector("input#pass")).sendKeys("vinita123");
  		
  	      //Click on login Button
  	      w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/button[1]/span[1]")).click();
  	      System.out.println("Login successfully Done");
  	      Thread.sleep(2000);
  	      w.navigate().to("https://everstylish.com/");
  	     
  	      //check functionality of All jewelry tab
          w.findElement(By.xpath("//span[contains(text(),'All Jewelry')]")).click();
          js.executeScript("window.scrollBy(0,700)","");
          System.out.println("All Jwellery Are open To Buy");

          //select jewellry you want
          Thread.sleep(1000);
          w.findElement(By.xpath("/html/body")).click();
        
          //check dropdown option
          Thread.sleep(1000);
          w.findElement(By.name("qty")).click();
          Thread.sleep(1000);

          //check the functionality of add to bag button
          Thread.sleep(1000);
          w.findElement(By.xpath("//span[contains(text(),'Add To Bag')]")).click();
         
          // wishlist the jwellery
          Thread.sleep(1000);
          // w.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
         
          //check functionality of size chart
          w.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[2]/div/div/div[3]/a[1]")).click();
          Thread.sleep(1000);
         
          //back to the current page
          w.navigate().to("https://everstylish.com/");
         
          //Check functionality of type button
    	  c.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Type')]"))).perform();
	      Thread.sleep(1000);
	      System.out.println("Type Option is Open to See the Different Varities of Jwellery");
	     
	      //click on neckpieces button inside the type module
	      w.findElement(By.xpath("//*[@id=\"mobile-menu-39-1\"]/li/ul/li[3]/a")).click();
	   
	      //select neckpice as you want
	      w.findElement(By.xpath("//*[@id=\"product-wrapper\"]/ol/li[1]/div[1]/a/img")).click();
	   
          //get text of jwellery name
		 WebElement gold = w.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/div[2]/div[1]/h1[1]/span[1]"));
		 gold.click();
		 String j = w.getTitle();
		 System.out.println(j);
		 js.executeScript("window.scrollBy(0,500)","");
		  
		 //select quantity that you want to order
		 Select s1 = new Select(w.findElement(By.id("qty")));
		 Thread.sleep(1000);
		 s1.selectByIndex(3);
		 //add to bag necpiece
		 w.findElement(By.xpath("//span[contains(text(),'Add To Bag')]")).click();
		   
		 //check functionality of delivery return button
		 w.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/a[2]")).click();
		 // js.executeScript("window.scrollBy(0,700)","");
		 Thread.sleep(2000);
		 w.navigate().to("https://everstylish.com/");
		     
		 //Check the Functionality of Ring Tab    
		 c.moveToElement(w.findElement(By.xpath("//span[contains(text(),'Type')]"))).perform();
		 w.findElement(By.linkText("Rings")).click();
		    
		 //chcek functionality of sorted dropdown tab
		 Select s2 =new Select(w.findElement(By.id("sorter")));
		 s2.selectByIndex(3);
		 Thread.sleep(1000);
		// s2.selectByValue("Sort By Newest To Oldest");
		 // js.executeScript("window.scrollBy(0,-200)","");
		 w.navigate().to("https://everstylish.com/");
		     
		 //check the functionality of Bracelet and anklets
		 c.moveToElement(w.findElement(By.xpath("/html[1]/body[1]/main[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"))).click();
		 w.findElement(By.partialLinkText("Bracelets and Ankle")).click();
		 //list view
		 w.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]")).click();
		 w.navigate().to("https://everstylish.com/");
		 
		 //check the functionality of collection tab
		 w.findElement(By.xpath("//*[@id=\"mainMenu\"]/li[4]/a/span[1]")).click();
	      
		 //Click on boho collection tab
	     w.findElement(By.partialLinkText("The Boho Collecti")).click();
	     js.executeScript("window.scrollBy(0,500)","");
	     Thread.sleep(1000);
	    
	     //select jwellery
		 w.findElement(By.xpath("//body/main[1]/div[1]/section[1]/div[2]/div[1]/div[3]/ol[1]/li[6]/div[1]/a[1]/img[1]")).click();
		 js.executeScript("window.scrollBy(0,200)","");
		 w.getTitle();
		 Thread.sleep(1000);
			
	     //To Take a Screenshot
		 TakesScreenshot t = (TakesScreenshot) w;
		 File src = t.getScreenshotAs(OutputType.FILE);
	     Files.copy(src, new File ("D:\\Screenshot\\Jwell.png"));
	     Thread.sleep(1000);
	     w.navigate().back();

	     //check functionality of search button
		 w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]/i[1]")).click();
	     Thread.sleep(2000);
	     
	     //Check functionality of all categories dropdown inside the srech button
	     //w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[1]/i[1]")).click();
	     //Thread.sleep(1000);
	     w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]/i[1]")).click();
	     System.out.println("All Categories R Open");
	     w.findElement(By.linkText("Under 99")).click();
	     Thread.sleep(3000);
	     w.navigate().to("https://everstylish.com/");
    	//w.navigate().to("https://everstylish.com/");
		     
		 //check the functionality of wishlist tab
		 w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[3]/a[1]/i[1]")).click();
		 System.out.println("Wishlist Open");
		 Thread.sleep(2000);
		 w.navigate().to("https://everstylish.com/");
	     Thread.sleep(2000);
		     
		     
		 //check the functionality of store credit tab
		 w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]/i[1]")).click();
		 w.findElement(By.xpath("/html/body/main/div/header/div[2]/div/div/div[4]/div/div[2]/div/ul/li[3]/a")).click();
		/* Set <String> windows=w.getWindowHandles();
		 Iterator <String> it= windows.iterator();
		 String parent_window=it.next();
		 String child_window1=it.next();
		 w.switchTo().window(parent_window);
		 Thread.sleep(1000);
		 w.switchTo().window(child_window1);*/
		    
		 //subscribe for email notification using checkbox
		 WebElement checkbox= w.findElement(By.id("credit_subscription"));
		 checkbox.click();
		 Thread.sleep(2000);
		 String p = w.getTitle();
		 System.out.println(p);
		 w.navigate().to("https://everstylish.com/");
		      
		 //Check the Order Tracking option 
		 WebElement Order_Tracking = w.findElement(By.linkText("Orders Tracking"));
		 Order_Tracking.click();
		 Thread.sleep(1000);
		      
		 //Chcek the functionality of mini bag
		 w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[4]/a[1]")).click();
	     Thread.sleep(2000);
	     System.out.println("Mini Bag Open to See the Items");
	     w.navigate().to("https://everstylish.com/");
	     
	     //Check the Functionality of Helpdesk Option
	  /*   w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]/i[1]")).click();
	     w.findElement(By.linkText("Helpdesk")).click();
	     System.out.println("HelpDesk");
	     Thread.sleep(1000);
	      w.navigate().to("https://everstylish.com/");
	     
		 // Check functionality of signout	
	      w.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/button[1]/i[1]")).click();   	
		  w.findElement(By.partialLinkText("Sign O")).click();
		  w.navigate().back();*/
	

        
 

	}

}
