package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register/");
		driver.manage().window().maximize();
		
		
		// Full Name Locators
		driver.findElement(By.id("name")).sendKeys("Abdhul");
		// driver.findElement(By.tagName("input")).sendKeys("Abdhul");
		// driver.findElement(By.className("form-control")).sendKeys("Abdhul");
		// driver.findElement(By.cssSelector("#name")).sendKeys("Abdhul");
		// driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Abdhul");
		
		
		// Email Address Locators
		driver.findElement(By.id("email")).sendKeys("testemailgv2000@gmail.com");
		// driver.findElement(By.tagName("input")).sendKeys("testemailgv2000@gmail.com");
		// driver.findElement(By.className("form-control")).sendKeys("testemailgv2000@gmail.com");
		// driver.findElement(By.cssSelector("#email")).sendKeys("testemailgv2000@gmail.com");
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testemailgv2000@gmail.com");
		
		
		// Password Locators
		driver.findElement(By.id("password")).sendKeys("Guvi321");
		// driver.findElement(By.tagName("input")).sendKeys("Guvi321");
		// driver.findElement(By.className("form-control
		// password-err")).sendKeys("Guvi321");
		// driver.findElement(By.cssSelector("#password")).sendKeys("Guvi321");
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Guvi321");
		
		
		// Mobile Number Locators
		driver.findElement(By.id("mobileNumber")).sendKeys("6382956919");
		// driver.findElement(By.tagName("input")).sendKeys("6382956919");
		// driver.findElement(By.className("form-control
		// countrycode-left")).sendKeys("6382956919");
		// driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("6382956919");
		// driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("6382956919");
		
		
		// Sign Up Locators
		driver.findElement(By.id("signup-btn")).click();
		// driver.findElement(By.tagName("a")).click();
		// driver.findElement(By.className("btn signup-btn")).click();
		// driver.findElement(By.cssSelector("#signup-btn")).click();
		// driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
	}

}
