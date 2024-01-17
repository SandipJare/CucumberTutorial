package stepsDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FacebookPageResgister extends BaseClass {

	@Given("user is on register page")
	public void user_is_on_register_page() {
		BaseClass.initilization();

	}

	@When("user entered {string} ,{string},{string},{string},{string},{string},{string}, {string} and {string}")
	public void user_entered_and(String firstname, String lastname, String username, String password, String reEmail,
			String birthDay, String birthMonth, String birthYear, String gender) throws InterruptedException {

		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("reg_email__")).sendKeys(username);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reEmail);

		WebElement dayWb = driver.findElement(By.name("birthday_day"));
		Select sel1 = new Select(dayWb);
		sel1.selectByVisibleText(birthDay);

		WebElement monthWb = driver.findElement(By.name("birthday_month"));
		Select sel2 = new Select(monthWb);
		sel2.selectByVisibleText(birthMonth);

		WebElement yearWb = driver.findElement(By.name("birthday_year"));
		Select sel3 = new Select(yearWb);
		sel3.selectByVisibleText(birthYear);

		List<WebElement> ls = driver.findElements(By.xpath("//label[@class='_58mt']"));

		for (WebElement w : ls) {
			String genderLable = w.getText();
			if (genderLable.equalsIgnoreCase(gender)) {
				w.click();
			}
		}

		Thread.sleep(7000);

		driver.quit();
	}

}
