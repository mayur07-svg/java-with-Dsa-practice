import java.util.Scanner;

public class CountNumbers {

    // Function to update counts of positive, negative, and zero
    // counters[0] = positive count
    // counters[1] = negative count
    // counters[2] = zero count
    public static void updateCount(int num, int[] counters) {

        // If number is positive, increase positive count
        if (num > 0) {
            counters[0]++;

        // If number is negative, increase negative count
        } else if (num < 0) {
            counters[1]++;

        // If number is zero, increase zero count
        } else {
            counters[2]++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store counts:
        // index 0 = positive
        // index 1 = negative
        // index 2 = zero
        int[] counters = {0, 0, 0};

        while (true) {

            // Ask user if they want to enter another number
            System.out.print("Do you want to enter a number? (yes/no): ");
            String user = sc.next();

            // If user says "yes", then ask for number
            if (user.equalsIgnoreCase("yes")) {

                System.out.print("Enter the number: ");
                int num = sc.nextInt();

                // Call the function to update counts
                updateCount(num, counters);

            } else {
                // If user says "no", stop the loop
                break;
            }
        }

        // Display final counts
        System.out.println("Positive numbers: " + counters[0]);
        System.out.println("Negative numbers: " + counters[1]);
        System.out.println("Zeros: " + counters[2]);

        sc.close();
    }
}
