package com.maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetTitleTest {
	@Test
	public void getTitle() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String facebbookTitle=driver.getTitle();
		System.out.println(facebbookTitle);
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	

}
