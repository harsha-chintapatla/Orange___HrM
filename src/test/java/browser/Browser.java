package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver driver;
public static void gotourl(String url){
	String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driverPath);
    driver= new ChromeDriver();
    driver.get(url);//orangeHrm
    driver.manage().window().maximize();  
    }

}
