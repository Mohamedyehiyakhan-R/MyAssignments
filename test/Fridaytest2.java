package test;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fridaytest2 {
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
		
		//Find first product name
		 WebElement firstname=	driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	   
	   //Print the product name
	   System.out.println("The first product name is-->  "+firstname.getText());
	   
	   //Print the product price
	   WebElement price =driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
	   
	   //Click Add to cart
	   driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
	   //Navigate to cart
		driver.findElement(By.id("svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ")).click();
		
		
}
}
