package demo.Cucumber; 
	   
	  import org.openqa.selenium.WebDriver; 
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import POM.LoginPOM;
	  import io.cucumber.java.en.Given; 
	  import io.cucumber.java.en.Then; 
	  import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

  
	  public class LoginStepDefSerenity 
	  { 
		  @Steps
		  HomePage home;
		  
	  WebDriver driver;
	  private LoginPOM obj;
	  @Given("User Launch DemoWebshop applicationS") 
	  public void user_launch_demo_webshop_applicationS() 
	  {
	  System.setProperty("webdriver.chrome.driver",
	  "src/test/resources/Driver/chromedriver.exe"); 
	  driver= new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  obj=new LoginPOM(driver);
	  //driver.findElement(By.linkText("Log in")).click(); 
	  obj.OutLog();
	  }
	  
	  @When("User enters username and passwordS") 
	  public void user_enters_username_and_passwordS() 
	  {
	  //driver.findElement(By.id("Email")).sendKeys("hkc@d.com");
	  //driver.findElement(By.id("Password")).sendKeys("test123"); 
		obj.Login("hkc@d.com", "test123");  
	  }
	  
	  @When("User clicks on Login buttonS") 
	  public void user_clicks_on_login_buttonS() 
	  {
	  //driver.findElement(By.xpath("//input[@value='Log in']")).click(); 
		obj.InLog();  
	  }
	  
	  @Then("Home Page is displayedS") 
	  public void home_page_is_displayedS() 
	  {
	  System.out.println("Home page is displayed"); 
	  }
	  
	  @Then("Close the browserS") 
	  public void close_the_browserS() 
	  {
		  driver.close();
	  }
	  			 
	  
	  }
	 

