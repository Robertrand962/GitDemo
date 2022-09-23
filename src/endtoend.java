import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class endtoend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        //Para dar click en el botón de One Way de viaje
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //Para dar click en el dropdown FROM en la opcion Delhi (DEL)
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
        //despues de dar click en dropdown, elegir en la opcion Delhi (DEL)
		Thread.sleep(2000);
        //Para esperar 2 segundos de dropdown a dropdown
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //Aquí se abre con parent to child el dropdown "To" y elige Chennai MAA
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        //Para el calendario con este se elige la fecha actual
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        //Condición para que esté en la opción OneWay
		{

		System.out.println("its disabled");
        //para imprimir que estaba deshabilitado el botón 
		Assert.assertTrue(true);
        //True para verificar si es cierto
		}

		else
        //Si no...
		{
        
		Assert.assertTrue(false);
        //Verificar si es falso
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        //Para elegir dropdown SeniorCitizen
		driver.findElement(By.id("divpaxinfo")).click();
        //Para dar click en el dropwdown Passenger
		   Thread.sleep(2000L);
        //Para esperar en lo que abre
		for(int i=1;i<5;i++)
        //Condición, empieza en el 1 pasajero, y tiene que elegir máximo 5 Passenger
		{

		driver.findElement(By.id("hrefIncAdt")).click();
        //Para dar click en (+) para aumentar pasajeros hasta el 5
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
        //Para dar click en Done en la parte de pasajeros
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//Verificacion que lo que este en el resultado actual sean 5 pasajeros , "5 Adult"
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//Para imprimir que sean 5 adultos 
		
		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
//Selector con css para dar Search 
		driver.findElement(By.cssSelector("input[value='Search']")).click();
//Para dar Search con el cssSelector
		// driver.findElement(By.xpath("//input[@value='Search']")).click();
//Selector con xPath para dar Search 
		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
//Selector con By.name para dar Search 
		}



		}


	
	
	