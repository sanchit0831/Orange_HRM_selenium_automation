package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDeleteUserSteps {
	
	WebDriver driver = Hooks.driver;
	
	@Given("user clicks on PIM homepage button")
	public void user_clicks_on_pim_homepage_button() throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"));
		e1.click();
		Thread.sleep(2000);
	}

	@When("^user enters (.*) in Employee Name textbox$")
	public void user_enters_rupa_raman_verma_in_employee_name_textbox(String username) throws InterruptedException {
		WebElement e1 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		e1.sendKeys(username);
		Thread.sleep(2000);
	}

	@And("user clicks on Search button")
	public void user_clicks_on_search_button() {
		WebElement e1 = driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		e1.click();
	}
	
//	@Then("user record is displayed")
//	public void user_record_is_displayed() {
//		// (//i[@class='oxd-icon bi-trash'])[1]
//		
//	}

	@Then("user deletes the record by selecting delete button")
	public void user_deletes_the_record_by_selecting_delete_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
		WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")));
		deleteButton.click();
		Thread.sleep(2000);
	
		//button[normalize-space()='Yes, Delete']
		WebElement e2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Yes, Delete']")));
		e2.click();
		Thread.sleep(2000);
	}

}
