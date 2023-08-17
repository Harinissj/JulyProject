package com.adactin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectHotel_Locators extends SearchHotel_Locators {

	public static WebElement radioButton_locator() {
		return driver.findElement(By.id("radiobutton_0"));	
	}
	public static WebElement continueButton_locator() {
		return driver.findElement(By.id("continue"));	
	}
	public static WebElement cancelButton_locator() {
		return driver.findElement(By.id("cancel"));	
	}
}
