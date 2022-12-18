package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		WebElement wb=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel= new Select(wb);
		List<WebElement> ls=sel.getOptions();
		int a=ls.size();
		
		System.out.println(a);
		
		for(WebElement abc:ls)
		{
			String b=abc.getText();
			System.out.println(b);
			
			if(b.equals("Sep"))
			{
				//System.out.println("Test is pass");
				sel.selectByVisibleText(b);
				break;
			}
		}
	

		
		
		
/*		for(int i=0;i<a;i++)               //get method presenui inside list interface .When we want to capture the list of  WebElement	                         
		{                                   //that time we use  get in java
	     System.out.println(ls.get(i).getText());
		}
*/		
	
	}

}
