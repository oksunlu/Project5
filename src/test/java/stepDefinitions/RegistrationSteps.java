package stepDefinitions;

import pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.DriverClass;


public class RegistrationSteps {
    RegistrationPage registrationPage = new RegistrationPage();

    @Given("Navigate to the website")
    public void navigate_to_the_website() {
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
        registrationPage.registerPage.click();
    }

    @Given ("Enter {string}, {string}, {string}, {string} and {string}")
    public void enter_and(String firstname, String lastname, String email, String password, String confirmPassword ) {
        registrationPage.genderChoice.click();
        registrationPage.firstname.sendKeys(firstname);
        registrationPage.lastname.sendKeys(lastname);
        registrationPage.email.sendKeys(email);
        registrationPage.password.sendKeys(password);
        registrationPage.confirmPassword.sendKeys(confirmPassword);
    }
    @When ("Click on Register Button")
    public void click_on_register_button(){
        registrationPage.registerButton.click();
        }

    @Then("User should register successfully")
    public void user_should_register() {
            String url = DriverClass.getDriver().getCurrentUrl();
            Assert.assertEquals(url, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
        }




    }








