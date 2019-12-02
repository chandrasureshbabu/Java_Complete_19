package Log4j;

import org.apache.logging.log4j.*;

public class Log4Jdemo1 {
	
	private static Logger log= LogManager.getLogger(Log4Jdemo1.class.getName());

	public static void main(String[] args) {
		
		log.debug("this is debug");
		
		if(5>4)
		{
			log.info("this is info");
			log.warn("this is warning");
			log.error("this is error");
			log.fatal("this fatal");
		}
		
		
		
		
		

	}

}
