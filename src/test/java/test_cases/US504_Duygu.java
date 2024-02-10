//package test_cases;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//import utilities.DriverClass;
//
//import java.time.Duration;
//
//public class US504_Duygu extends DriverClass {
//    //As a user, I want to ensure that the platform's tab menu works correctly, and the submenus are verifiable.
//    // This way, I can be sure that navigation on the platform is smooth.
//    //go to menu, click on computer, scroll down the page
//
//   @Test
//           public void menuFunction() {
////       US502_Duygu login1 = new US502_Duygu();
////       login1.login();
//
//       WebElement computers = driver.findElement(By.cssSelector("a[href='/computers']"));
//       computers.click();
//
//        WebElement desktops = driver.findElement(By.cssSelector("a[title='Show products in category Desktops']"));
//        desktops.click();
//
////       WebElement notebooks = driver.findElement(By.linkText("notebook"));
////       notebooks.click(); // --->>  XPATH DISINDAKILERLE CALISMADI???
//
//       WebElement notebooks = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a"));
//       notebooks.click();
//
//       WebElement software = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[2]/div[2]/ul/li[1]/ul/li[3]/a"));
//       software.click();
//
//      // WebElement elementToScroll = driver.findElement(By.id("vote-poll-1"));
//
//      // js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
//
//
//
//   }
//
//
//
//
//
//
//
//
//
//}
