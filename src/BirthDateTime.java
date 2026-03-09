import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input Year and Month
        int year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);

        // Determine the max days in the chosen month
        int dayLimit = switch (month) {
            case 2 -> // February
                    29;
            case 4, 6, 9, 11 -> // Months with 30 days
                    30;
            default -> // Months with 31 days
                    31;
        };
        // Input Day, Hours, and Minutes using the calculated dayLimit
        int day = SafeInput.getRangedInt(in, "Enter birth day", 1, dayLimit);
        int hours = SafeInput.getRangedInt(in, "Enter birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter birth minutes", 1, 59);

        System.out.println("\nBirth Date/Time: " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes);
    }
}