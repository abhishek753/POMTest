package com.gmail.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page factory = OR:
	@FindBy(id="identifierId")
	WebElement Email;
	
	@FindBy(id="identifierNext")
	WebElement nextBtn;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
//	@FindBy(id="passwordNext")
	@FindBy(xpath="//span[@name='Next']")
	WebElement nextBtn1;
	
	@FindBy(xpath="//span[class(text(),'Create account')]")
	WebElement createbtn;
	
	@FindBy(id="logo")
	WebElement googlelogo;

	//Initializing the Page objects/Factory/OR:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateGoogleImage() {
		return googlelogo.isDisplayed();
	}
	
		public HomePage login(String un,String pwd) {
			Email.sendKeys(un);
			nextBtn.click();
			password.sendKeys(pwd);
			nextBtn1.click();
			return new HomePage();
			
		}

	}


