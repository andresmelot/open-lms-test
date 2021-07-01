package net.mrooms.screens;

import org.openqa.selenium.By;

public class LoginFrontPage {

	public static By openLoginButton = By.xpath("//*[@id=\"page-mast\"]/a");
	public static By usernameField   = By.id("username");
	public static By passwordField   = By.id("password");
	public static By loginButton     = By.xpath("//*[@id=\"snap-pm-inner\"]/div[1]/div/form/input[2]");

}
