package ASSIGNMENTS;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		String username = "rahulshettyacademy";
		String password = "learning";		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='user']")).click();
		//locator para botonclickeable "user"
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement options = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(options);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='consult']")));
		dropdown.selectByVisibleText("Consultant");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
	
	for(int i =0;i<products.size();i++)
	{
		products.get(i).click();
	}
	driver.findElement(By.partialLinkText("Checkout")).click();
	
	

	
	}
}	
		
		