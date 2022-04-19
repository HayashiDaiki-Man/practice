public class App {
    public static void main(String[] args) {
        String s1 = "Java programing";
        System.out.println("s1の4文字目以降は" + s1.substring(3));

        System.out.println("s1の4～8文字目は" + s1.substring(3, 8));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
    }
}
