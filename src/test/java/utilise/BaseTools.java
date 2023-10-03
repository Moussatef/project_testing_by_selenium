package utilise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTools {
    WebDriverWait wait;
    int TIME = 30;
    public void waitAndClick(WebDriver driver, WebElement element){
        wait = new WebDriverWait(driver,TIME);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void waitAndSendkeys(WebDriver driver, WebElement element, String text){
        wait = new WebDriverWait(driver,TIME);
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
    }



}
