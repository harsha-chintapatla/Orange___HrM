package oh.capg;


import browser.Browser;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;



public class LoginInvalidStepDefinition extends Browser{
	
	String url =ReadData.config("url");//reading data from config.properties
	@Given("Chrome Browser is open")
	public void chrome_browser_is_open() {
	try {
		Browser.gotourl(url);    
	}catch(Exception e)
	{
		System.out.println("error in  opening the browser");
	}
	}
	@Given("user is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() {
	try {	
		System.out.println("user is on OrangeHRM login page");
	 
	}catch(Exception e) {
		System.out.println("user is not able to open orange hrm web page");
	}
	}
	
	
	@When("user enters invalid credentials in {string} and {string} text fields")
	public void user_enters_invalid_credentials_in_and_text_fields(String string, String string2) {
	try {	
		Locators.username().sendKeys(string);
		Locators.password().sendKeys(string2);
		Locators.loginbtn().click();
		
	}catch(Exception e) {
		System.out.println("error in entering the credentials");
	}
	}

	@Then("user is unable to login")
	public void user_is_unable_to_login() {  
		try {
		System.out.println("user is unable to login");
		
	}catch(Exception e) {
		System.out.println("user is able to login with valid credentials");
	}
	}
	@And("the page displays error message invalid credentials")
	public void the_page_displays_error_message_invalid_credentials() { 
		try {
		System.out.println("displays error message invalid credentials");
	   
	}catch(Exception e) {
		System.out.println("error in the last AND step");
	}
	}
}
