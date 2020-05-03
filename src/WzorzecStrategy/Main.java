package WzorzecStrategy;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        int i = context.executeStrategy(4, 5);
        System.out.println(i);
        System.out.println("====================================");

        System.out.println(System.currentTimeMillis());

        System.out.println("====================================");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeInMillis());

        System.out.println("====================================");

        int x = 20;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String format = formatter.format(20);
        System.out.println(format);

        System.out.println("====================================");

    }
}
