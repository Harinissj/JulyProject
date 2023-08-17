package com.adactin.pageexe;

import com.adactin.base.AdactinBaseClass;
import com.adactin.pageObject.BookingPage_Locators;

public class Booking_PageExe extends SelectHotel_PageExe {
	
	public static void firstName_pageExe() {
		AdactinBaseClass.inputData(BookingPage_Locators.firstName_locator(), AdactinBaseClass.excelTestData(2,2));
	}
	public static void lastName_pageExe() {
		AdactinBaseClass.inputData(BookingPage_Locators.lastName_locator(), AdactinBaseClass.excelTestData(3,2));
	}
	public static void billingAddress_pageExe() {
		AdactinBaseClass.inputData(BookingPage_Locators.billingAddress_locator(), AdactinBaseClass.excelTestData(4,2));
	}
	public static void ccNum_pageExe() {
		AdactinBaseClass.inputData(BookingPage_Locators.creditCardNum_locator(), AdactinBaseClass.excelTestData(5,2));
	}
	public static void ccType_pageExe() {
		AdactinBaseClass.selectDropDownByValue(BookingPage_Locators.creditCardType_locator(), AdactinBaseClass.excelTestData(12,2));
	}
	public static void expMonth_pageExe() {
		AdactinBaseClass.selectDropDownByValue(BookingPage_Locators.expiryMonth_locator(), AdactinBaseClass.excelTestData(13,2));
	}
	public static void expYear_pageExe() {
		AdactinBaseClass.selectDropDownByValue(BookingPage_Locators.expiryYear_locator(), AdactinBaseClass.excelTestData(14,2));
	}
	public static void cvv_pageExe() {
		AdactinBaseClass.inputData(BookingPage_Locators.cvvNum_locator(), AdactinBaseClass.excelTestData(6,2));
	}
	public static void bookNow_pageExe() {
		AdactinBaseClass.clickButton(BookingPage_Locators.bookNowButton_locator());
	}
	public static void cancel_pageExe() {
		
	}
}
