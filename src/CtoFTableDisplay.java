public class CtoFTableDisplay {
    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s | %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("---------------------------");

        // Loop through Celsius values in 1-degree increments
        for (double c = -100; c <= 100; c++) {
            // Call the local conversion method
            double f = CtoF(c);
            // Display values formatted to 2 decimal places in columns
            System.out.printf("%-10.2f | %-10.2f\n", c, f);
        }
    }


    public static double CtoF(double Celsius) {
        return (Celsius * 9/5) + 32;
    }
}