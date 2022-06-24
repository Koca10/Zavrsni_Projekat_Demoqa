package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicPropertiesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findDynamicPropertiesElementsTest(){
        demoMain.getElements().click();
        dynamicProperties.clickOnDynamicProperties().click();
    }

    @Test
    public void enableAfterTest(){
        findDynamicPropertiesElementsTest();
        dynamicProperties.getEnableAfterFiveSec();
        assertTrue(driver.findElement(By.id("enableAfter")).isEnabled());
    }

    @Test
    public void colorChangeTest(){
        findDynamicPropertiesElementsTest();
        dynamicProperties.getColorChange();
        assertTrue(driver.findElement(By.cssSelector(".mt-4.text-danger.btn.btn-primary")).isDisplayed());
    }

    @Test
    public void visibleAfterTest(){
        findDynamicPropertiesElementsTest();
        dynamicProperties.getVisibleAfterFiveSec();
        assertTrue(driver.findElement(By.id("visibleAfter")).isDisplayed());
    }


    @AfterMethod
    public void tearDown() {
    }
}