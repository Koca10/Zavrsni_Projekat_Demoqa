package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadAndDownloadTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findUploadAndDownloadsTest(){
        demoMain.getElements().click();
        uploadAndDownload.clickOnUploadAndDownload().click();
    }

    @Test
    public void downloadTest(){
        findUploadAndDownloadsTest();
        uploadAndDownload.getDownload().click();
    }


    @Test
    public void chooseFileTest(){
        findUploadAndDownloadsTest();
        uploadAndDownload.getChooseFile().sendKeys("D:/Uros/Desktop/Master rad/Uticaj ergonmije na socioloske apsekte rada 111.docx");
        assertEquals(driver.findElement(By.id("uploadedFilePath")).getText(), "C:\\fakepath\\Uticaj ergonmije na socioloske apsekte rada 111.docx");
    }

    @AfterMethod
    public void tearDown() {
    }
}