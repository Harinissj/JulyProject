package com.adactin.pageexe;

import com.adactin.base.AdactinBaseClass;
import com.adactin.pageObject.SearchHotel_Locators;

public class SearchHotel_PageExe extends LoginPage_PageExe {
	public static void location_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.location_locator(), AdactinBaseClass.excelTestData(7, 2));
	}
	public static void hotels_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.hotels_locator(), AdactinBaseClass.excelTestData(8, 2));
	}
	public static void roomType_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.RoomType_locator(), AdactinBaseClass.excelTestData(9, 2));
	}
	public static void numberOfRooms_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.numberOfRooms_locator(), AdactinBaseClass.excelTestData(15, 2));
	}
	public static void checkIn_pageExe() {
		SearchHotel_Locators.checkinDate_locator().clear();
		AdactinBaseClass.inputData(SearchHotel_Locators.checkinDate_locator(), AdactinBaseClass.excelTestData(0, 2));
	}
	public static void checkOut_pageExe() {
		SearchHotel_Locators.checkoutDate_locator().clear();
		AdactinBaseClass.inputData(SearchHotel_Locators.checkoutDate_locator(), AdactinBaseClass.excelTestData(1, 2));
	}
	public static void adult_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.adultsPerRoom_locator(), AdactinBaseClass.excelTestData(10, 2));
	}
	public static void child_pageExe() {
		AdactinBaseClass.selectDropDownByValue(SearchHotel_Locators.childPerRoom_locator(), AdactinBaseClass.excelTestData(11, 2));
	}
	public static void searchButton_pageExe() {
		AdactinBaseClass.clickButton(SearchHotel_Locators.searchButton_locator());
	}
	public static void resetButton_pageExe() {
		AdactinBaseClass.clickButton(SearchHotel_Locators.resetButton_locator());
	}
	
}
