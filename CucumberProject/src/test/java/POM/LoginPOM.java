package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
@FindBy(how=How.ID,using="Email")
private WebElement Email;
@FindBy(how=How.ID,using="Password")
private WebElement Pwd;
@FindBy(how=How.XPATH,using="//input[@value='Log in']")
private WebElement InLogIn;
@FindBy(how=How.LINK_TEXT,using="Log in")
private WebElement OutLogIn;

public WebDriver driver;
public LoginPOM(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void Login(String username,String password)
{
	Email.sendKeys(username);
	Pwd.sendKeys(password);		
}
public void OutLog()
{
	OutLogIn.click();
}

public void InLog()
{
	InLogIn.click();
}

}
