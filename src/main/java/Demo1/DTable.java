package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DTable {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			//it will click on PIM Link
			driver.findElement(By.linkText("PIM")).click();
			
			//it will click on add button
			driver.findElement(By.id("btnAdd")).click();
			//enter fname and lname
			driver.findElement(By.id("firstName")).sendKeys("abc");
			driver.findElement(By.id("lastName")).sendKeys("abc");
			
			//capture emp id
			String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
			System.out.println(empid);
			
			//click on save button
			driver.findElement(By.id("btnSave")).click();
			
			driver.findElement(By.xpath("//a[text()='Employee List']")).click();
			//List<WebElement> ls =driver.findElements(By.xpath("//table[@id='resultTable']//tbody//tr//td[2]"));
		
			List<WebElement> ls =driver.findElements(By.xpath("//div[contains(text(),'First')]/following-sibling::div"));
			for(WebElement abc: ls)
			{
			if(abc.getText().equals(empid))
			{
			System.out.println("New Employee is present in List "+empid);
			}
			}
			}

	}


