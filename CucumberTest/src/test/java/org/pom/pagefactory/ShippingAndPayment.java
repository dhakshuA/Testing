package org.pom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class ShippingAndPayment extends Baseclass{
public  ShippingAndPayment() {
		
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath = "(//div[@class='field field--required'])[1]")
private WebElement email;
public WebElement getemail() {
	return email;
}




	@FindBy(xpath = " //*[@placeholder='Address']")
	private WebElement Address;
	public WebElement getAddress() {
		return Address;
	}

	@FindBy (xpath = "//*[@placeholder='Company (optional)']")
	private WebElement company;
	public WebElement getcompany() {
		return company;
	}
	

	@FindBy(xpath = "//*[@placeholder='City']")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	
	
	@FindBy(xpath = "(//*[@autocomplete='shipping country'])[2]")
	private WebElement country;
	public WebElement getCountry() {
		return country;
	}

	@FindBy(xpath = "//*[@id='continue_button']")
	private WebElement continueshipping;
	public WebElement getContinueshipping() {
	return continueshipping;
	}
	
	

	@FindBy(xpath = "//*[@placeholder='State']")
	private WebElement state;	
	public WebElement getState() {
		return state;
	}

	
	@FindBy(xpath = "//*[@placeholder='PIN code']")
	private WebElement pincode;
	public WebElement getPincode() {
		return pincode;
	}

	
	@FindBy(xpath = "//*[@placeholder='Phone']")
	private WebElement phonenumber;
	public WebElement getPhonenumber() {
		return phonenumber;
	}

	

	@FindBy(xpath = "//*[@class='input-radio']") 
	private WebElement shippingmethod;
	public WebElement getShippingmethod() {
		return shippingmethod;
	}

	
	
	@FindBy(xpath = "(//*[@name='button'])[1]")
	private WebElement continuetopayment;
	public WebElement getcontinuetopayment() {
		return continuetopayment;
	}

	
	
	@FindBy(xpath = "(//*[@class='input-radio'])[3]")
	private WebElement billingadd;
	public WebElement getBillingadd() {
		return billingadd;
	}

	
	
	@FindBy(xpath = "(//div[@class='shown-if-js'])[2]")
	private WebElement completeorder;
	public WebElement getCompleteorder() {
		return completeorder;
	
	
	}
	
	@FindBy(xpath ="(//*[@class='input-radio'])[1]")
	private WebElement quickpay;
	public WebElement getquickpay() {
	return quickpay;
	
	}

	@FindBy(xpath= "(//*[@class='input-radio'])[3]")
	private WebElement Sameshipping;
	public WebElement getSameshipping() {
		return Sameshipping;
	}
	
}


