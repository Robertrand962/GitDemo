package ActionsMovermouse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
//para dar click en el link de la página
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
//se crea una string para tener las dos paginas y manejarlas
//con esta syntax el .getWindowsHandles funciona para eso 		
		Iterator<String>it = windows.iterator();
//Con Iterator returna sin orden los elementos y esta es la syntax
		String parentId = it.next();
//Se crea un string para cada pagina(esta es la principal)
		String childId = it.next();
//Se crea un string para cada pagina(esta es la secundaria)
		driver.switchTo().window(childId);
//syntax para cambiar de la página principal a la secundaria
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//Para imprimir mensaje y extraer el correo de la segunda pagina
		driver.findElement(By.cssSelector(".im-para.red")).getText();
//Para localizar elemento y obtener el texto
//driver.findElement(By.cssSelector(".im-para.red")).getText() se hace string abajo de esto pero se selecciona click derecho y despues en watch	
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//Se crea un string en este caso para el email
//Se pone un debug point en la linea de donde se extrae el texto Linea32 y se ejecuta debug as..
//se selecciona el driver.findelement... + clickder + opcion "Watch"
//Sale un cuadro con el texto y se van haciendo los pasos separando el texto hasta obtener
//hasta obtener esa syntax que se separa hasta obtener el puro email y convertirlo en string para colocarlo en otro metodo	
//VOLVER A CHECAR PARA APRENDERLO, VIDEO NUMERO 87, EN EL SEGUNDO 20
		driver.switchTo().window(parentId);
//para volver ala página principal y colocar despues el email de String emailId
		driver.findElement(By.id("username")).sendKeys(emailId);
//para escribir el emailId obtenido de la pagina principal, convertido en un string
	}

}
