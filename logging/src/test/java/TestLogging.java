import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogging {
	
	static Logger log = LoggerFactory.getLogger(TestLogging.class);
	
	public static void main(String[] args) {
		log.info("This is info logging");
		log.warn("This is warning log");
		log.error("This is error log");
		log.debug("THis is debug log");
		log.trace("This is trace log");
	}

}
