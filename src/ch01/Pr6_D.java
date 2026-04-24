package ch01;

public class Pr6_D {
    public static void main(String[] args) {
        int notes = 2000;
        int pgreat = 1500;
        int great = 300;
        int bad = 50;
        int poor = 40;
        int emptyPoor = 10;

        System.out.println("notes: " + notes);
        System.out.println("BP: " + (bad + poor + emptyPoor));
        System.out.println("EX score: " + (pgreat * 2 + great));
        System.out.println("score rate: " + (pgreat * 2 + great) * 100.0 / (notes * 2) + "%");
    }

}
