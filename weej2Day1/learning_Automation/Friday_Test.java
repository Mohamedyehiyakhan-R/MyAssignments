//package creation
package learning_Automation;

//imports
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//class creation
public class Friday_Test {
	//declare main function
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		//launch browser
		ChromeDriver driver = new ChromeDriver(opt);
		//To load the URL
		driver.get("https://www.saucedemo.com/v1/");
		//Maximize the Window
		driver.manage().window().maximize();
		
		//find elements in DOM page for user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//use thread function for reducing time
		Thread.sleep(2000);
		
		//find elements in DOM page for password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//find elements in DOM page for login button
		driver.findElement(By.id("login-button")).click();
		
		
	}

}
