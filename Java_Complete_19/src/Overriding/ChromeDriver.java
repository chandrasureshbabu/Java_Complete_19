package Overriding;

public class ChromeDriver extends WebDriver {
	
	public void click()
	{
		System.out.println("Performing click -- in chrome");
	}
	
	
	public void sendKeys()
	{
		System.out.println("Performing typing --in chrome");
	}
	
	public void gettitle()
	{
		System.out.println("getting title --in chrome");
	}

}
