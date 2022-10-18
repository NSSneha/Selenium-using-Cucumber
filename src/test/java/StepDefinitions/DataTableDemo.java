package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class DataTableDemo {
    @When("I type the following names")
    public void i_type_the_following_names(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> cols : rows) {
            System.out.println(cols.get(0) + " " + cols.get(1));
        }
    }
    @And("I click on OK button")
    public void i_click_on_ok_button() {
        System.out.println("Clicked OK");
    }
    @Then("I should see some Java")
    public void i_should_see_some_java() {
        System.out.println("SOMETHING!!");
    }
}
