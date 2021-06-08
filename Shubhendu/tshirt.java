package com.test.shubhendu;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tshirt {

	public static void main(String[] args) {
		
		  
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  
		  //Login
		  driver.findElement(By.id("email")).sendKeys("sm@test.com");
		  driver.findElement(By.id("passwd")).sendKeys("tester@123");
		  driver.findElement(By.id("SubmitLogin")).click();
		  
		  //Click on T-Shirts
		  driver.findElement(By.linkText("T-shirts")).click();

		  //Click on add to cart
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();

		  //Click on proceed
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  
		  //Checkout page Proceed
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  
		  //Agree terms&Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

		  //Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		  //Get Text
		  String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
		  
		  // Verify that Product is ordered
		  if(ConfirmationText.contains("complete")) {
		   System.out.println("Order Completed: TC Pass");
		  }
		  else {
		   System.out.println("Order Not Successfull: TC Failed");
		  }
		  
		  // Click on User Name
		  driver.findElement(By.xpath("s_m']//span[.='s m']")).click();
		  
		  // Click on My Personal Information
		  driver.findElement(By.xpath("//*[@id=\"my_personal_information\"]")).click();
		  
		  // Clear existing First name
		  driver.findElement(By.id("firstname")).clear();
		  
		  // Append new first name
		  driver.findElement(By.id("firstname")).sendKeys("shubh");
		  
		  // Input password
		  driver.findElement(By.id("old_passwd")).sendKeys("tester@123");
		  
		  // Save
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[3]/div[2]/div/p/a")).click();
		  
		  //Log out
		  driver.findElement(By.linkText("Log me out")).click();
		  
		 }
		

	}