package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //sadece tag i belirtilen senaryoları çalıştırır
        features = {"src/test/java/FeatureFiles"},//klasördeki bütün feature lar
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"} //basit report
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
