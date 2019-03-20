package com.bfd.webappxcdc.utils;

import com.bfd.webappxcdc.exception.BizException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义日期相关工具类.
 *
 * @author wangzhongcheng
 * @Date 2018/12/3 15:47
 */
public class DateTimeUtils {

    public static final Integer TIME_LENTH = 8;

    public static final Integer DATE_LENTH = 10;

    /**
     * 默认日期时间格式 yyyy-MM-dd HH:mm:ss
     */
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式
     */
    public static final String SIMPLE_DATE_FORMAT = "yyyy-MM-dd";

    private DateTimeUtils() {
    }

    /**
     * 比较日期大小
     *
     * @param date1       如"2018-11-11"
     * @param date2       如"2018-12-5"
     * @param date_format 日期格式
     * @return 返回值为1 代表date1在date2后   -1 date1在date2前
     */
    public static int compareDate(String date1, String date2, String date_format) {
        SimpleDateFormat df = new SimpleDateFormat(date_format);
        try {
            Date dt1 = df.parse(date1);
            Date dt2 = df.parse(date2);
            if (dt1.getTime() > dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }

    /**
     * 判断查询当日是否有数据 若没有则返回0，若有则返回当前数据
     *
     * @param number Integer类型
     */
    public static Integer getData(String queryTime, Integer number) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtils.SIMPLE_DATE_FORMAT);
        Integer compare = DateTimeUtils.compareDate(queryTime.substring(0, DATE_LENTH), sdf.format(new Date()), DateTimeUtils.SIMPLE_DATE_FORMAT);
        return (compare < 0) ? 0 : number;
    }

    /**
     * 判断查询当日是否有数据 若没有则返回0，若有则返回当前数据
     *
     * @param number Double类型
     */
    public static Double getData(String queryTime, Double number) {
        SimpleDateFormat sdf = new SimpleDateFormat(DateTimeUtils.SIMPLE_DATE_FORMAT);
        Integer compare = DateTimeUtils.compareDate(queryTime.substring(0, DATE_LENTH), sdf.format(new Date()), DateTimeUtils.SIMPLE_DATE_FORMAT);
        return (compare < 0) ? 0 : number;
    }

    /**
     * 将datetime型字符串剪切成time型字符串.
     *
     * @param dateTime 如"2018-11-11 11:22:33.0"
     * @return 返回一个time型字符串 如 "11:22:33"
     */
    public static String parseDatetimeToTime(String dateTime) {
        Integer startIndex = DateTimeUtils.DATE_LENTH + 1;
        Integer endIndex = startIndex + DateTimeUtils.TIME_LENTH;
        return dateTime.substring(startIndex, endIndex);
    }

    /**
     * 获取当日零点的时间字符串.
     *
     * @return 返回日期字符串
     */
    public static String getNowDateTimeString() {
        SimpleDateFormat sdf1 = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
        SimpleDateFormat sdf2 = new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT);
        Date date = new Date();
        try {
            return sdf2.format(sdf1.parse(sdf1.format(date)));
        } catch (ParseException e) {
            throw new BizException(500, "数据格式异常");
        }
    }

    /**
     * 获取当前时间的日期字符串.
     *
     * @return 返回当前日期字符串
     */
    public static String getNewDateTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat(DEFAULT_DATE_TIME_FORMAT);
        return sdf.format(new Date());
    }
}
