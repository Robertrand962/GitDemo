package CALENDARIO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarioManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23 
		//driver.findElementByXPath(".//*[@id='travel_date']").click();
//Para encontrar el elemento xpath para seleccionar fecha

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{//mientras el elemento contenga "April o lo que quieras" avanza a lo siguiente 
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		//Se da click en siguiente mes hasta que llegue al deseado 
		}
//Una vez que se cumpla lo anterior 

		List<WebElement> dates= driver.findElements(By.className("day"));
//se guardan los atributos en la lista de web elements llamada dates 		
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();
//se crea la variable count que se refiere al tamaño de la lista de elementos day 
		for(int i=0;i<count;i++)
		{//se crea for con el tamaño de days
		String text=driver.findElements(By.className("day")).get(i).getText();
//Y se crea un string llamado text que es el que arroja los datos de dias (1,2,3....etc)		
		if(text.equalsIgnoreCase("21"))
		{//Y con este if deja de seguir hasta el número 21 para despues dar click en el y acabar el test
		driver.findElements(By.className("day")).get(i).click();
//con este comando se le da click al dia que queremos y se rompe con un break el test	
		break;
		}

		}
	}

}
