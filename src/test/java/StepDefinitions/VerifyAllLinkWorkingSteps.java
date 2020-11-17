//package StepDefinitions;
//
//import java.awt.List;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class VerifyAllLinkWorkingSteps {
//	WebDriver driver=null;
//	@Given("User is in homepage")
//	public void user_is_in_homepage() throws InterruptedException {
//
//
//
//		
//		String Projectpath=System.getProperty("user.dir");
//		System.out.println("Project path is"+Projectpath);
//		System.setProperty("webdriver.chrome.driver",Projectpath+"/src/test/resources/drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://magazine.trivago.com/");
//		Thread.sleep(4000);		
//
//
//
//
//
//	}
//
//	@And("identify all links")
//	public void identify_all_links() {
//
//
//		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
//
//
//
//		System.out.println("Total links are "+links.size());
//
//
//
//		for(int i=0;i<links.size();i++)
//
//		{
//
//			WebElement ele= links.get(i);
//
//			String url=ele.getAttribute("href");
//
//
//			verifyLinkActive(url);
//		}
//
//	}
//
//
//	@Then("Working links are identified")
//	public void verifyLinkActive(String linkUrl)
//
//	{
//
//		try
//
//		{
//
//			URL url = new URL(linkUrl);
//
//
//
//			HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
//
//
//
//			httpURLConnect.setConnectTimeout(3000);
//
//
//
//			httpURLConnect.connect();
//
//
//
//			if(httpURLConnect.getResponseCode()==200)
//
//			{
//
//				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
//
//			}
//
//			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
//
//			{
//
//				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
//
//			}
//
//		} catch (Exception e) {
//
//
//		}
//	}  
//
//
//
//
//
//
//
//
//
//
//
//
//}
//
//
