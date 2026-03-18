
import java.util.Scanner;


class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        int count_num = 0;

        while(num>0){
            num = num /10;  // remove last digit

            count_num ++;   // increase counter 

        }

        System.out.println("Total_Digit :"+count_num);
    
    }
}