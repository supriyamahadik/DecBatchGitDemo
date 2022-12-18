package Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static WebDriver driver;
   
	public void LoginMethod()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("supriyamahadik8888@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Supriya8888");
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid ')]")).click();
		
		
	}

	public void homepagetitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.contains("MENTO"))
		{
			System.out.println("Test case pass");
		}
		{
			System.out.println("Test case fail");
		}
		
	}
	public void homepageloggeduser()
	{
		  driver.switchTo().defaultContent();
		WebElement wb=driver.findElement(By.xpath("//span[text()='supriya mahadik']"));
		String username=wb.getText();
		if(username.equals("supriya mahadik"))
		{
		System.out.println("Test case pass");	
		}
		else
		{
			System.out.println("Test case fail");
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
        driver= new ChromeDriver();
  
        driver.get("https://ui.cogmento.com/");
        Demo2 obj= new Demo2();
        obj.LoginMethod();
        obj.homepagetitle();
        obj.homepageloggeduser();
	}

}
