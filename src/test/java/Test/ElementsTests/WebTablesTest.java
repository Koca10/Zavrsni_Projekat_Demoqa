package Test.ElementsTests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class WebTablesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
    }

    @Test
    public void findWebTables(){
        demoMain.getElements().click();
        webTables.getWebTables().click();
        assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables");
    }

    @Test
    public void addNewPerson(){
        findWebTables();
        webTables.getAddButton().click();
        webTables.inputFieldsWebTables("Uros", "Kocic", "uros@yaoo.com","28", "1000", "Legal");
    }
    @Test
    public void addNewClose(){
        findWebTables();
        webTables.getAddButton().click();
        webTables.getClose().click();
        assertTrue(driver.findElement(By.cssSelector(".web-tables-wrapper")).isDisplayed());
    }

    @Test
    public void sort(){
        addNewPerson();
        webTables.getSortFirstName().click();
        webTables.getSortLastName().click();
        webTables.getSortEmail().click();
        webTables.getSortAge().click();
        webTables.getSortSalary().click();
        webTables.getSortDepartment().click();
        webTables.getSortActions().click();
        assertTrue(driver.findElement(By.xpath("(//div[@role='columnheader'])[1]")).isDisplayed());
    }

    @Test
    public void typeOfSearch() {
        findWebTables();
        webTables.inputSearchBox("Alden");
        assertTrue(driver.findElement(By.xpath("//div[normalize-space()='Alden']")).isDisplayed());
    }
    @Test
    public void searchButtonIsDisplayed() {
        findWebTables();
        webTables.getSearchButton().isDisplayed();
        assertTrue(driver.findElement(By.id("basic-addon2")).isDisplayed());
    }

    @Test
    public void editFirstName() {
        findWebTables();

        webTables.getEdit().click();
        webTables.getFirstName().clear();
        webTables.getFirstName().sendKeys("Nemanja");
        webTables.getSubmit().click();
        assertEquals(driver.findElement(By.xpath("(//div[normalize-space()='Nemanja'])[1]")).getText(),
                "Nemanja");
    }

    @Test
    public void delete() {
        findWebTables();
        webTables.delete(0);
        List<WebElement> name = driver.findElements(By.className("rt-tr-group"));

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).getText().compareTo(name.get(i).getText()) > 0) {
                fail();
            }
            //  System.out.println(name.get(i).getText());
        }
    }

    @Test
    public void rows() {
        findWebTables();
        webTables.select("5");
        List<WebElement> filter = driver.findElements(By.className("rt-tr-group"));
        int count = 0;
        for (int i = 0; i < filter.size(); i++) {
            if (filter.size() != 5)
                fail();
        }
    }

    @Test
    public void addUsers() {
        findWebTables();
        webTables.select("5");
        webTables.getAddButton().click();
        webTables.inputFieldsWebTables("Nevena", "Neve", "nev@yahoo.com",
                "26", "140", "civilenginering");

        webTables.getAddButton().click();
        webTables.inputFieldsWebTables("Vlada", "Vladimirovic", "vlada@yahoo.com",
                "59", "2000", "Architecture");

        webTables.getAddButton().click();
        webTables.inputFieldsWebTables("Jasminka", "Jas", "Jas@yahoo.com",
                "62", "3000", "Pharmacist");
    }

    @Test
    public void nextPage() {
        addUsers();
        webTables.getPage().clear();
        webTables.getPage().sendKeys("2");
        webTables.getPage().sendKeys(Keys.ENTER);
        assertEquals(driver.findElement(By.cssSelector(".-totalPages")).getText(), "2");
    }

    @Test
    public void nextButton() {
        addUsers();
        webTables.getNextPage().click();
        assertTrue(driver.findElement(By.className("-next")).isDisplayed());
    }

    @Test
    public void previousButton() {
        nextButton();
        webTables.getPreviousPage().click();
        assertTrue(driver.findElement(By.className("-previous")).isDisplayed());
    }




    @AfterMethod
    public void tearDown() {
    }
}