package oh.capg;



import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.LoginPage;
import pages.MyInfoPage;

import org.openqa.selenium.By;

import browser.Browser;

public class EditPDStepDefinition extends Browser{
	
	
	@Given("user is on personal details module of my info module")
	public void user_is_on_personal_details_module_of_my_info_module() {
	try {	
		String url =ReadData.config("url"); //login
		String loginbutton =ReadData.config("Login_button"); 
		LoginPage.cpage(url);
	    driver.findElement(By.id(loginbutton)).click();
		Locators.myinfo().click();
		MyInfoPage.personal_details();  //clicking on personal details
		
	    
	}catch(Exception e) {
		System.out.println("error in login");	
	}
	}

	@When("user click on edit personal details")
	public void user_click_on_edit_personal_details() {
		System.out.println("user is on personal details module");
	   
	}

	@And("user enters all the required details")
	public void user_enters_all_the_required_details() {
		try {
		Locators.edit_save_pd().click();
		Locators.first_name().clear();
		Locators.first_name().sendKeys("Harsha");
		Locators.last_name().clear();
		Locators.last_name().sendKeys("Vardhan");
		Locators.edit_save_pd().click();
		
	 
	}catch(Exception e) {
		System.out.println("error in entering personal details");
	}
	}
	@Then("user is able to succesfully save the details")
	public void user_is_able_to_succesfully_save_the_details() {
		try {
		String username =Locators.first_name().getAttribute("value");
	   if(username.contains("Harsha")) {
		   
		   System.out.println("User is able to succesfully save the details ");
	   }
		
	}catch(Exception e) {
		System.out.println("error in fetching value of firstname");
	}
	}
}
