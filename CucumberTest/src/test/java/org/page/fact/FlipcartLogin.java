package org.page.fact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class FlipcartLogin extends Baseclass {

	public FlipcartLogin() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="(//input[@type='text'] )[2]")
	private WebElement enteremail;
	public WebElement getenteremail() {
		return enteremail;
	}
	
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement enterpassword;
	public WebElement getenterpassword() {
		return enterpassword;
	}
	
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement enterlogin;
	public WebElement getenterlogin() {
		return enterlogin;
	}
	
}
