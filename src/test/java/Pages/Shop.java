package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilise.BaseTools;

public class Shop extends BaseTools {

    @FindBy(xpath = "//a[@href='/shop/?add-to-cart=169']")
            WebElement addButton;

    @FindBy(xpath = "//td[@class='product-remove']/a")
            WebElement removeProduct;



    WebDriver driver;
    public Shop(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickAddToBasketButton() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by pixel
        js.executeScript("window.scrollBy(0, 800);"); // Scroll down by 500 pixels vertically
        waitAndClick(this.driver,addButton);


    }

    public void clickRemoveProductButton(){
        System.out.println("sys");
        waitAndClick(this.driver,removeProduct);
    }

}
