package definition;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int currentMonth = new GregorianCalendar().get(Calendar.MONTH);
        int todayDate = new GregorianCalendar().get(Calendar.DATE);
        String month = new GregorianCalendar().getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.ENGLISH).trim().toUpperCase();
        Months currentMonthName = Months.valueOf(month);
        Year year = Year.now();

    }
}
