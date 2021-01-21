package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Form {

	@SuppressWarnings("unused")
	private static Select select = null;
	private static WebElement element = null;

	public static WebElement Name(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='text focus form-control'])"));
		return element;
	}
	
	public static WebElement Summary(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//*[@class='focus form-control'])"));
		return element;
	}
	
	public static Select Department(WebDriver driver) {
		Select	select = new Select(driver.findElement(By.xpath("(//*[@class='form-control'])[1]")));
		return select;			
	}
	
	public static WebElement Salary(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='focus money form-control'])"));
		return element;
	}
	
	public static WebElement Latitude(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='latLong form-control'])[1]"));
		return element;
	}
	
	public static WebElement Longitude(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='latLong form-control'])[2]"));
		return element;
	}	
	
	public static Select WorkLocation(WebDriver driver) {
		
		Select select = new Select(driver.findElement(By.xpath("(//*[@class='form-control'])[2]")));
		return select;
	}	
	
	public static WebElement Joiningdate(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='datePicker inputGlyphDone InputComponent--input'])[1]"));
		return element;
	}	
	
	public static WebElement Status(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@id='FL__ctl3_9'])"));
		return element;
	}	
	
	public static WebElement Clength(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='forMeasurement TableCell--input TableCell--input-value form-control'])"));
		return element;
	}	
	
	public static Select metric1(WebDriver driver) {
		
		Select select = new Select(driver.findElement(By.xpath("(//*[@class='forMeasurement TableCell--input TableCell--input-select form-control ml-1'])[1]")));
		return select;
	}	
	
	public static WebElement Cwidthth(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='measurement TableCell--measurement-value-input form-control'])"));
		return element;
	}		
	
	public static Select metric2(WebDriver driver) {
		
		Select select = new Select(driver.findElement(By.xpath("(//*[@class='forMeasurement TableCell--input TableCell--input-select form-control ml-1'])[2]")));
		return select;
	}	
	public static WebElement Ccolor(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])"));
		return element;
	}	
	
	public static WebElement Brand1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[2]"));
		return element;
	}	
	
	public static WebElement model1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[3]"));
		return element;
	}	
	
	public static WebElement modelYear1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[4]"));
		return element;
	}	
	
	public static WebElement Trim1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[5]"));
		return element;
	}	
	
	public static WebElement Color1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[6]"));
		return element;
	}	
	
	public static WebElement License1(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[7]"));
		return element;
	}	
	
public static WebElement Brand2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[8]"));
		return element;
	}	
	
	public static WebElement model2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[9]"));
		return element;
	}	
	
	public static WebElement modelYear2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[10]"));
		return element;
	}	
	
	public static WebElement Trim2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[11]"));
		return element;
	}	
	
	public static WebElement Color2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[12]"));
		return element;
	}	
	
	public static WebElement License2(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//input[@class='TableCell--input form-control'])[13]"));
		return element;
	}	
	
	public static WebElement submit(WebDriver driver) {
		
		element = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
		return element;
				
	}
	
}
