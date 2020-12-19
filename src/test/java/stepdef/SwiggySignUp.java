package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;




	public class SwiggySignUp {
		
		WebDriver driver = SetUP.driver;
		
		ExtentReports extent;
		ExtentTest logger;
		
		@Given("^The user is on the Swiggy Home Page$")
	    public void the_user_is_already_on_the_swiggy_home_page() throws Throwable {
			driver.get("https://www.swiggy.com/");
	    }

	    @When("^User click on SignUp$")
	    public void user_click_on_signup() throws Throwable {
	    	WebElement SingUp = driver.findElement(By.linkText("Sign up"));
	    	SingUp.click();
	    	
	    	
	    	Thread.sleep(5000);
	    	
	    	extent = new ExtentReports (System.getProperty("user.dir") +"/SwiggyTestReport.html", false);
			
	 		logger = extent.startTest("Test01");
	 		
	 		logger.log(LogStatus.PASS, "Click on the Signup button");
	    }

	    @Then("User should be go to SignUp Page")
	    public void user_should_be_redirected_to_signup_page() throws Throwable {
	    	System.out.println("Then");
	    	
	    	WebElement Logo = driver.findElement(By.xpath("//*[@class='_1Tg1D']"));
	    
	    	Assert.assertTrue(Logo.isDisplayed());
	    	
	    	logger.log(LogStatus.PASS, "Validate the signup is appearing");
	    	
	    	extent.endTest(logger);
	    	extent.flush();
	    	extent.close();
	    	
	    }
	    
	    @Given("^The user is already on the Signup page$")
	    public void the_user_is_already_on_the_signup_page() throws Throwable {
	    	
	    	driver.get("https://www.swiggy.com/");
	    	 PomSwiggy DrivePom = PageFactory.initElements(driver, PomSwiggy.class);
	    	/*WebElement SingUp = driver.findElement(By.linkText("Sign up"));
	    	SingUp.click();*/
	    	 
	    	 DrivePom.clicklink();
	    	
	    	extent = new ExtentReports (System.getProperty("user.dir") +"/SwiggyTestReport.html", false);
	    	
	    	logger = extent.startTest("Test02");
	    	logger.log(LogStatus.PASS, "Click on the Signup button");
	    	
	      
	    }

	    @When("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_enters_something_something_something_and_something(String phone, String name, String email, String password) throws Throwable {
	        PomSwiggy DrivePom = PageFactory.initElements(driver, PomSwiggy.class);
	        
	    
	        DrivePom.enterphone(phone);
	        DrivePom.entername(name);
	      
	        DrivePom.enteremail(email);
	        DrivePom.sendpassword(password);
	        
	        
	    	Thread.sleep(5000);
	    	logger.log(LogStatus.PASS, "Enter the user details");
	    	
	    }
	    
	    @And("^User Click Continue button$")
	    public void user_click_continue_button() throws Throwable {
	    	 PomSwiggy DrivePom = PageFactory.initElements(driver, PomSwiggy.class);
	    	 DrivePom.clickcontinue();
	    	 Thread.sleep(3000);
	    	 
	    	 logger.log(LogStatus.PASS, "Continue is clicked");
	       
	    }

	  
	    
	    @Then("^User should be able to SignUp$")
	    public void user_should_be_able_to_signup() throws Throwable {
	    	
	    	extent.endTest(logger);
	    	extent.flush();
	    	extent.close();
	        
	    }

	    @Given ("^user is already on the Signup Page$")
	    public void user_is_already_on_the_Signup_page() throws Throwable{
	    	driver.get("https://www.swiggy.com/");
	    	
	    	extent = new ExtentReports (System.getProperty("user.dir") +"/SwiggyTestReport.html", false);
	    	logger = extent.startTest("test03");
	    	logger.log(LogStatus.PASS, "Swiggy website should appears.");
	    	
	    }
	    
	    @When("^user click on Kolkatta$")
	    public void user_click_on_Kolkatta() throws Throwable{
	    	
	    	PomSwiggy DrivePom = PageFactory.initElements(driver, PomSwiggy.class);
	    	 DrivePom.ClickKolkatta();
	    	 Thread.sleep(3000);
	    	 //logger.log(LogStatus.PASS, "clicked in Kolkatta");
	    	 
	    	 //river.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		    	//PomSwiggy DrivePom = PageFactory.initElements(driver, PomSwiggy.class);
		    	DrivePom.Clickfindfood();
		    	 Thread.sleep(3000);
		    	 
		    	 logger.log(LogStatus.PASS, "Kolkatta site appears");
		    	// logger.log(LogStatus.PASS, "clicked in Find Food");
		    	
	    	
	    }
	   	    
	    @Then("^user end testing$")
	    public void user_end_testing() throws Throwable {
	    	
	    	
	    	extent.endTest(logger);
	    	extent.flush();
	    	extent.close();
	    }

	    
	    
	    
	}