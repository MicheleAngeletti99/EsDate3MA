import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int anno = data.getYear();
        Month mese = data.getMonth();
        int giorno = data.getDayOfMonth();
        DayOfWeek giornoDellaSettimana = data.getDayOfWeek();

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno del mese: " + giorno);
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);
    }
}