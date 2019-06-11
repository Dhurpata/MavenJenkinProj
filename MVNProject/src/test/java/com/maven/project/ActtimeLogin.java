package com.maven.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActtimeLogin {
	@Test
	public void loginTest() throws InterruptedException
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement ele=driver.findElement(By.xpath("//*[text()='Logout']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		//driver.findElement(By.xpath("//*[text()='Logout']")).click();
		driver.close();
	}
	

}
