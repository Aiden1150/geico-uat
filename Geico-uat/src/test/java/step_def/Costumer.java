package step_def;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.costumerPage;
import utilities.Config;
import utilities.Driver;

public class Costumer {
	
	WebDriver driver= Driver.getInstance();
	costumerPage HomePage= new costumerPage();
	JavascriptExecutor jse;
			
	@Given("^The user on the main page$")
	public void the_user_on_the_main_page() throws Throwable {
	  driver.get(Config.getProperty("url"));
	    
	}

	@When("^The user verifies the title and the url$")
	public void the_user_verifies_the_title_and_the_url() throws Throwable {
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl=Config.getProperty("url");
	
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Url matches");
		}
		else {
			System.out.println("No matches");
		}
	    String actualTitle=HomePage.title.getText(); // costumer page ten title i cagirdik
	    String expectedTitle=Config.getProperty("title"); // config.properties ten cagirdik
	    
	    Assert.assertEquals(expectedTitle, actualTitle);
	    
	}

	
	@When("^The user enters zip code$")
	public void the_user_enters_zip_code() throws Throwable {
		HomePage.zipcode.sendKeys(Config.getProperty("zipcode"));
	    
	    
	}

	@When("^The user clicks on the start quote button$")
	public void the_user_clicks_on_the_start_quote_button() throws Throwable {
	    HomePage.Start.click();
	    
	}

	@When("^The user enters first name$")
	public void the_user_enters_first_name() throws Throwable {
		Thread.sleep(3000);
	   HomePage.firstName.sendKeys(Config.getProperty("firstName")); 
	    
	}

	@When("^The user enters last name$")
	public void the_user_enters_last_name() throws Throwable {
		HomePage.lastName.sendKeys(Config.getProperty("lastName")); 
	    
	}

	@When("^The user enters street adress$")
	public void the_user_enters_street_adress() throws Throwable {
		HomePage.StreetAddress.sendKeys(Config.getProperty("StreetAddress")); 
	    
	}

	@When("^The user enters  apt number$")
	public void the_user_enters_apt_number() throws Throwable {
		Thread.sleep(3000);
		HomePage.AptN.sendKeys(Config.getProperty("Apt"));   
	    
	}

	@When("^The user fills date of birth boxes$")
	public void the_user_fills_date_of_birth_boxes() throws Throwable {
//		HomePage.DateBirth.sendKeys(Config.getProperty("DateBirth"));   
		jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,300)");
	    HomePage.month.sendKeys(Config.getProperty("Month"));
	    HomePage.day.sendKeys(Config.getProperty("Day"));
	    HomePage.year.sendKeys(Config.getProperty("Year"));
	}

	@When("^The user clicks next$")
	public void the_user_clicks_next() throws Throwable {
		HomePage.next.click();
	  
	}


}
