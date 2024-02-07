package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;

public class RegistrationPage extends DriverClass{

    public RegistrationPage(){PageFactory.initElements(DriverClass.getDriver(),this);}

@FindBy(className = "ico-register")
public WebElement registerPage;

@FindBy (id = "\"gender-female\"")
public WebElement genderChoice;

@FindBy (id = "FirstName")
public WebElement firstname;

@FindBy (id = "LastName")
public WebElement lastname;

@FindBy (id = "Email")
public WebElement email;

@FindBy (id = "Password")
public WebElement password;

@FindBy (id = "ConfirmPassword")
public WebElement confirmPassword;

@FindBy (id = "RegisterButton")
public WebElement registerButton;











}
