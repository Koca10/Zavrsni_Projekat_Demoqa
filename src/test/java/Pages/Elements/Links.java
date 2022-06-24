package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class Links {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnLinks = By.id("item-5");
    By clkOnHomeSimpleLink = By.id("simpleLink");
    By clkOnHomeDynamicLink = By.cssSelector("#dynamicLink");
    By clkOnCreatedLink = By.id("created");
    By clkOnNoContentLink = By.id("no-content");
    By clkOnMovedLink = By.id("moved");
    By clkOnBadRequestLink = By.id("bad-request");
    By clkOnUnauthorizedLink = By.id("unauthorized");
    By clkOnForbiddenLink = By.id("forbidden");
    By clkNotFoundLink = By.id("invalid-url");

    public Links(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnLinks(){
        return driver.findElement(clkOnLinks);
    }

    public void newTabs(int i){
        Set<String> skupTabova = driver.getWindowHandles();
        ArrayList<String> tabovi = new ArrayList<>(skupTabova);
        driver.switchTo().window(tabovi.get(i));
    }

    public void getHomeSimpleLink(){
        driver.findElement(clkOnHomeSimpleLink).click();
        newTabs(1);
    }
    public void getHomeDynamicLink(){
        driver.findElement(clkOnHomeDynamicLink).click();
        newTabs(2);
    }

    public WebElement getCreatedLink(){
        return driver.findElement(clkOnCreatedLink);
    }
    public WebElement getNoContentLink(){
        return driver.findElement(clkOnNoContentLink);
    }
    public WebElement getMovedLink(){
        return driver.findElement(clkOnMovedLink);
    }
    public WebElement getBadRequestLink(){
        return driver.findElement(clkOnBadRequestLink);
    }
    public WebElement getUnauthorizedLink(){
        return driver.findElement(clkOnUnauthorizedLink);
    }
    public WebElement getForbiddenLink(){
        return driver.findElement(clkOnForbiddenLink);
    }
    public WebElement getNotFoundLink(){
        return driver.findElement(clkNotFoundLink);
    }


}
