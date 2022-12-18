package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogonFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.get("https://www.google.com/");
	};
	

}
