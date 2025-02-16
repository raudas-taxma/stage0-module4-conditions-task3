package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days = 0;
        if (month < 0 || month > 12) {
            System.out.println("wrong number!");
            return;
        } else if (month == 2) {
            days = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else {
            days = 31;
        }
        System.out.println(days);
    }
}
