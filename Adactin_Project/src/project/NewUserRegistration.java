package project;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SE_ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://adactinhotelapp.com");
		driver.findElement(By.className("login_register")).click();
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("Shubham1911");
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(500);
		driver.findElement(By.name("re_password")).sendKeys("123456789");
		Thread.sleep(500);
		driver.findElement(By.name("full_name")).sendKeys("Shubham Sakhare Patil");
		Thread.sleep(500);
		driver.findElement(By.name("email_add")).sendKeys("shubhamsakhare1911@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("captcha")).click();
		Thread.sleep(10000);
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Please Enter Captcha");
		//driver.findElement(By.name("captcha")).sendKeys(String data=sc.next());
		//String data=sc.next();
		driver.findElement(By.name("tnc_box")).click();
		//Thread.sleep(500);
		driver.findElement(By.name("Submit")).click();

		//driver.findElement(By.name("rest")).click();
		//driver.close();
	}
}
