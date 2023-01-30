package org.Stepdefinition2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bistroregistration extends base  {
	@Given("To Launch Browser and Maximize window")
	public void to_Launch_Browser_and_Maximize_window() {
	   launchbrower();
	   windowsamximize();
	 
	}
	@Given("user Launch the Url")
	public void userLaunchTheUrl() throws InterruptedException {
		Thread.sleep(3000);
        launchurl("https://bistrobitesdc.com/");   
	}
	@Given("User Clicks Account button")
	public void userClicksAccountButton() {
		WebElement acc = driver.findElement(By.xpath("//span[text()='  Account']"));
		acc.click();
		}

	@Given("User has to enter Name in Name Field")
	public void user_has_to_enter_Name_in_Name_Field() {
		WebElement nam = driver.findElement(By.id("name"));
	    nam.sendKeys("arthy");
	  
	}

	@Given("User has to enter  email id")
	public void user_has_to_enter_email_id() {
		WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
		em.sendKeys("arthyvj@gmail.com");
	    
	}

	@Given("User has to enter Phonenum")
	public void user_has_to_enter_Phonenum() {
	    WebElement pho = driver.findElement(By.xpath("//input[@name='phone']"));
	    pho.sendKeys("243657876987");
	}

	@Given("User has to enter Password")
	public void user_has_to_enter_Password() {
	    WebElement pas = driver.findElement(By.id("password_reg"));
	    pas.sendKeys("sniuwhdiws");
	}

	@Given("User click the Register button")
	public void user_click_the_Register_button() {
	    WebElement ref = driver.findElement(By.xpath("//button[@name='login']"));
	    ref.click();
	}

	@Then("check all the field are valid")
	public void check_all_the_field_are_valid() {
	   System.out.println("check confirm password field is invalid");
	}

}
