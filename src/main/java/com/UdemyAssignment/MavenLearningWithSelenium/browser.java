package com.UdemyAssignment.MavenLearningWithSelenium  ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class browser extends mainclass {

	
	
	@Test
	
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'content\']/a[2]")).click();
		WebDriverWait w = new WebDriverWait (driver, 6);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//*[@id='results']")).getText());
	}

}			
		
	
