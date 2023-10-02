package bt1;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello, Huy!");
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());
        myObject.setMyString("Chào, Huy !");
        System.out.println("Giá trị mới của myString: " + myObject.getMyString());

    }
}
