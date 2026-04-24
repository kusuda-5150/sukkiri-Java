package ch02;

public class Pr2_A {
    public static void main(String[] args) {
        String songName = "conflict";
        int notes = 2000;
        int score = 3300;

        int maxScore = notes * 2;
        double scoreRate = ((double) score / maxScore) * 100;

        System.out.println("曲名: " + songName);
        System.out.println("notes: " + notes);
        System.out.println("EX score: " + score);
        System.out.println("max EX score: " + maxScore);
        System.out.println("score rate: " + scoreRate + "%");
    }
}
