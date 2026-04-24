package ch02;

public class Pr1_A {
    public static void main(String[] args) {
        String songName = "Blue Mirage";
        int notes = 1800;
        int pg = 1300;
        int gr = 350;
        int bd = 40;
        int pr = 25;
        int epr = 10;

        int maxScore = notes * 2;
        int bp = bd + pr + epr;
        int score = pg * 2 + gr;

        System.out.println("曲名: " + songName);
        System.out.println("notes: " + notes);
        System.out.println("BP: " + bp);
        System.out.println("EX score: " + score);
        System.out.println("max EX score: " + maxScore);

    }
}
