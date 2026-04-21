package ch03;

public class Pr3 {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        String food = "明太クリームパスタ";
        System.out.println("こんにちは");
        if(isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます");
        } else {}
        System.out.println("ごちそうさまでした");

    }
}
