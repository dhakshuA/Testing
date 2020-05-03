package org.Runner2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Sate\\eclipse-workspace\\CucumberTest\\src\\test\\resources\\Feature2",glue ="org.step.def2",monochrome =true,strict=false,plugin = {"json:target/reruncucumberreport.html","rerun:rerun/failedtest.txt"}
)
public class RunnerClass2 {

}   
