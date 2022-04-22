package Lesson8.Homework6;

public class Test extends T2 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(((T2) t).print());
    }

    String print() {
        return "Test";
    }
}

