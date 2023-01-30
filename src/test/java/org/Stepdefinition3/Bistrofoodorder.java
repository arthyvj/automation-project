package org.Stepdefinition3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BistroBoiteslogin;
import org.sample.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bistrofoodorder extends base{
	BistroBoiteslogin bb;
	@Given("To Lunch the browser and maximize window")
	public void to_Lunch_the_browser_and_maximize_window() {
		launchbrower();
		windowsamximize();
	}

	@Given("Client has to Launch Bistro Url")
	public void client_has_to_Launch_Bistro_Url() throws InterruptedException {
		Thread.sleep(3000);
        launchurl("https://bistrobitesdc.com/");
	}

	@Given("Client Clicks account option")
	public void client_Clicks_account_option() {
		WebElement acc = driver.findElement(By.xpath("//span[text()='  Account']"));
		acc.click();
	}

	@Given("Client Login With Valid Username and password")
	public void client_Login_With_Valid_Username_and_password() {
		WebElement user = driver.findElement(By.id("phone"));
		user.sendKeys("9790901475");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password'][1]"));
		pass.sendKeys("arthy@2012");
	}

	@Given("Client Clicks Login button")
	public void client_Clicks_Login_button() {
		WebElement log = driver.findElement(By.xpath("//button[@name='login'][1]"));
		log.click();
	}

	@Given("Client Click the Search button")
	public void client_Click_the_Search_button() throws InterruptedException {
		 bb= new BistroBoiteslogin();
         clickbutton(bb.getToggle());
         }

	@Given("Client enters and search Coke Can cost")
	public void client_enters_and_search_Coke_Can_cost() throws AWTException {
		 Robot r = new Robot();
		 bb= new BistroBoiteslogin();
		 passtext("Coke can", bb.getSearch());
	    r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    }
	@Then("Check and enter the coke cost")
	public void check_and_enter_the_coke_cost() {
	   System.out.println("Coke Can Cost is $ 1.50");
	}



}
