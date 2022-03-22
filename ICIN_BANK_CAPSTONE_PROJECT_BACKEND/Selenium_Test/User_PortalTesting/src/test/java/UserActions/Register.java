package UserActions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	@Test
	public void register() throws InterruptedException {
		String driver_path ="D:\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://localhost:4200/login");
	    Thread.sleep(5000);
	    
	    try {
	    	//WebDriverWait wait=new WebDriverWait(driver, 14);
	    	driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div[3]/a")).click();
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[1]/input")).sendKeys("vini");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[2]/input")).sendKeys("z");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[3]/input")).sendKeys("vini");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[4]/input")).sendKeys("123123v");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[5]/input")).sendKeys("14/03/2022");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[6]/input")).sendKeys("8888888888");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[7]/input")).sendKeys("Mumbai");
	    	Select id=new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[8]/select")));
	    	id.selectByIndex(2);
	    	WebElement fileInput = driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[9]/input"));
	    	fileInput.sendKeys("D:\\dinos.png");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[10]/input")).sendKeys("12341234");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[11]/input")).sendKeys("vini@gmail,com");
	    	driver.findElement(By.xpath("/html/body/app-root/app-register/div/form/div/div[12]/button")).click();
	    	Thread.sleep(5000);
	    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
	    	System.out.println("Registration Successfull");
	    }
	    catch(Exception e) {
	    	System.out.println("Erro in web browser\nPlease have a look");
	    }
	    Thread.sleep(5000);  
	    driver.quit();
	}
}
