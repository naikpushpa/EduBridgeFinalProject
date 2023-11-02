package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	public void test() {
		
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/newtours/");//open url in browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		//driver.findElement(By.name("userName")).sendKeys("mercury");
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("mercury");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		driver.findElement(By.name("password" )).sendKeys("mercury");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.findElement(By.name("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		
		String exptitle="Login: Mercury Tours";
		String acttitle=driver.getTitle();//returns the title of page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));

		if(acttitle.equals(exptitle))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");

		}
		//driver.close();//close the browser

	}

}

