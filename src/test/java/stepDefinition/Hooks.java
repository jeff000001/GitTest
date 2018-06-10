package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Moble before hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation()
	{
		System.out.println("Moble after hook");
	}
	
}
