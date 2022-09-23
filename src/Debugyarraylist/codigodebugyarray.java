package Debugyarraylist;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class codigodebugyarray {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
//Arraylist de productos que se quieren agregar en este caso al carrito (SOLOESOS) de 30 articulos		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded); //tiene que ser un metodo static, se puede llamar un metodo sin crear objeto como en este caso
//tiene que declararse el driver, y el array de items needed
//se crea el metodo additems para ver mejor el codigo
//para agregar items se hace esta variable con el driver y el array de itemsNeeded	
		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded)
//Se crea de esta manera el driver se extrae para poder ejecutarlo en los siguientes pasos asi como el metodo string 		
//se hace una clase con la variable additems que contiene el Webdriver y el string de items needed(array)
		{

		int j=0;
//variable j=0 empieza en el index 0 
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//se hace una lista de los productos con el locator similar para 30 articulos
		for(int i=0;i<products.size();i++)
//condicion i=0 empieza index 0, para obtener la lista completa de productos "30", i++ para que aumente 1 cada vez
		{

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");
//Arraylist llamada name que contiene los productos que le de su index
//y el metodo split para separar en este caso index 0 "cucumber", index 1 "1kg"		
		String formattedName=name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//check whether name you extracted is present in arrayList or not-
        List itemsNeededList = Arrays.asList(itemsNeeded);
//de esta manera un array se convierte en Array list,se tiene que importar
		if(itemsNeededList.contains(formattedName))
//si la lista de items necesario contiene el nombre formato "cucumber" pasa
		{//son los items de la lista

		j++;
//cada vez que pase 1 va aumentando la j hasta llegar al 3
	
		//click on Add to cart (lo de abajo)
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//si cumple sigue agregar al carrito
		if(j==itemsNeeded.length)
//si la j es igual al número de items máximo en este caso 3 pasa al siguiente step
		{

		break;//aqui termina el test despues de pasar hasta 3 pruebas

		}

		}

		}
		
	}

}
