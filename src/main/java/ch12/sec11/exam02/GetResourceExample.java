package ch12.sec11.exam02;

public class GetResourceExample {
    public static void main(String[] args){
        ClassLoader clazz = Car.class.getClassLoader();

        String photo1Path = clazz.getResource("photo1.png").getPath();
        //String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Path);
        //System.out.println(photo2Path);
    }
}
