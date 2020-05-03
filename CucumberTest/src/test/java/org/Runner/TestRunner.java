package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sate\\eclipse-workspace\\CucumberTest\\Feature" ,glue = "org.stepsefinition",monochrome= true,strict= true)
public class TestRunner {

}
