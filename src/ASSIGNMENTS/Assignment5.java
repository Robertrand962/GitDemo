package ASSIGNMENTS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.cssSelector(".table-display"));
//WebElement de la tabla para acceder a ella		
		System.out.println(table.findElements(By.tagName("tr")).size());
//Imprimir el tamaño de los elementos tr de la tabla
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//Imprimir cuantos son los elementos que pertenecen al apartado tr llamados th
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//Se hace una lista de la 2da fila que son 3 elementos llamados td
		System.out.println(secondrow.get(0).getText());//Rahul Shetty
//Se imprime cada elemento td de la segunda fila llamado secondrow index 0
		System.out.println(secondrow.get(1).getText());//Learn SQL in Practical + Database Testing from Scratch
//Se imprime cada elemento td de la segunda fila llamado secondrow index 1
		System.out.println(secondrow.get(2).getText());//25
//Se imprime cada elemento td de la segunda fila llamado secondrow index 2
		}


	}


