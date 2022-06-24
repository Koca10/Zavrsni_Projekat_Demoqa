package Test.BookStoreApplications;

import Test.BookStoreApplications.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ProfileTest extends BookStoreTest {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findProfile(){
        demoMain.getBookStoreApplications().click();
        profile.getProfile().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void LoginViaProfilePage(){
        findProfile();
        profile.getIfYouAreLogoutToLogin();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }
    @Test
    public void RegisterViaProfilePage(){
        findProfile();
        profile.getIfYouAreLogoutToRegister();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/register");
    }

    @Test
    public void loginViaLoginTest(){
        validLogIn();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void goToBookStore(){
        loginViaLoginTest();
        profile.getGoToBookStore();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }

    @Test
    public void logOut(){
        loginViaLoginTest();
        profile.getLogoutButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    @Test
    public void fieldSearch() throws InterruptedException {
        loginViaLoginTest();
        profile.inputInSearchBox("Git");
        Thread.sleep(1000);
        assertTrue(driver.findElement(By.xpath("//div[@class='rt-tr -odd']")).isDisplayed());
    }

    @Test
    public void rowsDropDown(){
        loginViaLoginTest();
        profile.getSelect("10");
        List<WebElement> list =driver.findElements(By.className("rt-tr-group"));
        for (int i = 0; i < list.size(); i++) {
            if (list.size() != 10)
                fail();
        }
    }

    @Test
    public void deleteAllBooksAndClickCancel() {
        loginViaLoginTest();
        profile.getDeleteAllBooks();
        profile.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @Test
    public void deleteAllBooksAndClickOk(){
        loginViaLoginTest();
        profile.getDeleteAllBooks();
        profile.getModalOkButton();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void deleteOneBookAndClickCancel(){
        loginViaLoginTest();
        profile.getDeleteOneBook();
        profile.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void deleteOneBookAndClickOk(){
        loginViaLoginTest();
        profile.getDeleteOneBook();
        profile.getModalOkButton();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    @Test
    public void deleteAccountAndClickCancel(){
        loginViaLoginTest();
        profile.getDeleteAccountButton();
        profile.getModalCancelButton();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }
    @Test
    public void deleteAccountAndClickOk(){
        loginViaLoginTest();
        profile.getDeleteAccountButton();
        profile.getModalOkButton();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");

    }

    @AfterMethod
    public void tearDown() {
    }
}