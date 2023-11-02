package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartSearch{
	
@Test
public void FlipSearch() {
	
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        //with get method use the url
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        
        //adding the claasName of search 
        driver.findElement(By.className("_30XB9F")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        
        driver.findElement(By.name("q")).sendKeys("shoes"+Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        
        driver.findElement(By.className("_2r_T1I _396QI4")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        
        driver.quit();
     
        
   }
}

