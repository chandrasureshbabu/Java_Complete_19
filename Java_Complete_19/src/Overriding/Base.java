package Overriding;

public class Base {
	
	
	public WebDriver getBrowserInstance(String browserName)
	{
		if (browserName.equals("FireFox"))
		{
			return new FirefoxDriver();
		}else if(browserName.equals("Chrome"))
		{
			return new ChromeDriver();
		}else if(browserName.equals("InternetExplorer"))
		{
			return new InternetExplorerDriver();
		}else
			return new FirefoxDriver();
	}

}
