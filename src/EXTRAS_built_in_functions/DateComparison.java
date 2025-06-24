package EXTRAS_built_in_functions;

import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 5, 20);
        LocalDate date2 = LocalDate.of(2025, 6, 15);

        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }
    }
}
