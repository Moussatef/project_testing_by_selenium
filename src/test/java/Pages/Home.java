package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilise.BaseTools;


public class Home extends BaseTools {
    @FindBy(xpath = "//a[contains(text(),'My Account')]" )
    WebElement buttonMyAccount;

    @FindBy(xpath = "//li[@id='wpmenucartli']/a" )
    WebElement startShopping;

    @FindBy(xpath = "//li[@id='menu-item-40']/a" )
    WebElement shopButton;


    WebDriver driver;
    public Home(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    };

    public void clickStartShopping() {

        waitAndClick(driver,startShopping);
    }

    public void clickShopButton(){
        waitAndClick(driver,shopButton);
    }
    public void clickMyAccount(){
        waitAndClick(driver,buttonMyAccount);
    }
}
