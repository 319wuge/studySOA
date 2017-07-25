package com.wuge.study.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ResourceBundle;

/**
 * 配置资源
 * <p/>
 * Created by whz on 2014/10/17.
 */
public class ConfigResource {
    private static Logger logger = Logger.getLogger(ConfigResource.class);
    /**
     * 配置文件
     */
    public final static ResourceBundle config = ResourceBundle.getBundle("config");

    /**
     * 获取系统属性
     *
     * @param key 键值
     * @return
     */
    public static String getSystemProperty(String key) {
        try {
            return config.getString(key);
        } catch(Exception e) {
        }
        return null;
    }
    public static int getMachineId() {
        BufferedReader reader = null;
        try {
            File file = new File("/etc/vpsid");
            if (!file.exists())
                return 1;
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            if ((tempString = reader.readLine()) != null) {
                // 显示行号
                logger.info("line vpsid: " + tempString);
                return Integer.valueOf(tempString);
            }
        } catch (Exception ex) {
            logger.error("exception", ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception ex) {
                    logger.error("exception", ex);
                }
            }
        }
        return 1;
    }

//    public static String createRandomNum() {
//        SimpleSequenceGenerator ssg = new SimpleSequenceGenerator(ConfigResource.getMachineId());
//        String randomNum = ssg.nextSequenceId() + "";
//        return randomNum;
//    }
//
//    public static void main(String[] args) {
//        String code = createRandomNum();
//        System.out.println(code);
//    }
}
