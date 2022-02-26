package pages;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(){
        driver= BaseClass.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "  //b[text()='My Info']")
    private WebElement myInfoLink;

    @FindBy(xpath = "//form[@id='frmEmpPersonalDetails']//child::p//input")
    private WebElement editButton;

    @FindBy(xpath = "//label[text()='License Expiry Date']//following-sibling::input")
    private WebElement calendar;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
    private List<WebElement> calendarDates;

    @FindBy(xpath = "//a[contains(text(),'.log')]//parent::td//preceding-sibling::td")
    private WebElement checkBox;

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getMyInfoLink() {
        return myInfoLink;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getCalendar() {
        return calendar;
    }

    public List<WebElement> getCalendarDates() {
        return calendarDates;
    }


}
