package com.automationpractice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Jay Vaghani on 27/04/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:target/CucumberReport",tags = "@SmokeTest")

public class RunTest
{

}
