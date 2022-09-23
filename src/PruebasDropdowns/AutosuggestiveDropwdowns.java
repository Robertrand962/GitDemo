package PruebasDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropwdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //url 
	    driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(3000);
	    List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] "));
//se hace lista de las opciones del find.elements son varias y de esta manera se hace clase-objeto        
	    for(WebElement option :options)
	    {//de esta manera se hace el for con option como
//la unica opcion entre las opciones 	    	
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{//este if es para que solamente se elija la opcion que se quiere en este caso India
	    		option.click();//con esto se le da click ala opcion que quieres entre todas las opciones 
	    		break;//con esto se rompe hasta tener la opcion que quieres.
	    	}
	    }
	}

}
