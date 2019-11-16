package Overriding;

public class FirefoxDriver extends WebDriver  {
	
	
	public void click()
	{
		System.out.println("Performing click -- in Firefox");
	}
	
	
	public void sendKeys()
	{
		System.out.println("Performing typing --in Firefox");
	}
	
	public void gettitle()
	{
		System.out.println("getting title --in Firefox");
	}


}
