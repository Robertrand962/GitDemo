package WINDOWMANAGES;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
//Selenium no tiene comando para hacer scroll entonces se hace uso de JavaScript con esta syntax
//Se crea el elemento js para poder correr elementos 		
		js.executeScript("window.scrollBy(0,500)");
//SYNTAX de como hacer scrolldown en una página, en la consola pones ese comando
//window.scrollBy(0,500) el 0 son las X y 500 las Y para saber que tanto hacer scroll		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//SYNTAX para hacer Scroll en un cuadro dentro de la página, se tiene que hacer
//en la consola document.querySelector escribes el Locator de la tabla
//.scrollTop=xxx, este comando es para hacer scroll hasta abajo o hasta arriba		
		List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//Se hace una lista de los elementos en WebElement de la tabla por que se requiere imprimir toda la columna 
		int sum =0;//se crea el int llamado sum para hacer la suma
		for(int i =0;i<values.size();i++)
//for para obtener todos los valores de la columna 1x1 para sumarlos posteriormente			
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
//Se le da valor ala variable sum que es igual a sum + cada valor
//SYNTAX para convertir un int en String es con .parseInt
			
		}
		
		System.out.println(sum); //Para imprimir la sumatoria 
		driver.findElement(By.cssSelector(".totalAmount")).getText();
//Para obtener el texto de un apartado que te arroja el resultado de la suma para verificarse mas adelante 
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//Se crea el int total para separar el texto donde viene el total de la suma dentro de la página
//Para verificarse despues mas adelante
		Assert.assertEquals(sum, total);
//Para verificar con asserEquals si el valor de la suma es igual al de la pagina		
//de esta manera se verifica si son iguales los valores de la suma.	
	}

}
