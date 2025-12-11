package com.e2etests.automation.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;



public class RegisterPage {
	private ConfigFileReader configFileReader;
	
	/** Find By **/
	@FindBy(how = How.NAME,using = "firstName")
	public WebElement firstName;
	
	@FindBy(how = How.NAME,using="lastName")
	public WebElement lastName;
	
	@FindBy(how = How.NAME,using="phone")
	public WebElement phone;
	
	@FindBy(how = How.ID, using="userName")
	public WebElement userName;
	
	@FindBy(how = How.NAME,using="address1")
	public WebElement address1;
	
	@FindBy(how = How.NAME,using="city")
	public WebElement city;
	
	@FindBy(how = How.NAME,using="state")
	public WebElement state;
	
	@FindBy(how = How.NAME, using="postalCode")
	public WebElement postalCode;
	
	@FindBy(how = How.NAME,using="country")
	public WebElement country;
	
	@FindBy(how = How.NAME,using="email")
	public WebElement email;
	
	@FindBy(how = How.NAME, using="password")
	public WebElement password;
	
	@FindBy(how = How.NAME,using="confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(how = How.NAME,using="submit")
	public WebElement registerBtn;
	
	@FindBy(how = How.XPATH, using="//b[normalize-space()='Dear ayoub zitouni,']")
	public WebElement msgSuccess;
	
	public RegisterPage () {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Create Methods */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("register.url"));
	}
	
	public void fillFirstName() {
		firstName.sendKeys(configFileReader.getProperties("register.firstName"));
	}
	public void fillLastName() {
		lastName.sendKeys(configFileReader.getProperties("register.lastName"));
	}
	public void fillNum() {
		phone.sendKeys(configFileReader.getProperties("register.phone"));
	}
	
	public void fillEmail() {
		email.sendKeys(configFileReader.getProperties("register.email"));
	}
	
	public void fillAddresse() {
		address1.sendKeys(configFileReader.getProperties("register.addresse"));
	}
	
	public void fillCity() {
		city.sendKeys(configFileReader.getProperties("register.city"));
	}
	public void fillProvence() {
		state.sendKeys(configFileReader.getProperties("register.provence"));
	}
	public void fillPostCode() {
		postalCode.sendKeys(configFileReader.getProperties("register.codePostal"));
	}
	public void selectCountry() {
		Select drpDwnList = new Select(country);
		drpDwnList.selectByValue(configFileReader.getProperties("register.country"));
	}
	public void fillUserName() {
		userName.sendKeys(configFileReader.getProperties("register.country"));
	}
	public void fillPassword() {
		password.sendKeys(configFileReader.getProperties("register.pass"));
	}
	public void fillConfirmPass() {
		confirmPassword.sendKeys(configFileReader.getProperties("register.pass"));
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
	public void verifRegister() {
		Assert.assertEquals("Dear ayoub zitouni,", msgSuccess);
	}
	

}
