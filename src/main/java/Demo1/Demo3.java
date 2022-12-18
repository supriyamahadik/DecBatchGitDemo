package Demo1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{
	static WebDriver driver;
	public void loginpage()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	public void homepagetitle()
	{
		String title=driver.getTitle();	
	if(title.contains("HRM"))
	{
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}
	
	}
	
	public void pimpage()
	{
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("supriya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("mahadik");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String name=driver.findElement(By.xpath("//h6[text()='supriya mahadik']")).getText();
		System.out.println(name);
		
	}    
	public void searchEmp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("supriya");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		
	}

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Demo3 obj= new Demo3();
	obj.loginpage();
	obj.homepagetitle();
	obj.pimpage();
	obj.searchEmp();
	}

}
