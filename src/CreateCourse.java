import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateCourse {
  @Test
  public void createCourse(WebDriver driver , Actions actions) throws Exception {
	  
	  Thread.sleep(9000);
	  driver.findElement(By.xpath(".//*[@id='SystemAdmin.label']/a/span[1]")).click();
	  Thread.sleep(9000);
	  driver.findElement(By.xpath(".//*[@id='nav_list_courses']")).click();
	  Thread.sleep(9000);
	  	  
	  //driver.findElement(By.id("courseInfoSearchText")).sendKeys("joel");
	  //driver.findElement(By.xpath(".//*[@id='panelbutton1']/form/fieldset/div[2]/input[5]")).click();
      //Thread.sleep(5000);
	  // driver.findElement(By.xpath(".//*[@id='listContainer_row:0']/td[2]/a")).click();
	    
	
		WebElement element = driver.findElement(By.linkText("Create Course"));
		actions .moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement newel = driver.findElement(By.linkText("New"));
		actions.moveToElement(newel).click().build().perform();
		
		Thread.sleep(9000);
		WebElement coursename = driver.findElement(By.id("courseName"));
		coursename.sendKeys("coursename_17032017");
		
		
		WebElement courseid = driver.findElement(By.id("courseId"));
		courseid.sendKeys("courseid_17032017");
		
		Thread.sleep(15000);
		driver.findElement(By.id("bottom_submitButtonRow")).click();
		driver.findElement(By.xpath(".//*[@id='bottom_submitButtonRow']/input[2]")).click();
  }
}
