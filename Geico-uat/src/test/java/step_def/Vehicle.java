package step_def;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.VehiclePage;
import utilities.Config;
import utilities.Driver;

public class Vehicle {
	WebDriver driver= Driver.getInstance();
	VehiclePage HomePage= new VehiclePage();
	JavascriptExecutor jse;
	
	
	@Given("^The user is on the Add vehicle page$")
	public void the_user_is_on_the_Add_vehicle_page() throws Throwable {
		
		Thread.sleep(1000);
		String actualTitle=HomePage.Title.getText(); // costumer page ten title i cagirdik
	    String expectedTitle=Config.getProperty("Title"); 
	   Assert.assertEquals(expectedTitle, actualTitle);
		
	    
	}

	@When("^the user selects a year$")
	public void the_user_selects_a_year() throws Throwable {
	Thread.sleep(2000);
	Select sel = new Select(HomePage.YearList);
	for(int i=2; i<41; i++) {
	sel.selectByIndex(i);
	}
	sel.selectByIndex(2);
	}

	@When("^the user selects a make$")
	public void the_user_selects_a_make() throws Throwable {
		Thread.sleep(2000);
//	   Select ay=new Select(HomePage.MakeList);
//	   for(int i=1; i<44; i++) {
//		   ay.selectByIndex(i);
//	   }
//	   
//	   
//	   ay.selectByIndex(4);
		
		for(int i=1; i <45; i++) {
		driver.findElement(By.xpath("//*[@id=\"vehicleMake\"]/option["+i+"]")).click();
		Thread.sleep(100);
		}
		driver.findElement(By.xpath("//*[@id=\"vehicleMake\"]/option[5]")).click();
//		 ay.selectByIndex(4);
	}

	@When("^the user selects a model$")
	public void the_user_selects_a_model() throws Throwable {
		Thread.sleep(2000);
	    Select ab= new Select(HomePage.ModelList);
	    ab.selectByValue("A3 1.8T Premium");
	   
	    
	}
	@When("^the user selects a body style$")
	public void the_user_selects_a_body_style() throws Throwable {
		Thread.sleep(2000);
		Select at= new Select(HomePage.BodyList);
		at.selectByValue("CONV  2D");
	}
	@When("^the user selects a ofl$")
	public void the_user_selects_a_ofl() throws Throwable {
	    for(int i=1; i<4;i++) {
	    	driver.findElement(By.xpath("//*[@id=\"vehicleForm\"]/div[1]/div[1]/div[16]/div/div[2]/div/div[1]/div["+i+"]/label")).click();
	    	Thread.sleep(300);
	    }
	    
	}

	@When("^the user selects primary use$")
	public void the_user_selects_primary_use() throws Throwable {
		Thread.sleep(2000);
		jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,300)");
	    
	    for(int i=1; i<4; i++) {
	    	driver.findElement(By.xpath("//*[@id=\"vehicleForm\"]/div[1]/div[1]/div[17]/div[3]/div/div[2]/div/div[1]/div["+i+"]/label")).click();
	    	Thread.sleep(300);
	    	
	    }
	    
	}

	@When("^the user selects how$")
	public void the_user_selects_how() throws Throwable {
		Thread.sleep(2000);
		Select ar= new Select(HomePage.How);
	    ar.selectByValue("001");
	    
	}

	@When("^the user selects milage$")
	public void the_user_selects_milage() throws Throwable {
	    
	    
	}

	@When("^the user clicks no$")
	public void the_user_clicks_no() throws Throwable {
	    
	    
	}



}
