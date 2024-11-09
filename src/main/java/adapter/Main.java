package adapter;

public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter calendar = new CalendarToNewDateAdapter();

        System.out.println("Today is " + calendar.getDay() + "." + calendar.getMonth() + "." + calendar.getYear());
        calendar.setDay(25);
        // Setting date
        System.out.println("Day is now " + calendar.getDay() + "." + calendar.getMonth() + "." + calendar.getYear());
        // Setting new date
        calendar.setYear(2013);
        calendar.setDay(20);
        calendar.setMonth(7);
        System.out.println("Day is now set to " + calendar.getDay() + "." + calendar.getMonth() + "." + calendar.getYear());
        // Advancing calendar
        calendar.advanceDays(5);
        System.out.println("Calendar advanced by 5 days " + calendar.getDay() + "." + calendar.getMonth() + "." + calendar.getYear());

    }
}
