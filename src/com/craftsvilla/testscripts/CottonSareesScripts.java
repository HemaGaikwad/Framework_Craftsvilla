package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CartPage;
import com.craftsvilla.pompages.CottonSareeSelection;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;

public class CottonSareesScripts extends BaseTest
{
	HomePage homePage = null;
	 SareesPage sareesPage = null;
	CottonSareeSelection cottonSarees = null;
	ProductDescriptionPage productDescription = null;
	CartPage cartPage = null;
	
	@Test
	public void TC_01_ChooseCottonSaree()
	{
		homePage = new HomePage(driver);
		sareesPage = new SareesPage(driver);
		cottonSarees = new CottonSareeSelection(driver);
		productDescription = new ProductDescriptionPage(driver);
		cartPage = new CartPage(driver);
		
		try
		{
			homePage.goToSareesLink();
			sareesPage.goToCottonSarees();
			cottonSarees.chooseProduct();
			productDescription.clickOnBuyNow();
			Assert.fail();
			cartPage.setEmail("youremail@email.com");
			cartPage.setFirstName("Hema");
			cartPage.setMobile("9865465453");
			
		}
		catch(Exception e)
		{
			Reporter.log("Test case failed : "+e);
		}
	}

}
