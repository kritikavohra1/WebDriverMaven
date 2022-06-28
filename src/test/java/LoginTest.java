import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void doLogin(){

        driver.get("http://gmailsd.com");
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("trainer@way2automation.com");
        //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        System.out.println("Test push");
        /*
            added new comments
         */
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
