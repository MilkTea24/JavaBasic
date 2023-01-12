package ch12.pro15;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateExample {
    public static void main(String[] args) throws Exception {
        Date now = new Date();
        Date lastOfYear = new SimpleDateFormat("yyyy.MM.dd").parse("2022.12.31");
        long MilliTime = lastOfYear.getTime() - now.getTime();
        long Days = MilliTime / (1000 * 3600 * 24);
        System.out.println(Days);
    }
}