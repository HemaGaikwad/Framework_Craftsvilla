package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.craftsvilla.generic.BasePage;

public class CottonSareeSelection extends BasePage{


	@FindBy(id="sortByNone")
	private WebElement PopularLink;
	
	@FindBy(xpath="(//div[@id='listProducts']/div/div/div/div/div/a/img[@alt='Gold Silk Woven Paithani Saree With Unstitched Blouse Material'])[2]")
	private WebElement SelectFromPopularSaree;
	
	@FindBy(id="priceOrder_ASC")
	private WebElement LowToHighLink;
	
	@FindBy(xpath="//div[@id='listProducts']/div/div/div[2]/div/div/a/img[@alt='Craftsvilla Black Color Bhagalpuri Silk Printed  Traditional Saree With Unstitched Blouse']")
	private WebElement SelectFromLowToHighSaree;
	
	@FindBy(id="priceOrder_DESC")
	private WebElement HighToLowLink;
	
	@FindBy(xpath="//img[contains(@src,'1521112236-Craftsvilla_1.jpg')]")
	private WebElement product;
	
	@FindBy(xpath="//div[@id='listProducts']/div/div/div[2]/div/div/a/img[@alt='Craftsvilla Red Georgette Traditional Woven Saree']")
	private WebElement SelectFromHighToLowSaree;
	
	
	public CottonSareeSelection(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void chooseProduct()
	{
		try
		{
			verifyElementPresent(product);
			product.click();
		}
		catch(Exception e)
		{
			log.error("Unable to choose product"+e);
		}
	}
	public void PopularLinkElement(){
		try{
			PopularLink.click();
			SelectFromPopularSaree.click();
			Reporter.log("One of the saree from popular link is selected");
		}
		catch(Exception e){
			Reporter.log("Cant be selected"+e);
		}
		
	}

	public void LowToHighLink(){
		try{
			LowToHighLink.click();
			SelectFromLowToHighSaree.click();
			Reporter.log("One of the saree from popular link is selected");
		}
		catch(Exception e){
			Reporter.log("Cant be selected"+e);
		}
		
	}
	
	public void HighToLowLink(){
		try{
			HighToLowLink.click();
			SelectFromHighToLowSaree.click();
			Reporter.log("One of the saree from popular link is selected");
		}
		catch(Exception e){
			Reporter.log("Cant be selected"+e);
		}
		
	}
}
