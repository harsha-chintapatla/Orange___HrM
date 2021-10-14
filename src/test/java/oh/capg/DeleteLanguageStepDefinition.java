package oh.capg;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import pages.MyInfoPage;

public class DeleteLanguageStepDefinition {
	{
	MyInfoPage.qualifications();
	}


@When("user checks checkbox of any added language")
public void user_checks_checkbox_of_any_added_language() {
	try {
	Locators.check_language().click();
    
}catch(Exception e) {
	System.out.println("error in check language");
}
}
@And("user clicks on delete")
public void user_clicks_on_delete() {
	try {
	Locators.delete_language().click();
   
}catch(Exception e) {
	System.out.println("error in deleting language");
}
}
@Then("user is able to succesfully delete the corresponding language added")
public void user_is_able_to_succesfully_delete_the_corresponding_language_added() {
	try {
	String res = Locators.deleted_language().getAttribute("value");
	if(res==null) {
		System.out.println("User is able to succesfully delete added language");
	}else {
		System.out.println("User is not able to delete the language added");
	}

}catch(Exception e) {
	System.out.println("error in the last method THEN");
}
}
}
