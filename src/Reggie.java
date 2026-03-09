import java.util.Scanner;

/**
 * Program 05: Uses Regular Expressions to validate patterns 
 * for SSN, Student M-Numbers, and Menu choices.
 */
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pattern for SSN: 3 digits, dash, 2 digits, dash, 4 digits
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");

        // Pattern for M-Number: 'M' or 'm' followed by 5 digits
        String mNumber = SafeInput.getRegExString(in, "Enter your UC M-Number (M#####)", "^(M|m)\\d{5}$");

        // Pattern for Menu: Single character from the set [O, S, V, Q]
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice [O, S, V, Q]", "^[OoSsVvQq]$");

        System.out.println("\nValidation Results:");
        System.out.println("SSN: " + ssn);
        System.out.println("M-Number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}