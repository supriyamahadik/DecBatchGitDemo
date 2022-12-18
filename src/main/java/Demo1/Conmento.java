package Demo1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Conmento {
	
			static WebDriver driver;
			
			public void login()
			{
				driver.get("https://ui.cogmento.com/");
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("supriyamahadik8888@gmail.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Supriya8888");
				driver.findElement(By.xpath("//div[text()='Login']")).click();
			}

			public void homepagettile()
			{
				String a=driver.getTitle();
				
				if(a.contains("CRM"))
				{
					System.out.println("test case passed");
				}
				else
				{
					System.out.println("test case failed");
				}
				System.out.println(a);
			}

			public void homepageloggeduser()
			{
				String b=driver.findElement(By.xpath("//span[@class='user-display']")).getText();
				if(b.contains("supriya"))
				{
					System.out.println("test2 is passed");
				}
				else
				{
					System.out.println("test2 is failed");
				}
			}
			
			public void contactpage()
			{
				driver.findElement(By.xpath("(//div[@class='menu-item-wrapper'])[3]")).click();
				driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
				driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("pppppp");
				driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("rrrrr");
				driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
				//WebElement staticdd=driver.findElement(By.xpath("(//div[@name='status'])[1]"));
				//Select dd=new Select(staticdd);
				//dd.selectByValue("Inactive");
				
				
			}
			
			
			

			public static void main(String[] args) {
				// Assignment 4
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
			    driver= new ChromeDriver();
				Conmento obj=new Conmento();
				Conmento.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				obj.login();
				obj.homepagettile();
				obj.homepageloggeduser();
				obj.contactpage();
				
			}

 }

