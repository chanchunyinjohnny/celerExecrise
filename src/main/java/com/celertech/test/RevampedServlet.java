package com.celertech.test;

import com.celertech.test.utils.FileIoUtil;
import com.celertech.test.utils.RequestUtil;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RevampedServlet extends javax.servlet.http.HttpServlet {

    private Logger logger = Logger.getRootLogger();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {

            Long c = RequestUtil.calculateTheChecksumValueForTheServletParameterMap(request.getParameterMap());

            logger.info("Checksum of this message:" + c);

            String outputMe = RequestUtil.printAllParameter(request.getParameterMap());

            FileIoUtil.writeToOutputFile(outputMe);
        } catch (IOException e) {
            logger.error(e);
            throw e;
        }
    }

}
