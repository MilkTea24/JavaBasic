package ch13.sec05.exam01;

public class Course {
    public static <T> void registerCourse1(Applicant<T> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course1을 등록함");
    }

    public static <T extends Student> void registerCourse2(Applicant<T> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course2를 등록함");
    }

    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course3를 등록함");
    }
}
