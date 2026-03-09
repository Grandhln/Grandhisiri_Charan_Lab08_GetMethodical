import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMore = true;

        // Loop to add items until the user is finished
        do {
            // Get price between $0.50 and $10.00
            double itemPrice = SafeInput.getRangedDouble(in, "Enter price of item", 0.50, 10.00);
            totalCost += itemPrice; // Add to running total

            // Ask for confirmation to continue
            hasMore = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (hasMore);

        // Print total formatted as currency
        System.out.printf("\nTotal cost of items: $%.2f\n", totalCost);
    }
}