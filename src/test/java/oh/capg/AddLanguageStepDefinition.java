package oh.capg;


import org.openqa.selenium.support.ui.Select;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.LoginPage;
import pages.MyInfoPage;

public class AddLanguageStepDefinition {
	@Given("user is on Qualifications module of my info module")
	public void user_is_on_qualifications_module_of_my_info_module() {
		try {
		String url =ReadData.config("url");  //reading data from config.properties
		LoginPage.lpage(url);                //login by using method lpage in LoginPage.java class
		Locators.myinfo().click();           //clicking on my info
		MyInfoPage.qualifications();          //navigating to qualifications
	   
	}catch(Exception e) {
		System.out.println("error in login and navigating to qualifications");
	}
	}
	@When("user click on add language")
	public void user_click_on_add_language() {
		try {
		Locators.add_language().click();
	    
	}catch(Exception e) {
		System.out.println("error on clicking add language");
	}
	}
	@And("user selects language and fluency and competency")
	public void user_selects_language_and_fluency_and_competency() {
		try {
		Select language_dropdown = new Select(Locators.select_language());
	    language_dropdown.selectByIndex(3);
	    Select fluency_dropdown = new Select(Locators.select_fluency());
	    fluency_dropdown.selectByIndex(2);
	    Select competency_dropdown = new Select(Locators.select_competency());
	    competency_dropdown.selectByIndex(3);
	   
	}catch(Exception e) {
		System.out.println("error in entering details of language");
	}
	}

	@Then("user is able to succesfully add language")
	public void user_is_able_to_succesfully_add_language() {
		try {
		Locators.save_language().click();
		 System.out.println("user is able to succesfully add language");
	}catch(Exception e) {
		System.out.println("error in saving language");
	}
	}
}
