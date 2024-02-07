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
    public WebElement loginPart;

    @FindBy (id = "Email")
    public WebElement email;

    @FindBy ( id = "Password")
    public WebElement password;

    @FindBy (css = "button.button-1.login-button")
    public WebElement loginButton;     //css demek sorun olur mu???








}
