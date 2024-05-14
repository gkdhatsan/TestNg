package aravind.project;

import org.apache.log4j.Logger;

public class CommonLog {

	static Logger log = Logger.getLogger("com.src.output");
	static Logger errorLog = Logger.getLogger("com.src.output");

	public static void log(String message) {

		log.info(message);
	}

	public static void errorLog(Exception ex) {

		for (int i = 0; i < ex.getStackTrace().length; i++) {
			errorLog.error(ex.getStackTrace()[i]);
		}
	}
}
