package com.adactin.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.adactin.base.AdactinBaseClass;;

public class LoginPage_Locators extends AdactinBaseClass {

	public static WebElement username_locator() {
		return driver.findElement(By.id("username"));
	}

	public static WebElement password_locator() {
		return driver.findElement(By.id("password"));
	}

	public static WebElement loginButton_locator() {
		return driver.findElement(By.id("login"));
	}
}
