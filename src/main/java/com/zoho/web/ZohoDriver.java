package com.zoho.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.base.pages.ZohoPage;
import com.zoho.listener.ZohoEventListener;
import com.zoho.session.ZohoTestSession;

public class ZohoDriver extends ZohoValidationDriver{

	
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openBrowser(String bName) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium 4.10.0\\Selenium 4.0.0\\Gecko\\geckodriver.exe");
		driver = new EventFiringWebDriver(new FirefoxDriver());

		driver.register(new ZohoEventListener());
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Override
	public void navigate(String url) {
		driver.get(url);
		
	}

	@Override
	public void quit() {
		driver.quit();
		
	}

	public EventFiringWebDriver getCurrentDriver() {
		return  driver;
	}
	
	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}
	
}
