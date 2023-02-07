package com.adactin.pro;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Task {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
           driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           WebElement us = driver.findElement(By.id("username"));
           us.sendKeys("Sharonrenuka");
           
           WebElement ps = driver.findElement(By.id("password"));
           ps.sendKeys("93renu61Ka");
           
           WebElement ln = driver.findElement(By.name("login"));
           ln.click();
           
           WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
           Select s = new Select(location);
           s.selectByVisibleText("Paris");
           
           WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
           Select h = new Select(hotel);
           h.selectByValue("Hotel Sunshine");
           
           WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
           Select r = new Select(room);
           r.selectByIndex(2);
           
           WebElement num  = driver.findElement(By.xpath("//select[@name='room_nos']"));
           Select n = new Select(num);
           n.selectByValue("2");
           
           WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
           checkin.click();
           
           WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
            checkout.click();
            
           WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
           Select a = new Select(adult);
            a.selectByVisibleText("1 - One");
           
           WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
           Select ch = new Select(child);
           ch.selectByIndex(0);
           
           WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
           submit.click();
           
           WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
           button.click();
           
           WebElement con = driver.findElement(By.xpath("//input[@name='continue']"));
           con.click();
           
           WebElement frstna = driver.findElement(By.xpath("//input[@name='first_name']"));
            frstna.sendKeys("sharon");
            
           WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
             last_name.sendKeys("renuka");
            
           WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
            add.sendKeys("No11,1st main street kamaraj nagar Nemblichery");
            
            WebElement ccnm = driver.findElement(By.xpath("//input[@name='cc_num']"));
            ccnm.sendKeys("45678 6789 5679 5643");
            
            WebElement ctyp = driver.findElement(By.xpath("//select[@name='cc_type']"));
            Select ct = new Select(ctyp);
            ct.selectByValue("VISA");
            
            WebElement sm = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
            Select m = new Select(sm);
            m.selectByVisibleText("May");
            
            WebElement sy = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
            Select y = new Select(sy);
            y.selectByValue("2022");
            
            WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
            ccv.sendKeys("5678");
            
            WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
            book.click();
            
            WebElement my = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
            my.click();
            //  Thread.sleep(1000);
            
            TakesScreenshot s1 = (TakesScreenshot)driver; 
    		File f =s1.getScreenshotAs(OutputType.FILE);
        	File f1 = new File ("C:\\Users\\ELCOT-Lenovo\\eclipse-workspace\\Selenium\\hotel book\\order.png");
    		
    		FileUtils.copyFile(f, f1);
    		
           driver.findElement(By.id("logout")).click();
           driver.quit();
            
            
}
}