package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnProfile = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]");
    By loginFromProfilePage = By.cssSelector("a[href='/login']");
    By registerFromProfilePage = By.cssSelector("a[href='/register']");
    By logout = By.id("submit");
    By goToBookStore = By.id("gotoStore");
    By deleteAccount = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button");
    By deleteAllBooks = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button");
    By deleteOneBook = By.id("delete-record-undefined");
    By modalCancelButton = By.id("closeSmallModal-cancel");
    By modalOkButton = By.id("closeSmallModal-ok");
    By searchBox = By.id("searchBox");
    By page = By.cssSelector("input[value=\"1\"]");
    By rows = By.cssSelector("select[aria-label=\"rows per page\"]");

    public Profile(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getProfile(){
        return driver.findElement(clkOnProfile);
    }
    public void getIfYouAreLogoutToLogin(){
        driver.findElement(loginFromProfilePage).click();
    }
    public void getIfYouAreLogoutToRegister(){
        driver.findElement(registerFromProfilePage).click();
    }
    public void getLogoutButton(){
        driver.findElement(logout).click();
    }
    public void getGoToBookStore(){
        scroll();
        driver.findElement(goToBookStore).click();
    }
    public void getDeleteAccountButton(){
        scroll();
        driver.findElement(deleteAccount).click();
    }
    public void getDeleteOneBook(){
        driver.findElement(deleteOneBook).click();
    }
    public void getDeleteAllBooks(){
        scroll();
        driver.findElement(deleteAllBooks).click();
    }
    public void getModalCancelButton(){
        driver.findElement(modalCancelButton).click();
    }
    public void getModalOkButton(){
        driver.findElement(modalOkButton).click();
    }

    public WebElement getSearchBox(){
        return driver.findElement(searchBox);
    }
    public void inputInSearchBox(String text){
        getSearchBox().sendKeys(text);
    }
    public void getSelect(String num){
        Select sort = new Select(driver.findElement(rows));
        sort.selectByValue(num);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
