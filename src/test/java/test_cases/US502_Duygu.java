//package test_cases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utilities.DriverClass;
//
//public class US502_Duygu extends DriverClass {
//    //As a user, I want to be able to log in to the website
//    // so that I can access the features on the platform using the profile I created before.
//    @Test
//
//
//    public void login() {
//        WebElement loginButton = driver.findElement(By.className("ico-login"));
//        loginButton.click();
//
//        driver.findElement(By.id("Email")).sendKeys("dyg21kk@gmail.com");
//        driver.findElement(By.id("Password")).sendKeys("olive1234");
//
//        driver.findElement(By.id("RememberMe")).click();
//        WebElement loginClick = driver.findElement(By.cssSelector("button.button-1.login-button"));
//        loginClick.click();
//       // driver.findElement(By.className("button-1 login-button")).click();
//
//
//
//
//
//
//    }
//
//
////    @DataProvider(name = "loginData")
////    public Object[][] info() {
////        Object[][] infoArray = {
////                {"dyg21kk@gmail.com", "olive1234"}
////        };
////        return infoArray;
////
////    }
//
//
//
//}