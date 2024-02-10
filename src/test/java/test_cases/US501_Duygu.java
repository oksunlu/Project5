//package test_cases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utilities.DriverClass;
//
//public class US501_Duygu extends DriverClass {
//    //### As a user, I want to register on the website [https://demo.nopcommerce.com/ ]
//    //so that I can access personalized content, view special offers, and enjoy other advantages.
// @Test (dataProvider = "registrationInfo")
//
// void registration(String username, String lastname, String email, String password, String confirmPassword){
//
//
//
// WebElement register = driver.findElement(By.className("ico-register"));
//            register.click();
//
//WebElement gender = driver.findElement(By.id("gender-female"));
//gender.click();
//
//driver.findElement(By.id("FirstName")).sendKeys(username);
//driver.findElement(By.id("LastName")).sendKeys(lastname);
//driver.findElement(By.id("Email")).sendKeys(email);
//driver.findElement(By.id("Password")).sendKeys(password);
//driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
//
////actions.click(driver.findElement(By.id("register-button")));
//WebElement registerButton = driver.findElement(By.id("register-button"));
//registerButton.click();
//
//
//
//
//
//
//    }
//
//    @DataProvider(name = "registrationInfo")
//public Object[][] info(){
//        Object[][] infoArray = {
//                {"Olive", "Tree","dyg21kk@gmail.com", "olive1234", "olive1234"}
//        };
//        return infoArray;
//    }
//
//
//
//
//}
