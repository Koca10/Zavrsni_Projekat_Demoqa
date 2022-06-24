package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void textBoxTest() {
        //demoMain.getAllCategoryCard().get(0).click();
        demoMain.getElements().click();
        textBox.clickOnTextBox().click();
        textBox.form("Uros","uros@yahoo.com","Jurija Gagarina","Jurija Gagarina");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".border.col-md-12.col-sm-12")));
        //System.out.println(driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12")).getText());
        assertTrue(driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12")).isDisplayed());
    }


    @AfterMethod
    public void tearDown() {
    }

}