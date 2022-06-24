package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookStore {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnBookStore = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]");
    By bookStoreWithAllBooks = By.className("rt-tr-group");
    By backToBookStore = By.cssSelector(".text-left.fullButton");
    By addToYourCollection = By.cssSelector(".text-right.fullButton");


    public BookStore(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBookStore(){
        scroll();
        return driver.findElement(clkOnBookStore);
    }

    public List<WebElement> getAllBooks(){
        return driver.findElements(bookStoreWithAllBooks);
    }

    public void addBook(String text) throws InterruptedException {
        Thread.sleep(2500);
        scroll();
        List<WebElement> list = getAllBooks();
        driver.findElement(By.xpath("//a[text()='"+text+"']")).click();
    }

    public void getAddToCollection(){
        scroll();
        driver.findElement(addToYourCollection).click();
    }
    public void getBackToBookStore(){
        scroll();
        driver.findElement(backToBookStore).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
