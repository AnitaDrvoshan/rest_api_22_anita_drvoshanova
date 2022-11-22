package clickupapi.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClickupSteps {

    @Given("The Folder exists with the name {string}")
            public void getFolderandCheckName(String foldername){

    }

    @When("I create a new list in the Folder")
        public void ICreateListInFolder(){

    }
    @And("Check that the list name is correct")
        public void iCheckedTheListName(){

    }
    @Then("I create a task with a title {string}")
        public void iCreateTaskWithTitle(String title){

    }
    @And("I check that the task name is {string}")
        public void iCheckTaskNameisCorrect(String title){

    }
    @Then("I delete the task from the list")
        public void iDeletedTheTask(){

    }


}
