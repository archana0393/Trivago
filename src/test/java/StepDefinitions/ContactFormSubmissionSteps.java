package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ContactFormSubmission;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactFormSubmissionSteps {
	WebDriver driver=null;
	ContactFormSubmission contact;
	//public String parentHandle;
	@Given("User is in Home page")
	public void user_is_in_homepage() throws InterruptedException {

				String Projectpath=System.getProperty("user.dir");
				System.out.println("Project path is"+Projectpath);
				System.setProperty("webdriver.chrome.driver",Projectpath+"/src/test/resources/drivers/chromedriver.exe");
					driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("https://magazine.trivago.com/");
			Thread.sleep(4000);	
			}
			@And("User navigates to contact form page")
			public void user_navigates_to_contact_form_page() throws InterruptedException
			{
				contact=new ContactFormSubmission(driver);
				contact.UserNavigates();
			
			
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
		 //   js.executeScript("window.scrollBy(0,4250)", "");
		    
		    
		 //   parentHandle = driver.getWindowHandle(); // get the current window handle
		 //   driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click(); // click some link that opens a new window
		
		 //   for (String winHandle : driver.getWindowHandles()) {
		 //       driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		//    }
		 
		     
			}
			@Then("user is in contact form page")
			public void user_is_in_contact_form_page() {
			   
			}
		
			@When("^User enters (.*),(.*) and (.*)$")
			public void user_enters_details(String Messagecontent,String Fullname, String Email) throws InterruptedException {
				
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//	contact=new ContactFormSubmission(driver);
				
				contact.ContactformdetailsEntry(Messagecontent,Fullname,Email);
				
				
				
						
			
				
			}
		
			@And("User clicks on checkbox")
			public void user_clicks_on_checkbox() {
			contact.checkboxtickcheck();	
			}
		
			@And("Click on submit button")
			public void click_on_submit_button() {
		contact.submitBtnClick();
				
				 //driver.close(); close newly opened window when done with it
				//driver.switchTo().window(parentHandle);   
			    
			}
		
			@Then("Contact form submitted successfully.")
			public void contact_form_submitted_successfully() throws InterruptedException {
			   contact.detailsSubmissionCheck();
			   
				// driver.close(); 
			}
			
			@When("User clicks on submit button")
			public void user_clicks_on_submit_button() throws InterruptedException {
				//new ContactFormSubmission(driver);
				contact=new ContactFormSubmission(driver);
				 contact.submitbtnclickforblankdetails();
				 
			}
		
			@Then("Proper error message is displayed")
			public void proper_error_message_is_displayed() throws InterruptedException {
				//contact=new ContactFormSubmission(driver);
			   contact.checkProperErrorMessage();
			  // driver.close();
				// driver.switchTo().window(parentHandle);
				// driver.close();
			}
			@When("click on submit button without marking checkbox")
			public void click_on_submit_button_without_marking_checkbox() {
				contact.submitBtnClick();
			}
		
			@Then("Proper error message is displayed in order to tick the checkbox")
			public void proper_error_message_is_displayed_in_order_to_tick_the_checkbox() throws InterruptedException {
			   contact.checkboxfunctioncheck();
			  // driver.close();
				// driver.switchTo().window(parentHandle);
				// driver.close();
			}
		
			@When("^User entering (.*),(.*) and (.*)$")
			public void user_entering_agrvc(String Messagecontents, String name, String email ) {
				contact=new ContactFormSubmission(driver);
				contact.InvalidEmailaddressEntry(Messagecontents,name,email);
				
				
				
				
			}
		
			@Then("Proper error message for email validation is displayed")
			public void proper_error_message_for_email_validation_is_displayed() throws InterruptedException {
			 contact.Emailaddressvalidationcheck();
			// driver.close();
				//driver.switchTo().window(parentHandle);
			//	driver.close();
			//	driver.quit();
			}
		}
