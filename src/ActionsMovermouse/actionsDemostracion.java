package ActionsMovermouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemostracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//Para maximizar pantalla		
		driver.get("https://amazon.com.mx/");
		Actions a= new Actions(driver);
//Actions llamado a que contiene al driver para poder aplicar metodos		
		WebElement move= driver.findElement(By.cssSelector("//a[@id='nav-link-accountList']"));
//se crea el webelement move para poder navegar en la pagina, esta inhabilitado en amazon 
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//para mover el mouse en este caso para poder escribir en el cuadro de texto "HELLO" en mayusculas		
//Syntax para dejar la tecla presionada en este caso shift 		
//.click().keyDown(Keys.SHIFT)		
//.doubleClick para darle doble click		
		a.moveToElement(move).contextClick().build().perform();
//syntax para dar click derecho 		
	}

}
//.build es para estar listo para ejecutar la accion
//pero tiene que usar .perform para poder ejecutar
//.build().perform();