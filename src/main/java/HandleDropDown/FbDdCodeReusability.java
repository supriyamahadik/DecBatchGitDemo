package HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDdCodeReusability {
	static WebDriver driver;
	
	public static void dateDropdown(WebElement wb, String value)
	{
		Select sel =new Select(wb);
		sel.selectByVisibleText(value);    //no need to put doublequote here to val we already given in main method
	}

	public static void main(String[] args) {
	System.setProperty("webdriver.chorme.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
	driver = new ChromeDriver();

	WebElement w1= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_day']"));
	FbDdCodeReusability.dateDropdown(w1,"5");
	
	WebElement w2= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_month']"));
	FbDdCodeReusability.dateDropdown(w2,"Dec");
	
	WebElement w3= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_year']"));
	FbDdCodeReusability.dateDropdown(w3,"1995");
	}

}
