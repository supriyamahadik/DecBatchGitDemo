package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("driver.chorome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
     RemoteWebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.findElement(By.className("gLFyf gsfi")).sendKeys("iphone14");
     driver.findElement(By.name("btnK")).click();
   
     
	}

}
