package SCOPE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope1 {//Para poder acceder a los apartados de links de la pagina

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1.Give me the count of links on the page
		//2.Count of footer section -
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
//para obtener todos los elementos de toda la página que son links "a"		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
//Se crea WebElement que corresponde a la parte de abajo de la página "gf-BIG"		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
//Imprime todos los elementos correspondients de la parte de abajo (links "a")	    
		//3
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//Se crea otro elemento que corresponde a una columna de footerdriver
//Para poder acceder a los elementos e imprimirlos		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
//Se imprime cuantos elementos hay en esa columna	
	   //4-click on each link in the column and check if the pages are opening-
	    
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size(); i++)
//Syntax para obtener los valores de toda la columna con metodo for	    
		{
	    	
	    	String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//Se crea una accion que corresponde a presionar Ctrl+Enter para mandarlos a una nueva pestaña	    	
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//De esta manera por cada elemento de la columna se mandara a Nueva Pestaña para imprimirlos despues 	        
	    	Thread.sleep(5000L);
	        
	    }//opens all the tabs
	        Set<String> abc=driver.getWindowHandles(); //4
//Syntax para manejar las pestañas 	        
	        Iterator<String> it=abc.iterator();
//Syntax iterator para el manejo de pestañas	        
	        while(it.hasNext())
	        {//Para validar si hay una pagina aparte de la principal se utiliza esto
	        	driver.switchTo().window(it.next());
//Por cada pagina extra ala actual se va cambiar de pestaña hasta la ultima que haya	        	
	        	System.out.println(driver.getTitle());	         
//Para imprimir el titutlo de cada pestaña	       
	        }
	
	}
}
