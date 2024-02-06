package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.DriverClass;

public class US501 extends DriverClass {
    //### As a user, I want to register on the website [https://demo.nopcommerce.com/ ]
    //so that I can access personalized content, view special offers, and enjoy other advantages.
    @Test (dataProvider = "registrationInfo")

    void registration(String username, String lastname, String email, String password, String confirmPassword){

      //  driver.get("https://demo.nopcommerce.com/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-register")));

actions.click(driver.findElement(By.className("ico-register"))).perform();

actions.click(driver.findElement(By.id("gender-female"))).perform();

driver.findElement(By.id("FirstName")).sendKeys(username);
driver.findElement(By.id("LastName")).sendKeys(lastname);
driver.findElement(By.id("Email")).sendKeys(email);
driver.findElement(By.id("Password")).sendKeys(password);
driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);

//actions.click(driver.findElement(By.id("register-button")));







    }

    @DataProvider
public Object[][] dataMethod(){
        Object[][] registrationInfo = {
                {"Olive"},
                {"Tree"},
                {"dyg21kk@gmail.com"},
                {"olive1234"},
                {"olive1234"}
        };
        return registrationInfo;
    }




}
