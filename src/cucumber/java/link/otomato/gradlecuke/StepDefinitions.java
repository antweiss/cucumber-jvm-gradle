package link.otomato.gradlecuke;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StepDefinitions {
    private CukeBucket bucket;
    private int addCukes;

    @Given("^I have (\\d+) cukes in my bucket$")
    public void i_have_cukes_in_my_bucket(int cukes) throws Throwable {
        bucket = new CukeBucket();
        bucket.put(cukes);
    }

    @When("^I add (\\d+) cukes$")
    public void i_add_cukes(int cukes) throws Throwable {
        this.addCukes = cukes;
        bucket.put(addCukes);
    }

    @Then("^my bucket should (.*)$")
    public void my_bucket_should_crack(String expectedState) throws Throwable {
        String actualState = bucket.getState();
        assertThat(actualState, is(expectedState));
    }
}
