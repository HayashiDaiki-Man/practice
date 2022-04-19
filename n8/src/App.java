import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(now.getTime());
        System.out.println(past);
    }
}
