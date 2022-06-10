package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class Draggable extends BaseTest{

	 
	   public void checkSimple() {
			
			getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-simple']")).click();
			
			Actions actions = new Actions(getDriver());
			WebElement from = getDriver().findElement(By.xpath("//div[@id='dragBox']"));
			WebElement to = getDriver().findElement(By.xpath("//div[@id='dragBox']"));
			actions.dragAndDrop(from, to).perform();
	   }
	    public void checkAxisRestricted() {
			
			getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-axisRestriction']")).click();
			
			Actions actions = new Actions(getDriver());
			WebElement from = getDriver().findElement(By.xpath("//div[@id='restrictedX']"));
			WebElement to = getDriver().findElement(By.xpath("//div[@id='restrictedX']"));
			actions.dragAndDrop(from, to).perform();
	    }
	    
	    
	    public void checkContainerRestricted() {
	    	
			getDriver().findElement(By.xpath("//a[@id=['draggableExample-tab-containerRestriction]")).click();
			
			Actions actions = new Actions(getDriver());
			WebElement From = getDriver().findElement(By.xpath("//div[@id='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
			WebElement To = getDriver().findElement(By.xpath("//div[@id='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
			actions.dragAndDrop(From,To).perform();
	    }  
	}          	   
	
	
	
	
	
	
}
