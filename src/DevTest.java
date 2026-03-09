import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Scratch testing each method
        System.out.println("Testing getNonZeroLenString:");
        SafeInput.getNonZeroLenString(in, "Enter something");

        System.out.println("\nTesting getInt:");
        SafeInput.getInt(in, "Enter any integer");

        System.out.println("\nTesting getRangedInt:");
        SafeInput.getRangedInt(in, "Enter a number", 1, 10);

        System.out.println("\nTesting getYNConfirm:");
        SafeInput.getYNConfirm(in, "Are you sure?");

        System.out.println("\nTesting PrettyHeader:");
        SafeInput.prettyHeader("Message Centered Here");
    }
}