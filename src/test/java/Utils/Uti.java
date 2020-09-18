package Utils;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import objrepo.flightList;
import objrepo.launchpage;



public class Uti{
	
	public static void click(WebElement objWebElement){
		
		objWebElement.click();		
}
	
	public static void datePicker(WebElement objWebElement, String date){

		objWebElement.clear();
		objWebElement.sendKeys(date);
}
	
	public static void type(WebElement objWebElement, String value){
		objWebElement.clear();
		objWebElement.sendKeys(value);
}
	
	public static void selectDropDown(WebElement objWebElement, String dropdownItem, String byOption){
		Select sel= new Select(objWebElement);
		if(byOption.equalsIgnoreCase("value")){
			sel.selectByValue(dropdownItem);
		}
		if(byOption.equalsIgnoreCase("visibleText")){
			sel.selectByVisibleText(dropdownItem);
		} 
}
	
	public static boolean isElementClickable(WebElement objWebElement){
	    try {
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(setup.driver, 50)
            			.ignoring(StaleElementReferenceException.class); 
            wait.until(ExpectedConditions.elementToBeClickable(objWebElement));
	    } catch(NoSuchElementException noElement){
	    	noElement.printStackTrace();
	        throw noElement;
	    } catch(TimeoutException notClickable){
	    	notClickable.printStackTrace();
	    	return false;
	    }
	    
		return true;
	}
	
	public static boolean isElementenable(WebElement objWebElement){
	    try {
            WebDriverWait wait = (WebDriverWait) new WebDriverWait(setup.driver, 50)
            			.ignoring(StaleElementReferenceException.class); 
            wait.until(ExpectedConditions.visibilityOf(objWebElement));
	    } catch(NoSuchElementException noElement){
	    	noElement.printStackTrace();
	        throw noElement;
	    } catch(TimeoutException notClickable){
	    	notClickable.printStackTrace();
	    	return false;
	    }
	    
		return true;
	}
    
	
	
	
	public static void tab(WebElement objWebElement){
		
				objWebElement.sendKeys(Keys.TAB);

	}
	
	

	  
	  public static void initAllPages(){
	    	PageFactory.initElements(setup.driver, launchpage.class);
	    	PageFactory.initElements(setup.driver, flightList.class);
	    	
	    	
	    }
	  
	
	  
}
