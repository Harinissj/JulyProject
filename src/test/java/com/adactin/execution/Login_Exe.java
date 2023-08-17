package com.adactin.execution;


import org.junit.Test;
import com.adactin.pageexe.Booking_PageExe;

public class Login_Exe extends Booking_PageExe {

@Test
public void testone() {
		//browserLaunch();
		url(propertiesTestData("url"));
		username();
		password();
		screenshot();
		loginButton();
		location_pageExe();
		hotels_pageExe();
		roomType_pageExe();
		numberOfRooms_pageExe();
		checkIn_pageExe();
		checkOut_pageExe();
		adult_pageExe();
		child_pageExe();
		screenshot();
		searchButton_pageExe();
		radioButton_pageExe();
		screenshot();
		continue_pageExe();
		firstName_pageExe();
		lastName_pageExe();
		billingAddress_pageExe();
		ccNum_pageExe();
		ccType_pageExe();
		expMonth_pageExe();
		expYear_pageExe();
		cvv_pageExe();
		bookNow_pageExe();
		screenshot();
	}
}