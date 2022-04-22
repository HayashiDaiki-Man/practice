import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 10進数を2進数に変換する
        int n;
        String blank = "";

        var sc = new Scanner(System.in);
        try {
            System.out.println("数値を入力してください");
            n = sc.nextInt();

            while (n > 1) {
                if (n % 2 == 0) {
                    System.out.print("0" + blank);
                } else {
                    System.out.print("1" + blank);
                }
                n = n / 2;
            }
        } finally {
            sc.close();
        }
    }
}
