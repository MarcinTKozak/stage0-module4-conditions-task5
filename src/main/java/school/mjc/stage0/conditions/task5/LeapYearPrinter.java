package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        boolean leapYear;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
    }
}
