package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

   public WebDriver driver;
   public WebDriverWait wdwait;

   By clkOnLogin = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]");

   By username = By.id("userName");
   By password = By.id("password");

   By loginButton = By.id("login");
   By newUser = By.id("newUser");

    public Login(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getLogin(){
        return driver.findElement(clkOnLogin);
    }
    public WebElement getNewUser(){
        return driver.findElement(newUser);
    }
    public WebElement getUserName(){
        return driver.findElement(username);
    }
    public WebElement getPassword(){
       return driver.findElement(password);
    }
    public void getLoginButtonClick(){
        driver.findElement(loginButton).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    public void getUserAndPass(String user, String pass){
        getUserName().sendKeys(user);
        getPassword().sendKeys(pass);
    }
}
