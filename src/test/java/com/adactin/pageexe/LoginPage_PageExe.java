package com.adactin.pageexe;
import com.adactin.base.AdactinBaseClass;
import com.adactin.pageObject.*;

public class LoginPage_PageExe extends BookingPage_Locators{
	public static void username() {
		AdactinBaseClass.inputData(LoginPage_Locators.username_locator(), AdactinBaseClass.propertiesTestData("username"));
	}
	public static void password() {
		AdactinBaseClass.inputData(LoginPage_Locators.password_locator(), AdactinBaseClass.propertiesTestData("password"));
	}
	public static void loginButton() {
		AdactinBaseClass.clickButton(LoginPage_Locators.loginButton_locator());
	}
}
