import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
//Se crea una variable que se llama "name" y el contenido es rahul para en vez de poner rahul poner name en las pruebas, de aqui en adelante puro name		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
//String es para guardarlo en la variable password desde el getpassword(driver)		
//Es para llamar al método lo convierte en "static" 		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); // syntax de java (name) por la variable name = rahul
	    driver.findElement(By.name("inputPassword")).sendKeys(password);
//Se pone directamente la variable "password" que contiene la contraseña ... 	    
	    driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(2000);//hay que esperar para que no confunda los elementos iguales ("p") en este caso .. añadir declaracion de throws 
	    System.out.println(driver.findElement(By.tagName("p")).getText());
//System.out.println(driver.findElement(By.cssSelector("p[style*='color']")).getText()); yo lo hice gg
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
//Assert.asse... está es la syntax para ver si funciona el encontrar el elemento y lo que tiene que decir sea correcto.	    
//es como una validación de que todo este bien "ASSERT"
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
//esta es la syntax parecida ala que comento abajo pero con la variable name = rahul, otra manera para en vez de poner rahul usar la variable name
	    
//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello rahul,");
//este es una prueba para verificar que este bien el texto primero pusimos rahul como username y tiene que salir Hello rahul sino da error	    
	   driver.findElement(By.xpath("//*[text()='Log Out']")).click();
// Otra manera de encontrar elementos en este caso el botón de cerrar sesión con selector de Xpath	   
	   driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
//Webdriver driver entra con input en este block para que pueda funcionar el driver (en los parentesis entra)	
//Cuando el método se cambia a Static no hay necesidad de haberlo hecho en el object	
	{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//se reciclaron de Locators 1 para obtener el password con String con Variables	
	String passwordText =driver.findElement(By.cssSelector("form p")).getText();
//Con esta Syntax se volvió una variable el texto que incluye la contraseña 	
//Para asi poder separar el texto para obtener la pura parte entre comillas
// y con el método .split se van a separar en cadenas (ARRAYS) hasta obtener el texto que sale en comillas.	
	
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[] passwordArray = passwordText.split("'");
//De esta manera se hace una cadena para separar el texto se separa desde la comilla (') tiene que estar entre comillas	
	//0th index - Please use temporary password
	//1st index - rahulshettyacademy' to Login.
//String[] passwordArray2 = [1].split("'"); para separar la otra cadena y quedaria
//passwordArray2[0] --- viene siendo la contraseña que esta entre las comillas
	//0th index - rahulshettyacademy --- ESTA ES LA CONTRASEÑA HAY QUE GUARDARLA EN OTRA VARIABLE
	//1st index - to Login.
	String password = passwordArray[1].split("'")[0];
//Aqui se almacena la contraseña, tienes que llamar al metodo en el otro block para invocar la contraseña en la variable " password "	
	return password;
//Para retornar la variable contraseña	
	
	
	}

}
