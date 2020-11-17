package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ContactFormSubmission {
	WebDriver driver;
	public String parentHandle;

	By txt_yourMessage=By.cssSelector("textarea.contact-msg");
	By txt_Fullname=By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]");
	By txt_email=By.xpath("//input[@id='contact-email']");

	By checkbox_tick=By.xpath("//input[@id='confirm']");



	By btn_Submit=By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[1]/button[1]");
	public ContactFormSubmission(WebDriver driver)
	{
		this.driver=driver;

	}

	
	
	
	public void UserNavigates()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,4250)", "");
	    
	    
	    parentHandle = driver.getWindowHandle(); // get the current window handle
	 //   System.out.println("title---- "+parentHandle+"");
	    driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click(); // click some link that opens a new window
	
	    for (String winHandle : driver.getWindowHandles()) {
	        driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	    }
	}
	public void ContactformdetailsEntry(String Messagecontent,String Fullname, String Email) throws InterruptedException
	{
		driver.findElement(txt_yourMessage).click();	
		driver.findElement(txt_yourMessage).sendKeys(Messagecontent);

		driver.findElement(txt_Fullname).sendKeys(Fullname);	
		driver.findElement(txt_email).sendKeys(Email);
		Thread.sleep(3000);
	}

	public void checkboxtickcheck()
	{
		driver.findElement(checkbox_tick).click();	
	}

	public void submitBtnClick()
	{
		driver.findElement(btn_Submit).click();

	}


	public void detailsSubmissionCheck() throws InterruptedException
	{
		String strtextdisplayed=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[4]/footer[1]/div[1]/div[3]/div[1]/div[1]/a[1]")).getText();
		//System.out.println("String is=="+strtextdisplayed+"");
		String stractualdisplayed="About";
		if(stractualdisplayed.contentEquals(strtextdisplayed))
		{
			System.out.println("Form submitted successfully");	
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(2000);
			driver.switchTo().window(parentHandle);
		//	driver.findElement(By.xpath("//a[@href='https://company.trivago.com/open-positions']")).click();
			driver.close();
		}
		else
		{
			System.out.println("Error in Submission");		
			driver.close();
		}		
	}

	public void submitbtnclickforblankdetails() throws InterruptedException
	{


		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,-250)", "");
		Thread.sleep(1000);
		driver.findElement(btn_Submit).click();
	}
	public void checkProperErrorMessage() throws InterruptedException
	{
		String strterrormsgallfields=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]")).getText();
		//System.out.println("sss"+strt9+"");


		String strerrormsgallfieldsactual="All fields are required.";
		Thread.sleep(2000);
		if(strterrormsgallfields.contentEquals(strerrormsgallfieldsactual))
		{
			System.out.println("Proper error message is displayed");	
			Thread.sleep(2000);
			driver.close();
//			Thread.sleep(2000);
//			driver.switchTo().window(parentHandle);
//		driver.findElement(By.xpath("//a[@href='https://company.trivago.com/open-positions']")).click();
//			driver.close();
//	
			

		}
		else
		{
			System.out.println("Error in message displayed");		
		}		

	}
public void checkboxfunctioncheck() throws InterruptedException
{
	String checkboxerrormessage=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]")).getText();
	//System.out.println("sss"+checkboxerrormessage+"");
	String checkboxactualmsg="Please mark the checkbox.";
	
	
	if(checkboxerrormessage.contentEquals(checkboxactualmsg))
	{
		System.out.println("Proper error message is displayed marking checkbox");	
		//Thread.sleep(3000);
		//driver.close();
		
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentHandle);
	//	driver.findElement(By.xpath("//a[@href='https://company.trivago.com/open-positions']")).click();
		driver.close();

	}
	else
	{
		System.out.println("Error in message displayed there");		
	}		

}
public void InvalidEmailaddressEntry(String Messagecontents, String name, String email)
{
	
	driver.findElement(txt_yourMessage).sendKeys(Messagecontents);

	driver.findElement(txt_Fullname).sendKeys(name);	
	driver.findElement(txt_email).sendKeys(email);
	
	JavascriptExecutor js4 = (JavascriptExecutor) driver;
	js4.executeScript("window.scrollBy(0,350)", "");
}

public void Emailaddressvalidationcheck()
{
	String emailvaliderrormessage=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]")).getText();
	
	String emailvalidactualerrormessage="Please provide a valid email address.";
	if(emailvaliderrormessage.contentEquals(emailvalidactualerrormessage))
	{
		System.out.println("Proper error message is displayed for email validation");	
		//Thread.sleep(3000);
		
		driver.close();
		

	}
	else
	{
		System.out.println("Error in message displayed there for email validation");		
	}		
}

}



