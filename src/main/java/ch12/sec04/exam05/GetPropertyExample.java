package ch12.sec04.exam05;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args){
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        System.out.println("key : value");
        Properties props = System.getProperties();
        Set keys = props.keySet();

        for (Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }

    }
}
