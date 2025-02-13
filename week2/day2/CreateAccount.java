package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args){

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("sel_automation_tester");

		WebElement d1 = driver.findElement(By.name("industryEnumId"));
		Select dd1 = new Select(d1);
		dd1.selectByVisibleText("Computer Software");
		
		WebElement d2 = driver.findElement(By.name("ownershipEnumId"));
		Select dd2 = new Select(d2);
		dd2.selectByVisibleText("S-Corporation");
		
		WebElement d3 = driver.findElement(By.id("dataSourceId"));
		Select dd3 = new Select(d3);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement d4 = driver.findElement(By.id("marketingCampaignId"));
		Select dd4 = new Select(d4);
		dd4.selectByIndex(6);
		
		WebElement d5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd5 = new Select(d5);
		dd5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
	}

}
