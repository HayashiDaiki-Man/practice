public class App {
    public static void main(String[] args) {
        String s = "abc,def:htht";
        String w = s.replaceAll("[beh]", "X");
        System.out.println(w);
    }
}
