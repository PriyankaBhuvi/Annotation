package com.widgets;


import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Slider extends BaseTest{
	
	public void getSlider() {
	
		  WebElement slider = getDriver().findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		    Actions actions = new Actions(getDriver());
		    actions.dragAndDropBy(slider, 30, 0);
		  
	}
	

}

