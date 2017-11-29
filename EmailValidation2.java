package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailValidation2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_9")).sendKeys("John");
		driver.findElement(By.id("u_0_b")).sendKeys("Anderson");
		
		driver.findElement(By.id("u_0_e")).sendKeys("testemail@123.456");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.id("u_0_h"))!= null){
			System.out.println("Email syntax correct");
		}else{
			System.out.println("Invalid email 1");
		}
		driver.findElement(By.id("u_0_e")).clear();

		driver.findElement(By.id("u_0_e")).sendKeys("testemail@gmailcom");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.id("u_0_h"))!= null){
			System.out.println("Email syntax correct");
		}else{
			System.out.println("Invalid email 2");
		}

		driver.close();
	}

}
