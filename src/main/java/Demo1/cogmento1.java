package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cogmento1 {
	static WebDriver driver;
	
	public void loginPage()
	{
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("supriyamahadik8888@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Supriya8888");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	public void contact()
	{
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("supriya");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("mahadik");
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		String name=driver.findElement(By.xpath("//span[text()='supriya mahadik']")).getText();
		
		if(name.equals("supriya"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		driver= new ChromeDriver();
	
		cogmento1 obj= new cogmento1();
		obj.loginPage();
		obj.contact();
		

	}

}
