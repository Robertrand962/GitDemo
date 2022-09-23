package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators { //locators .id, .name, .className ...etc

	public static void main(String[] args) throws InterruptedException { //throws InterruptedException para evitar incercepcion de clicks
// implicit wait - 2 second timeout
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
//Es el driver esa es la syntax		
		WebDriver driver = new ChromeDriver();
//Chromedriver asi es
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//driver.manageblabla sirve para tiempo, implicit wait especifico, duration(se tiene que importar) para saber cuanto tiempo se necesita.		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//driver.get para las url
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
//driver.findElement para encontrar elementos con "id"... .sendkeys para escribir en el espacio del elemento	
	    driver.findElement(By.name("inputPassword")).sendKeys("hola123");
//by.name para encontrar elementos con atribute "name"
	    driver.findElement(By.className("signInBtn")).click();
//by.className atributo "className".. .click(); para dar click en algun boton
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//para imprimir text de error..cssSelector es otro locator, .getText para obtener el texto 	    
	    driver.findElement(By.linkText("Forgot your password?")).click();
//by.linkText es para los links 
	    Thread.sleep(1000);//sirve para esperar a que se estabilice la app y puedas dar click en algo
//Al picarle olvide contraseña tiene que haber tiempo de espera para poder dar click en el botón	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
//by.xpath es para xpath, esa es su sintaxis correcta •	//Tagname[@attribute='value']	    
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
//cssSelector("input[placeholder='Email']" otra manera (sintax) de cssSelector
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();//clear es para borrar lo que se escribió
//By.xpath("//input[@type='text'][2]")) para elegir un elemento que no es único y puede haber varios iguales (indice)INDEX	    
//	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
//Se hizo prueba de escribir y borrar cosas con diferentes locators
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
//By.cssSelector("input[type='text']:nth-child(3)")) para elegir elemento repetido por indice, verificar en consola	    
//$('input[type="type"]:nth-child(2)') y enter, para buscar elemento en consola por CSS locator.	    
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8998989898");
//By.xpath("//form/input[3]" para Parent to child syntax se usa así
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//By.cssSelector(".reset-pwd-btn" syntax para CSS pero hay error por corregir
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
//By.cssSelector("form p") Parent to child CSS System... para imprimir el getText..
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//xpath("//div[@class='forgot-pwd-btn-container']/button[1]" syntax para parent to child + index para encontrar objetos.    
	    Thread.sleep(1000);// para esperar que se estabilice
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
//By.cssSelector("#inputUsername") syntax de css para valores "id"	    
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
//By.cssSelector("input[type*='pass']") syntax para palabras regulares para simplificar palabras largas con " * " asterisco
	    driver.findElement(By.id("chkboxOne")).click();
//By.id("chkboxOne") para clickear una caja de recordar usuario...	    
	    driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//By.xpath("//button[contains(@class,'submit')]") syntax de xpath para palabras regulares.	
	    driver.close();
	}
// para obtener valores en consola con CSS es $(' ')
// para obtener valores en consola con Xpath es $x('//input[@placeholder="Name"])
}
