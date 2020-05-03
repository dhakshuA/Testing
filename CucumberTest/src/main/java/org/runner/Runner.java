package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sate\\eclipse-workspace\\CucumberTest\\Feature2" ,glue = "org.stepls.definition",monochrome= true,strict= true)
public class Runner {

}
