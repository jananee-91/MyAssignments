package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9765432109");
		String LeadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9765432109");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String errmsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(errmsg);
		if(errmsg.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		}
		else {
			System.out.println("Lead not deleted");
		
		}
		
		
		
	}

}
