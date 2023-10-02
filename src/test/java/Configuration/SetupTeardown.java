package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;

public class SetupTeardown {
    public WebDriver driver;

    @BeforeMethod
    public void LunchBrowser(){
        System.out.println("lunch browser");


        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\omoussat\\Desktop\\Formation_Test\\ProjectForTest\\by_selenium\\file\\Free-Ad-Blocker.crx"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capabilities);
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
        driver.quit();
    }
}