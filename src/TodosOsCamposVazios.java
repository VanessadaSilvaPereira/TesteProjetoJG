import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TodosOsCamposVazios {
	private static final String KEY = "webdriver.gecko.driver";
	private static final String VALUE = "C:\\uc13\\eclipse\\geckodriver.exe";
	FirefoxDriver pagina;
	@Before
	public void antes(){
		
		System.setProperty(KEY, VALUE);
		
		pagina = new FirefoxDriver();
		pagina.get("https://jgoftalmo.000webhostapp.com/");
	}
	
	@Test
	public void test() {
//id botaoFaleConosco
		WebElement btnEnviar = pagina.findElementById("botaoFaleConosco");
		btnEnviar.click();
	}
	
	@After
	public void depois() {
		//pagina.close();
	}


}
