package CertificacionesPopuphasmap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyHashmapSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
//Syntax para poder acceder a permisos en chrome, ChromeOptions (importante)
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
//Para manejar la parte de proxys se tiene que seguir este procedimiento que es 
//crear un objeto llamado proxy, y con el siguiente comando se aceptan la proxy o se setean		
//despues el objeto de chromeoptions para la capability		
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
//Syntax para las preferencias de chrome esa es la syntax para cambiar de 
//cambiar directorio de uno a otro
		
		// FirefoxOptions options1 = new FirefoxOptions();
//options1.setAcceptInsecureCerts(true);  PARA ACEPTAR CERTIFICADOS
		// EdgeOptions options2 = new EdgeOptions();

		options.setAcceptInsecureCerts(true);
//PARA ACEPTAR CERTIFICADOS ES LOS SIG, (obj.chrome).setAcceptInsecureCerts(true) true para aceptar
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\Downloads\\chromedriver_win32 (new)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
//Se tiene que colocar el objeto de ChromeOptions en el driver para que corra
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
//Para imprimir titulo de la pagina 

	}

}
