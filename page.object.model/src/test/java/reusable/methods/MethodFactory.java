package reusable.methods;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodFactory {
    static WebDriver driver= BaseClass.driver;

    public static void scrollTo(WebElement element){
        JavascriptExecutor javascriptExecutor= ((JavascriptExecutor) driver);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",element );
    }
}
