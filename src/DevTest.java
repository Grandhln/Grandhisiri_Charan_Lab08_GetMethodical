import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            // 1. Test non-blank string input
            System.out.println("--- Testing getNonZeroLenString ---");
            String name = SafeInput.getNonZeroLenString(in, "Enter your name");
            System.out.println("Input received: " + name);

            // 2. Test basic integer validation (Try typing "abc" to test error handling)
            System.out.println("\n--- Testing getInt ---");
            int age = SafeInput.getInt(in, "Enter your age");
            System.out.println("Input received: " + age);

            // 3. Test basic double validation (Try typing "abc" or "10.5")
            System.out.println("\n--- Testing getDouble ---");
            double salary = SafeInput.getDouble(in, "Enter your desired hourly wage");
            System.out.println("Input received: " + salary);

            // 4. Test ranged integers (Try 0 or 101 to test range handling)
            System.out.println("\n--- Testing getRangedInt ---");
            int score = SafeInput.getRangedInt(in, "Enter test score", 0, 100);
            System.out.println("Input received: " + score);

            // 5. Test ranged doubles (Try 0.25 or 15.00)
            System.out.println("\n--- Testing getRangedDouble ---");
            double price = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 10.00);
            System.out.println("Input received: " + price);

            // 6. Test Yes/No confirmation (Try 'y', 'N', or 'maybe')
            System.out.println("\n--- Testing getYNConfirm ---");
            boolean confirm = SafeInput.getYNConfirm(in, "Do you want to save your progress?");
            System.out.println("Input received: " + confirm);

            // 7. Test RegEx validation (Social Security Number pattern)
            System.out.println("\n--- Testing getRegExString (SSN Pattern) ---");
            String ssn = SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
            System.out.println("Input received: " + ssn);

            // 8. Test visual header formatting
            System.out.println("\n--- Testing PrettyHeader ---");
            SafeInput.prettyHeader("SafeInput Library Test Complete");
    }
}