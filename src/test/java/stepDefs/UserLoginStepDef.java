package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	/*@Given("User is on valid login")
	public void user_is_on_valid_login() {
		 driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			
	}
	@When("User enters credentials")
	public void user_enters_credentials() {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("o.fa.fa-2x.fa-sign-in")).click();
		
	}
	@Then("should display success msg")
	public void should_display_success_msg() {
		boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	}*/
	

@Given("User is on Login Page")
public void user_is_on_login_page() {
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
}
/*@When("User enters {string} and {string}")
public void user_enters_and(String strUsr, String strPwd) {
	driver.get("https://the-internet.herokuapp.com/login");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsr);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(strPwd);
	driver.findElement(By.cssSelector("o.fa.fa-2x.fa-sign-in")).click();
}*/

/*@When("User enters {string} and {string}")
public void user_enters_and(String strUsr, String strPwd) {
	driver.get("https://the-internet.herokuapp.com/login");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(strUsr);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(strPwd);
	driver.findElement(By.cssSelector("o.fa.fa-2x.fa-sign-in")).click();
}*/

@Then("should display success Msg")
public void should_display_success_msg() {
	boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	Assert.assertTrue(isDisp);
}

}
