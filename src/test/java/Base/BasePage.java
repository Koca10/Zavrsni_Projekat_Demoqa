package Base;

import Pages.BookStoreApplication.BookStore;
import Pages.BookStoreApplication.Login;
import Pages.BookStoreApplication.Profile;
import Pages.DemoqaMain.DemoQaMainMenu;
import Pages.Elements.*;
import Pages.Forms.PracticeForms;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public final String url="https://demoqa.com/";
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;
    public DemoQaMainMenu demoMain;
    public TextBox textBox;
    public WebTables webTables;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public Buttons buttons;
    public Links links;
    public BrokenLinksImages brokenLinksImages;
    public UploadAndDownload uploadAndDownload;
    public DynamicProperties dynamicProperties;
    public PracticeForms practiceForms;
    public Login login;
    public Profile profile;
    public BookStore bookStore;



    @BeforeClass
    public void beforeClass(){
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.manage().window().minimize();
        demoMain = new DemoQaMainMenu(driver);
        textBox= new TextBox(driver, wdwait);
        webTables = new WebTables(driver, wdwait);
        checkBox = new CheckBox(driver,wdwait);
        radioButton = new RadioButton(driver,wdwait);
        buttons = new Buttons(driver,wdwait);
        links = new Links(driver,wdwait);
        brokenLinksImages = new BrokenLinksImages(driver,wdwait);
        uploadAndDownload = new UploadAndDownload(driver,wdwait);
        dynamicProperties = new DynamicProperties(driver,wdwait);
        practiceForms = new PracticeForms(driver,wdwait);
        login = new Login(driver, wdwait);
        profile = new Profile(driver,wdwait);
        bookStore = new BookStore(driver,wdwait);




    }

    @AfterClass
    public void afterClass(){
        //driver.quit();

    }
}
