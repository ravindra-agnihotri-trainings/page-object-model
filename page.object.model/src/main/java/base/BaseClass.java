package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    private static BaseClass instance;
    //singleton design pattern achieved
    public static BaseClass getInstance(){
        if (instance == null){
            return instance= new BaseClass();
        }
        else {
            return instance;
        }
    }

    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
