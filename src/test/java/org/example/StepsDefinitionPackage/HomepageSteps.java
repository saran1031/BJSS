package org.example.StepsDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {
    Homepage homepage = new Homepage();

    @Given("^user is on homepage of BJSS$")
    public void user_is_on_homepage_of_BJSS() throws Throwable {
    }

    @When("^user brings the cursor on 'Your Industry' and clicks on 'Retail' from Mouse Hover dropdown list$")
    public void user_brings_the_cursor_on_Your_Industry_and_clicks_on_Retail_from_Mouse_Hover_dropdown_list() throws Throwable {
    homepage.retailMethod();
    }

    @Then("^user should be able to see the Retail page$")
    public void user_should_be_able_to_see_the_Retail_page() throws Throwable {
        homepage.assertionMethod();
        homepage.scrollMethod();
    }
}
