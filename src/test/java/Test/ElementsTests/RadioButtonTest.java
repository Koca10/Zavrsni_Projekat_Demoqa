package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonTest extends BasePage {



    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findRadioButtonTest(){
        demoMain.getElements().click();
        radioButton.clickOnRadioButton().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }

    @Test
    public void radioButtonYesButton() {
        findRadioButtonTest();
        radioButton.clickOnYes().click();
        //System.out.println(driver.findElement(By.tagName("p")).getText());
        assertTrue(driver.findElement(By.tagName("p")).isDisplayed());
    }

    @Test
    public void radioButtonImpressiveButton(){
        findRadioButtonTest();
        radioButton.clickOnImpressive().click();
        assertEquals(driver.findElement(By.tagName("p")).getText(), "You have selected Impressive");
    }

    @Test
    public void radioButtonNoButton(){
        findRadioButtonTest();
        radioButton.disabledButton().click();
        assertFalse(driver.findElement(By.cssSelector("label[for=\"noRadio\"]")).isSelected());
    }





    @AfterMethod
    public void tearDown() {
    }
}