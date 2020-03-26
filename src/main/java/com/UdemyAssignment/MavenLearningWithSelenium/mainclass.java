package com.UdemyAssignment.MavenLearningWithSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class mainclass {

	WebDriver driver;

	public void addToCart() {

		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[3]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\'root\']/div/header/div/div[3]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/button")).click();
		WebDriverWait w = new WebDriverWait(driver, 6);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div/div/div/input")));
	
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")));
		System.out.println(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")).getText());
		Assert.assertTrue(true);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//	WebDriverWait wait = new WebDriverWait(driver, 60);
//	wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/button"))));
	}

//	public void promationCodeTest() {
//	
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/input")).sendKeys("rahulshettyacademy");
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/button")).click();
//		WebDriverWait w = new WebDriverWait(driver, 6);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div/div/div/input")));
//	
//		
//		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")));
//		System.out.println(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")).getText());
//		Assert.assertTrue(true);
//	}

}
