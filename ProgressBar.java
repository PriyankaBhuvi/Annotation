package com.widgets;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;

public class ProgressBar extends BaseTest{
	
	public void getProgessBar() {
		
		getDriver().findElement(By.xpath("//button[@id='startStopButton']")).click();
		
		
		getDriver().findElement(By.xpath("//button[@id='startStopButton']")).click();
	    
	}    
	    
}    
	    
	    
	