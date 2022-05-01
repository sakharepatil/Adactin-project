package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	    public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SE_ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://adactinhotelapp.com");
		driver.findElement(By.name("username")).sendKeys("shubham1911");
		Thread.sleep(500);
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(500);

		driver.findElement(By.name("login")).click();
		Thread.sleep(500);
		
		WebElement a1=driver.findElement(By.name("location"));
		Select A1=new Select(a1);
		A1.selectByValue("Paris");
		Thread.sleep(500);

		WebElement a2=driver.findElement(By.name("hotels"));
		Select A2=new Select(a2);
		A2.selectByValue("Hotel Sunshine");
		Thread.sleep(500);

		WebElement a3=driver.findElement(By.name("room_type"));
		Select A3=new Select(a3);
		A3.selectByValue("Double");
		Thread.sleep(500);

		WebElement a4=driver.findElement(By.name("room_nos"));
		Select A4=new Select(a4);
		A4.selectByValue("2");
		Thread.sleep(500);
		
		driver.findElement(By.name("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("19/11/2022");
		driver.findElement(By.name("datepick_out")).clear();
		driver.findElement(By.name("datepick_out")).sendKeys("20/11/2022");
		
		WebElement a5=driver.findElement(By.name("adult_room"));
		Select A5=new Select(a5);
		A5.selectByValue("2");
		Thread.sleep(500);
		
		WebElement a6=driver.findElement(By.name("child_room"));
		Select A6=new Select(a6);
		A6.selectByValue("2");
		Thread.sleep(500);
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(500);

		driver.findElement(By.name("radiobutton_0")).click();
		Thread.sleep(500);

		driver.findElement(By.name("continue")).click();
		Thread.sleep(500);
		
		driver.findElement(By.name("first_name")).sendKeys("Shubham");
		Thread.sleep(500);

		driver.findElement(By.name("last_name")).sendKeys("Patil");
		Thread.sleep(500);

		driver.findElement(By.name("address")).sendKeys("Ameerpeth Hyderabad-500016");
		Thread.sleep(500);

		driver.findElement(By.name("cc_num")).sendKeys("1234567891234567");
		Thread.sleep(500);
		
		WebElement a7=driver.findElement(By.name("cc_type"));
		Select A7=new Select(a7);
		A7.selectByValue("MAST");
		Thread.sleep(500);
		
		WebElement a8=driver.findElement(By.name("cc_exp_month"));
		Select A8=new Select(a8);
		A8.selectByValue("11");
		Thread.sleep(500);
		
		WebElement a9=driver.findElement(By.name("cc_exp_year"));
		Select A9=new Select(a9);
		A9.selectByValue("2022");
		Thread.sleep(500);
		
		driver.findElement(By.name("cc_cvv")).sendKeys("7542");
		Thread.sleep(500);

		driver.findElement(By.name("book_now")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click(); //Book Itinerary
		Thread.sleep(500);
		
		driver.findElement(By.id("check_all")).click();
		
		driver.findElement(By.name("order_id_text")).sendKeys("CIO615D2I6");
		Thread.sleep(500);
		
		driver.findElement(By.name("search_hotel_id")).click();
		Thread.sleep(500);
		
		/*driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[3]")).click(); //Change Password
		Thread.sleep(500);
		
		driver.findElement(By.name("current_pass")).sendKeys("9145214626");
		Thread.sleep(500);
		
		driver.findElement(By.name("new_password")).sendKeys("123456789");
		Thread.sleep(500);
		
		driver.findElement(By.name("re_password")).sendKeys("123456789");
		Thread.sleep(500);
		
		driver.findElement(By.name("change_password_Submit")).click();
		Thread.sleep(500);*/

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click(); //Logout
		Thread.sleep(500);
		
		driver.close();
		
	}
	}

