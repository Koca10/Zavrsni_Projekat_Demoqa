package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnBrokenLinkImages = By.id("item-6");
    By clkOnValidLink = By.cssSelector("a[href='http://demoqa.com']");
    By clkOnBrokenLink = By.cssSelector("a[href='http://the-internet.herokuapp.com/status_codes/500']");

    public BrokenLinksImages(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnBrokenLinksImages(){
        return driver.findElement(clkOnBrokenLinkImages);
    }
    public WebElement clikOnValidLink(){
        return driver.findElement(clkOnValidLink);
    }
    public WebElement clickOnBrokenLink(){
        return driver.findElement(clkOnBrokenLink);
    }


}
