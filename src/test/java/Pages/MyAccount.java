package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilise.BaseTools;

public class MyAccount extends BaseTools {

    @FindBy(xpath = "//input[contains(@name,'username')]")
    WebElement fieldLoginUserName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement fieldLoginPassword;

    @FindBy(xpath = "//input[@type='submit' and @name='login']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement fieldRegisterEmail;

    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement fieldRegisterPassword;

    @FindBy(xpath = "//a[text()='shipping and billing addresses']")
    WebElement MessageAfterSigningIn;



    WebDriver driver;
    public MyAccount(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    };


    public void clickRegister(){

        waitAndClick(driver,registerButton);
        System.out.println("I am clicking on Register");
    }
    public void fillInRegisterEmail(String email){

        waitAndSendkeys(driver,fieldRegisterEmail, email);
        System.out.println("I filled in email");
    }
    public void fillInRegisterPassword(String password){

        waitAndSendkeys(driver,fieldRegisterPassword, password);
        System.out.println("I filled in password");
    }
    public boolean verifyMessageIsDisplayed (){
        return MessageAfterSigningIn.isDisplayed();
    }

    public void fillInLoginUserName(String userName){

        waitAndSendkeys(driver,fieldLoginUserName, userName);
        System.out.println("I filled in username");
    }
    public void fillInLoginPassword(String password){

        waitAndSendkeys(driver,fieldLoginPassword, password);
        System.out.println("I filled in login password");
    }
    public void clickLogin(){

        waitAndClick(driver,loginButton);
        System.out.println("I am clicking on login");
    }

}
