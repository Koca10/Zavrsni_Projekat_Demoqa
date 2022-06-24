package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnButtons = By.id("item-4");
    By doubleClk = By.id("doubleClickBtn");
    By rightClk = By.id("rightClickBtn");
    By clk = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");


    public Buttons(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnButtons(){
        return driver.findElement(clkOnButtons);
    }

    public void getDoubleClick(){
        Actions actions = new Actions(driver);
        WebElement dblClick = driver.findElement(doubleClk);
        actions.doubleClick(dblClick).perform();
    }

    public void getRightClick(){
        Actions actions = new Actions(driver);
        WebElement rghClk = driver.findElement(rightClk);
        actions.contextClick(rghClk).perform();
    }

    public void getClick(){
        Actions actions = new Actions(driver);
        WebElement click =driver.findElement(clk);
        actions.moveToElement(click).click().perform();
    }
}
