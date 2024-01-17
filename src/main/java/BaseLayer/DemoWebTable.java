package BaseLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebTable {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> wb = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/td"));

		List<WebElement> rowweb = driver.findElements(By.xpath("// *[@id=\"customers\"]/tbody/tr"));
		int toatlRow = rowweb.size();
		System.out.println("toatlRow: " + toatlRow);

		List<WebElement> celWb = driver.findElements(By.xpath("// *[@id=\"customers\"]/tbody/tr[2]/td"));
		int toatlcell = celWb.size();
		System.out.println("toatlcell: " + toatlcell);

		WebElement wb1 = driver.findElement(By.xpath("// *[@id='customers']/tbody/tr[1]/td[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wb2 = wait.until(ExpectedConditions.visibilityOf(wb1));

		for (int i = 0; i < toatlRow; i++) {
			for (int j = 1; j < toatlcell; j++) {
				String cellValue = wb2.getText();
				System.out.print(cellValue + "  ");
			}
			System.out.println();
		}

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr/td

	}

}
