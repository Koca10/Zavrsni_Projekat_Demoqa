package Test.BookStoreApplications;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BookStoreTest extends LoginTest{

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findBookStore(){
        demoMain.getBookStoreApplications().click();
        bookStore.getBookStore().click();
    }

    @Test
    public void findBookStoreWithValidLogin(){
        validLogIn();
        bookStore.getBookStore().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }
    @Test
    public void addBook() throws InterruptedException {
        findBookStoreWithValidLogin();
        bookStore.addBook( "Speaking JavaScript");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        //profile.getProfile().click();
    }
    @Test
    public void twoBooks() throws InterruptedException {
        addBook();
        bookStore.getBackToBookStore();
        bookStore.addBook("Learning JavaScript Design Patterns");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void threeBooksAdded() throws InterruptedException {
        twoBooks();
        bookStore.getBackToBookStore();
        bookStore.scroll();
        bookStore.addBook("Programming JavaScript Applications");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void fourBooksAdded() throws InterruptedException {
        threeBooksAdded();
        bookStore.getBackToBookStore();
        bookStore.scroll();
        bookStore.addBook("Designing Evolvable Web APIs with ASP.NET");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

   }
    @Test
    public void fiveBookAdded() throws InterruptedException {
        fourBooksAdded();
        bookStore.getBackToBookStore();
        bookStore.scroll();
        bookStore.addBook("Eloquent JavaScript, Second Edition");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }
    @Test
    public void sixBookAdded() throws InterruptedException {
        fiveBookAdded();
        bookStore.getBackToBookStore();
        bookStore.scroll();
        bookStore.addBook("Understanding ECMAScript 6");
        Thread.sleep(2000);
        bookStore.getAddToCollection();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }


    @AfterMethod
    public void tearDown() {
    }
}