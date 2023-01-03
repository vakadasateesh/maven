package com.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltestng {
	  WebDriver driver;
	    @Test(priority=1)
		public void logotest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			// WebElement logo= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
			// Assert.assertTrue(logo.isDisplayed());
			Assert.assertEquals(driver.getTitle(), "OrangeHRM");

			Thread.sleep(5000);
			// driver.quit();
		}

		@Test(priority =2)
	    void homepagetitle1() throws InterruptedException {
	        WebDriverManager.firefoxdriver().setup();
	        driver=new ChromeDriver();
	       // driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	       Thread.sleep(5000);
	       // driver.quit();
		}
	}