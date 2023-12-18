package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	 System.out.println("User is logged in");
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	  System.out.println("User create a new contact");
	  
	}
	
	
	@When("User View contact details")
	public void user_view_contact_details() {
System.out.println("User View contact details");
	}
	
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	}
	
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
	    System.out.println("User create a new Deals");
	}
	
	
	@When("User View Deals details")
	public void user_view_deals_details() {
	System.out.println("User View Deals details");
	}
	
	
	@When("User delete a Deals")
	public void user_delete_a_deals() {
System.out.println("User delete a Deals");
	}
	

	
	@When("User create a new Tasks")
	public void user_create_a_new_tasks() {
	System.out.println("User create a new Tasks");
	}
	
	
	@When("User View Tasks Tasks")
	public void user_view_tasks_tasks() {
	   System.out.println("User View Tasks Tasks");
	}
	
	
	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
	  System.out.println("User delete a Tasks");	
	}
}
