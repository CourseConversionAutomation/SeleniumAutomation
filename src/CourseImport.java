import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CourseImport {
  @Test
  public void courseImport(WebDriver driver , Actions actions) throws Exception {
	  Thread.sleep(9000);
	  driver.findElement(By.xpath(".//*[@id='SystemAdmin.label']/a/span[1]")).click();
	  Thread.sleep(9000);
	  driver.findElement(By.xpath(".//*[@id='nav_list_courses']")).click();
	  Thread.sleep(9000);
	  
	//  WebElement element = driver.findElement(By.linkText("Import Package"));
	  WebElement element = driver.findElement(By.xpath(".//*[@id='navsecondary']/li[1]/a"));
	  element.click();
	  Thread.sleep(9000);
	  
	  WebElement courseid = driver.findElement(By.id("courseId"));
	  courseid.sendKeys("dest_course_240317a");
	  
	  
	  WebElement upload = driver.findElement(By.id("uploadedFile_chooseLocalFile"));
	  upload.sendKeys("D:\\Build\\Blackboard_Course_Conversion_Tool-4.0\\output\\bridge_11887218_ANT101_IMS_Package.zip");
	  Thread.sleep(9000);
	  
	  driver.findElement(By.xpath(".//*[@id='stepcontent3']/ol/li[2]/div/div/a[1]")).click();
	    
	  Thread.sleep(9000);
	  
	  driver.findElement(By.xpath(".//*[@id='bottom_submitButtonRow']/input[2]")).click();
	  
	  
	  
	  /*  driver.findElement(By.id("uploadedFile_chooseLocalFile")).click();
	  WebElement iframe = driver.findElement(By.cssSelector("[src*='recruit'"]));
	  driver.switchTo().frame(iframe);
	  driver.findElement(By.xpath(".//*[@id='uploadedFile_chooseLocalFile']")).click(); */
	  
	  
	  
	  
	  
	  
	  
  }
}
