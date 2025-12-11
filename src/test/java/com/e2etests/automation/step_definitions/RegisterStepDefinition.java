package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}
	
	@Given("je me connecte sur l application Mercury register")
	public void jeMeConnecteSurLApplicationMercuryRegister() {
		registerPage.goToUrl();
	}

	@When("je saisie le first name {string}")
	public void jeSaisieLeFirstName(String string) {
		registerPage.fillFirstName();
	}
	@When("je saisie le last name {string}")
	public void jeSaisieLeLastName(String string) {
		registerPage.fillLastName();

	}
	@When("je saisie le numero {string}")
	public void jeSaisieLeNumero(String string) {
		registerPage.fillNum();
	}
	@When("je saisie le email {string}")
	public void jeSaisieLeEmail(String string) {
		registerPage.fillEmail();
	}
	@When("je saisie l adresse {string}")
	public void jeSaisieLAdresse(String string) {
		registerPage.fillAddresse();
	}
	@When("je saisie le city {string}")
	public void jeSaisieLeCity(String string) {
		registerPage.fillCity();
	}
	@When("je saisie la provence {string}")
	public void jeSaisieLaProvence(String string) {
		registerPage.fillProvence();
	}
	@When("je saisie le code postal {string}")
	public void jeSaisieLeCodePostal(String string) {
		registerPage.fillPostCode();
	}
	@When("je saisie le country {string}")
	public void jeSaisieLeCountry(String string) {
		registerPage.selectCountry();
	}
	@When("je saisie le user name {string}")
	public void jeSaisieLeUserName(String string) {
		registerPage.fillUserName();
	}
	@When("je saisie le password register {string}")
	public void jeSaisieLePasswordRegister(String string) {
		registerPage.fillPassword();
	}
	@When("je saisie le confirm password register {string}")
	public void jeSaisieLeConfirmPasswordRegister(String string) {
		registerPage.fillConfirmPass();
	}
	@When("je clique sur le bouton submit register")
	public void jeCliqueSurLeBoutonSubmitRegister() {
		registerPage.clickRegisterBtn();
	}
	@Then("je me redirige vers la page register success {string}")
	public void jeMeRedirigeVersLaPageRegisterSuccess(String string) {
		
	}



}
