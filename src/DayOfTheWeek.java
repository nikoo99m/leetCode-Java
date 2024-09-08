//Given a date, return the corresponding day of the week for that date.
//
// The input is given as three integers representing the day, month and year respectively.
//
// Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.


import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayOfTheWeek {
    public static String findDay(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();
    }

    public static void main(String[] args) {

        int day = 8, month = 9, year = 2024;
        System.out.println(findDay(day, month, year));
    }
}

