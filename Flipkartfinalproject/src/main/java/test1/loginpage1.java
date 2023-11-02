package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginpage1 {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        
    	// Set up the WebDriver (in this case, ChromeDriver)
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test
    public void login() {
        // Find and interact with the login elements
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pushpa94sfdc@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Bhoomi@123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        driver.findElement(By.xpath("//div[text()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
    }
    @AfterTest
    public void tearDown() {
        // Close the browser after the test
        driver.close();
    }
}


