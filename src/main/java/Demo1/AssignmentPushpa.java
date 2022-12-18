package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPushpa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");

		WebElement wb=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		wb.sendKeys("Pushpa the rise");
		wb.submit();
	
		driver.findElement(By.partialLinkText("The Rise - Wikipedia")).click();
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"));
		String date =a.getText();
        
		if(date.equals("17 December 2021"))
		{
		System.out.println("Test case pass");	
		}
		else
		{
			System.out.println("Test is fail");
		}
		
		WebElement b=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td"));
		System.out.println(b.getText());
	}

}
