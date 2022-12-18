package HandleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegDropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (7)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/signup");
	
	driver.findElement(By.xpath("//button[contains(@class,'6wl _58mi ')]/preceding::input[11]")).sendKeys("priya");
	driver.findElement(By.xpath("//button[contains(@class,'6wl _58mi ')]/preceding::input[@name='lastname']")).sendKeys("abcd");
	driver.findElement(By.xpath("//button[contains(@class,'6wl _58mi ')]/preceding::input[9]")).sendKeys("90999999992");
	driver.findElement(By.xpath("//button[contains(@class,'6wl _58mi ')]/preceding::input[@type='password']")).sendKeys("Abc123@n");

	WebElement w1= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_day']"));
    
	Select sel= new Select(w1);
	sel.selectByIndex(5);   //index= no-1
	WebElement a=sel.getFirstSelectedOption();
	String date=a.getText();
	System.out.println(date);

	WebElement w2= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_month']"));
	Select sel1= new Select(w2);
    sel1.selectByVisibleText("Sep");   //use this method with string val
    WebElement b=sel1.getFirstSelectedOption();
    String month=b.getText();
    System.out.println(month);
	

	WebElement w3= driver.findElement(By.xpath("//input[@name='firstname']//following::select[@name='birthday_year']"));
    
	Select sel2= new Select(w3);
	sel2.selectByValue("1995");        //use this method with val in int
	WebElement c=sel2.getFirstSelectedOption();
	String year=c.getText();
	System.out.println(year);
	
	Thread.sleep(5000);
	boolean r=driver.findElement(By.xpath("//input[starts-with(@id,'u_0_d_')]/following::label[1]")).isSelected();
	System.out.println(r);
	driver.findElement(By.xpath("//input[@class='_8esa'][1]")).click();
	driver.findElement(By.xpath("websubmit")).click();

    driver.close();
	}

}
