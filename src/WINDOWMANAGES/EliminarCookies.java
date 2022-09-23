package WINDOWMANAGES;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class EliminarCookies {

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
		
		driver.get("http://google.com");

		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("C://screenshot.png"));
	}

}
