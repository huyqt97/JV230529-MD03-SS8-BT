package bt4;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Tên ban đầu: " + student.getName());
        System.out.println("Lớp ban đầu: " + student.getClasses());

        student.setName("Huy");
        student.setClasses("THH");

        System.out.println("Tên mới: " + student.getName());
        System.out.println("Lớp mới: " + student.getClasses());
    }
}
