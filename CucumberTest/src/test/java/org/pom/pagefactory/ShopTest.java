package org.pom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.page.object.model.Baseclass;

public class ShopTest extends Baseclass{

	
public  ShopTest() {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "(//div[@class='spf-col-xl-3 spf-col-lg-4 spf-col-md-4 spf-col-sm-4 spf-col-6'])[3]")
private WebElement shopnow;


@FindBy(xpath = "//div[@data-pro-size='68']")
private WebElement sizeofdress;

@FindBy(xpath = "(//button[@type='button'])[2]")
private WebElement sizeincrease;


@FindBy(xpath = "//button[@class='add-to-cart js-add2cart']")
private WebElement Addtocart;



@FindBy(xpath = "//p[text()='CHECK OUT']")
private WebElement checkout;
public WebElement getCheckout() {
	return checkout;
}


public WebElement getShopnow() {
	return shopnow;
}


public WebElement getSizeofdress() {
	return sizeofdress;
}


public WebElement getSizeincrease() {
	return sizeincrease;
}


public WebElement getAddtocart() {
	return Addtocart;
}
}


