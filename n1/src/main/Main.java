package main;

public class Main {
    public static void main(String[] args) {
        String s1 = "あいうえお";
        String s2 = "かきのたね";
        String s3 = "kakinotane";

        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
            System.out.println(s2 + s3 + "は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println(s2 + s3 + "はケースをわけなければ等しい");
        }
        System.out.println(s1 + "の長さは" + s1.length() + "です");
        if (s1.isEmpty()) {
            System.out.println("s1は空文字です");
        }
    }
}
