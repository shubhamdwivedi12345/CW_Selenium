package com.magneto.stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(
//    features = "src/test/resources/com/magneto/features", // path to feature files
//    glue = "com.magneto.stepdefinitions", // path to step definitions
//    plugin = {"pretty", "html:target/cucumber-reports.html"} // for generating reports
//)


//
//
//@CucumberOptions(
//	    features = {
//	        "src/test/resources/com/magneto/features/Login.feature", 
//	        "src/test/resources/com/magneto/features/ProductSearch.feature",
//	        "src/test/resources/com/magneto/features/Checkout.feature"
//	    },
//	    glue = "com.magneto.stepdefinitions",
//	    plugin = {"pretty", "html:target/cucumber-reports.html"}
//	)
//	public class TestRunner extends AbstractTestNGCucumberTests {
//	}
//
//
@CucumberOptions(
    features = {
        "src/test/resources/com/magneto/features/Login.feature", 
        "src/test/resources/com/magneto/features/ProductSearch.feature",
        "src/test/resources/com/magneto/features/Checkout.feature",
        "src/test/resources/com/magneto/features/UIValidation.feature"
    },
    glue = "com.magneto.stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
