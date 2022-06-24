package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnDynamicProperties = By.id("item-8");
    By clkEnable = By.id("enableAfter");
    By clkColorChange = By.cssSelector(".mt-4.text-danger.btn.btn-primary");
    By clkVisible = By.id("visibleAfter");


    public DynamicProperties(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement clickOnDynamicProperties(){
        scroll();
        return driver.findElement(clkOnDynamicProperties);
    }

    public void getEnableAfterFiveSec(){
    wdwait.until(ExpectedConditions.elementToBeClickable(clkEnable));
    driver.findElement(clkEnable).click();
    }

    public void getColorChange(){
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(clkColorChange));
        driver.findElement(clkColorChange);
    }

    public void getVisibleAfterFiveSec(){
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(clkVisible));
        driver.findElement(clkVisible).click();
    }




    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
