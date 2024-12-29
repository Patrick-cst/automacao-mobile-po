package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import utils.DriverManager;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	//@iOSFindBy(xpath = "teste")
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='test-Username']")
    private MobileElement usernameField;

    @AndroidFindBy(accessibility = "test-Password")
    private MobileElement passwordField;

    @AndroidFindBy(accessibility  = "test-LOGIN")
    private MobileElement loginButton;

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
