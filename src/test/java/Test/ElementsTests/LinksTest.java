package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test (priority = 1)
    public void findLinksElementsTest(){
        demoMain.getElements().click();
        links.clickOnLinks().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }

    @Test (priority = 2)
    public void homeSimpleLinkTest() throws InterruptedException {
        findLinksElementsTest();
        links.getHomeSimpleLink();
        Thread.sleep(1500);
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test (priority = 3)
    public void homeDynamicLinkTest() throws InterruptedException {
        findLinksElementsTest();
        links.getHomeDynamicLink();
        Thread.sleep(2500);
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test (priority = 4)
    public void createdLink() throws InterruptedException {
        findLinksElementsTest();
        links.getCreatedLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 201 and status text Created");
    }

    @Test (priority = 5)
    public void noContentLink() throws InterruptedException {
        findLinksElementsTest();
        links.getNoContentLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 204 and status text No Content");
    }
    @Test (priority = 6)
    public void movedLink() throws InterruptedException {
        findLinksElementsTest();
        links.getMovedLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 301 and status text Moved Permanently");
    }
    @Test (priority = 7)
    public void badRequestLink() throws InterruptedException {
        findLinksElementsTest();
        links.getBadRequestLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 400 and status text Bad Request");
    }
    @Test (priority = 8)
    public void unauthorizedLink() throws InterruptedException {
        findLinksElementsTest();
        links.getUnauthorizedLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 401 and status text Unauthorized");
    }
    @Test (priority = 9)
    public void forbiddenLink() throws InterruptedException {
        findLinksElementsTest();
        links.getForbiddenLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 403 and status text Forbidden");
    }
    @Test (priority = 10)
    public void notFoundLink() throws InterruptedException {
        findLinksElementsTest();
        links.getNotFoundLink().click();
        Thread.sleep(1500);
        assertEquals(driver.findElement(By.id("linkResponse")).getText(), "Link has responded with staus 404 and status text Not Found");
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}