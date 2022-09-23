package RelativeLocators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
//Switching Window Para cambiar de pagina
		Set<String> handles=driver.getWindowHandles();
//Syntax para Window Handles, crear Strings en plural por que son 2 o mas
		Iterator<String> it=handles.iterator();
//Para iterar crear metodo it = handles.iterator
		String parentWindowId = it.next();
//String para Página Parent 
		String childWindow =it.next();
//String para página child
		driver.switchTo().window(childWindow);
//Para cambiar de Parent to child window
		driver.get("https://rahulshettyacademy.com/");
//Para abrir url en child window
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
//String para los cursos que aparecen en la página (queremos el 1ero)
		.get(1).getText();
//Index numero 1
		driver.switchTo().window(parentWindowId);
//Para volver a Parent window
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
//WebElement para el cuadro de texto name que queremos llenar con el string de cursos
		name.sendKeys(courseName);
//Para escribir en el cuadro de texto el string creado courseName que contiene el texto de el curso 1er
		
//Screenshot Para tomar screenshot
		File file=name.getScreenshotAs(OutputType.FILE);
//Esta es la syntax para guardar como archivo File		
		FileUtils.copyFile(file, new File("logo.png"));
//File utils se importa para convertirlo en archivo File
		
		//driver.quit();

//GEt Height & Width Para obtener Alto y ancho
		System.out.println(name.getRect().getDimension().getHeight());
//Syntax para obtener Alto
		System.out.println(name.getRect().getDimension().getWidth());
//Syntax para obtener Ancho		
	}

}
