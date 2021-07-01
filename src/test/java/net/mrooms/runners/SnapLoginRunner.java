package net.mrooms.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/net/mrooms/features/Login/snapLogin.feature",
				 glue="net.mrooms.stepsdefinitions",
				 snippets = SnippetType.CAMELCASE)
public class SnapLoginRunner {

}
