package test;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.Uti;
import Utils.setup;
import objrepo.bookingsteps;
import objrepo.flightList;
import objrepo.launchpage;

public class cleartripTest extends setup {
  
	@Test
  public void searchFlight() {	
			try{
				
			
			String title= driver.getTitle();
			Assert.assertTrue(title.contains("Cleartrip")); 
			
			
			launchpage objlaunchpage = new launchpage(driver);
			flightList objflightList = new flightList(driver);
			bookingsteps objbookingsteps = new bookingsteps(driver);
			Uti.click(objlaunchpage.RoundTrip);
			
			String selectvaluefrom = "Abu Dhabi, AE - Abu Dhabi International Airport (AUH)";
			Uti.type(objlaunchpage.From, selectvaluefrom);			
			
			List<WebElement> fromLists = objlaunchpage.FromList;
			for(WebElement fromList: fromLists) {
	            if(fromList.getText().trim().equalsIgnoreCase(selectvaluefrom)) {
	            	fromList.click();
	                break;
	            }
	        }
			
			String from = objlaunchpage.From.getAttribute("value");
	        System.out.println("=> from   : "+from); 
	        
	        Thread.sleep(2000);
	        
	        String selectvalueto = "New Delhi, IN - Indira Gandhi Airport (DEL)";
			Uti.type(objlaunchpage.To, selectvalueto);			
			
			List<WebElement> toLists = objlaunchpage.FromList;
			for(WebElement toList: toLists) {
	            if(toList.getText().trim().equalsIgnoreCase(selectvalueto)) {
	            	toList.click();
	                break;
	            }
	        }
			
			String to = objlaunchpage.To.getAttribute("value");
	        System.out.println("=> To   : "+to); 
	        
	        
	        Uti.type(objlaunchpage.Departon, CONFIG.getProperty("departon"));
	        Uti.type(objlaunchpage.Returnon, CONFIG.getProperty("returnon"));
	        Thread.sleep(2000);
	        Uti.tab(objlaunchpage.Returnon);	        
	        
	        
	        Uti.isElementClickable(objlaunchpage.SearchFlights);
	   
	        Uti.click(objlaunchpage.SearchFlights);	 
	        Thread.sleep(5000);
	        
	
	       Uti.isElementClickable(objflightList.firstflighbook);
	       
	       Uti.click(objflightList.firstflighbook);
	       Thread.sleep(2000);
	       
	       String MainWindow=driver.getWindowHandle();	
	       
	      
   		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	   
	                   String title1= driver.getTitle();
	                   System.out.println("booking window title"+title1);
	                                   			
	                    Thread.sleep(2000);
	                    
	                    Uti.isElementClickable(objbookingsteps.insurancebox);
		         	       	         	       
	         	       if((objbookingsteps.insurancebox.isSelected())){
	         	    	   
	         	    	   Uti.click(objbookingsteps.insurancebox);
	         	    	   
	         	       }
	         	       Uti.isElementClickable(objbookingsteps.Continuebooking);
	         	    
	         	       Uti.click(objbookingsteps.Continuebooking);
	         	       
	         	       Uti.isElementenable(objbookingsteps.email);
	         	       Uti.type(objbookingsteps.email, CONFIG.getProperty("email"));
	         	       
	         	       Uti.isElementenable(objbookingsteps.step2continue);
	         	       Uti.click(objbookingsteps.step2continue);
	         	       
	         	       Uti.isElementenable(objbookingsteps.title);
	         	       Uti.selectDropDown(objbookingsteps.title, CONFIG.getProperty("title"), "value");
	         	       Uti.type(objbookingsteps.firstname, CONFIG.getProperty("firstname"));
	         	       Uti.type(objbookingsteps.lastname, CONFIG.getProperty("lastname"));
	         	       Uti.type(objbookingsteps.mobilenumber, CONFIG.getProperty("mobilenumber"));
	         	       Uti.click(objbookingsteps.continuepayment);
	         	       
	         	       Uti.isElementenable(objbookingsteps.tick);
	         	       System.out.println("success");
	         	       
	                    			
	            
	            }		
	        }	    
	        
	      
	        
	        
	        
			
			}catch (Exception e){
				e.printStackTrace();
			}	
		
	
  }
	}

	
