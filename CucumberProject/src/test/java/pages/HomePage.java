package pages;
import demo.Cucumber.*;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
public class HomePage {
	LoginStepDefSerenity la =new LoginStepDefSerenity();
	@Step
	public void openapplication()
	{
		Serenity.takeScreenshot();
		la.user_launch_demo_webshop_applicationS();
		
	}
	@Step
	public void entercreds()
	{
		Serenity.takeScreenshot();
		la.user_enters_username_and_passwordS();
		
	}
	@Step
	public void clickLogin()
	{
		Serenity.takeScreenshot();
		la.user_clicks_on_login_buttonS();
		
	}
	@Step
	public void displayfirstpage()
	{
		Serenity.takeScreenshot();
		la.home_page_is_displayedS();
		
	}
	@Step
	public void close()
	{
		la.close_the_browserS();
		
	}
}
