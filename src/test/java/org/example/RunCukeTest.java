package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\Resource\\Homepage.feature",
plugin = {"html:target/Cucumber-report",
        "json:target/Cucumber-report.json",
        "pretty:target/Cucumber-pretty.txt",
        "junit:target/junit-report.xml"
})
public class RunCukeTest {
}
