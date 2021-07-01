package net.mrooms.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.mrooms.tasks.LogIn;
import net.mrooms.tasks.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class snapLoginStepsDefninition {

	private String actorName;
	@Before
	public void setTheStage(){
		OnStage.setTheStage(new OnlineCast());//Create the actor
	}
	
	@Given("{} can access the site")
	public void userCanAccessTheSite(String actorName) {
		this.actorName = actorName;
		theActorCalled(this.actorName).attemptsTo(NavigateTo.frontPage());
	}

	@When("It sends its credentials {} and {}")
	public void itSendsItsCredentialsUsernameAndPassword(String username, String password) {
		theActorCalled(actorName).attemptsTo(LogIn.viaFrontPage(username, password));
	}

	@Then("it should be able to verify its {} on profile page")
	public void itShouldBeAbleToVerifyItsNameOnProfilePage(String userName) {

	}

}