package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplication {

	public static void main(String[] args) {

		//Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize window
		driver.manage().window().maximize();
		
		//Enter Email ID
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter pwd:
		driver.findElement(By.id("pass")).sendKeys("Tuna@123");
		
		
		
		//Click login button
		driver.findElement(By.name("login")).click();
		
		//Click on Find Your account link
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		//Close the browser
		driver.close();
	}

}
