package generator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 苏博
 * @version V1.2.0
 * @company lhfinance.com
 * @className: FdpConsts.java
 * @package com.lihfinance.fdp.config
 * @description: 生成器用到的常量
 * @date 2019/3/7 11:34
 */
public class FdpConsts {
    public final static String NEWLINE = "\n";
    public final static String TAB = "\t";
    public final static String TAB2 = "\t\t";
    public final static String TAB3 = "\t\t\t";
    public final static String TAB4 = "\t\t\t\t";
    public final static String BLANK = " ";
    public final static String BEGINLINE = "\n\t";
    public final static String NOTE_BEGIN = "/**";
    public final static String NOTE_MIDDLE = " *";
    public final static String NOTE_END = " */";
    public final static String L_BRACKET = "{";
    public final static String R_BRACKET = "}";
    public final static String PUB_CLASS = "public class";
    public final static String SEMICOLON = ";";

    public static final String IN_PATH = "\\fdp-generator\\src\\main\\resources\\info\\";
    public static final String OUT_PATH = "\\fdp-generator\\src\\main\\resources\\outPut\\";

    public static final String AUTHOR_INFO = getAuthorInfo();
    public static final String TIME_INFO = getTimeInfo();


    //生成作者注释
    private static String getAuthorInfo() {
        return "@author fdp-auto-generator";
    }

    //生成时间注释
    private static String getTimeInfo() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return "@date "+sdf.format(date);
    }

    //生成注释信息
    public static String getNoteInfo(String cname) {
        StringBuilder sb = new StringBuilder();
        sb.append(NEWLINE + NOTE_BEGIN);
        sb.append(NEWLINE + NOTE_MIDDLE + BLANK +cname);
        sb.append(NEWLINE + NOTE_MIDDLE + AUTHOR_INFO);
        sb.append(NEWLINE + NOTE_MIDDLE + TIME_INFO);
        sb.append(NEWLINE + NOTE_END);
        return sb.toString();
    }

    //生成标准类名
    public static String getClassName(String fileName) {
        StringBuilder sb = new StringBuilder();
        sb.append(NEWLINE + PUB_CLASS + BLANK + fileName + BLANK + L_BRACKET);
        return sb.toString();
    }
}
