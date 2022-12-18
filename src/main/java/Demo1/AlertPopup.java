package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Downloads/alertPopUp.html");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Alert alt= driver.switchTo().alert();
		alt.sendKeys("supriya");
		alt.accept();
		String name=alt.getText();
	    System.out.println(name);
	    Thread.sleep(5000);
		alt.accept();
		
	}

}
