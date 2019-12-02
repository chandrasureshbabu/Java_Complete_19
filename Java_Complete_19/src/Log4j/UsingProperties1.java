package Log4j;

import org.apache.logging.log4j.*;

public class UsingProperties1 {
	
	private static Logger log =LogManager.getLogger(UsingProperties1.class.getName());

	public static void main(String[] args) {
		
		log.debug("this is debug");
		log.warn("this is warning");
		log.info("this is info");
		log.error("this is eror");
		log.fatal("this is fatal");
		
		
		

	}

}
