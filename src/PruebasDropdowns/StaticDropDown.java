package PruebasDropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//dropdown with select tag - static  solo para dropdowns con el tag de select"
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
// Se crea un webelement para el dropdown en este caso el de currency donde solamente hay 4 elementos 
// la variable del id del dropdown se guarda aqui en "staticDropdown" para usarla abajo en la clase Select		
// y asi poder llamar al elemento. OJO se debe de importar WebElement, este es el address del dropdown de la pagina 		
		Select dropdown = new Select(staticDropdown);//staticDropdown es la variable que se creo anteriormente
//se crea el objeto de la clase, tienes que darle a conocer que el webelement existe
// haciendo el elemento WebElement de arriba staticDropdown
//Con el object creado puedes hacer muchos métodos como los siguientes
		dropdown.selectByIndex(3);//para index
//esta seria una manera de seleccionar elemento en el indice 3		
		System.out.println(dropdown.getFirstSelectedOption().getText());
//para imprimir el texto del elemento seleccionado es de esta manera
//dropdown.getFirstSelectedOption().getText() para seleccionar el texto del primer objeto seleccionado
		dropdown.selectByVisibleText("AED");//seleccionar por texto
//para seleccionar elemento por texto visible		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");//para values depende si aplica o no
//para seleccionar elemento por value
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
