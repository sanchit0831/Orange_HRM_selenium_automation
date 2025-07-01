package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePIMUserSteps {
	
	WebDriver driver = Hooks.driver;

	@Given("user clicks on PIM option")
	public void user_clicks_on_pim_option() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"));
		e1.click();
		Thread.sleep(2000);
	}

	@And("user clicks +Add button")
	public void user_clicks_add_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		e1.click();
		Thread.sleep(2000);
	}

	@When("^user enters (.*), (.*) , (.*)$")
	public void user_enters_first_name_middle_name_lastname(String firstname, 
			String middlename, String lastname) throws InterruptedException {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		e1.sendKeys(firstname);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
		e2.sendKeys(middlename);
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		e3.sendKeys(lastname);
		Thread.sleep(2000);
	}

	@Then("user enters save button")
	public void user_enters_save_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		e1.click();
		Thread.sleep(2000);
	}

}
