package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SetupTeardown {
    public WebDriver driver;

    @BeforeMethod
    public void LunchBrowser(){
        System.out.println("lunch browser");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");
        //Assert.assertTrue(driver.findElement(By.xpath("//h2[text()=\"Current temperature\"]")));
    }

    @AfterMethod
    public void  CloseBrowser() throws InterruptedException {
        System.out.println("close Browser");
        Thread.sleep(3000);
        driver.close();
    }

    @BeforeTest
    public void LunchTests(){
        System.out.println("lunch Tests");
    }

    @AfterTest
    public void closeTests(){
        System.out.println("close tests");
    }
}