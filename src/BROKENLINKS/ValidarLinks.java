package BROKENLINKS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ValidarLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		   //broken URL
        //Step 1 - IS to get all urls tied up to the links using Selenium
        //  Java methods will call URL's and gets you the status code
        //if status code >400 then that url is not working-> link which tied to url is broken
        //a[href*="soapui"]' es la syntax en la consola del xpath de los links

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//Se hace una lista llamada links con el locator css de los links
//Almacena todos los links que queremos checar     
     SoftAssert a =new SoftAssert();
//SoftAssert es una verificación sin necesidad de terminar el test de una
//Es más flexible por si algo sale mal solo registre el error y continue a ver si hay mas     
     for(WebElement link : links)
//Por cada link de la lista links 
     {
         String url= link.getAttribute("href");
//Se crea una string del url que contenga el link mas el atributo href
         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//Esta SYNTAX para tener una conexion abierta del url HttpURLConnection apartir de aqui se crea el object
//openConnection method llamando como objeto la url creada como string
         conn.setRequestMethod("HEAD");
//para setear que tipo de request es en este caso HEAD
         conn.connect();
//De esta manera es para que de respuesta el url en este objeto en conn.
         int respCode = conn.getResponseCode();
//Para que de respuesta que si funciona o no el codigo es con este objeto 
//Para ver si da 200 o 400 y de ahi hacer los assert         
         System.out.println(respCode);
//Para imprimir cuanto fue la respuesta de cada link
         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);      
//De esta manera verificamos si el link no está roto tiene que ser menor a 400    
     }
    
     a.assertAll();//Con esto verifica todo el test para ver que pase o no el test
}



}




