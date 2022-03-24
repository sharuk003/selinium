package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumProgect {
	
public static void main(String[] args) throws InterruptedException, Throwable {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saruk\\eclipse-workspace\\SeliniumProject\\drivrers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	WebElement usname = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','sharuk')" , usname);
	//Object script = js.executeScript("return aruguments[0].getAttribute('value')", usname);
	//System.out.println(script);
	js.executeScript("arguments[0].setAttribute('value','12345')", pass);
	js.executeScript("arguments[0].click()", login);
	
	
	TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File des = new File("C:\\Users\\saruk\\eclipse-workspace\\SeliniumProject\\drivrers\\javas");
    FileUtils.copyFile(src, des);
    
	
	
	
	
}
		
		
		
	    
	
}

