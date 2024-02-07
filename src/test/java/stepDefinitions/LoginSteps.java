package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import utilities.DriverClass;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to the website")
    public void navigate_to_the_website(){
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
        loginPage.loginPart.click();
    }

    @Given("Enter {string} and {string}")
    public void enter_and(){
        loginPage.email.sendKeys("dyg21kk@gmail.com");
        loginPage.password.sendKeys("olive1234");
    }

    @When("Click on Login Button")
    public void click_on_Login_Button(){
        loginPage.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login(){
        String url = DriverClass.getDriver().getCurrentUrl();
        Assert.assertEquals(url, "https://demo.nopcommerce.com/");
    }

    @Then("User should get an error")
    public void user_should_get_anError(){
        String message = DriverClass.getDriver().findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        Assert.assertEquals(message,"Login was unsuccessful. Please correct the errors and try again");

    }









}
