package RelativeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*; //Se importa desde otro lado para que funcionen

import org.openqa.selenium.By;
public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
//Se crea webelement con el cuadro de texto Name
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//Para imprimir el texto arriba del cuadro de texto esta seria la syntax
//Above para obtener el elemento de arriba
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
//WebElement para texto Date of birth 
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
//Encontrar elemento llamado input del DateofBirth
//Below es para el elemento de abajo en este caso Submit		
		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//WebElement para el texto de iceCream, para encontrar el texto
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
//Para dar click en el checkbox ala izquierda del texto
//toLeftOf elemento ala izquierda		
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
//WebElement de encontrar elemento 
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
//Imprimir el elemento que esta ala derecha del tagname label
//toRightOf elemento ala derecha del otro		

	}

}
