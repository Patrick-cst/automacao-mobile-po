package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReportUtil {
    private static final Logger logger = LogManager.getLogger(ReportUtil.class);

    public static void log(String message) {
        logger.info(message);
    }
}
