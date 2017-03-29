import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Main {
	
	static
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	}
	
	static WebDriver driver = new FirefoxDriver();
	private Actions actions = new Actions(driver);
	
	public static void login()
	{
		  
		  driver.get("http://css.blackboard.com");
		  WebElement username = driver.findElement(By.id("user_id"));
		  username.sendKeys("joel.franklin");
		  //username.sendKeys(Keys.TAB);
		  WebElement pass = driver.findElement(By.id("password"));
		  pass.sendKeys("password");
		  driver.findElement(By.id("entry-login")).click();
	}
@Test
  public void start() throws Exception {
	  
	  login();	  
	  CourseImport course_import = new CourseImport();
	  course_import.courseImport(driver, actions);
	  //CreateCourse create_course=  new CreateCourse();
	 // create_course.createCourse(driver, actions);
	  
  }


	/*public void readExcel() throws  IOException {
	String FilePath = "D:\\CourseData.xls";
	FileInputStream fs = new FileInputStream(FilePath);
	Workbook wb = Workbook.getWorkbook(fs);

	// TO get the access to the sheet
	Sheet sh = wb.getSheet("Sheet1");

	// To get the number of rows present in sheet
	int totalNoOfRows = sh.getRows();

	// To get the number of columns present in sheet
	int totalNoOfCols = sh.getColumns();

	for (int row = 0; row < totalNoOfRows; row++) {

		for (int col = 0; col < totalNoOfCols; col++) {
			System.out.print(sh.getCell(col, row).getContents() + "\t");
		}
		System.out.println();
	}
}*/

}


