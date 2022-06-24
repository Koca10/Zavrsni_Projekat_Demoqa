package Pages.DemoqaMain;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DemoQaMainMenu {

     public WebDriver driver;

    By categoryCards = By.cssSelector(".card.mt-4.top-card");

    public DemoQaMainMenu(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement>  getAllCategoryCard(){
        return driver.findElements(categoryCards);
    }

    public WebElement getElements(){
        return getAllCategoryCard().get(0);
    }
    public WebElement getForms(){
        return getAllCategoryCard().get(1);
    }
    public WebElement getAlertsFrameWindows(){
        return getAllCategoryCard().get(2);
    }
    public WebElement getWidgets(){
        return getAllCategoryCard().get(3);
    }
    public WebElement getInteractions(){
        return getAllCategoryCard().get(4);
    }
    public WebElement getBookStoreApplications() {
        scroll();
        return getAllCategoryCard().get(5);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }




}
