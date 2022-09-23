package PruebasDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //url 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//El assert es para verificar que sea falso que no haya un checkbox elegido, de ser true fallara el test//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//es para imprimir si el checkbox está seleccionado o no en este caso no y saldrá en la consola un FALSE		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Para verificar si es verdad que el checkbox que se le dió click está seleccionado
//Syntax para dar click en un checkbox de los 6		
//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//es para imprimir si el checkbox está seleccionado o no en este caso no y saldrá en la consola un TRUE			
		
//Count the number of checkboxes para contar los checkboxes es lo sig		
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
//es para ver en la consola cuantos checkboxes hay.		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		/*int i=1; -se le da valor a la i de 1 por que empieza desde el 1 adultos
		while(i<5) -se hace el while loop hasta 5 que es lo que queremos hasta 5 adultos
		{ ESTA ES LA MANERA DE HACER WHILE LOOP PARA VARIOS CLICKS 
			driver.findElement(By.id("hrefIncAdt")).click();//4 veces tiene que ser por eso se hace while o for loop
			//i++;//esto sirve para aumentar 1 cada vez que hace el loop hasta llegar a 5 adultos
		}
		driver.findElement(By.id("btnclosepaxoption")).click();*/
		
//PARA SABER SI ESTA ENABLED O DISABLED ALGUN BOTON ES LO SIG		
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//Para checar los attributos de en este caso Style es de esta manera
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
//condicion para obtener el valor que queremos de los atributos de style para verificar si esta activado o no un boton
		{

		System.out.println("its enabled");
//si satisface aparece mensaje, el assert es para verificar que es correcto
		Assert.assertTrue(true);

		}

		else
//y si no es correct, con el else verificamos + Assert.assert true si es verdadero o no
		{

		Assert.assertTrue(false);
//con esto podemos hacer fallar el test si no satisface 
		}
		
		
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	for(int i=1;i<5;i++)//Esta manera es con For loop, un poco mas facil esta es la syntax
	{// esta es la syntax de for
		driver.findElement(By.id("hrefIncAdt")).click();
	}	
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//Este assert equals es para comparar lo que se tiene vs la expectativa en este caso es 5 adult, si lo actual fuera diferente el test fallara	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
	
	}
	


