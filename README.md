# automationBatch03
package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vel.config.Configurations;

public class A1 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", Configurations.driverPathChrome);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		

		//1 Alert
		WebElement btn1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		btn1.click();
		Thread.sleep(2000);
		
		Alert alrt1 = driver.switchTo().alert();
		alrt1.accept();
		Thread.sleep(2000);
		
		
		//3rd Alert
		WebElement btn3 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		btn3.click();
		Thread.sleep(2000);
		
		Alert alrt3 = driver.switchTo().alert();
		alrt3.accept();
		Thread.sleep(2000);
		
		//4th Alert
		WebElement btn4 = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
		btn4.click();
		Thread.sleep(2000);
		
		Alert alrt4 = driver.switchTo().alert();
		alrt4.sendKeys("Aditya");
		Thread.sleep(2000);
		alrt4.accept();
		
		//2nd Alert
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		btn2.click();
		Thread.sleep(5000);
		
		Alert alrt2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt2.accept();
		
		
		
	
		
	}

}
