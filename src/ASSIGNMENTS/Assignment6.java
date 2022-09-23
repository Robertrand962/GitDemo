package ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
//para escribir en el recuadro la palabra ind y salen opciones para rellenar
	    Thread.sleep(2000);
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//SYNTAX para dar ala opcion de abajo
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//SYNTAX para dar ala opcion de abajo, es la segunda la que queremos
	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
//De esta manera se imprime con .getAttribute(value)
	   //para obtener la opcion autocompletada.	
	}

}
