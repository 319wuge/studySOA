package com.wuge.study.utils;

import org.apache.log4j.Logger;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by whz on 2015/6/2.
 */
public class IpUtils {
    private static Logger logger = Logger.getLogger(IpUtils.class);
    private static String hostName;

    static {
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch(UnknownHostException e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static String getHostName() {
        return hostName;
    }
}
