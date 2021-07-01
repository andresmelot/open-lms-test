package net.mrooms.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.mrooms.screens.LoginFrontPage;

public class LogIn implements Task {

	private String username;
	private String password;


	public LogIn(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static LogIn viaFrontPage(String username, String password) {
		return instrumented(LogIn.class, username, password);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(
			Click.on(LoginFrontPage.openLoginButton),
			Enter.theValue(username).into(LoginFrontPage.usernameField),
			Enter.theValue(password).into(LoginFrontPage.passwordField),
			Click.on(LoginFrontPage.loginButton)
		);
	
	}

}
