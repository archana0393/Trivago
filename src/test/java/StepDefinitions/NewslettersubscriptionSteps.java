package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.NewsletterSubscription;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewslettersubscriptionSteps {
	

	WebDriver driver=null;
public NewsletterSubscription subscription;
	@Given("User opens Home page")
	public void user_is_in_Home_page() throws InterruptedException {
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

	@And("Navigates to subscriber Newsletter form")
	public void navigates_to_subscriber_Newsletter_form() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,3800)", "");
	}

	@When("^The User enters (.*)$")
	public void user_submitdata(String Invalidemail) {
		
		subscription=new NewsletterSubscription(driver);
		subscription.InvalidEmailEntry(Invalidemail);
		
		
	}

	@Then("Proper validation message is displayed there")
	public void proper_validation_message_is_displayed_there() throws InterruptedException {
		subscription.InvalidEmailCheck();
	  
	}
	

	@When("^Passs valid email (.*)$")
	 
	public void user_entering_validemail_com(String Validemail) {
		subscription=new NewsletterSubscription(driver);
		subscription.ValidEmailEntry(Validemail);
	}
	@And("Click on Inspire Me button")
	public void click_on_Inspire_Me_button() throws InterruptedException {
		subscription=new NewsletterSubscription(driver);
		subscription.SubmitbuttonClick();
	}

	@Then("User is Subscribed to the  Newsletter successfully")
	public void user_is_Subscribed_to_the_Newsletter_successfully() throws InterruptedException {
		subscription=new NewsletterSubscription(driver);
		subscription.NewsletterSubscriptioncheck();
		
		
	}


}
