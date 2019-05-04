package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	
	@FindBy(id="cartCount")
	private WebElement cartLink;	
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement signInLink;
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sareesLink;
	
	@FindBy(linkText ="About us")
	private WebElement aboutUsLink;
	
	@FindBy(partialLinkText="Secure Payment")
	private WebElement securePaymentOptionsLink;
	
	
	//Initialization
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOncartLink()
	{
		try
		{
			verifyElementPresent(cartLink);
			cartLink.click();
			log.info("Clicked on "+cartLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+cartLink+" : "+e);
		}
	}
	
	
	public void clickOnSignInLink()
	{
		try
		{
			verifyElementPresent(signInLink);
			signInLink.click();
			log.info("Clicked on "+signInLink);
		}
		catch(Exception e)
		{
			log.error("Unable to click on "+signInLink+" : "+e);
		}
	}
	
	public void setSearchText(String searchString)
	{
		try
		{
			verifyElementPresent(searchBox);
			searchBox.sendKeys(searchString);
			log.info(searchString+" has been set to "+searchBox);
		}
		catch(Exception e)
		{
			log.error("");
		}
	}
	
	public void goToSareesLink()
	{
		try
		{
			verifyElementPresent(sareesLink);
			mouseHover(sareesLink);
			log.info("");
		}
		catch(Exception e)
		{
			log.error("");
		}
		
	}
	
}
