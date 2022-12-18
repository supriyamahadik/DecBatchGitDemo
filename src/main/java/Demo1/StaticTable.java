package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Downloads/Statictabel.html");
		
		List<WebElement> wb=driver.findElements(By.tagName("//*[@id=\"table\"]/tbody/tr[3]/td[1]"));
		int a=wb.size();
		System.out.println(a);
		
		for(WebElement abc:wb)
	    {
	    String b=abc.getText();
	    System.out.println(b);
	       
	    }
		
	}

}
