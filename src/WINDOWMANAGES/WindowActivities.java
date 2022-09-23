package WINDOWMANAGES;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//sirve para controlar en este caso maximizar la ventana
		driver.get("http://google.com"); //para el url
		driver.navigate().to("https:rahulshettyacademy.com");
//sirve para cambiar de una página a otra  
		driver.navigate().back();
//sirve para dar ala flecha "atras" para regresar al url anterior
//si da para atrás no deja cargar la pagina, tiene que usar explicit o implicit wait para eso
		driver.navigate().forward();
//sirve para dar a la flecha "adelante" para regresar ala pagina de la que regresaste (adelantar)
		
	
	}

}
