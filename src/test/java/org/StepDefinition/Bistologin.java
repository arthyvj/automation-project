package org.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.base;

import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class Bistologin extends base {

	@Given("To Launch The browser and Maximize the Window")
	public void to_Launch_The_browser_and_Maximize_the_Window() {
		launchbrower();
		windowsamximize();
	}

	@Given("User Launch The Bisto Url")
	public void user_Launch_The_Bisto_Url() throws InterruptedException {
		Thread.sleep(3000);

		launchurl("https://bistrobitesdc.com/");
		}

	@Given("User clicks The Account button")
	public void user_clicks_The_Account_button() throws InterruptedException {
		WebElement acc = driver.findElement(By.xpath("//span[text()='  Account']"));
		acc.click();
	}

	@Given("To Pass invalid Username")
	public void to_Pass_invalid_Username() {
		WebElement user = driver.findElement(By.id("phone"));
		user.sendKeys("9790425678");
	}

	@Given("To Pass invalid Password")
	public void to_Pass_invalid_Password() {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password'][1]"));
		pass.sendKeys("sfgtdsydh");
	}

	@Given("To Click The Login button")
	public void to_Click_The_Login_button() {
		WebElement log = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		log.click();
	}

	@Given("To Check The Output")
	public void to_Check_The_Output() {
		System.out.println("Check Valid Username and Password");

	}

}
