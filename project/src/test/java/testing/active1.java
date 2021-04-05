package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class active1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver();
		// Launch website  
	    driver.navigate().to("http://192.168.43.251:49153/"); 
	 // Click on the search text box and send value  
	    driver.findElement(By.id("About Us")).click();
	    WebElement TxtBoxContent = driver.findElement(By.id("PID-ab2-pg"));
	    String Txt = TxtBoxContent.getText();
	    System.out.println(Txt);
	    driver.quit();
	 
		

	}

}
