package com.balazspap.docler.stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        format = {"json:target/integration_cucumber.json"},
        features="src/test/resources"
//        glue = {"src/test/java/com/balazspap/docler/stepdef"}
)
public class TestRunner {
}
