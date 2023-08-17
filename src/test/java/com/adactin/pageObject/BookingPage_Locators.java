package com.adactin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingPage_Locators extends SelectHotel_Locators{

	public static WebElement firstName_locator() {
		return driver.findElement(By.id("first_name"));	
	}
	public static WebElement lastName_locator() {
		return driver.findElement(By.id("last_name"));	
	}
	public static WebElement billingAddress_locator() {
		return driver.findElement(By.id("address"));	
	}
	public static WebElement creditCardNum_locator() {
		return driver.findElement(By.id("cc_num"));	
	}
	public static WebElement creditCardType_locator() {
		return driver.findElement(By.id("cc_type"));	
	}
	public static WebElement expiryMonth_locator() {
		return driver.findElement(By.id("cc_exp_month"));	
	}
	public static WebElement expiryYear_locator() {
		return driver.findElement(By.id("cc_exp_year"));	
	}
	public static WebElement cvvNum_locator() {
		return driver.findElement(By.id("cc_cvv"));	
	}
	public static WebElement bookNowButton_locator() {
		return driver.findElement(By.id("book_now"));	
	}
	public static WebElement cancelButton_locator() {
		return driver.findElement(By.id("cancel"));	
	}
}
