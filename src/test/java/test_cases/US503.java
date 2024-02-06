package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.DriverClass;

public class US503 extends DriverClass {
    //As a user, I want to be able to log in to the website using the data provider method so that I can test both valid and invalid email and password combinations,
    // check warnings during unsuccessful login attempts, and finally log in successfully with a valid combination.

@Test (dataProvider = "loginAttemptsData")
    void loginAttempts(String email, String password){
    //WebElement logout = driver.findElement(By.className("ico-logout"));
    //logout.click();

    WebElement loginButton = driver.findElement(By.className("ico-login"));
    loginButton.click();

    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(password);


    WebElement loginClick = driver.findElement(By.cssSelector("button.button-1.login-button"));
    loginClick.click();

    //add wait here






}

@DataProvider (name = "loginAttemptsData")
    public Object[][] dredentials(){
    Object[][] credentialsArray = {
            {"dyg21kk@gmail.com", "oliveee"},
            {"dyg21kk@gmail.com", "ooo111222"},
            {"email98765@gmail.com", "olive1234"},
            {"dyg21kk@gmail.com", "olive1234"}
    };
    return credentialsArray;

}







}
