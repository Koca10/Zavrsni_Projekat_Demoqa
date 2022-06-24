package Test.Forms;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PracticeFormsTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void studentRegistrationForm() throws InterruptedException {
        demoMain.getForms().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/forms");
        practiceForms.clickOnPracticeForm().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
        practiceForms.getFirstName();
        practiceForms.getLastName();
        practiceForms.getEmail();
        practiceForms.getMale().click();
        practiceForms.getMobileNumber();
        practiceForms.getDateField();
        practiceForms.getSubjects();
        practiceForms.getHobbies();
        practiceForms.getChooseFile().sendKeys("D:\\Uros\\Downloads\\Toolsqa.jpg");
        practiceForms.getCurrentAddress();
        practiceForms.getState();
        practiceForms.getCity();
        practiceForms.getSubmit();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("example-modal-sizes-title-lg")));
        assertEquals(driver.findElement(By.id("example-modal-sizes-title-lg")).getText(), "Thanks for submitting the form");
        assertTrue(driver.findElement(By.className("modal-body")).isDisplayed());
        Thread.sleep(4000);
        practiceForms.getClose();

    }


    @AfterMethod
    public void tearDown() {
    }
}