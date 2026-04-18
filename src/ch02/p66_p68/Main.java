package ch02.p66_p68;

public class Main {
    public static void main(String[] args) {
        System.out.println("私の好きな記号は二重引用符(\")です");

        //p68
        String test1 = "改行\nテスト";
        String test2 = """
                       改行
                       テスト
                       """;
        System.out.println(test1);
        System.out.println(test2);
    }
}
