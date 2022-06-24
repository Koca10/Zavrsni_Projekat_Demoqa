package Pages.Forms;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class PracticeForms {
    public WebDriver driver;
    public WebDriverWait wdwait;

    By clkOnPracticeForm = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By male = By.cssSelector("label[class=\"custom-control-label\"]");
    By userMobile = By.id("userNumber");
    By dateField = By.id("dateOfBirthInput");
    By dayChoose = By.cssSelector("div[aria-label='Choose Wednesday, May 5th, 2021']");

    By subject = By.id("subjectsInput");
    By hobbiesSport = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label");
    By hobbiesMusic = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[3]");

    By chooseFile = By.id("uploadPicture");
    By currentAddres = By.id("currentAddress");
    By state = By.id("react-select-3-input");
    By city = By.id("react-select-4-input");
    By submit = By.id("submit");
    By close = By.id("closeLargeModal");

    public PracticeForms(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement clickOnPracticeForm(){
        return driver.findElement(clkOnPracticeForm);
    }
    public void getFirstName(){
         driver.findElement(firstName).sendKeys("Uros");
    }

    public void getLastName(){
        driver.findElement(lastName).sendKeys("Kocic");
    }
    public void getEmail(){
        driver.findElement(userEmail).sendKeys("uros@yahoo.com");
    }
    public WebElement getMale(){
        return driver.findElement(male);
    }

    public void getMobileNumber(){
        driver.findElement(userMobile).sendKeys("06412345678");
    }
    public void getDateField() throws InterruptedException {
        driver.findElement(dateField).click();
        Select dropdownMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        List<WebElement> listMonth = dropdownMonth.getOptions();
        for (WebElement we:listMonth) {
        }
        dropdownMonth.selectByValue("4");

        Select dropdownYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        List<WebElement> listYear = dropdownYear.getOptions();
        for (WebElement wee:listYear) {
        }
        dropdownYear.selectByValue("2021");

        driver.findElement(dayChoose).click();
    }
    public void getSubjects() throws InterruptedException {
        WebElement subjects = driver.findElement(subject);
        subjects.sendKeys("e");
        subjects.sendKeys(Keys.ENTER);
    }

    public void getHobbies(){
        driver.findElement(hobbiesSport).click();
        driver.findElement(hobbiesMusic).click();
    }
    public WebElement getChooseFile(){
        return driver.findElement(chooseFile);
    }

    public void getCurrentAddress(){
        driver.findElement(currentAddres).sendKeys("Jurija Gagarina");
    }
    public void getState() {
        WebElement states = driver.findElement(state);
        states.sendKeys(Keys.ARROW_DOWN);
        states.sendKeys(Keys.ENTER);
   }
   public void getCity(){
        WebElement cities =driver.findElement(city);
        cities.sendKeys(Keys.ARROW_DOWN);
        cities.sendKeys(Keys.ENTER);
   }
   public void getSubmit(){
        driver.findElement(submit).submit();
   }
   public void getClose(){
        driver.findElement(close).click();
   }



}
