package definition;

public enum Months {
    January(31),February(28),March(31),April(30),May(31),
    June(30),July(31),August(31),September(30),October(31)
    ,November(30),December(31);

    private static int NO_OF_DAYS_IN_MONTH;

    Months(int daysInMonth){
        this.NO_OF_DAYS_IN_MONTH = daysInMonth;
    }

    public static int getNoOfDaysInMonth() {
        return NO_OF_DAYS_IN_MONTH;
    }
}

