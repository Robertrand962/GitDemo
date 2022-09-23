package PruebasDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {//esto es para dropdowns dinamicos 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //url 
		//  //a[@value='MAA']  - Xpath for chennai
		//  //a[@value='BLR']
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//para primer dropdown de ciudades son los mismos locators para diferenciar es por index 		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//para seleccionar opcion de ciudad
		Thread.sleep(2000);//para esperar dos segundos
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();*/
//para seleccionar del segundo dropdown y no quede error tiene que diferenciarse por index
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//de esta otra manera se sustituye el uso de index con el parenttochild relationship
//esa seria la syntax para parent to child de dropdown dinamicos 		
	   driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//es para elegir la fecha actual del calendario de la página 	   
	}

}
