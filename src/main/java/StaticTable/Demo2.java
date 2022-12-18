package StaticTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/statictable.html");
		
		//List<WebElement> ls =driver.findElements(By.xpath("//tbody/tr/td"));
		
		List<WebElement> ls =driver.findElements(By.tagName("th"));
          int a= ls.size();
          System.out.println(a);
          
          for(int i=0;i<a;i++)  
          {
        	System.out.println(ls.get(i).getText());
          }
          
          
           
          
/*          for(WebElement abc:ls)
          {
        	  String b=abc.getText();
        	  System.out.println(b);
          }
*/
	}

}
