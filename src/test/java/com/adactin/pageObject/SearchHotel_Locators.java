package com.adactin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locators extends LoginPage_Locators{

	public static WebElement location_locator() {
		return driver.findElement(By.id("location"));	
	}
	public static WebElement hotels_locator() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement RoomType_locator() {
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement numberOfRooms_locator() {
		return driver.findElement(By.id("room_nos"));
	}
	public static WebElement checkinDate_locator() {
		return driver.findElement(By.id("datepick_in"));
	}
	public static WebElement checkoutDate_locator() {
		return driver.findElement(By.id("datepick_out"));
	}
	public static WebElement adultsPerRoom_locator() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement childPerRoom_locator() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement searchButton_locator() {
		return driver.findElement(By.id("Submit"));
	}
	public static WebElement resetButton_locator() {
		return driver.findElement(By.id("Reset"));
	}
}
