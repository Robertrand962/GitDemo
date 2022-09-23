package WINDOWMANAGES;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//Para maximizar pagina web		
		driver.manage().deleteAllCookies();
//Para eliminar las cookies de una pagina web o navegador		
		driver.manage().deleteCookieNamed("sessionKey");
//Para eliminar alguna cookie en especial
		//click on any link
		//Login page - verify login url
		driver.get("http://google.com");//url
		
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//Syntax para tomar y guardar como FILE el screenshot	    
		FileUtils.copyFile(src,new File("C://screenshot.png"));
//Para guardar en FileUtils que tiene que ser importado y descargado en : "https://commons.apache.org/proper/commons-io/download_io.cgi" Binaries la opcion de abajo	  
//Y esta es la syntax para copiar en una carpeta addthrows y todo eso hacerlo	    
//OJO tienes que guardar en una carpeta que no sea directo de C:// por los accesos de admin
	//Es solo un ejemplo no es mi carpeta esta	C://screenshot.png
		//Por eso no funciona el test case pero asi se hace
	}

}
