package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilise.BaseTools;


public class Home extends BaseTools {
    @FindBy(xpath = "//li[@id='wpmenucartli']/a" )
    WebElement startShopping;

    @FindBy(xpath = "//li[@id='menu-item-40']/a" )
    WebElement shopButton;


    WebDriver driver;
    public Home(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    };

    public void clickStartShopping() throws InterruptedException {

        waitAndClick(driver,startShopping);


    }

    public void closeAddPopup(){
        try {
            WebElement closeButton = driver.findElement(By.id("dismiss-button"));
            waitAndClick(this.driver,closeButton);
            if (closeButton.isDisplayed()) {
                waitAndClick(this.driver,closeButton);
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // The pop-up ad element was not found or is not displayed, continue testing.
            System.out.println("add not found!!");
        }
    }

    public void clickShopButton(){

        waitAndClick(driver,shopButton);


    }


}
