package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NewsletterSubscription {
	
	WebDriver driver;
	
	By txt_email=By.xpath("//input[@name='email']");
	By btn_submit=By.xpath("//button[@class='submit']");

	
	
	
	public NewsletterSubscription(WebDriver driver)
	{
		this.driver=driver;
	}
	public void InvalidEmailEntry(String Invalidemail)
	{
		driver.findElement(txt_email).sendKeys(Invalidemail);	
		
	}
	public void InvalidEmailCheck() throws InterruptedException
	{
		
		String strerror=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[4]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")).getText();

		String stractual="Please enter a valid e-mail address";
		if(strerror.contentEquals(stractual))
		{
			System.out.println("Validation message is displayed");	
			Thread.sleep(2000);
			driver.close();
			
		}
		else
		{
			System.out.println("Validation message is not displayed");		
		}	
	}
		public void ValidEmailEntry(String Validemail)
		{
			driver.findElement(txt_email).sendKeys(Validemail);	
		}
		public void SubmitbuttonClick() throws InterruptedException
		{
			driver.findElement(btn_submit).click();
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js1.executeScript("window.scrollBy(0,-300)", "");
			  Thread.sleep(5000);		
		}
		
		
		public void NewsletterSubscriptioncheck()throws InterruptedException
		{
			String strSuccessMsg=driver.findElement(By.xpath("//body/div[@id='app']/div[@id='__nuxt']/div[@id='__layout']/div[@id='app']/div[3]/div[1]/div[1]/div[4]/section[1]/div[1]/p[1]")).getText();
			String strActualMsg="You are now checked-in!";
			if(strSuccessMsg.contentEquals(strActualMsg))
			{
				System.out.println("Checked-in message is displayed");	
				Thread.sleep(2000);
				driver.close();
				
			}
			else
			{
				System.out.println("Checked-in message is not displayed");		
			}
		}
		
	}

