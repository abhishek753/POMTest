package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class ComposeEmailPage extends TestBase{
	
	@FindBy(xpath="//div[@class='z0']/div")
	WebElement compbtn;
	
	@FindBy(xpath="//td//img[2]")
	WebElement clkbtn;
	
	@FindBy(xpath="//text[@name='Compose']")
	WebElement copmosetext;
	
//	@FindBy()
	public ComposeEmailPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action:
		public String validateComposePageTitle() {
			return driver.getTitle();
		}
		
		public boolean ValidateComposeText() {
			return copmosetext.isDisplayed();
			
		}
		
		
	public HomePage login(String un,String pwd) {
		compbtn.click();
		
		clkbtn.click();
		
		return new HomePage();
		
	}

}
