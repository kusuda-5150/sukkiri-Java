package ch05;

public class P179 {
    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }
    public static void methodB() {
        System.out.println("methobB");
    }
    public static void main(String[] args) {
        methodA();
    }
}
