package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class ProductDescriptionPage extends BasePage
{
	@FindBy(id="buynow")
	private WebElement buyNow;
	
	@FindBy(id="addtocart")
	private WebElement addToCart;
	
	public ProductDescriptionPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart()
	{
		verifyElementPresent(addToCart);
		addToCart.click();
	}
	
	public void clickOnBuyNow()
	{
		verifyElementPresent(buyNow);
		buyNow.click();
	}

}
