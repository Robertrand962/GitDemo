package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:jqueryui.com/droppable/");//url
		//driver.switchTo().frame(1); este es para cambiar al frame(apartado 1) hay 0 y 1
		System.out.println(driver.findElements(By.tagName("iframe")).size());
//Para obtener en la consola el tamaño de cuantos elementos de frame hay		
		driver.switchTo().frame(0);
//Syntax para cambiar al frame con index 0		
//cssSelector//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//id//driver.findElement(By.id("draggable")).click();
        Actions a = new Actions(driver);
//Objeto Actions llamado a        
        WebElement source= driver.findElement(By.id("draggable"));
//Se crean 2 elementos Source y target, source es el elemento que se moverá a target        
        WebElement target= driver.findElement(By.id("droppable"));
//Target es el elemento donde source será llevado        
        a.dragAndDrop(source, target).build().perform();
//Syntax de arrastrar elemento de un frame a otro        
        driver.switchTo().defaultContent();
//Para volver al apartado fuera del apartado frame        
	}
	//Frames: Son apartados de las páginas donde se pueden hacer opciones blabla
}
