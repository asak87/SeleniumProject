package Utils;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
	
	public static WebDriver driver=null;
	public static Properties CONFIG=null;
	
	public void initConfigurations(){
		 CONFIG = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
			CONFIG.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void initDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
	
	public static void navigate()	
	{
		driver.get(CONFIG.getProperty("url"));
	}
	
	
	@BeforeSuite
	public void init(){
		initConfigurations();
		initDriver();
		navigate();
		
	}
	
/*	@AfterSuite
	public void quitDriver() throws Throwable{
		try {
			Thread.sleep(30);			
			driver.quit();
			} catch (Exception e) {
			  e.printStackTrace();
			}finally{
				driver=null;}
	}
*/
 }
