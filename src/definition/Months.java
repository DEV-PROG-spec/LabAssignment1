package definition;

public enum Months {
    January(31),February(28),March(31),April(30),May(),June,July,August,September,October,November,December;

    private static int noOfDaysInMonth;

    Months(int noOfDaysInMonth){
        this.noOfDaysInMonth = noOfDaysInMonth;
    }
}

