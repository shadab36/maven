package webApp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sivvi_Wep_application_Method {
	public static WebDriver driver = null;
	PerformAction action = new PerformAction();
	int rno = FileData.nextNumber();

	@Given("^navigates to sivvi\\.com$")
	public void navigates_to_sivvi_com() {
		try {
			System.setProperty(CommonData.Chrome_Name, CommonData.Chrome_Path);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			PerformAction.SLEEP_TIME = 2000;
			driver.get(CommonData.URL);
			action.implictywait(driver);
		} catch (Exception e) {

		}

	}

	@Then("^close the popup message$")
	public void close_the_popup_message() {
		try {
			action.performXpathClick(driver, "(//*[@class='fa fa-close'])[2]");
			action.implictywait(driver);
		} catch (Exception e) {

		}
	}

	@Then("^click on Register button$")
	public void click_on_Register_button() {
		try {
			action.performXpathClick(driver,
					"//*[@class='topmenu']/ul/li/a[(@href='https://sivvi.com/customer/account/create/')]");
			action.implictywait(driver);
		} catch (Exception e) {

		}
	}

	@Then("^he/she select the gender$")
	public void he_she_select_the_gender() {
		try {
			// select male
			action.performXpathClick(driver, "(//*[@class='radio'])[1]");
			action.implictywait(driver);
		} catch (Exception e) {

		}
	}

	@Then("^he/she provides the first name as \"([^\"]*)\"$")
	public void he_she_provides_the_first_name_as(String Fname) throws Exception {

		action.performSendDataById(driver, "firstname", Fname);
		action.implictywait(driver);

	}

	@Then("^he/she provides the last name as \"([^\"]*)\"$")
	public void he_she_provides_the_last_name_as(String arg1) {
		try {
			action.performSendDataById(driver, "lastname", arg1);
			action.implictywait(driver);
		} catch (Exception e) {
		}
	}

	@Then("^he/she provides the email as \"([^\"]*)\"$")
	public void he_she_provides_the_email_as(String email) {
		try {
			action.performSendDataById(driver, "email_address", email);
			action.implictywait(driver);
		} catch (Exception e) {
		}
	}

	@Then("^he/she provides the confirm email again as \"([^\"]*)\"$")
	public void he_she_provides_the_confirm_email_again_as(String cemail) {
		try {
			action.performSendDataById(driver, "billing:confirm_email", cemail);
			action.implictywait(driver);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,400)", "");
			action.implictywait(driver);
		} catch (Exception e) {
		}
	}

	@Then("^he/she provides the password as \"([^\"]*)\"$")
	public void he_she_provides_the_password_as(String password) {
		try {
			action.performSendDataById(driver, "password", password);
			action.implictywait(driver);
		} catch (Exception e) {
		}
	}

	@Then("^he/she provides the confirm password again as \"([^\"]*)\"$")
	public void he_she_provides_the_confirm_password_again_as(String conPass) {
		try {
			action.performSendDataById(driver, "confirmation", conPass);
			action.implictywait(driver);
		} catch (Exception e) {
		}

	}

	@Then("^he/she check the checkbox button$")
	public void he_she_check_the_checkbox_button() {
		try {
			
		//	driver.findElement(By.id("is_subscribed")).click();
			//action.performIDClick(driver, "is_subscribed");
		//	action.implictywait(driver);
		} catch (Exception e) {
		}

	}

	@Then("^he/she click on Continue button$")
	public void he_she_click_on_Continue_button() {
		try {
			action.performXpathClick(driver, "//*[@title='Continue']");
			action.implictywait(driver);
		} catch (Exception e) {
		}

	}

	@Then("^he/she close the application$")
	public void he_she_close_the_application() {

		driver.close();
		try {
			PerformAction.SLEEP_TIME = 4000;
		} catch (Exception e) {

			e.printStackTrace();
		}
		;

	}
	@Then("^he/she Verify \"([^\"]*)\" for \"([^\"]*)\" validation message for first name$") 
	//@Then("^he/she Verify \"([^\"]*)\" for \"([^\"]*)\" validation message for first name$")
        
	public void he_she_Verify_for_validation_message_for_first_name(String arg1, String arg2){
		try {
		PerformAction.SLEEP_TIME = 1000;
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Then("^he/she verify \"([^\"]*)\" for \"([^\"]*)\" validation message for last name$")
	public void he_she_verify_for_validation_message_for_last_name(String arg1, String arg2) {
		PerformAction.SLEEP_TIME = 1000;
	}

	@Then("^he/she verfiy \"([^\"]*)\" for \"([^\"]*)\" validation message for email$")
	public void he_she_verfiy_for_validation_message_for_email(String arg1, String arg2)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

	@Then("^he/she verfiy \"([^\"]*)\" for \"([^\"]*)\" validation message for confirm email$")
	public void he_she_verfiy_for_validation_message_for_confirm_email(String arg1, String arg2) throws Throwable {
		try {
			PerformAction.SLEEP_TIME = 1000;
			}catch (Exception e){
				e.printStackTrace();
			}
	}

	@Then("^he/she Verify \"([^\"]*)\" for \"([^\"]*)\" validation message for password$")
	public void he_she_Verify_for_validation_message_for_password(String arg1, String arg2) throws Throwable {
		try {
			PerformAction.SLEEP_TIME = 1000;
			}catch (Exception e){
				e.printStackTrace();
			}
	}

	@Then("^he/she Verify \"([^\"]*)\" for \"([^\"]*)\" validation message for confirm password$")
	public void he_she_Verify_for_validation_message_for_confirm_password(String arg1, String arg2) throws Throwable {
		try {
			PerformAction.SLEEP_TIME = 1000;
			}catch (Exception e){
				e.printStackTrace();
			}
	}

	@Then("^Then \"([^\"]*)\" for \"([^\"]*)\" for \"([^\"]*)\" for \"([^\"]*)\" for confirm \"([^\"]*)\" for \"([^\"]*)\" and for confirm \"([^\"]*)\" validation for all invalid credentials$")
	public void then_for_for_for_for_confirm_for_and_for_confirm_validation_for_all_invalid_credentials(String arg1,
			String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		try {
			PerformAction.SLEEP_TIME = 1000;
			}catch (Exception e){
				e.printStackTrace();
			}
	}

}
