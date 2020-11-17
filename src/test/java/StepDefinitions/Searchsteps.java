package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Searchlocation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Searchsteps {
	Searchlocation search;

	WebDriver driver=null;
	@Given("User is in trivago magazine home page")
	public void user_is_in_trivago_magazine_home_page() throws InterruptedException {

		System.out.println("inside step-browser is open");
		String Projectpath=System.getProperty("user.dir");
		System.out.println("Project path is"+Projectpath);
		System.setProperty("webdriver.chrome.driver",Projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://magazine.trivago.com/");
		Thread.sleep(3000);




	}

	@And("Clicks on search icon")
	public void clicks_on_search_icon() {
		search=new Searchlocation(driver);
		search.Clicktosearchfield();
	}
	@Then("user is taken to search page.")
	public void user_is_taken_to_search_page() {

	}



	@When("^User enters (.*) in search field$")
	public void user_enters_serach_location_in_search_field(String locationname) {
		search.entersearchkeyword(locationname);


	}

	@And("Click on enter key")
	public void click_on_enter_key() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);

	}

	@Then("Proper search result for corresponding location is displayed")
	public void proper_search_result_for_corresponding_location_is_displayed() throws InterruptedException {

		search.checkValidSearchResult();
		driver.close();
	}
	@When("^Non matching keyword enters(.*)  in search field$")

	public void non_matching_keyword_enters_Kerala_in_search_field(String Invalidlocationname) throws InterruptedException {
		Thread.sleep(3000);
		search.Invalidkeywordsearch(Invalidlocationname);
	} 
	@And("User Clicks on enter key")
	public void user_Clicks_on_enter_key() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot1.keyPress(KeyEvent.VK_PAGE_UP);
		robot1.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	@Then("No results are displayed for the corresponding location")
	public void no_results_are_displayed_for_the_corresponding_location() {

		search.Noresultsearch();
		driver.close();
	}

	@When("user clicks on All destination tab")
	public void user_clicks_on_All_destination_tab() throws InterruptedException {
		search.alldestinationfunctionality();
	}

	@Then("Proper result for all destinations is displayed")
	public void proper_result_for_all_destinations_is_displayed() throws InterruptedException, AWTException {
		search.checkResultForAllDestination();
		driver.close();
		driver.quit();   
	}
}
