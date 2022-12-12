package commun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;

    @BeforeMethod

    public void BeforeTest () {
        // PATH CHROME DRIVER (METHODE CLASSIQUE)
        // System.setProperty("webdriver.chrome.driver","C:\\dev\\allDrivers\\chromedriver.exe");

        // PATH CHROME DRIVER AVEC WebDriverManager
        WebDriverManager.chromedriver().setup();

        // INSTANCIATION
        driver = new ChromeDriver();

        // GET LINK
        driver.get("https://www.saucedemo.com/");

        // ATTENTE IMPLICITE
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // MAXIMIZE WINDOW
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void AfterTest (){
       driver.quit();
    }


}
