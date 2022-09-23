package PruebasMias;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenisNike {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.nike.com/mx/?cp=76060516106_aff_wizKxmN8no4&ranMID=41134&ranEAID=wizKxmN8no4&ranSiteID=wizKxmN8no4-xesG8fhPU5Y6bcDGltGvHw");
		driver.findElement(By.xpath("(//input[@id='VisualSearchInput'])[1]")).sendKeys("Air force 1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@class='pre-search-input-icon'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt=\"Nike Air Force 1 '07 Calzado para mujer\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='Blanco/Blanco/Blanco/Negro'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[normalize-space()='CM 25.5'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[normalize-space()='Agregar a la bolsa de compra'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='pre-jewel pre-cart-jewel text-color-primary-dark'])[1]")).click();
		Thread.sleep(4000);
		driver.close();
	
		
		
		
	

	}
}
