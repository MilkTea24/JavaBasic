package ch12.sec08.exam02;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch(week) {
            case Calendar.MONDAY -> strWeek = "월";
            case Calendar.TUESDAY -> strWeek = "화";
            case Calendar.WEDNESDAY -> strWeek = "수";
            case Calendar.THURSDAY -> strWeek = "목";
            case Calendar.FRIDAY -> strWeek = "금";
            case Calendar.SATURDAY -> strWeek = "토";
            case Calendar.SUNDAY -> strWeek = "일";
        }

        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) strAmPm = "오전";
        else strAmPm = "오후";

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(strWeek + "요일");
        System.out.println(strAmPm + " " + hour + "시 " + minute + "분 " + second + "초");
    }
}
