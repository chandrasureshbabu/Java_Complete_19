package Log4p1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {
	
	final static Logger logger= LogManager.getLogger(Demo2.class.getName());

	public static void main(String[] args) {
		
			logger.debug("this is debug");
		
		if(5>4)
		{
			logger.info("this is info");
			logger.warn("this is warning");
			logger.error("this is error");
			logger.fatal("this fatal");
		}
		

	}

}
