package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_Datatable {
    @When("Write username {string}")
    public void writeUsername(String arg0) {
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String arg0, String arg1) {
    }

    @And("Write username as Datatable")
    public void writeUsernameAsDatatable(DataTable dtUserlar) {
        List<String> listUserlar= dtUserlar.asList(String.class);

        for (String user : listUserlar)
            System.out.println(user);
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUserPass) {

        List< List<String> > listUserpass= dtUserPass.asLists(String.class);

        for (int i = 0; i <listUserpass.size() ; i++) {
            System.out.println(listUserpass.get(i).get(0) + " " +
                               listUserpass.get(i).get(1));
        }
    }
}
