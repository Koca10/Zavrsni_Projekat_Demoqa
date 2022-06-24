package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findCheckBoxTest(){
        demoMain.getElements().click();
        checkBox.getCheckBox().click();
    }

    @Test
    public void selectHome(){
        findCheckBoxTest();
        checkBox.getSelectHome().click();
        assertTrue(driver.findElement(By.id("result")).isDisplayed());
    }

    @Test
    public void selectReact(){
        findCheckBoxTest();
        checkBox.getPlusButton().click();
        checkBox.getSelectReact().click();
        assertTrue(driver.findElement(By.id("result")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
    }
}