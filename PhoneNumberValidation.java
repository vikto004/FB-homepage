package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhoneNumberValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_9")).sendKeys("John");
		driver.findElement(By.id("u_0_b")).sendKeys("Anderson");
		
		driver.findElement(By.id("u_0_e")).sendKeys("7418529630");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.xpath("//*[contains(.,'Please enter a valid mobile number or email address.')]"))!= null){
			System.out.println("Invalid phone 1");
		}else{
			System.out.println("Phone syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();
		
		
		driver.findElement(By.id("u_0_e")).sendKeys("7635551");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.xpath("//*[contains(.,'Please enter a valid mobile number or email address.')]"))!= null){
			System.out.println("Invalid phone 2");
		}else{
			System.out.println("Phone syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();

		
		driver.findElement(By.id("u_0_e")).sendKeys("76355512ib");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.xpath("//*[contains(.,'Please enter a valid mobile number or email address.')]"))!= null){
			System.out.println("Invalid phone 3");
		}else{
			System.out.println("Phone syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();

		

		driver.findElement(By.id("u_0_e")).sendKeys("7635551234");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.xpath("//*[contains(.,'Please enter a valid mobile number or email address.')]"))!= null){
			System.out.println("Phone syntax correct");
		}else{
			System.out.println("Invalid phone 4");
		}
		driver.findElement(By.id("u_0_e")).clear();
		
		
		driver.findElement(By.id("u_0_e")).sendKeys("+17635551234");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.xpath("//*[contains(.,'Please enter a valid mobile number or email address.')]"))!= null){
			System.out.println("Phone syntax correct");
		}else{
			System.out.println("Invalid phone 5");
		}

		driver.close();



	}

}
