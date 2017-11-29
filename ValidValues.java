package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_9")).sendKeys("John");
		driver.findElement(By.id("u_0_b")).sendKeys("Anderson");
		driver.findElement(By.id("u_0_e")).sendKeys("testemail@gmail.com");
			Thread.sleep(1000);
		driver.findElement(By.id("u_0_h")).sendKeys("testemail@gmail.com");
		driver.findElement(By.id("u_0_l")).sendKeys("testPW!");
		driver.findElement(By.cssSelector("span._5k_2:nth-child(2) > label:nth-child(2)")).click();
		driver.findElement(By.id("u_0_r")).click();
		
		driver.close();
		

	}

}
