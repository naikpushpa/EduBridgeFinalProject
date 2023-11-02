package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFlights {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set up the WebDriver (in this case, ChromeDriver)
        
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");  // Replace with the URL of the flight search website.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test
    public void searchFlights() {
        // Find and interact with the flight search elements
        driver.findElement(By.xpath("//input[@name='0-departcity']")).sendKeys("New Delhi, DEL - Indira Gandhi Intl Airport");
        driver.findElement(By.xpath("//input[@name='0-arrivalcity']")).sendKeys("Mumbai, BOM - Chatrapati Shivaji International Airport");
       
        driver.findElement(By.className("_3dESVI")).click();

        
    }

//    @AfterTest
//    public void tearDown() {
//        // Close the browser after the test
//        driver.close();
//    }
}
