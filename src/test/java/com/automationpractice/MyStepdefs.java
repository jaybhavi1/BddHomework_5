package com.automationpractice;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Jay Vaghani on 27/04/2017.
 */
public class MyStepdefs
{
    WebDriver driver;

    @Given("^User is on Home page$")
    public void userIsOnHomePage()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");

    }

    @When("^he select woman tag$")
    public void heSelectWomanTag()
    {
        driver.findElement(By.linkText("Women")).click();

    }

    @Then("^he navigate to woman catalog$")
    public void heNavigateToWomanCatalog()
    {
        Assert.assertTrue("User is not navigate to Women catelog",driver.findElement(By.xpath("//div[@id='layered_block_left']/p")).getText().contains("CATALOG"));

    }

    @And("^see the Tops and Dresses in Woman categories$")
    public void seeTheTopsAndDressesInWomanCategories()
    {
        driver.quit();

    }
}
