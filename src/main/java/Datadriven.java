import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("C:\\Users\\johnj\\Downloads\\test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
		}
		workbook.close();
		driver.quit();

	}

}
