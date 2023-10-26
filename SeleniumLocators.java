package com.learning.seleniumtask19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		driver.navigate().to("https://www.guvi.in/register/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//By xpath
		
		driver.findElement(By.xpath("//a[@class='brand logo']"));
		Thread.sleep(2000);
		driver.findElement(By.tagName("input"));
		//driver.findElement(By.xpath("////a[@id='google-button']"));
		driver.findElement(By.tagName("label"));
	
		driver.findElement(By.id("google-button"));
		driver.findElement(By.id("firstName"));
		driver.findElement(By.className("form-control"));
		//driver.findElement(By.id("lastName"));
		driver.findElement(By.id("emailgroup"));
		driver.findElement(By.id("emailInput"));
		driver.findElement(By.xpath("//label[@for='passwordInput']"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.name("mobileNumberInput"));
		driver.findElement(By.tagName("button"));

}

}
