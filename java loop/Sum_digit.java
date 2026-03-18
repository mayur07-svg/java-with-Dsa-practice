
import java.util.Scanner;


class Sum_digit{

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int sum = 0;
        int digit;


        while(num>0){

            digit = num % 10;      // get last digit
            sum = sum + digit;    // add to sum
            num = num / 10;      // remove last digit  ✅ VERY IMPORTANT , Update num value
        }

    System.out.println("Sum :"+sum);

    }
}