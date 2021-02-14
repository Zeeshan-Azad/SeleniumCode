package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.ExcelLibrary;

public class ActiTimeLogin implements AutoConstant{
	
	public ActiTimeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeLink;
	
	public void loginMethod() throws IOException {
		usernameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, sheet_name, 1, 1));
		loginButton.click();
	}
}
