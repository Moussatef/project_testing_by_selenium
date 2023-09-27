package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilise.BaseTools;


public class Home extends BaseTools {
    //By buyMoisturizersButton = By.xpath("//a[@href='/moisturizer']");
    @FindBy(xpath = "//a[@href='/sunscreen']" )
    WebElement buySunscreensButton;
    @FindBy(xpath = "//h2[text()='Current temperature']" )
    WebElement titleTemperature;


    WebDriver driver;
    public Home(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    };

    public void clickBuySunscreens(){

        //driver.findElement(buySunscreensButton);
        //waitElementToBeVisible(driver,titleTemperature);
        waitAndClick(driver,buySunscreensButton);


    }


}
