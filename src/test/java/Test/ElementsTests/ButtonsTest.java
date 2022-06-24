package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findButtonsElementsTest(){
        demoMain.getElements().click();
        buttons.clickOnButtons().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }

    @Test
    public void doubleClickTest() {
        findButtonsElementsTest();
        buttons.getDoubleClick();
        //System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
        assertEquals(driver.findElement(By.id("doubleClickMessage")).getText(), "You have done a double click");
    }

    @Test
    public void rightClickTest(){
        findButtonsElementsTest();
        buttons.getRightClick();
        //System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
        assertEquals(driver.findElement(By.id("rightClickMessage")).getText(), "You have done a right click");
    }

    @Test
    public void dynamicClickTest(){
        findButtonsElementsTest();
        buttons.getClick();
        assertEquals(driver.findElement(By.id("dynamicClickMessage")).getText(), "You have done a dynamic click");
    }


    @AfterMethod
    public void tearDown() {
    }
}