
import java.util.Scanner;


class arthmatic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from users
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Multiply = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));
        System.out.println("Modulus (Remainder) = " + (num1 % num2));
        
        sc.close();

    }
}
