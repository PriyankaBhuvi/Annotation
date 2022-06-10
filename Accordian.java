package com.widgets;

import org.openqa.selenium.By;

import generic.BaseTest;

public class Accordian extends BaseTest{
	
	  public void getAccordianInfo() {
	 
      getDriver().findElement(By.xpath("//div[@id='section1Heading']")).click();

      getDriver().findElement(By.xpath("//div[@id='section2Heading']")).click();

      getDriver().findElement(By.xpath("//div[@id='section3Heading']")).click();

}
}