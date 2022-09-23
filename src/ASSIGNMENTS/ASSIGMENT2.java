package ASSIGNMENTS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGMENT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
//Para navegar
		driver.findElement(By.linkText("Multiple Windows")).click();
//Abrir el link multiple windows
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
//Click en el link click here
		Set<String> abc=driver.getWindowHandles();
//se hace una lista de las windows  
		Iterator<String> it=abc.iterator();
//con el iterator retunra los valores y es la variable para hacer los handles
		String parentWindow=it.next();
//se crea el string del parent window con la variable it
		driver.switchTo().window(it.next());
//para cambiar ala pagina secundaria
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
//se imprime el mensaje new window
		driver.switchTo().window(parentWindow);
//se cambia ala pag principal
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
//y se imprime mensaje opening a new window
		}

		


	}


