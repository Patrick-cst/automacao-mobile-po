package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        // Already handled by Appium opening the app
    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("the user should see the home screen")
    public void theUserShouldSeeTheHomeScreen() throws InterruptedException {
        // Add validation logic for home screen
       // Assertions.assertTrue(true, "Home screen is not displayed");
    	Thread.sleep(5000);
    }
}
