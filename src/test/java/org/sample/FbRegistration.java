package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbRegistration extends base {
	public FbRegistration() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createnewacc;

	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement firstnamebox;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnamebox;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement moboremail;
	@FindBy(xpath="//input[@data-type='password']")
	private WebElement pass;
	
	public WebElement getMoboremail() {
		return moboremail;
	}
	

	public WebElement getCreatenewacc() {
		return createnewacc;
	}

	public WebElement getFirstnamebox() {
		return firstnamebox;
	}

	public WebElement getLastnamebox() {
		return lastnamebox;
	}

	public WebElement getPass() {
		return pass;
	}

	public static void main(String[] args) {
		
	}
	
}
