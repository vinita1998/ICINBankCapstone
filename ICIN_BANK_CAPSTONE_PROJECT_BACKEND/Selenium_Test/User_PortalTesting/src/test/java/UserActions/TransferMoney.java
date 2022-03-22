package UserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferMoney {
	
	@Test
	public void TransferMoney() throws InterruptedException{
		
		String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:4200/login");
	    Thread.sleep(5000);
	    
	    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[1]/input")).sendKeys("Novina");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[2]/input")).sendKeys("Novina123");
		
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/button")).click();
		try 
		{
			WebDriverWait wait=new WebDriverWait(driver, 14);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-home/div[1]/h2")));
			System.out.println("Login Successfull");
			
			driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[3]/a")).click();
		    
		    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("/html/body/app-root/app-transfer-between-accounts/div/form/div[3]/input")).sendKeys("123456789");
		    driver.findElement(By.xpath("/html/body/app-root/app-transfer-between-accounts/div/form/div[4]/input")).sendKeys("1234");
		    driver.findElement(By.xpath("/html/body/app-root/app-transfer-between-accounts/div/form/div[5]/input")).sendKeys("1000");
		    
		    Thread.sleep(5000);
		    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("/html/body/app-root/app-transfer-between-accounts/div/form/div[6]/button")).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-home/div[1]/h2")));
		    System.out.println("Transfer Money Successfull");

//			driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
//			System.out.println("Signed Out");
		}
		catch(Exception e) 
		{
			System.out.println("Error in browser!!\nPlease have a look");
		}
		
	    Thread.sleep(5000);  
	    driver.quit();
		
	}

}
