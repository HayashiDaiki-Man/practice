import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);
        LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
        System.out.println(l3);
    }
}
