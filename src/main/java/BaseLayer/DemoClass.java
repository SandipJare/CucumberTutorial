package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		WebElement wb = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		
		//File f=new File("C:\\Users\\SANDIP\\Desktop\\englisgplan.pdf");
	//	FileInputStream fis=new FileInputStream(f);
		Actions act = new Actions(driver);
		act.click(wb).sendKeys().build().perform();
		
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr/td

	}

}
