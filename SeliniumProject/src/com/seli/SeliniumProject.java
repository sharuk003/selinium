package com.seli;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeliniumProject {
	
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saruk\\eclipse-workspace\\SeliniumProject\\drivrers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement edu = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement ottu = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement edu1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement ottu1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    WebElement edu2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	    WebElement ottu2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	    WebElement edu3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement ottu3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	    
		
		
		Actions a = new Actions(driver);
		a.dragAndDrop(edu, ottu).perform();
		a.dragAndDrop(edu1, ottu1).perform();
		a.dragAndDrop(edu2, ottu2).perform();
		a.dragAndDrop(edu3, ottu3).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\saruk\\eclipse-workspace\\SeliniumProject\\drivrers\\drop");
        FileUtils.copyFile(src, des);
        
		
		
		
		
		
		
		
		
	}

}
