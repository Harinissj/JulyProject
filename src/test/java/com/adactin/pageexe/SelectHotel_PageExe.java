package com.adactin.pageexe;

import com.adactin.base.AdactinBaseClass;
import com.adactin.pageObject.SelectHotel_Locators;

public class SelectHotel_PageExe extends SearchHotel_PageExe{
	public static void radioButton_pageExe() {
		AdactinBaseClass.clickButton(SelectHotel_Locators.radioButton_locator());
	}
	public static void continue_pageExe() {
		AdactinBaseClass.clickButton(SelectHotel_Locators.continueButton_locator());
	}
	public static void cancel_pageExe() {
		AdactinBaseClass.clickButton(SelectHotel_Locators.cancelButton_locator());
	}
}
