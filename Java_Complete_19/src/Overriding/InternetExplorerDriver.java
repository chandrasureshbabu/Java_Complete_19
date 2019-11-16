package Overriding;

public class InternetExplorerDriver  extends WebDriver {
	
	
	public void click()
	{
		System.out.println("Performing click -- in IE");
	}
	
	
	public void sendKeys()
	{
		System.out.println("Performing typing --in IE");
	}
	
	public void gettitle()
	{
		System.out.println("getting title --in IE");
	}

}
