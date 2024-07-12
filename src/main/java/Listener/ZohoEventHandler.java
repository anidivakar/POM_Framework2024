package Listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class ZohoEventHandler extends AbstractWebDriverEventListener{


	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before Finding.."+by);
		System.out.println("Before Finding.."+element);
		System.out.println("Before Finding.."+driver);
	}
	
}
