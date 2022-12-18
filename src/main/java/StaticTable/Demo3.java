package StaticTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://prafpawar11.github.io/statictable.html");
		List<WebElement> ls =driver.findElements(By.tagName("tr"));
        int a= ls.size();
        System.out.println(a);
        
        String b="Amol";
        
        for(WebElement abc:ls)
        {
        	String c=abc.getText();
        			if(c.contains(b))
        			{
        				System.out.println("Test pass:"+b);
        			}
        }
	}

}
