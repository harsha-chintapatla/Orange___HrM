package oh.capg;


import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.MyInfoPage;

public class AddEducationStepDefinition {
	
	{
		MyInfoPage.qualifications();
	}
	@When("user click on add education")
	public void user_click_on_add_education() {
		try {
		Locators.add_education().click();
	    
	}catch(Exception e) {
		System.out.println("error in clicking on add education");
	}
	}
	@And("user enters degree and isntitute name")
	public void user_enters_degree_and_isntitute_name() {
		try {
		 Select education_level_dropdown = new Select(Locators.select_level());
	      education_level_dropdown.selectByIndex(1);
	      Locators.institute_name().sendKeys("XYZ College");
	   
	}catch(Exception e) {
		System.out.println("error in entering details");	
	}
	}

	@Then("user is able to succesfully add education details")
	public void user_is_able_to_succesfully_add_education_details() {
		try {
		Locators.save_education().click();
		System.out.println("user is able to succesfully add education details");
	}catch (Exception e) {
		System.out.println("error insaving education");	
	}
	}

}
