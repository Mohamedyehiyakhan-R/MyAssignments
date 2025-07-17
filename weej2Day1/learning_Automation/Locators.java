package learning_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
		WebElement element = driver.findElement(By.id("username")); //30-1 29
		element.sendKeys("demo");
		element.clear();
		Thread.sleep(3000);
		element.sendKeys("demosalesmanager");
		
		//name
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//tag name
		
		//class name
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// partialLinktext
		driver.findElement(By.partialLinkText("CR")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("yehiya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
