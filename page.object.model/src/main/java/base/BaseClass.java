package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    private static WebDriver driver;
    private static BaseClass instance;
    //singleton design pattern added
    public static WebDriver getInstance(){
        if (driver == null){
           instance= new BaseClass();
           return instance.getDriver();
        }
        else {
            return driver;
        }

    }

    private   WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
