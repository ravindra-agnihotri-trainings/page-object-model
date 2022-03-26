package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver= BaseClass.getInstance();

    public LoginPage(){

        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='txtUsername']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    private WebElement loginButton;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
