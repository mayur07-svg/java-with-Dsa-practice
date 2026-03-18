import java.util.*;

class PalindromeNumber {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ente number");
        int num  = sc.nextInt();
        int original = num;
        int reverse = 0;
        int digit;

        while(num > 0){

            digit = num % 10;
            reverse = reverse*10 + digit;
            num = num / 10;

        }

        if(original == reverse){
            System.out.println("Palindrome NUmber");
        }
        else{
            System.out.println("NOt Palidrome");
        }

        long endTime = System.nanoTime();   // end time

        long executionTime = endTime - startTime;

        System.out.println("Execution Time (nanoseconds): " + executionTime);


    }
}