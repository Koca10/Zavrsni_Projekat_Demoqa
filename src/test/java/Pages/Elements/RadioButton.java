package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnRadioButton = By.id("item-2");
    By yesButton = By.cssSelector("label[for=\"yesRadio\"]");
    By impressiveButton = By.cssSelector("label[for=\"impressiveRadio\"]");
    By noButton = By.cssSelector("label[for=\"noRadio\"]");

    public RadioButton(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnRadioButton(){
       return driver.findElement(clkOnRadioButton);
    }

    public WebElement clickOnYes(){
        return driver.findElement(yesButton);
    }

    public WebElement clickOnImpressive(){
        return driver.findElement(impressiveButton);
    }

    public WebElement disabledButton(){
        return driver.findElement(noButton);
    }

}
