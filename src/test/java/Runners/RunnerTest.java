package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

 @RunWith(Cucumber.class)
  @CucumberOptions (
        features = "src/test/java/Features",
        glue = {"Steps"},
        tags = {"@current_test"}// позволяет запускать тесты, которые помечены аннотацией
)
public class RunnerTest {


}
