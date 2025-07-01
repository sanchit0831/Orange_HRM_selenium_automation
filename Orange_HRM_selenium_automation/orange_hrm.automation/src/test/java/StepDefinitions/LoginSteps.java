package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver d1 = Hooks.driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		if(d1.getCurrentUrl().contains("login")) {
			System.out.println("User is on login page");
		}
		else {
			System.out.println("User is not on login page");
		}
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		
		WebElement e1 = d1.findElement(By.xpath("//input[@placeholder='Username']"));
		e1.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement e2 = d1.findElement(By.xpath("//input[@placeholder='Password']"));
		e2.sendKeys("admin123");
		Thread.sleep(2000);
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		WebElement e1 = d1.findElement(By.xpath("//button[normalize-space()='Login']"));
		e1.click();
		Thread.sleep(2000);
	}

	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() {
		if(d1.getCurrentUrl().contains("index")) {
			System.out.println("User logged in successfully");
		}
		else {
			System.out.println("Login failed");
		}
	}	
}
