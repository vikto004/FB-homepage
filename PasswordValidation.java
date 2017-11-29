package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PasswordValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_9")).sendKeys("John");
		driver.findElement(By.id("u_0_b")).sendKeys("Anderson");
		
		driver.findElement(By.id("u_0_e")).sendKeys("7635551234");
		driver.findElement(By.id("u_0_l")).sendKeys("12345678");
		driver.findElement(By.cssSelector("span._5k_2:nth-child(2) > label:nth-child(2)")).click();
		driver.findElement(By.id("u_0_r")).click();
		Thread.sleep(1000);
		
		driver.switchTo().activeElement();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		
		if(driver.findElement(By.id("reg_error_inner"))!= null){
			System.out.println("Invalid Password 1");
		}else{
			System.out.println("Password 1 is valid");
		}
		
		
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("Test12345678");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_r")).click();
		Thread.sleep(4000);
		if(driver.findElement(By.className("uiHeaderTitle"))!= null){
			System.out.println("Password 2 is valid");
		}else{
			System.out.println("Invalid PW 2");
		}
		Thread.sleep(3000);
		driver.close();


	}

}
