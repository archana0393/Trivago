package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchlocation {

	WebDriver driver;

	By icon_search=By.xpath("//header/div[1]/div[1]/div[2]");
	By txt_search=By.xpath("//header/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]");
	By btn_destinations=By.xpath("//div[contains(text(),'All Destinations')]");
	public Searchlocation(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Clicktosearchfield()
	{
		driver.findElement(icon_search).click();	

	}
	public void entersearchkeyword(String locationname)
	{
		driver.findElement(txt_search).sendKeys(locationname);

	}
	public void checkValidSearchResult() throws InterruptedException
	{
		String str=driver.findElement(By.xpath("//h3[@class='section-title']")).getText();



		String str1=str.substring(3);
		String str2="Search Results";
		Thread.sleep(3000);
		if(str1.contentEquals(str2))
		{
			System.out.println("Rersult is displayed");		}

		else
		{
			System.out.println("Rersult is not displayed");
		}


	}

	public void Invalidkeywordsearch(String Invalidlocationname)

	{

		driver.findElement(txt_search).sendKeys(Invalidlocationname);

	}

	public void Noresultsearch()
	{
		driver.findElement(By.xpath("//h1[contains(text(),'No results')]")).isDisplayed();
		System.out.println("No result is displayed for this location");
	}

	public void alldestinationfunctionality() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(btn_destinations).click();

	}
	public void checkResultForAllDestination() throws InterruptedException
	{
		Thread.sleep(3000);
		String str3=driver.findElement(By.xpath("//h3[@class='section-title']")).getText();



		String str4=str3.substring(3);
		String str5="Search Results";
		Thread.sleep(3000);
		if(str4.contentEquals(str5))
		{
			System.out.println("All destinations are  displayed");		}

		else
		{
			System.out.println("All destinations are not displayed");
		}  
	}

}
