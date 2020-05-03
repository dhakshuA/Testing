package org.pom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class HomeTest extends Baseclass {

	
	public HomeTest() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//li[@class='nav-item'])[7]")
	private WebElement home;
	public WebElement getHome() {
		return home;
	}

	
@FindBy(xpath = " (//h3[@class='cat-title'])[1]")
	private WebElement boy;

public WebElement getBoy() {
	return boy;
}


@FindBy(xpath = " (//h3[@class='cat-title'])[2] ")
private WebElement girl;
public WebElement getGirl() {
	return girl;
}	
	
	
}



	
	
