package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownload {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnUploadAndDownloads = By.id("item-7");
    By clkDownload = By.id("downloadButton");

    By clkChoosenPage = By.id("uploadFile");

    public UploadAndDownload(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnUploadAndDownload(){
        scroll();
        return driver.findElement(clkOnUploadAndDownloads);
    }

    public WebElement getDownload(){
        return driver.findElement(clkDownload);
    }

    public WebElement getChooseFile(){
        return driver.findElement(clkChoosenPage);
    }



    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}
