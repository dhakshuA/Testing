package org.pom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class CardDetails extends Baseclass{
	public  CardDetails() {
		PageFactory.initElements(driver, this);	
		}

		@FindBy  (xpath = " //input[@id='cardnumber']  ")
		private WebElement cardnumber;
		public WebElement getcardnumber() {
			return cardnumber;
		}

		@FindBy  (xpath = "//input[@id='expiration-month']  ")
		private WebElement expirymonth;
		public WebElement getexpirymonth() {
			return expirymonth;
		}

		@FindBy  (xpath = "//input[@id='expiration-year']")
		private WebElement expiryyear;
		public WebElement getexpiryyear() {
			return expiryyear;
		}

		@FindBy  (xpath = "//input[@id='cvd']")
		private WebElement cvv	;
		public WebElement getcvv() {
			return cvv;
		}

		@FindBy  (xpath = "//button[@type='submit']")
		private WebElement pay;
		public WebElement getpay() {
			return pay;
		}

}
