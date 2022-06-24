package Test;

import Base.BasePage;
import Pages.Elements.TextBox;
import jdk.jfr.TransitionFrom;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasePageTest extends BasePage {

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
    @Test
    public void findRadioButtonTest(){
        demoMain.getElements().click();
        radioButton.clickOnRadioButton().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }

    @Test
    public void radioButtonElements(){
        findRadioButtonTest();
        radioButton.clickOnYes().click();
        //System.out.println(driver.findElement(By.tagName("p")).getText());
        assertTrue(driver.findElement(By.tagName("p")).isDisplayed());

        radioButton.clickOnImpressive().click();
        assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Impressive");
    }

    @Test
    public void findButtonsElementsTest(){
        demoMain.getElements().click();
        buttons.clickOnButtons().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }

    @Test
    public void buttonsElements() throws InterruptedException {
        findButtonsElementsTest();
        buttons.getDoubleClick();
        //System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
        assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");

        buttons.getRightClick();
        //System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
        assertEquals(driver.findElement(By.id("rightClickMessage")).getText(), "You have done a right click");


        buttons.getClick();
        assertEquals(driver.findElement(By.id("dynamicClickMessage")).getText(), "You have done a dynamic click");
    }

    @Test
    public void homeSimpleLinkTest() throws InterruptedException {
        demoMain.getElements().click();
        links.clickOnLinks().click();
        links.getHomeSimpleLink();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void homeDynamicLinktest() throws InterruptedException {
        demoMain.getElements().click();
        Thread.sleep(2500);
        links.clickOnLinks().click();
        Thread.sleep(2500);
        links.getHomeDynamicLink();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }

    @Test
    public void createdLink(){
        demoMain.getElements().click();
        links.clickOnLinks().click();
        links.getCreatedLink().click();
    }


    @Test
    public void findBookStore() throws InterruptedException {
        demoMain.getBookStoreApplications().click();
    }





    @AfterMethod
    public void tearDown() {
    }
}