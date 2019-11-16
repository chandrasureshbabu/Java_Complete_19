package Overriding;

public class TestCase1 extends Base {
	
	String Browsername="Chrome";

	public static void main(String[] args) {
		TestCase1 obj= new TestCase1();
		obj.initBrowser();

	}
	
	public void initBrowser()
	{
		WebDriver driver=getBrowserInstance(Browsername);
		driver.click();
		driver.sendKeys();
		driver.gettitle();
	}

}
