package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;


@RunWith(AggProductosRunners.CustomCucumberWithSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"net.serenitybdd.demos.todos.screenplay",},
        plugin = "json:build/cucumber-reports/json/cucumber.json",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@SerenityBDDWeb"
)

public class AggProductosRunners {

    private AggProductosRunners() {
    }


    private static final String EXTENSION_FEATURE = ".feature";


    public class CustomCucumberWithSerenityRunner extends Runner {
        @Override
        public Description getDescription() {
            return null;
        }

        @Override
        public void run(RunNotifier notifier) {

        }
    }
}






