package stepDefinitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class StepDefinitions extends Base {
    @Given("I open Google Chrome and navigate to saucelabs.com")
    public void i_open_Google_Chrome_and_navigate_to_saucelabs_com() {
        init("https://www.saucedemo.com/");
    }
    @When("I login to the website with valid {string} and {string}")
    public void i_login_to_the_website_with_valid_credentials(String username, String password) {
        driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
        driver.findElement(By.cssSelector("#login-button")).click();
    }
    @Then("Home page and Robot logo is shown")
    public void home_page_and_Robot_logo_is_shown() {
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
        Assert.assertTrue(driver.findElement(By.cssSelector(".peek")).isDisplayed());
    }
    @And("User logs out")
    public void userLogsOut() {
        System.out.println("User logged out");
    }

    @Given("Another precondition is given")
    public void another_precondition_is_given() {
        System.out.println("another_precondition_is_given");
    }
    @When("Something is done again")
    public void something_is_done_again() {
        System.out.println("something_is_done_again");
    }
    @Then("Something is expected again")
    public void something_is_expected_again() {
        System.out.println("something_is_expected_again");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}