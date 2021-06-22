package com.marciotrindade.cucumber1.test.steps


import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.marciotrindade.cucumber1.LoginActivity
import com.marciotrindade.cucumber1.R
import com.marciotrindade.cucumber1.test.logic.LoginLogic
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps {
    private val logic = LoginLogic()


    @Given("^I have my app configured$")
    fun login() {
    ActivityScenario.launch(LoginActivity::class.java)
    }

    @When("something happens")
    fun login1() {
        onView(withId(R.id.edtMatricula)).check(matches(isDisplayed()))   }

    @Then("I should see xx on the display")
    fun login2() {
        print("as ações")
    }


}