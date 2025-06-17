package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //sadece tag i belirtilen senaryoları çalıştırır
        features = {"src/test/java/FeatureFiles"},//klasördeki bütün feature lar
        glue = {"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
