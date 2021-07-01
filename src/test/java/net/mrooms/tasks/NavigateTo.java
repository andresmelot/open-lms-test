package net.mrooms.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.mrooms.pages.aplicationUnderTest;


public class NavigateTo implements Task {

	private EnvironmentVariables environmentVariables;
	private String siteURL;

	public NavigateTo() {
		environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
		siteURL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url");
	}

	public static NavigateTo frontPage() {
		return instrumented(NavigateTo.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Open.browserOn().the(aplicationUnderTest.class)
		);
	}

}
