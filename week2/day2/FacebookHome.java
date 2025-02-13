package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookHome {

	public static void main(String[] args){

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.name("firstname")).sendKeys("Shailene");
		driver.findElement(By.name("lastname")).sendKeys("Woodley");
		
		WebElement day = driver.findElement(By.id("day"));
		Select dd1 = new Select(day);
		dd1.selectByValue("6");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByValue("10");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select dd3 = new Select(year);
		dd3.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("qwerty1234");
		
		driver.findElement(By.xpath("(//button[text() = 'Sign Up'])[1]")).click();
		
		
		
	}

}
