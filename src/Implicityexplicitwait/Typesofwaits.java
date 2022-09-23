package Implicityexplicitwait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Typesofwaits {

	public static void main(String[] args)throws InterruptedException { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
//crear variable para explicit wait, esta es la syntax
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver,itemsNeeded);
//metodo creado con el driver y la lista de items esta es la syntax
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//para ver el carrito
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//para ver el checkout para despues aplicar codigo
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
//syntax de explicit wait variable.until(ExpectedC...visibil..located y se coloca el locator que se espera ver
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//para escribir en el recuadro, tiene que haber una espera de varios segundos 
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		//explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//syntax para explicit wait, para despues imprimir el texto que sale despues de varios segundos 
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//para imprimir texto despues del explicit wait
		}

		public static  void addItems(WebDriver driver,String[] itemsNeeded)
//mismo metodo que en la clase codigodebugyarray
		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.card-title"));

		for(int i=0;i<products.size();i++)

		{

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();

		//format it to get actual vegetable name

		//convert array into array list for easy search

		//  check whether name you extracted is present in arrayList or not-

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if(j==itemsNeeded.length)

		{

		break;

		}

		}

		}

		}
		
}

