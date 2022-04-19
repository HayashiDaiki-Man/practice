public class App {
    public static void main(String[] args) {
        String s1 = "Java and Javascript";
        if (s1.contains("Java")) {
            System.out.println("文字列s1は、Javaを含んでいます");
        } else {
            System.out.println("文字列s1は、Javaを含んでいません");
        }
        if (s1.endsWith("Java")) {
            System.out.println("文字列s1は、末尾にJavaがある");
        } else {
            System.out.println("文字列s1は、末尾にJavaがありません");
        }
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        System.out.println("文字列s1で、最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

    }
}
