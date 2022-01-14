// Below locators are commented because of their new location in POM file.
  package demo.Cucumber; 
   
  import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.chrome.ChromeDriver;
  import POM.LoginPOM;
  import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When;
  
  public class LoginStepDef 
  { 
  WebDriver driver;
  private LoginPOM obj;
  @Given("User Launch DemoWebshop application") 
  public void user_launch_demo_webshop_application() 
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
  
  @When("User enters username and password") 
  public void user_enters_username_and_password() 
  {
  //driver.findElement(By.id("Email")).sendKeys("hkc@d.com");
  //driver.findElement(By.id("Password")).sendKeys("test123"); 
	obj.Login("hkc@d.com", "test123");  
  }
  
  @When("User clicks on Login button") 
  public void user_clicks_on_login_button() 
  {
  //driver.findElement(By.xpath("//input[@value='Log in']")).click(); 
	obj.InLog();  
  }
  
  @Then("Home Page is displayed") 
  public void home_page_is_displayed() 
  {
  System.out.println("Home page is displayed"); 
  }
  
  @Then("Close the browser") 
  public void close_the_browser() 
  {
	  driver.close();
  }
  
	
  @When("User enters Invalid username and password") 
  public void user_enters_invalid_username_and_password() 
  {
	  //driver.findElement(By.id("Email")).sendKeys("hkcsdfg@d.com");
	  //driver.findElement(By.id("Password")).sendKeys("tessfdgt123"); 
	  obj.Login("hkcsdfg@d.com", "tessfdgt123");    
  }
	  
  @When("User enters Valid {string} and {string}")
  public void user_enters_valid_and(String email, String pass) 
  {
	  //driver.findElement(By.id("Email")).sendKeys(email);
	  //driver.findElement(By.id("Password")).sendKeys(pass);
	  obj.Login("email", "pass");
  } 
  
  }
 