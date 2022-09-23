package ALERTSJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERTSPOPUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Rahul";
		//Se crea la variable Rahul para usarla despues
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//url
		driver.findElement(By.id("name")).sendKeys(text);
//Para escribir la variable Rahul en el apartado 
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
//Para dar click en el botón alert
		System.out.println(driver.switchTo().alert().getText());
//Para obtener el texto de la alerta
		driver.switchTo().alert().accept();
//Para dar click en OK de la alerta (accept es positivo)
		driver.findElement(By.id("confirmbtn")).click();
//Para dar click en el boton de confirm
		System.out.println(driver.switchTo().alert().getText());
//Para imprimir el mensaje de alerta al darle click al boton confirm
     
		driver.switchTo().alert().dismiss();
//Para dar click en CANCEL de la alerta (dismiss es negativo)
		}
		    
	}


