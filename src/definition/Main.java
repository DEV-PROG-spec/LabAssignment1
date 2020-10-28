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
        switch (currentMonthName) {
            case JANUARY:
                System.out.println("only "+(Months.JANUARY.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.JANUARY.name().toLowerCase());
                break;
            case FEBRUARY:
                if(year.isLeap()){
                    todayDate--;
                }
                System.out.println("only "+(Months.FEBRUARY.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.FEBRUARY.name().toLowerCase());
                break;
            case MARCH:
                System.out.println("only "+(Months.MARCH.getNoOfDaysInMonth()-(todayDate))+" days left in"+Months.MARCH.name().toLowerCase());
                break;
            case APRIL:
                System.out.println("only "+(Months.APRIL.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.APRIL.name().toLowerCase());
                break;
            case MAY:
                System.out.println("only "+(Months.MAY.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.MAY.name().toLowerCase());
                break;
            case JUNE:
                System.out.println("only "+(Months.JUNE.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.JUNE.name().toLowerCase());
                break;
            case JULY:
                System.out.println("only "+(Months.JULY.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.JULY.name().toLowerCase());
                break;
            case AUGUST:
                System.out.println("only "+(Months.AUGUST.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.AUGUST.name().toLowerCase());
                break;
            case SEPTEMBER:
                System.out.println("only "+(Months.SEPTEMBER.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.SEPTEMBER.name().toLowerCase());
                break;
            case OCTOBER:
                System.out.println("only "+(Months.OCTOBER.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.OCTOBER.name().toLowerCase());
                break;
            case NOVEMBER:
                System.out.println("only "+(Months.NOVEMBER.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.NOVEMBER.name().toLowerCase());
                break;
            case DECEMBER:
                System.out.println("only "+(Months.DECEMBER.getNoOfDaysInMonth()-(todayDate))+" days left in "+Months.DECEMBER.name().toLowerCase());
                break;
        }

    }
}
