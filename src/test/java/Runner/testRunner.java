package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            features={"src/test/resources/features"},
            glue={"stepdefinations"},
            tags={"@CashInvestmentsInterestRates"},
            plugin={"pretty", "html:target/cucumber-reports","json:target/cucumber.json"},
            monochrome = true,
            dryRun=false
    )
    public class testRunner {


}

