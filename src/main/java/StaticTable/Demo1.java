package StaticTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/statictable.html");
		
		String a =driver.findElement(By.xpath("//tr/th[1]")).getText();
             System.out.println(a);
	}

}
