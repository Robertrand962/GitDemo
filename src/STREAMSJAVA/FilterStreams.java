package STREAMSJAVA;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
//Not found por eso no jala
		driver.findElement(By.id("search-field")).sendKeys("Rice");
//No encuentra este elemento pero es el buscador de articulos
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
//Se crea una lista llamada veggies despues de escribir Rice y solo 
//Solo tendrá el elemento Rice en este caso pero en otros puede haber mas		
		// 1 results(en este caso solo 1 resultado

		List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).
//Se crea otra lista llamada FilteredList, donde aplique filtro de
//obtener texto que contenga Rice, y se hace otra lista
		collect(Collectors.toList());
//con collect se colecta los resultados para convertirlo en otra lista
		// 1 result (Solo se debe de obtener un resultado)
		Assert.assertEquals(veggies.size(), filteredList.size());
//Con el metodo Assert comparamos el tamaño de las 2 listas si coincide pasa.	
	}

}
