package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.generic.ReadExcel;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.SignInPage;

public class SignInScripts extends BaseTest
{
	HomePage hp = null;
	SignInPage sp = null;
	
	@Test
	public void TC_01_LoginWithMultipleCredentials()
	{
		hp = new HomePage(driver);
		sp = new SignInPage(driver);
		try {
		String[][] credentials = ReadExcel.getData(FILE_PATH, "Login");
		
		for(int i = 1; i<credentials.length; i++)
		{
			String email = credentials[i][0];
			String password = credentials[i][1];
			
			hp.clickOnSignInButton();
			sp.setEmail(email);
			sp.clickOnContinue();
			sp.enterPassword(password);
			sp.clickOnLoginButton();
			hp.gotoAccount();
			hp.clickOnLogout();
		}
		}
		catch(Exception e)
		{
			
		}
	}

}
