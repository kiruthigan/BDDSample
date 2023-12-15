package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebElement srcBox = driver.findElement(By.className("gLFyf"));
		WebElement srcBox = driver.findElement(By.cssSelector(".gLFyf"));
		//WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.submit();
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");	
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement srcBox = driver.findElement(By.cssSelector(".gLFyf"));
		//WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Selenium Tutorial");
		srcBox.submit();
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}

}
