package com.widgets;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import generic.BaseTest;

public class DatePicker extends BaseTest {
	
	public void getSelectDate() {
	
		getDriver().findElement(By.xpath("//div[@class='col-md-3 col-sm-12']")).sendKeys("o6/09/2022");
		Date date = new Date();
		System.out.println(date.toString());
		
	}
		public void getDateandTime() {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			String formattedDate = sdf.format(date);
			System.out.println(formattedDate);
		}
}
