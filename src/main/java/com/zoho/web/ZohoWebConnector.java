package com.zoho.web;

import com.zoho.base.pages.ZohoPage;

public interface ZohoWebConnector{
void logout();
ZohoPage validateTitle(String expectedTitle);
ZohoPage validateText(String locator, String expectedText);
void validateLogin();
ZohoPage validateElementPresence(String locatorType, String locator);

/*
 * void openBrowser(String bName); 
 * void navigate(String url); 
 * void quit();
 */

}
