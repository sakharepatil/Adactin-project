package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_New_Account {

	    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SE_ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Salmaan");
		Thread.sleep(500);
		
		driver.findElement(By.name("lastname")).sendKeys("Khan");
		Thread.sleep(500);
		
		driver.findElement(By.name("reg_email__")).sendKeys("salmaanlkhan2712@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("salmaanlkhan2712@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		Thread.sleep(500);
		
		WebElement a1=driver.findElement(By.name("birthday_day"));
		Select A1=new Select(a1);
		A1.selectByValue("27");
		Thread.sleep(500);
		
		WebElement a2=driver.findElement(By.name("birthday_month"));
		Select A2=new Select(a2);
		A2.selectByValue("12");
		Thread.sleep(500);
		
		WebElement a3=driver.findElement(By.name("birthday_year"));
		Select A3=new Select(a3);
		A3.selectByValue("1972");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(500);
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
		
	}
}



