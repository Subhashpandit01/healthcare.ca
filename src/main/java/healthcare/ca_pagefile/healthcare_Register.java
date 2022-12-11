package healthcare.ca_pagefile;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;


public class healthcare_Register {

	public WebDriver driver;
	By register = By.xpath("/html/body/header/nav/div/div[3]/div[1]/div/a[1]");
	By firstname= By.xpath("//*[@id=\"register_form\"]/div[1]/div[5]/div[1]/div[1]/div/input");
	By lastname=  By.xpath("//*[@id=\"register_form\"]/div[1]/div[5]/div[1]/div[2]/div/input");
	By email= By.xpath("//*[@id=\"register_form\"]/div[1]/div[5]/div[2]/input");
	By password= By.xpath("//*[@id=\"register_form\"]/div[1]/div[5]/div[3]/div[1]/div/input");
	By cpassword= By.xpath("//*[@id=\"register_form\"]/div[1]/div[5]/div[3]/div[2]/div/input");
	By submit= By.xpath("//*[@id=\"register_form\"]/div[1]/a");
		
	public healthcare_Register (WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void register_negative_sc1() {
		
		driver.findElement(register).click();
		driver.findElement(firstname).sendKeys("abcd");
		driver.findElement(lastname).sendKeys("xyz");
		driver.findElement(email).sendKeys("efgh");
		driver.findElement(password).sendKeys("abcd");
		driver.findElement(cpassword).sendKeys("efg");
		driver.findElement(submit).click();
	}
	public void register_negative_sc2() {
		
		driver.findElement(register).click();
		driver.findElement(firstname).sendKeys("abcd");
		driver.findElement(lastname).sendKeys("abcd");
		driver.findElement(email).sendKeys("efgh@gmail.com");
		driver.findElement(password).sendKeys("abcd");
		driver.findElement(cpassword).sendKeys("abc");
		driver.findElement(submit).click();
	}
	public void register_negative_sc3() {
		
		driver.findElement(register).click();
		driver.findElement(firstname).sendKeys("abcd");
		driver.findElement(lastname).sendKeys("xyz");
		driver.findElement(email).sendKeys("efgh@gmail.com");
		driver.findElement(password).sendKeys("Abcd");
		driver.findElement(cpassword).sendKeys("abc");
		driver.findElement(submit).click();
	}
	public void register_negative_sc4() {
		
		driver.findElement(register).click();
		driver.findElement(firstname).sendKeys("abcd");
		driver.findElement(lastname).sendKeys("xyz");
		driver.findElement(email).sendKeys("efgh@gmail.com");
		driver.findElement(password).sendKeys("Abcd@123");
		driver.findElement(cpassword).sendKeys("Abcd@123");
		driver.findElement(submit).click();
	}
	
	

}
