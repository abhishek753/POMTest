package com.gmail.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gmail.qa.pages.ComposeEmailPage;
import com.gmail.qa.pages.HomePage;

public class ComposeEmailPageTest {
	HomePage homepage;
	ComposeEmailPage composeemailpage;
	
	@Test
	public void homeTitleTest(){
		String title = HomePage.validateComposePageTitle();
		Assert.assertEquals(title, "Gmail");
	}
	
	@Test
	public void copmosetextTest() {
		boolean flag = composeemailpage.ValidateComposeText();
		Assert.assertTrue(flag);
	}

}
