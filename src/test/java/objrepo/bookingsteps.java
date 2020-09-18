package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingsteps {
	
	public bookingsteps(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(id ="itineraryBtn")
    public WebElement Continuebooking;
	
	
	@FindBy(id ="insurance_box")
    public WebElement insurancebox;
	
	
	//--------- step 2------------------
	
	@FindBy(id ="LoginContinueBtn_1")
    public WebElement step2continue;
	
	@FindBy(id ="username")
    public WebElement email;
	
	
	//------------ step3----------
	
	
	@FindBy(id ="AdultFname1")
    public WebElement firstname;
	
	@FindBy(id ="AdultTitle1")
    public WebElement title;
	
	@FindBy(id ="AdultLname1")
    public WebElement lastname;
	
	
	@FindBy(id ="mobileNumber")
    public WebElement mobilenumber;
	
	
	@FindBy(id ="travellerBtn")
    public WebElement continuepayment;
	
	@FindBy(xpath="//*[@id='travellerDone']/div/span/span[2]")
	public WebElement tick;
	
	
	
}
