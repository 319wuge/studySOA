package com.wuge.study.model;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sky91 on 2015-03-31.
 *
 * @author sky91 - feitiandaxia1991@163.com
 * @since 0.0.1
 */
public class OrderCode {
    private static final int NBITS = 19;//2^19=524288
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyMM");
    /**
     * 业务类型
     */
    private BusinessType businessType;
    /**
     * 单据类型
     */
    private ReceiptType receiptType;
    /**
     * 单据序列号
     */
    private String receiptSerialNumber;
    /**
     * 城市码
     */
    private String cityCode;
    /**
     * 日期
     */
    private Date date;
    /**
     * 序列号
     */
    private String last6Code;

    private OrderCode(BusinessType businessType, ReceiptType receiptType, String receiptSerialNumber, String cityCode, Date date, String last6Code) {
        this.businessType = businessType;
        this.receiptType = receiptType;
        this.receiptSerialNumber = receiptSerialNumber;
        this.cityCode = cityCode;
        this.date = date;
        this.last6Code = last6Code;
    }

    public static OrderCode parse(String orderCodeString) {
        try {
            BusinessType businessType = BusinessType.fromCode(orderCodeString.substring(0, 1));
            ReceiptType receiptType = ReceiptType.fromCode(orderCodeString.substring(1, 2));
            String receiptSerialNumber = String.valueOf(orderCodeString.charAt(2));
            String cityCode = orderCodeString.substring(3, 6);
            Date date = DATE_FORMAT.parse(orderCodeString.substring(6, 10));
            String last6Code = orderCodeString.substring(10, 16);
            return new OrderCode(businessType, receiptType, receiptSerialNumber, cityCode, date, last6Code);
        } catch(Exception e) {
            throw new RuntimeException("Format error.", e);
        }
    }

    public static OrderCode parseReceipt(String receiptRecordCodeString) {
        try {
            BusinessType businessType = BusinessType.fromCode(receiptRecordCodeString.substring(0, 1));
            ReceiptType receiptType = ReceiptType.fromCode(receiptRecordCodeString.substring(1, 2));
            String receiptSerialNumber = receiptRecordCodeString.substring(2, 4);
            String cityCode = receiptRecordCodeString.substring(4, 7);
            Date date = DATE_FORMAT.parse(receiptRecordCodeString.substring(7, 11));
            String last6Code = receiptRecordCodeString.substring(11, 17);
            return new OrderCode(businessType, receiptType, receiptSerialNumber, cityCode, date, last6Code);
        } catch(Exception e) {
            throw new RuntimeException("Format error.", e);
        }
    }

    public static OrderCode newOrderCode(BusinessType businessType, String cityCode, long orderId) {
        try {
            return new OrderCode(businessType, ReceiptType.order, "0", cityCode.substring(0, 3), new Date(), calcOrderCodeLast6(orderId));
        } catch(Exception e) {
            throw new RuntimeException("Format error.", e);
        }
    }

    public static OrderCode newReceiptCode(OrderCode orderCode, ReceiptType receiptType) {
        try {
            return new OrderCode(orderCode.businessType, receiptType, "01", orderCode.cityCode, orderCode.date, orderCode.last6Code);
        } catch(Exception e) {
            throw new RuntimeException("Format error.", e);
        }
    }

    public static OrderCode renewReceiptCode(OrderCode lastReceiptCode) {
        if(lastReceiptCode.receiptType == ReceiptType.order) {
            throw new RuntimeException("Format error.");
        }
        if(Integer.valueOf(lastReceiptCode.receiptSerialNumber) < 1 || Integer.valueOf(lastReceiptCode.receiptSerialNumber) > 99) {
            throw new RuntimeException("Format error.");
        }
        return new OrderCode(lastReceiptCode.businessType,
                             lastReceiptCode.receiptType,
                             autoComplete(String.valueOf(Integer.valueOf(lastReceiptCode.receiptSerialNumber) + 1)),
                             lastReceiptCode.cityCode,
                             lastReceiptCode.date,
                             lastReceiptCode.last6Code);
    }

    private static String calcOrderCodeLast6(long orderId) {
        long seed = orderId & ((1 << (NBITS + 1)) - 1);
        long code = 0;
        for(int i = 0; i < NBITS; i++) {
            code |= (((seed >> i) & 1) ^ (i & 1)) << (NBITS - 1 - i);
        }
        return String.format("%06d", code);
    }

    private static String autoComplete(String str) {
        if(StringUtils.isBlank(str)) {
            return "";
        }
        if(str.length() == 1) {
            return "0".concat(str);
        } else {
            return str;
        }
    }

    @Override
    public String toString() {
        return businessType.code + receiptType.code + receiptSerialNumber + cityCode + DATE_FORMAT.format(date) + last6Code;
    }

    /**
     * 业务类型
     */
    public static enum BusinessType {
        rent("1", "租房"),
        sale("2", "二手房"),;
        private static final Map<String, BusinessType> map = new HashMap<>((int) (values().length / .75f) + 1);

        static {
            for(BusinessType instance : values()) {
                map.put(instance.code, instance);
            }
        }

        private String code;
        private String name;

        private BusinessType(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public static BusinessType fromCode(String code) {
            return map.get(code);
        }
    }

    /**
     * 单据类型
     */
    public static enum ReceiptType {
        order("0", "订单"),
        jujianContract("1", "居间合同"),
        earnestReceipt("2", "意向金收据"),
        commissionReceipt("3", "佣金收据"),
        other("4", "其它");
        private static final Map<String, ReceiptType> map = new HashMap<>((int) (values().length / .75f) + 1);

        static {
            for(ReceiptType instance : values()) {
                map.put(instance.code, instance);
            }
        }

        private String code;
        private String name;

        private ReceiptType(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public static ReceiptType fromCode(String code) {
            return map.get(code);
        }
    }
}
