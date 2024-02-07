package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;

public class LoginPage extends DriverClass {
    public LoginPage(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy (className = "ico-login")
    WebElement loginPage;

    @FindBy (id = "Email")
    WebElement email;

    @FindBy ( id = "Password")
    WebElement password;

    @FindBy (css = "button.button-1.login-button")
WebElement loginButton;     //css demek sorun olur mu???








}
