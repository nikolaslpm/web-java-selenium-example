package step_definitions;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class Stepdefs implements En {
    public class Stepdefs {
    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
//    public Stepdefs() {
//        Given("today is Sunday", () -> {
//            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
//        });
//
//        When("I ask whether it's Friday yet", () -> {
//            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
//        });
//
//        Then("I should be told {string}", (String string) -> {
//            // Write code here that turns the phrase above into concrete actions
//            throw new cucumber.api.PendingException();
//        });
//    }

}
