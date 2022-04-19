public class App {
    public static void main(String[] args) {
        String s1 = "Java";
        s1.matches("Java");
        s1.matches("fff");
        s1.matches("java");
        String ok = "等しい";
        if (s1.matches("J.va")) {
            System.out.println(ok);
        }
    }
}
