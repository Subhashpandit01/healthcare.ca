package healthcare.ca_framework_testfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import healthcare.ca_basefile.healthcare_Register_basefile;
import healthcare.ca_pagefile.healthcare_Register;

public class healthcare_Register_Testfile extends healthcare_Register_basefile {
	
	@Test
	public void test1() throws InterruptedException{
		
		healthcare_Register loginPage = new healthcare_Register(driver);
		
		loginPage.register_negative_sc1();
		loginPage.register_negative_sc2();
		loginPage.register_negative_sc3();
	}
	@Test
	public void test2() throws InterruptedException{
		
		healthcare_Register loginPage = new healthcare_Register(driver);
		
		loginPage.register_negative_sc2();
	}
	@Test
	public void test3() throws InterruptedException{
		
		healthcare_Register loginPage = new healthcare_Register(driver);
		
		loginPage.register_negative_sc3();
	}
	@Test
	public void test4() throws InterruptedException{
	
		healthcare_Register loginPage = new healthcare_Register(driver);

	loginPage.register_negative_sc4();
	}
	
	@AfterTest
	public void end() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
