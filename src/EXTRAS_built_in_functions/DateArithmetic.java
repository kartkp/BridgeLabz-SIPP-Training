package EXTRAS_built_in_functions;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 4, 1);

        LocalDate updatedDate = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Final date after arithmetic: " + updatedDate);
    }
}