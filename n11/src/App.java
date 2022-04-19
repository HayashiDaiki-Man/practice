import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ld = LocalDate.parse("2011/08/21", f);
        ld = ld.plusDays(1000);
        String str = ld.format(f);
        System.out.println("1000日後は" + str);

        // 現在日時との比較
        LocalDate now = LocalDate.now();
        if (now.isAfter(ld)) {
            System.out.println("nowはldより新しい");
        }
    }
}
