package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sate\\git\\Testing\\CucumberTest\\Feature\\Login.feature",glue = {"org.stepsefinition"},monochrome= true,dryRun= false)
public class TestRunner {

}
