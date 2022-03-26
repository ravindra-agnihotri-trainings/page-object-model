package testcases;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import reusable.methods.MethodFactory;

public class LoginTestCase {
    static WebDriver driver= BaseClass.getInstance();
    LoginPage loginPage= new LoginPage();
    DashboardPage dashboardPage= new DashboardPage();

    @Test(priority = 1)
    public void loginSite(){

     driver.get("https://opensource-demo.orangehrmlive.com/");
     loginPage.getUsername().sendKeys("Admin");
     loginPage.getPassword().sendKeys("admin123");
     loginPage.getLoginButton().click();
    }



    @Test(priority = 2)
    public  void anOperations(){
        dashboardPage.getMyInfoLink().click();
        MethodFactory.scrollTo(dashboardPage.getEditButton());
        dashboardPage.getEditButton().click();
        MethodFactory.scrollTo(dashboardPage.getCalendar());
        dashboardPage.getCalendar().click();
        for (int i=0;i<=dashboardPage.getCalendarDates().size()-1;i++){
            if (dashboardPage.getCalendarDates().get(i).getText().equals("11")){
                dashboardPage.getCalendarDates().get(i).click();
                break;
            }
        }
        MethodFactory.scrollTo(dashboardPage.getCheckBox());
        dashboardPage.getCheckBox().click();

    }

}
