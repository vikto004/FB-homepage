package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class EmailVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_9")).sendKeys("John");
		driver.findElement(By.id("u_0_b")).sendKeys("Anderson");
		
		driver.findElement(By.id("u_0_e")).sendKeys("testemailAtgmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.cssSelector("#u_0_d > i:nth-child(2)"))!= null){
			System.out.println("Invalid email 1");
		}else{
			System.out.println("Email syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();
		
		driver.findElement(By.id("u_0_e")).sendKeys("testemail@gmailcom");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.cssSelector("#u_0_d > i:nth-child(2)"))!= null){
			System.out.println("Invalid email 2");
		}else{
			System.out.println("Email syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();
		
		driver.findElement(By.id("u_0_e")).sendKeys("testemail@gmail");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.cssSelector("#u_0_d > i:nth-child(2)"))!= null){
			System.out.println("Invalid email 3");
		}else{
			System.out.println("Email syntax correct");
		}
		driver.findElement(By.id("u_0_e")).clear();
		
		driver.findElement(By.id("u_0_e")).sendKeys("@gmail");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_r")).click();
		if(driver.findElement(By.cssSelector("#u_0_d > i:nth-child(2)"))!= null){
			System.out.println("Invalid email 4");
		}else{
			System.out.println("Email syntax correct");
		}

		driver.close();


	}

}
