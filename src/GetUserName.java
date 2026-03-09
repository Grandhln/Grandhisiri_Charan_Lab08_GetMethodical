import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Use the library method to get names
        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        // Output the result
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
