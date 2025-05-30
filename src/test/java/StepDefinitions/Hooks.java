package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    // Cucumbera ait ger seneryodan sonra çalışan
    // Annıtation
    @After
    public void after()
    {
        GWD.quitDriver();
    }
}
