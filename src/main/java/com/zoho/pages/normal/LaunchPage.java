package com.zoho.pages.normal;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;


public class LaunchPage extends ZohoBasePage {
	
	public ZohoPage openBrowser(String browser) {
		System.out.println("Page1 LaunchPage openBrowser");
		
		getDriver().openBrowser(browser);
		
		return this;
	}

	
	public ZohoPage goToHomePage() {
		
		System.out.println("Zoho LauchPage called");
		getDriver().navigate("https://zoho.com");
		return new HomePage();
	}
	
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void getTotalWindows() {
		// TODO Auto-generated method stub
//		WebDriverWait wait = new WebDriverWait(getCurrentDriver(), 15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("ElementLocator")));
//		
//		JavascriptExecutor js = (JavascriptExecutor)getCurrentDriver();
//		String state = (String)js.executeScript("return document.readyState;");
//		Wait wait = new FluentWait(getCurrentDriver())
//				.withTimeout(20,SECONDS)
//				.pollingEvery(5,SECONDS)
//				.ignoring(NoSuchElementException.class);
//		
//		
//		Actions action = new Actions(getCurrentDriver());
//		WebElement element=getCurrentDriver().findElement(By.id("elementId"));
//		action.moveToElement(element).doubleClick().perform();
//		action.clickAndHold(element).dragAndDropBy(element, 0, 100).release();
//		element.type("","");
//		
//		element.typeKeys(locator, value);
	}

	

	public void goToRegisterPage() {
		// TODO Auto-generated method stub
		
	}

	public void submitUsername(String userid) {
		// TODO Auto-generated method stub
		
	}

	public WebConnector validator() {
		return getSession().getCon();
		
	}

	public void creatDeal() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}



	
}
