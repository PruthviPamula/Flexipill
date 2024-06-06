package Flexx;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	WebDriver wd;
	Robot r;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	
	@BeforeTest
	public void t() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		wd.get("https://flexipill-ui-new-staging.vercel.app/");
	}
	@Test (priority = 0)
	public void login() throws InterruptedException {
	wd.findElement(By.xpath("(//*[@class='Header_btnLinkWhite__rHyPy'])[3]")).click();
	wd.findElement(By.xpath("//*[@placeholder='Enter your number']")).sendKeys("1111111111");
	wd.findElement(By.xpath("//*[@class='MuiTypography-root MuiTypography-body1 platinumrx-1bx7d16']")).click();
	wd.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("1");
	wd.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("1");
	wd.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("1");
	wd.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("1");
	}
	@Test(priority = 1)
	public void addtocart() {
		wd.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("paracetomol");
		wd.findElement(By.xpath("//*[@class='Searchbar_searchBtnLanding__HdOMy']")).click();
		js = (JavascriptExecutor)wd;
	     js.executeScript("window.scrollBy(0,40)");
	     wd.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-p platinumrx-8ygzv4'])[1]")).click();
	     wd.findElement(By.xpath("(//*[@fill='none'])[3]")).click();
	     
	}
	     
	     @Test
	     public void createorder() {
	    	 js = (JavascriptExecutor)wd;
		     js.executeScript("window.scrollBy(0,40)");
	    	 wd.findElement(By.xpath("//*[@type='button']")).click();
	    	 WebElement element = wd.findElement(By.xpath("(//*[@tabindex='0'])[4]"));
	    	 wd.findElement(By.xpath("//*[@placeholder='Your Name']")).sendKeys("test1");
	    	 wd.findElement(By.xpath("//*[@placeholder='Pin code']")).sendKeys("539089");
	    	 wd.findElement(By.xpath("//*[@placeholder='House number, floor']")).sendKeys("test floor");
	    	 wd.findElement(By.xpath("//*[@placeholder='Building name, locality']")).sendKeys("test block");
	         wd.findElement(By.xpath("//*[@placeholder='City']")).sendKeys("test city");
	    	 wd.findElement(By.xpath("//*[@placeholder='State']")).sendKeys("test state");
	    	 wd.findElement(By.xpath("//*[@placeholder='Patient's Name']")).sendKeys("test");
	    	 wd.findElement(By.xpath("//*[@id=':rg:']")).sendKeys("45");
	    	 wd.findElement(By.xpath("(//*[@type='radio'])[4]")).click();
	    	 wd.findElement(By.xpath("(//*[@type='button'])[10]")).click();
	    	   	

	    	 
	    	 
	     }
	     
	}

	
	
