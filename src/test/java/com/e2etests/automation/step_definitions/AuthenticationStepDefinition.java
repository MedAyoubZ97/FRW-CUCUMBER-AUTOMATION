package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthenticationStepDefinition {
	
	private AuthenticationPage authenticationPage;
	
	public AuthenticationStepDefinition() {
		this.authenticationPage= new AuthenticationPage();
	}
	
	@Given("je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToUrl();
	}

	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authenticationPage.fillUserName(name);
		
	}

	@When("je saisie le password {string}")
	public void jeSaisieLePassword(String pswd) {
		authenticationPage.fillPassword(pswd);
	}

	@When("je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String textMsg) {
		String message = AuthenticationPage.successMsg.getText();
		Assert.assertEquals(textMsg, message);
	}

}
