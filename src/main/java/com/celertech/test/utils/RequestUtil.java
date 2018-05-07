package com.celertech.test.utils;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by johnn on 07/05/2018.
 */
public class RequestUtil {

    public static String printAllParameter(Map<String, String[]> parameterMap){

        StringBuffer sb = new StringBuffer();

        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            sb.append(Arrays.toString(entry.getValue()));
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    public static Long calculateTheChecksumValueForTheServletParameterMap(Map<String, String[]> parameterMap) {

        Long a = 0L;
        Long b = 0L;
        Long c = 0L;

        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            a++;
            b += a + entry.getValue().length + 5371;
            c += a + b++;
        }

        return c;

    }
}
