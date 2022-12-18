package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'-c57-8 ui')]")).sendKeys("MUMBAI CENTRAL - MMCT");
		driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']")).sendKeys("BIKANER JN - BKN");

	}

}
