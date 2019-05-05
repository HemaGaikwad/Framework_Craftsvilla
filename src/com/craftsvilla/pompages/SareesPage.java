package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class SareesPage extends BasePage
{
	
	@FindBy(xpath="//a[text()='Cotton Sarees']")
	private WebElement cottonSarees;
	
	@FindBy(xpath="//a[text()='Georgette Sarees']")
	private WebElement georgetteSarees;
	
	
	public SareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void goToCottonSarees()
	{
		verifyElementPresent(cottonSarees);
		cottonSarees.click();
	}
	
	public void goToGeorgetteSarees()
	{
		verifyElementPresent(georgetteSarees);
		mouseHover( georgetteSarees);
	}
	

}
