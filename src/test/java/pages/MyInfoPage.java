package pages;

import org.openqa.selenium.WebElement;

import locators.Locators;

public class MyInfoPage {
	public static void personal_details() {
		WebElement personaldetails = Locators.personal_details();
		personaldetails.click();
	}
	public static void qualifications() {
		WebElement qualifications = Locators.qualifications_module();
		qualifications.click();
		}
	

}
