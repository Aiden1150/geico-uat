package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class costumerPage {


		
		public costumerPage() {
			PageFactory.initElements(Driver.getInstance(),this);
		}
		@FindBy(xpath="//*[@id=\"section1heading\"]")
		public WebElement title;
		
		@FindBy (name="zip")
		public WebElement zipcode;
		
		@FindBy(id="submitButton")
		public WebElement Start;
		
		
				
				@FindBy(id="firstName")
		public WebElement firstName;
		
		
		@FindBy(id="lastName")
		public WebElement lastName;
		
		@FindBy(id="street")
		public WebElement StreetAddress;
		
		@FindBy(xpath="//*[@id=\"apt\"]")
		public WebElement AptN;
		
		@FindBy(id="submitButton")
		public WebElement dateBirth ;
		
		@FindBy(id="date-monthdob")
		public WebElement month ;
		
		@FindBy(id="date-daydob")
		public WebElement day ;
		
		@FindBy(id="date-yeardob")
		public WebElement year ;
		
		@FindBy(id="btnSubmit")
		public WebElement next;

	}


