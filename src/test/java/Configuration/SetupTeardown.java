package Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
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

        ConfigReader configReader = new ConfigReader();
        configReader.loadProperties();

        System.out.println("lunch browser");
        if(configReader.getBrowser().equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            // to block adds
            options.addExtensions(new File("C:\\Formation\\Git02102023\\project_testing_by_selenium\\file\\Free-Ad-Blocker.crx"));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(capabilities);
        } else if (configReader.getBrowser().equals("edge")) {

            driver= new EdgeDriver();
        }


        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/");


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