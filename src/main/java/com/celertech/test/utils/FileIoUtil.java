package com.celertech.test.utils;

import com.celertech.test.config.Config;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by johnn on 07/05/2018.
 */
public class FileIoUtil {

    private static Logger logger = Logger.getRootLogger();

    public static void writeToOutputFile(String message) throws IOException {

        try {
            File file = new File(Config.OUTPUTPATH);
            FileUtils.writeStringToFile(file, message, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            logger.error(Config.ERROR_MESSAGE);
            logger.error(ex);
            throw ex;
        }
    }

}
