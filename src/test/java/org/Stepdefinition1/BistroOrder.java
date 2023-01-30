package org.Stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BistroOrder extends base {
	@Given("User Launch Browser and Maximize window")
	public void user_Launch_Browser_and_Maximize_window() {
		launchbrower();
		windowsamximize();
	}
	@Given("User Launch the Url")
	public void user_Launch_the_Url() throws InterruptedException {
		Thread.sleep(3000);
        launchurl("https://bistrobitesdc.com/");
		
	}
	@Given("User Click Account button")
	public void user_Click_Account_button() {
		WebElement acc = driver.findElement(By.xpath("//span[text()='  Account']"));
		acc.click();
	}
	@Given("User Has to Login With Valid Username")
	public void user_Has_to_Login_With_Valid_Username() {
		WebElement user = driver.findElement(By.id("phone"));
		user.sendKeys("9790901475");
	  
	}

	@Given("User Has to Login with Valid Password")
	public void user_Has_to_Login_with_Valid_Password() {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password'][1]"));
		pass.sendKeys("arthy@2012");
	}

	@Given("To Click Login button")
	public void to_Click_Login_button() {
		WebElement log = driver.findElement(By.xpath("//button[@name='login'][1]"));
		log.click();
	}

	@Given("To navigate home page")
	public void to_navigate_home_page() {
	   System.out.println("entering into Home Page");
	}

	@Given("User Click The Menu button")
	public void user_Click_The_Menu_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//a[@href='https://bistrobitesdc.com/itemlist'][1]"));
		men.click();
		
	}

	@Given("User Pick The Food  Dosa")
	public void user_Pick_The_Food_Dosa() {
		WebElement dos = driver.findElement(By.xpath("//a[@href='https://bistrobitesdc.com/itemlist?cat=10']"));
	    dos.click();
	}

	@Given("User Select the Masala Dosa in Dosa list")
	public void user_Select_the_Masala_Dosa_in_Dosa_list() {
		WebElement mal = driver.findElement(By.xpath("//h2[text()='Masala Dosa']"));
	   mal.click();
	}

	@Then("Enter the Page and Check available time")
	public void enter_the_Page_and_Check_available_time() {
		System.out.println("ordered masala dosa availability time is 8.00am");
	    
	}



}
