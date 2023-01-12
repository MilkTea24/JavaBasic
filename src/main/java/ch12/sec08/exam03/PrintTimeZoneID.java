package ch12.sec08.exam03;

import java.util.TimeZone;

public class PrintTimeZoneID {
    public static void main(String[] args){
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs) {
            String[] splitString = id.split("/");
            if (splitString[0].equals("Asia")) System.out.println(id);
        }
    }
}
