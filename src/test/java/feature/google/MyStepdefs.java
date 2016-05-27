package feature.google;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by john on 27/05/16.
 */
public class MyStepdefs {
    @Given("^I am on Google's home page$")
    public void iAmOnGoogleSHomePage() throws Throwable {

        System.out.println("Home Page...");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Search For " + arg0);
    }

    @Then("^The page returned should include a link entitled \"([^\"]*)\"$")
    public void thePageReturnedShouldIncludeALinkEntitled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Search Results Should Include " + arg0);
    }
}
