package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.Driver;

public class VehiclePage {
	public VehiclePage() {
		PageFactory.initElements(Driver.getInstance(), this);
		
		
			
	}

	@FindBy(xpath="//*[@id=\"wrapper\"]/div[2]/div/section/div/div/div[1]/div/div[1]/h2")
	public WebElement Title;
	
	@FindBy(xpath="//*[@id=\"vehicleYear\"]")
	public WebElement YearList;
	
	@FindBy(xpath="//*[@id=\"vehicleMake\"]")
	public WebElement MakeList;
	
	@FindBy(xpath= "//*[@id=\"vehicleModel\"]")
	public WebElement ModelList;
	
	@FindBy(name="bodyStyles")
	public WebElement BodyList;
	
	
	
	
	

	@FindBy(xpath="//*[@id=\"typeOfBusinessUse\"]")
	public WebElement How;
}
