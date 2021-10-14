package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class Locators extends Browser {
public static String geturl() {
		
		String url =  driver.getCurrentUrl();
		return url;
	}
	//login to page
	public static WebElement username() {
		
		WebElement username =  driver.findElement(By.xpath("//input[@name='txtUsername']"));
		return username;
	}
	public static WebElement password() {
		
		WebElement password =  driver.findElement(By.xpath("//input[@name='txtPassword']"));
		return password;
	}
	public static WebElement loginbtn() {
		
		WebElement loginbtn =  driver.findElement(By.xpath("//input[@id='btnLogin']"));
		return loginbtn;
	}
	
	//my info 
	public static WebElement myinfo() {
		WebElement myinfo = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewMyDetails']"));
		return myinfo;
	}
	
	//personal details
	public static WebElement personal_details() {
		WebElement personal = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewPersonalDetails/empNumber/7']"));
	    return personal;
	}
	//edit and save personal details button
	public static WebElement edit_save_pd() {
		WebElement edit_save_pd = driver.findElement(By.xpath("//input[@id='btnSave']"));
		return edit_save_pd;
	}
	
	public static WebElement first_name() {
		WebElement firstname = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		return firstname;
	}
	public static WebElement last_name() {
		WebElement lastname = driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		return lastname;
	}
	
	//navigating to qualifications
	public static WebElement qualifications_module() {
	    WebElement qualifications = driver.findElement(By.xpath("//a[@href='/index.php/pim/viewQualifications/empNumber/7']"));
		return qualifications;
	}
	//add work experience
	public static WebElement add_work_experience() {
		WebElement addworkexperience =  driver.findElement(By.xpath("//input[@id='addWorkExperience']"));
		return addworkexperience;
	}
	public static WebElement comapny_name() {
		WebElement companyname =  driver.findElement(By.xpath("//input[@id='experience_employer']"));
		return companyname;
	}
	public static WebElement designation() {
		WebElement designation =  driver.findElement(By.xpath("//input[@id='experience_jobtitle']"));
		return designation;
	}
	public static WebElement save_work_experience() {
		WebElement  saveworkexperience  = driver.findElement(By.xpath("//input[@id='btnWorkExpSave']"));
		return saveworkexperience;
	}
	public static WebElement saved_work_experience() {
		WebElement  savedworkexperience  = driver.findElement(By.xpath("//*[@class='table hover']/tbody/tr[1]/td[2]"));
		return savedworkexperience;
	}
	
	//add and save education
	public static WebElement add_education() {
		WebElement  addeducation  = driver.findElement(By.xpath("//input[@id='addEducation']"));
		return addeducation;
	}
	public static WebElement select_level() {
		WebElement  level  = driver.findElement(By.xpath("//select[@id='education_code']"));
		return level;
	}
	public static WebElement institute_name() {
		WebElement  institutename  = driver.findElement(By.xpath("//input[@id='education_institute']"));
		return institutename;
	}
	public static WebElement save_education() {
		WebElement  saveeducation  = driver.findElement(By.xpath("//input[@id='btnEducationSave']"));
		return saveeducation;
	}
	
	//add and save language
	public static WebElement add_language() {
		WebElement  addlanguage  = driver.findElement(By.xpath("//input[@id='addLanguage']"));
		return addlanguage;
	}
	public static WebElement select_language() {
		WebElement  selectlanguage  = driver.findElement(By.xpath("//select[@id='language_code']"));
		return selectlanguage;
	}
	public static WebElement select_fluency() {
		WebElement  selectfluency  = driver.findElement(By.xpath("//select[@id='language_lang_type']"));
		return selectfluency;
	}
	public static WebElement select_competency() {
		WebElement  selectcompetency  = driver.findElement(By.xpath("//select[@id='language_competency']")) ;
		return selectcompetency;
	}
	public static WebElement save_language() {
		WebElement  savelanguage  = driver.findElement(By.xpath("//input[@id='btnLanguageSave']")) ;
		return savelanguage;
	}
	//delete selected language
	public static WebElement check_language() {
		WebElement  checklanguage  = driver.findElement(By.xpath("//input[@name='delLanguage[]']"));
		return checklanguage;
	}
	public static WebElement delete_language() {
		WebElement  deletelanguage  = driver.findElement(By.xpath("//input[@id='delLanguage']"));
		return deletelanguage;
	}
	public static WebElement deleted_language() {
		WebElement  deletedlanguage  = driver.findElement(By.xpath("//*[@id='lang_data_table']/tbody/tr[1]/td[2]"));
		return deletedlanguage;
	}
	
	
	
	

	
	
	
}
