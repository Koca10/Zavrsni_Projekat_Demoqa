package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BrokenLinksImagesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findBrokenLinksImagesTest(){
        demoMain.getElements().click();
        brokenLinksImages.clickOnBrokenLinksImages().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
    }

    @Test
    public void validImageTest(){
        findBrokenLinksImagesTest();
        System.out.println(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]")).getAttribute("src"));
        assertTrue(driver.findElement(By.cssSelector("img[src=\"/images/Toolsqa.jpg\"]")).isDisplayed());
    }
    @Test
    public void brokenImageTest(){
        //TODO **********
    }

    @Test
    public void validLinkTest(){
        findBrokenLinksImagesTest();
        brokenLinksImages.clikOnValidLink().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
    @Test
    public void brokenLinkTest(){
        findBrokenLinksImagesTest();
        brokenLinksImages.clickOnBrokenLink().click();
        assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }


    @AfterMethod
    public void tearDown() {
    }
}