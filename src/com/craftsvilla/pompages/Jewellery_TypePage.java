
package com.craftsvilla.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class Jewellery_TypePage extends BasePage{
	
	//Declaration
	@FindBy(linkText="Necklaces")
	private WebElement necklacesLink;
	
	@FindBy(linkText="Earrings")
	private WebElement earringsLink;
	
	@FindBy(linkText="Mangalsutras")
	private WebElement mangalsutrasLink;
	
	@FindBy(linkText="Anklets")
	private WebElement ankletsLink;

	//Initialization
	
	public Jewellery_TypePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void clickOnNecklacesLink() 
	{
		try
		{
			verifyElementPresent(necklacesLink);
			mouseHover(necklacesLink);
			log.info("Mouse Hovered On NecklacesLink:"+necklacesLink );
			
		}
		catch (Exception e) 
		{
			log.error("Unable to Mouse Hovered On NecklacesLink:"+ necklacesLink +":"+e );
		}
	}
	
	public void clickOnEarringsLink() 
	{
		try
		{
			verifyElementPresent(earringsLink);
			mouseHover(earringsLink);
			log.info("Mouse Hovered On EarringsLink:"+earringsLink );
			
		}
		catch (Exception e) 
		{
			log.error("Unable to Mouse Hovered On EarringsLink:"+ earringsLink +":"+e );
		}
	}
	
	public void clickOnMangalsutrasLink() 
	{
		try
		{
			verifyElementPresent(mangalsutrasLink);
			mouseHover(mangalsutrasLink);
			log.info("Mouse Hovered On MangalsutrasLink:"+mangalsutrasLink );
			
		}
		catch (Exception e) 
		{
			log.error("Unable to Mouse Hovered On MangalsutrasLink:"+ mangalsutrasLink +":"+e );
		}
	}
	
	public void clickOnAnkletsLink() 
	{
		try
		{
			verifyElementPresent(ankletsLink);
			mouseHover(ankletsLink);
			log.info("Mouse Hovered On AnkletsLink:"+ankletsLink );
			
		}
		catch (Exception e) 
		{
			log.error("Unable to Mouse Hovered On AnkletsLink:"+ ankletsLink +":"+e );
		}
	}
}
