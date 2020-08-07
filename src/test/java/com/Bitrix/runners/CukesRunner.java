package com.Bitrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"html:target/cucumber-report.html"
},
        features = "src/test/resources/features" ,
        glue = "com/Bitrix24/step_definitions",

        dryRun = false,
        tags =" @record"
)


public class CukesRunner {




}
