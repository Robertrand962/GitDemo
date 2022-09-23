package ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
//SYNTAX en xpath para dar click en el checkbox		
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//Se guarda en una string el texto del checkbox		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//se guarda como webelement el dropdown 		
		Select s=new Select(dropdown);
//Se guarda como variable el seleccionar el dropdown 		
		s.selectByVisibleText(option);
//la variable de select "s" con el metodo selectbyvisibletext de la variable option va seleccionar Option 2
        driver.findElement(By.name("enter-name")).sendKeys(option);
//Se va imprimir el texto de la variable option en el recuadro
        driver.findElement(By.id("alertbtn")).click();
//para dar click en el boton de alert
     String text=  driver.switchTo().alert().getText();
//se guarda el texto en una string para poder checarlo que aparece en el alert
     if(text.contains(option))
//si el alert contiene el texto de la variable option (Option 2) pasa el test
     {

    System.out.println("Alert message success");
//imprime si si 
     }

     else

    System.out.println("Something wrong with execution");
//imprime sino
}
     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

       

       



}
		
		
	