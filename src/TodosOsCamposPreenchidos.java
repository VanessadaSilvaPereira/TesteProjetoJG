import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TodosOsCamposPreenchidos {
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
	void test() {
		WebElement nome = pagina.findElementByName("txtNome");
		WebElement email = pagina.findElementByName("txtEmail");
		WebElement assunto = pagina.findElementByName("txtAssunto");
		WebElement mensagem = pagina.findElementByName("txtMensagem");
		
		nome.sendKeys("Vanessa");
		email.sendKeys("vanessa.pereira787@gmail.com");
		assunto.sendKeys("Preço de consultas");
		mensagem.sendKeys("Gostaria de saber a tabela de preços das consultas ");
		
		WebElement btnEnviar = pagina.findElementById("botaoFaleConosco");
		btnEnviar.click();
	}
	
	@After
	public void depois() {
		
	}

}
