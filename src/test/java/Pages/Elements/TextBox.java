package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnTextBox = By.id("item-0");
    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress= By.id("permanentAddress");
    By buttonSubmit = By.id("submit");

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnTextBox(){
        return driver.findElement(clkOnTextBox);
    }

    public WebElement getFullName(){
        return driver.findElement(fullName);
    }

    public WebElement getEmail(){
        return driver.findElement(email);
    }

    public WebElement getCurrentAddress(){
        return driver.findElement(currentAddress);
    }

    public WebElement getPermanentAddress(){
        return driver.findElement(permanentAddress);
    }

    public WebElement getSubmitButton(){
        return driver.findElement(buttonSubmit);
    }

    public void form(String fullName, String email, String currAddress, String perAddress){
        getFullName().sendKeys(fullName);
        getEmail().sendKeys(email);
        getCurrentAddress().sendKeys(currAddress);
        getPermanentAddress().sendKeys(perAddress);
        getSubmitButton().click();
    }


}
