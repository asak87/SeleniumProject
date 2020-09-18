package objrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightList {
	
	

	public flightList(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath ="//*[@id='root']/div/main/div/div")
    public WebElement table;
	
	@FindBy(css ="div:nth-child(1) > .bg-white .bg-orange")
    public WebElement firstflighbook;
	
	
	@FindBy(xpath ="//td[contains(text(),'flights')]")
	public WebElement noofflight;
}
