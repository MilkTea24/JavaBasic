package ch12.sec08.exam05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime lastOfYear = LocalDateTime.of(2022, 12, 31, 0, 0, 0);

        if (now.isBefore(lastOfYear)) System.out.println("아직 올해의 마지막 날이 아닙니다.");
        else if (now.isEqual(lastOfYear)) System.out.println("마지막 날입니다.");
        else if (now.isAfter(lastOfYear)) System.out.println("마지막 날이 지나갔습니다.");

        long remainYear = now.until(lastOfYear, ChronoUnit.YEARS);
        long remainMonth = now.until(lastOfYear, ChronoUnit.MONTHS);
        long remainDay = now.until(lastOfYear, ChronoUnit.DAYS);
        long remainHour = now.until(lastOfYear, ChronoUnit.HOURS);
        long remainMinute = now.until(lastOfYear, ChronoUnit.MINUTES);
        long remainSecond = now.until(lastOfYear, ChronoUnit.SECONDS);

        System.out.println("남은 해: " + remainYear);
        System.out.println("남은 월: " + remainMonth);
        System.out.println("남은 일: " + remainDay);
        System.out.println("남은 시간: " + remainHour);
        System.out.println("남은 분: " + remainMinute);
        System.out.println("남은 초: " + remainSecond);
    }
}
