package objrepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class launchpage {
	

		public launchpage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		} 
		
		@FindBy(id ="RoundTrip")
	    public WebElement RoundTrip;
		
		@FindBy(id ="FromTag")
	    public WebElement From;
		
		@FindBy(id ="ui-id-59")
	    public List<WebElement> FromList;
		
		@FindBy(id ="ui-id-59")
	    public WebElement FromListbox;
		
		@FindBy(id ="ui-id-70")
	    public WebElement ToList;
		
		@FindBy(id ="ToTag")
	    public WebElement To;
		
		@FindBy(xpath ="//input[@id='SearchBtn']" )
	    public WebElement SearchFlights;
		
		
		@FindBy(id ="DepartDate")
	    public WebElement Departon;
		
		@FindBy(id ="ReturnDate")
	    public WebElement Returnon;

		
	}
