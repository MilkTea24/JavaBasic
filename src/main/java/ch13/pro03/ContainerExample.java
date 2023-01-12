package ch13.pro03;

public class ContainerExample {
    public static void main(String[] args){
        Container2<String, Integer> container2 = new Container2<String, Integer>();
        container2.set("홍길동", 1);
        System.out.println(container2.getKey());
        System.out.println(container2.getValue());
    }
}
