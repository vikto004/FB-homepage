package com.FB.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ButtonsandFields {


	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("u_0_9")).click();
	driver.findElement(By.id("u_0_b")).click();
	driver.findElement(By.id("u_0_e")).click();
	driver.findElement(By.id("u_0_l")).click();
	driver.findElement(By.id("month")).click();
	driver.findElement(By.id("day")).click();
	driver.findElement(By.id("year")).click();
	driver.findElement(By.id("birthday-help")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("._42fu")).click();
	driver.findElement(By.cssSelector("span._5k_2:nth-child(1) > label:nth-child(2)")).click();
	driver.findElement(By.cssSelector("span._5k_2:nth-child(2) > label:nth-child(2)")).click();
	System.out.println("Link present: " + driver.findElement(By.id("terms-link")).getText());
	System.out.println("Link present: " + driver.findElement(By.id("privacy-link")).getText());
	System.out.println("Link present: " + driver.findElement(By.id("cookie-use-link")).getText());
	
	
	driver.close();
		
	}

}
