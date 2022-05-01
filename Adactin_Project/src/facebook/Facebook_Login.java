package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	    public static void main(String[] args) throws Exception {
	    // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SE_ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("email")).sendKeys("9145214626");
	    Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Shubham@1911");
		Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
        
	    driver.close();

	}
}
