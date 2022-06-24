package Test.BookStoreApplications;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findLogin(){
        demoMain.getBookStoreApplications().click();
        login.getLogin().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    @Test
    public void clickOnNewUser(){
        findLogin();
        login.getNewUser().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");
    }

    @Test
    public void validLogIn(){
        findLogin();
        login.getUserAndPass("uroskocic", "Password123!");
        login.getLoginButtonClick();
        wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void InvalidUsernameLogIn() {
        findLogin();
        login.getUserAndPass("1111", "Password123!");
        login.getLoginButtonClick();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("output")));
        //System.out.println(driver.findElement(By.id("output")).getText());
        assertTrue(driver.findElement(By.id("output")).isDisplayed());
    }

    @Test
    public void InvalidPasswordLogIn() {
        findLogin();
        login.getUserAndPass("uroskocic", "Passwor3!");
        login.getLoginButtonClick();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("output")));
        //System.out.println(driver.findElement(By.id("output")).getText());
        assertTrue(driver.findElement(By.id("output")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
    }
}