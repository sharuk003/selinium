package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launchbrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saruk\\eclipse-workspace\\SeliniumProject\\drivrers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver  ();
		

		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement usrtxt = driver.findElement(By.id("email"));
		usrtxt.sendKeys("sarukkan");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("java");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}


}
