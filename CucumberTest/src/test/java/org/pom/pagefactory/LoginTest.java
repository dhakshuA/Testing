package org.pom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class LoginTest extends Baseclass{

	
	
	
	public  LoginTest() {
		PageFactory.initElements(driver, this);
			
	}

		@FindBy(xpath = "(//input[@type='email'])[1]")
		private WebElement email;
		public  WebElement getEmail() {
			return email;
		}
		@FindBy(xpath = "(//input[@type='password'])[1]")
		private WebElement pass;
		public WebElement getPass() {
			return pass;
		}

		
		@FindBy(xpath = "//input[@class='secondary button log-btn']")
		private WebElement login;
			public WebElement getLogin() {
			return login;
		}

		}



