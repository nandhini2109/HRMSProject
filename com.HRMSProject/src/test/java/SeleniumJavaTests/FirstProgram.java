package SeleniumJavaTests;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstProgram {
	void loginTest()
//browser login
	{
		FirefoxDriver driver= new  FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	//	Get the title
		String title=driver.getTitle();
		System.out.println("Title of the webpage:"+title);
			
		
		
	if (title.equals("OrangeHRM -New level of HR Management System"))
			
		{
		System.out.println("verified successfully");	
		
		}else
			
		{
			System.out.println("not verified sucessfully");
		}	
	
	driver.findElement(By.name("username")).sendKeys("selenium");
	driver.findElement(By.name("password")).sendKeys("selenium");
	driver.findElement(By.name("submit")).click();
	
	driver.findElement(By.xpath("http://127.0.0.1/orangehrm-2.5.0.2/index.php")).click();
	System.out.println("logout successfully");
	}
	
	
	




		
	public static void main(String[] args) {
		FirstProgram login=new FirstProgram();
		{
			login.loginTest();
		}
		}
			
		}
				
		
		
		
		