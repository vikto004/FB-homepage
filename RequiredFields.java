package com.FB.registration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequiredFields {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_r")).click();
		
		System.out.println("Prompt is asking: " + driver.findElement(By.xpath("//div[text()='What’s your name?']")).getText());
		
		driver.close();

	}

}
