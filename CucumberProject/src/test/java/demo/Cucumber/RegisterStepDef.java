package demo.Cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

public class RegisterStepDef {
	WebDriver driver;
	@Given("User has launched application")
	public void user_has_launched_application() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe"); 
		driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	   
				  }

	@When("User clicks on Register button on first page")
	public void user_clicks_on_register_button_on_first_page() {
		 driver.findElement(By.linkText("Register")).click();
	}

	@Then("User enters his details")
	public void user_enters_his_details(io.cucumber.datatable.DataTable dataTable) {
	       List<List<String>> rows = dataTable.asLists();
	       //String Gender = rows.get(1).get(1);
	       String Firstname = rows.get(2).get(1);
	       String Lastname = rows.get(3).get(1);
	       String Email = rows.get(4).get(1);
	       String Password = rows.get(5).get(1);
	       String Confirmpassword = rows.get(6).get(1);
	       
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
	}

	@Then("User clicks on Register button")
	public void user_clicks_on_register_button() {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
	   driver.close();
	}

}
