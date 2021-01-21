package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.Form;

public class ScriptsRPM {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
  @Test
  public void test() {
	  
	  driver.get("https://rpmsoftware.com/hiring/2020/integration-test/form-edit.html");
	  driver.manage().window().maximize();
	  Form.Name(driver).sendKeys("Isabel Britt");
	  Form.Summary(driver).sendKeys("This is a test Employee Summary.");
	  Form.Department(driver).selectByVisibleText("Management");
	  Form.Salary(driver).sendKeys("$50,000.00");
	  Form.Latitude(driver).sendKeys("34.833850°");
	  Form.Longitude(driver).sendKeys("106.748580°");
	  Form.WorkLocation(driver).selectByVisibleText("Headquarters");
	  Form.Joiningdate(driver).sendKeys("0020180104");
	  Form.Status(driver).click();
	  Form.Clength(driver).sendKeys("47");
	  Form.metric1(driver).selectByVisibleText("in");
	  Form.Cwidthth(driver).sendKeys("21");
	  Form.metric2(driver).selectByVisibleText("in");
	  Form.Ccolor(driver).sendKeys("Brown");
	  Form.Brand1(driver).sendKeys("Ford");
	  Form.model1(driver).sendKeys("Taurus");
	  Form.modelYear1(driver).sendKeys("2018");
	  Form.Trim1(driver).sendKeys("SEL");
	  Form.Color1(driver).sendKeys("Black");
	  Form.License1(driver).sendKeys("Test-001");
	  Form.Brand2(driver).sendKeys("Ford");
	  Form.model2(driver).sendKeys("F150");
	  Form.modelYear2(driver).sendKeys("2015");
	  Form.Trim2(driver).sendKeys("XLT");
	  Form.Color2(driver).sendKeys("Red");
	  Form.License2(driver).sendKeys("Test-002");
	  Form.submit(driver).click();
	  
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	  
	  String actual = driver.getCurrentUrl();
	  String expected = "https://rpmsoftware.com/hiring/2020/integration-test/form.html";
	  Assert.assertEquals(actual, expected);
	  System.out.println("Assert Passed");
	  
  }
}
