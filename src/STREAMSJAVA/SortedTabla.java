package STREAMSJAVA;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SortedTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

		// click on column

		driver.findElement(By.xpath("//tr/th[1]")).click();


		// capture all webelements into list

		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));


		// capture text of all webelements into new(original) list

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());


		// sort on the original list of step 3 -> sorted list



		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));

		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do
//Para realizar el while loop es de esta manera para acceder al objeto que queremos que
//se encuentra en una de las paginas siguientes 			
		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
//Lista llamada rows para las columnas 
		price = rows.stream().filter(s -> s.getText().contains("Rice"))
//Para buscar en este caso Rice en la lista
		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
//en este caso se creo "getPriceVeggie para generar otra lista
		price.forEach(a -> System.out.println(a));
//imprimir cual es el precio de Rice
		if(price.size()<1)
//Para buscar Rice en las listas tiene que ser menor a 1 para que cambie de lista
		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
//Para hacer click en siguiente pagina
		}

		}while(price.size()<1);
//para completar el while loop


		}



		private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
//String de pricevalue


		return pricevalue;
	}

}

