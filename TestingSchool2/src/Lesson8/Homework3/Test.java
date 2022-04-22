package Lesson8.Homework3;

class Test extends Point {
    static double x = 4.7;
    public static void main(String[] args) {
        new Test().printX();
    }
    void printX() {
        System.out.println(Point.x);
        System.out.println(super.x);//напишите здесь свой код
    }
}
//сделал